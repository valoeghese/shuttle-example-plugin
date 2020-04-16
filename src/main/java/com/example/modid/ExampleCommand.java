package com.example.modid;

import tk.valoeghese.shuttle.api.command.CommandCallback;
import tk.valoeghese.shuttle.api.command.CommandRuntimeInfo;
import tk.valoeghese.shuttle.api.command.arg.CommandArguments;

public class ExampleCommand implements CommandCallback {
	@Override
	public boolean execute(CommandArguments arguments, CommandRuntimeInfo context) {
		// first get the executor of the command (often a player), then send the message "Hello, Shuttle World" to them.
		context.getExecutor().sendMessage("Hello, Shuttle World!");
		// true shows the command execution was successful
		return true;
	}
}
