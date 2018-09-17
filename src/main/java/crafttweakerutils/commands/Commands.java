package crafttweakerutils.commands;


import crafttweaker.annotations.*;
import stanhebben.zenscript.annotations.*;

import crafttweaker.api.command.ICommandSender;

@ZenRegister
@ZenClass("mods.ctutils.commands.Commands")
public class Commands {

	@ZenMethod
	public static ICommandSender getServerCommandSender() {
		return ServerCommandSender.INSTANCE;
	}

}