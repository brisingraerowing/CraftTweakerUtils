package crafttweakerutils;
import crafttweaker.CraftTweakerAPI;
import crafttweakerutils.preprocessors.OnSidePreprocessor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = CraftTweakerUtils.MODID, name = CraftTweakerUtils.NAME, version = CraftTweakerUtils.VERSION, dependencies = CraftTweakerUtils.DEPENDENCIES)
public class CraftTweakerUtils {
	public static final String MODID = "crafttweakerutils";
	public static final String NAME = "CraftTweaker Utils";
	public static final String VERSION = "0.7";
	public static final String DEPENDENCIES = "required-after:crafttweaker";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CraftTweakerAPI.tweaker.getPreprocessorManager().registerPreprocessorAction("onside", OnSidePreprocessor::new);
	}

}
