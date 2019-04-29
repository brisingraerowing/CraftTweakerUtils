package crafttweakerutils.spawner;


import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityLivingBase;
import crafttweaker.api.world.IBlockPos;
import crafttweaker.api.world.IWorld;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import stanhebben.zenscript.annotations.ZenClass;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.ctutils.spawner.Spawner")
public class Spawner {

	@ZenMethod
	public static boolean setSpawnerEntity(IWorld world, IBlockPos pos, IEntityLivingBase entity)
	{
		World w = (World)world.getInternal();
		BlockPos p = (BlockPos)pos.getInternal();
		EntityLivingBase e = (EntityLivingBase)entity.getInternal();

		TileEntity tmp = w.getTileEntity(p);
		if(!(tmp instanceof  TileEntityMobSpawner)) { return false; }

		TileEntityMobSpawner spawner = (TileEntityMobSpawner)tmp;
		spawner.getSpawnerBaseLogic().setEntityId(EntityRegistry.getEntry(e.getClass()).getRegistryName());
		return true;

	}

}
