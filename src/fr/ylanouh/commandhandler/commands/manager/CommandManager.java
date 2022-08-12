package fr.ylanouh.commandhandler.commands.manager;

import fr.ylanouh.commandhandler.Main;
import fr.ylanouh.commandhandler.commands.Commands;
import fr.ylanouh.commandhandler.commands.models.CommandModel;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {

    public static Map<String, CommandModel> commandModelMap = new HashMap<>();

    public CommandManager() {
    }


    public void add(CommandModel commandModel) {
        commandModelMap.put(commandModel.getName(), commandModel);
    }

    public void remove(CommandModel commandModel) {
        commandModelMap.remove(commandModel.getName(), commandModel);
    }

    public void load() {
        for (CommandModel commandModel1 : commandModelMap.values()) {
            String name = commandModel1.getName();
            System.out.println("Command: " + name + " is operationnel !");
            Main.getINTANCE().getCommand(name).setExecutor(new Commands());
            Main.getINTANCE().getCommand(name).setName(name);
            Main.getINTANCE().getCommand(name).setPermission(commandModel1.getPermission());
            Main.getINTANCE().getCommand(name).setAliases(commandModel1.getAliasse());
            Main.getINTANCE().getCommand(name).setPermissionMessage(commandModel1.getPermissionMessage());
            Main.getINTANCE().getCommand(name).setDescription(commandModel1.getDescription());
        }
    }
}
