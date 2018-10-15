package crafttweakerutils.preprocessors;

import crafttweaker.preprocessor.PreprocessorActionBase;
import crafttweaker.runtime.ScriptFile;
import net.minecraftforge.fml.common.FMLCommonHandler;
import stanhebben.zenscript.ZenRuntimeException;
import net.minecraftforge.fml.relauncher.Side;

public class OnSidePreprocessor extends PreprocessorActionBase {

	private static final String PREPROCESSOR_NAME = "onside";

	private Side side;

	public OnSidePreprocessor(String fileName, String preprocessorLine, int lineIndex)
	{
		super(fileName, preprocessorLine, lineIndex);
		String s = preprocessorLine.substring(7).trim().toLowerCase();

		switch (s)
		{
			case "server":
				side = Side.SERVER;
				break;
			case "client":
				side = Side.CLIENT;
				break;
			default:
				throw new ZenRuntimeException("Invalid value for preprocessor. Must be one of 'server' or 'client'.");
		}

	}

	@Override
	public void executeActionOnFind(ScriptFile scriptFile) {
		if (FMLCommonHandler.instance().getSide() != side)
		{
			scriptFile.setParsingBlocked(true);
			scriptFile.setCompileBlocked(true);
			scriptFile.setExecutionBlocked(true);
		}
	}

	@Override
	public String getPreprocessorName() {
		return PREPROCESSOR_NAME;
	}
}
