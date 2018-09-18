package crafttweakerutils.world;

import net.minecraft.world.GameRules;
import stanhebben.zenscript.ZenRuntimeException;

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
	public void addGameRule(String key, String value, String type) {
		if(hasRule(key)) return;

		GameRules.ValueType t = GameRules.ValueType.ANY_VALUE;

		switch (type.toLowerCase())
		{
			case "any":
				break;
			case "numeric":
				t = GameRules.ValueType.NUMERICAL_VALUE;
				break;
			case "boolean":
				t = GameRules.ValueType.BOOLEAN_VALUE;
				break;
			default:
				throw new ZenRuntimeException("Invalid value for gamerule type. Must be one of Any, Numeric, or Boolean");
		}

		rules.addGameRule(key, value, t);

	}

	@Override
	public Object getInternal() {
		return rules;
	}
}
