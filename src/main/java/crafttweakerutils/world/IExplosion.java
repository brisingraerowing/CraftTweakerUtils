package crafttweakerutils.world;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityLivingBase;
import crafttweaker.api.world.IBlockPos;
import crafttweaker.api.world.IVector3d;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.ctutils.world.IExplosion")
public interface IExplosion {

	@ZenMethod
	@ZenGetter("PlacedBy")
	IEntityLivingBase getExplosivePlacedBy();

	@ZenMethod
	@ZenGetter("placedBy")
	IBlockPos[] getAffectedBlockPositions();

	@ZenMethod
	@ZenGetter("position")
	IVector3d getPosition();

    @ZenMethod
    void clearAffectedBlockPositions();


	Object getInternal();

}
