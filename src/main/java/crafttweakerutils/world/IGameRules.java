package crafttweakerutils.world;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.ctutils.world.IGameRules")
public interface IGameRules {

	@ZenMethod
	boolean getBoolean(String name);

	@ZenMethod
	String getString(String name);

	@ZenMethod
	int getInt(String name);

	@ZenMethod
	String[] getRules();

	@ZenMethod
	boolean hasRule(String name);

	@ZenMethod
	void addGameRule(String key, String value, String type);

	Object getInternal();

}
