package crafttweakerutils.world;

import net.minecraft.world.GameRules;

public class MCGameRules implements IGameRules {

	private GameRules rules;

	public MCGameRules(GameRules rules)
	{
		this.rules = rules;
	}

	@Override
	public boolean getBoolean(String name) {
		return rules.getBoolean(name);
	}

	@Override
	public String getString(String name) {
		return rules.getString(name);
	}

	@Override
	public int getInt(String name) {
		return rules.getInt(name);
	}

	@Override
	public String[] getRules() {
		return rules.getRules();
	}

	@Override
	public boolean hasRule(String name) {
		return rules.hasRule(name);
	}

	@Override
	public Object getInternal() {
		return rules;
	}
}
