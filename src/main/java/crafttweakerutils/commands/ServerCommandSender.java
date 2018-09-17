package crafttweakerutils.commands;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.api.command.ICommandSender;
import crafttweaker.api.server.IServer;
import crafttweaker.api.world.IBlockPos;
import crafttweaker.api.world.IWorld;
import crafttweaker.mc1120.world.MCBlockPos;
import crafttweaker.mc1120.world.MCWorld;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;

public class ServerCommandSender implements ICommandSender {

	private MinecraftServer sender;

	public static final ServerCommandSender INSTANCE = new ServerCommandSender();

	private ServerCommandSender()
	{
		sender = (MinecraftServer)CraftTweakerAPI.server.getInternal();
	}

	@Override
	public String getDisplayName() {
		return sender.getDisplayName().getFormattedText();
	}

	@Override
	public IBlockPos getPosition() {
		return new MCBlockPos(BlockPos.ORIGIN);
	}

	@Override
	public IWorld getWorld() {
		return new MCWorld(sender.getWorld(0));
	}

	@Override
	public IServer getServer() {
		return CraftTweakerAPI.server;
	}

	@Override
	public void sendMessage(String text) {
		sender.sendMessage(new TextComponentString(text));
	}

	@Override
	public Object getInternal() {
		return sender;
	}
}
