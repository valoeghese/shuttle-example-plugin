package com.example.modid;

import tk.valoeghese.shuttle.api.ShuttlePlugin;
import tk.valoeghese.shuttle.api.command.Command;
import tk.valoeghese.shuttle.api.server.SetupEvents.CommandSetupContext;
import tk.valoeghese.shuttle.api.server.SetupEvents.ShuttleCommandSetup;

public class ExamplePlugin extends ShuttlePlugin implements ShuttleCommandSetup {
	// Note the environment in the fabric.mod.json is set to "*" to allow on both dedicated and integrated servers
	// If you only want your plugin to run on dedicated servers (not recommended), change that to "server"
	@Override
	public void setupCommands(CommandSetupContext context) {
		// we create a command
		Command example = new Command("example");
		// set the callback of the command: what code will run?
		example.setCallback(new ExampleCommand());
		// register the command to the game
		context.registerCommand(example);
	}
}
