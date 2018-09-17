package crafttweakerutils.entity;


import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.world.IWorld;
import net.minecraft.server.MinecraftServer;
import stanhebben.zenscript.annotations.ZenClass;
import crafttweaker.api.entity.IEntityXp;
import crafttweaker.mc1120.entity.MCEntityXp;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.world.World;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.ctutils.entity.Experience")
public class Experience {

	@ZenMethod
	public static IEntityXp createEntityXp(IWorld world, int value)
	{
		EntityXPOrb orb = new EntityXPOrb((World)world.getInternal());
		orb.xpValue = value;
		return new MCEntityXp(orb);
	}

	@ZenMethod
	public static void setXpValue(IEntityXp xp, int value)
	{
		EntityXPOrb orb = (EntityXPOrb)xp.getInternal();
		orb.xpValue = value;
	}

}
