package crafttweakerutils.server;


import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.player.IPlayer;
import crafttweaker.api.server.IServer;
import crafttweaker.mc1120.player.MCPlayer;
import net.minecraft.server.MinecraftServer;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.ctutils.server.Server")
@ZenExpansion("crafttweaker.server.IServer")
@ZenRegister
public class Server {

	@ZenMethod
	public static int getCurrentPlayerCount(IServer server)
	{
		MinecraftServer s = (MinecraftServer)server.getInternal();
		return s.getCurrentPlayerCount();
	}

	@ZenMethod
	public static int getMaxPlayerCount(IServer server)
	{
		MinecraftServer s = (MinecraftServer)server.getInternal();
		return s.getMaxPlayers();
	}

	@ZenMethod
	public static IPlayer[] getPlayers(IServer server)
	{
		MinecraftServer s = (MinecraftServer)server.getInternal();
		return (IPlayer[])s.getPlayerList().getPlayers().stream().map(p -> new MCPlayer(p)).toArray();
	}

}
