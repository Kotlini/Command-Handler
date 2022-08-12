package fr.ylanouh.commandhandler.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            ((Player) commandSender).sendTitle("CC" ,"mec");
        } else {
            commandSender.sendMessage("Erreur: Console");
        }
        return false;
    }
}
