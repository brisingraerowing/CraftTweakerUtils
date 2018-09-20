package crafttweakerutils.world;

import crafttweaker.api.entity.IEntityLivingBase;
import crafttweaker.api.world.IBlockPos;
import crafttweaker.api.world.IVector3d;
import crafttweaker.mc1120.entity.MCEntityLivingBase;
import crafttweaker.mc1120.world.MCBlockPos;
import crafttweaker.mc1120.world.MCVector3d;
import net.minecraft.world.Explosion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MCExplosion implements IExplosion {

	private Explosion explosion;

	public MCExplosion(Explosion explosion)
	{
		this.explosion = explosion;
	}

	@Override
	public IEntityLivingBase getExplosivePlacedBy() {
		return new MCEntityLivingBase(explosion.getExplosivePlacedBy());
	}

	@Override
	public IBlockPos[] getAffectedBlockPositions() {
		List<IBlockPos> list = new ArrayList<IBlockPos>();
		list.addAll(explosion.getAffectedBlockPositions().stream().map(x -> {
			return new MCBlockPos(x);
		}).collect(Collectors.toList()));

		return (IBlockPos[])list.toArray();

	}

	@Override
	public IVector3d getPosition() {
		return new MCVector3d(explosion.getPosition());
	}

	@Override
	public Object getInternal() {
		return explosion;
	}
}
