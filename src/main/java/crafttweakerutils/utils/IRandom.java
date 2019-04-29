package crafttweakerutils.utils;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.ctutils.utils.IRandom")
public interface IRandom {

	@ZenMethod
	boolean nextBoolean();

	@ZenMethod
	double nextDouble();

	@ZenMethod
	float nextFloat();

	@ZenMethod
	double nextGaussian();

	@ZenMethod
	int nextInt();

	@ZenMethod
	int nextInt(int i);

	@ZenMethod
	long nextLong();

}
