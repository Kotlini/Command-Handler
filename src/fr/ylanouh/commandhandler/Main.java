package fr.ylanouh.commandhandler;

import fr.ylanouh.commandhandler.commands.Commands;
import fr.ylanouh.commandhandler.commands.loads.CommandCreate;
import fr.ylanouh.commandhandler.commands.manager.CommandManager;
import fr.ylanouh.commandhandler.commands.models.CommandModel;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main INTANCE;

    private CommandManager manager;

    @Override
    public void onEnable() {

        //Intance
        INTANCE = this;

        //CommandManager
        manager = new CommandManager();

        //LoadCommands
        CommandCreate.loadAllCommands();


        getCommand("test").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
                return false;
            }
        });

        for (CommandModel commandModel1 : CommandManager.commandModelMap.values()) {
            String name = commandModel1.getName();
            System.out.println("Command: " + name + " is operationnel !");
            getCommand(name).setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
                    commandSender.sendMessage("test réussi");
                    return false;
                }
            });
            getCommand(name).setPermission(commandModel1.getPermission());
        }
    }


    public static Main getINTANCE() {
        return INTANCE;
    }

    public CommandManager getManager() {
        return manager;
    }
}
