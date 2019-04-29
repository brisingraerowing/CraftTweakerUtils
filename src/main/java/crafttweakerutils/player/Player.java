package crafttweakerutils.player;


import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.player.IPlayer;
import net.minecraftforge.common.util.FakePlayer;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.ctutils.player.Player")
@ZenExpansion("crafttweaker.player.IPlayer")
public class Player {

	@ZenMethod
	public static boolean isFake(IPlayer player)
	{
		return (player.getInternal() instanceof FakePlayer);
	}

}
