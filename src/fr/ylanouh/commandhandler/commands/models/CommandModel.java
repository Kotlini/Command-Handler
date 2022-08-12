package fr.ylanouh.commandhandler.commands.models;

import org.bukkit.command.CommandExecutor;

import java.util.List;

public class CommandModel {
    private String name;
    private String description;
    private List<String> aliasse;
    private String permission;

    private Class command;

    private String permissionMessage;
    public static class CommandModelBuilder {
        private String name;
        private String description;
        private List<String> aliasse;
        private String permission;

        private String permissionMessage;

        private Class command;

        public CommandModelBuilder whitchName(String name) {
            this.name = name;
            return this;
        }

        public CommandModelBuilder whitchDescription(String description) {
            this.description = description;
            return this;
        }

        public CommandModelBuilder whitchAliasse(List<String> aliasse) {
            this.aliasse = aliasse;
            return this;
        }

        public CommandModelBuilder whitchPermission(String permission) {
            this.permission = permission;
            return this;
        }

        public CommandModelBuilder witchCommand(Class command) {
            this.command = command;
            return this;
        }

        public CommandModelBuilder witchPermission(Class command) {
            this.command = command;
            return this;
        }

        public CommandModelBuilder witchPermissionMessage(String permissionMessage) {
            this.permissionMessage = permissionMessage;
            return this;
        }

        public CommandModel build() {
            CommandModel commandModel = new CommandModel();
            commandModel.aliasse = aliasse;
            commandModel.description = description;
            commandModel.name = name;
            commandModel.permission = permission;
            commandModel.command = command;
            commandModel.permissionMessage = permissionMessage;
            return commandModel;
        }
    }

    public String getName() {
        return name;
    }

    public String getPermissionMessage() {
        return permissionMessage;
    }

    public List<String> getAliasse() {
        return aliasse;
    }

    public String getDescription() {
        return description;
    }

    public String getPermission() {
        return permission;
    }

    public Class getCommand() {
        return command;
    }
}
