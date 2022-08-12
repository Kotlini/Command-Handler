package fr.ylanouh.commandhandler.commands.loads;

import fr.ylanouh.commandhandler.Main;
import fr.ylanouh.commandhandler.commands.Commands;
import fr.ylanouh.commandhandler.commands.models.CommandModel;

import java.util.Arrays;

public class CommandCreate {

    public static void loadAllCommands() {
        CommandModel model = new CommandModel.CommandModelBuilder().
                whitchName("test").
                whitchDescription("CC mec c'est la description").
                whitchAliasse(Arrays.<String>asList("t" , "test")).
                whitchPermission("admin.test").build();

        Main.getINTANCE().getManager().add(model);
    }
}
