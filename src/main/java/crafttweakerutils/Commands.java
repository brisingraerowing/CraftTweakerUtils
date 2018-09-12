package crafttweakerutils;


import crafttweaker.annotations.*;
import crafttweaker.mc1120.server.ServerPlayer;
import stanhebben.zenscript.annotations.*;

import crafttweaker.api.command.ICommandSender;

@ZenRegister
@ZenClass("mods.ctutils.Commands")
public class Commands {

	@ZenMethod
	public static ICommandSender getServerCommandSender() {
		return ServerCommandSender.INSTANCE;
	}

}