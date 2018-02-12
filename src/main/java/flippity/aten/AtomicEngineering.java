package flippity.aten;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(name = AtomicEngineering.MOD_NAME, modid = AtomicEngineering.MOD_ID, version = AtomicEngineering.MOD_VERSION)
public class AtomicEngineering {

	public static final String MOD_NAME = "Atomic Engineering";
	public static final String MOD_ID = "atomicengineering";

	public static final String MAJOR_VERSION = "@MAJOR@";
	public static final String MINOR_VERSION = "@MINOR@";
	public static final String BUILD_VERSION = "@BUILD@";
	public static final String MOD_VERSION = MAJOR_VERSION + "." + MINOR_VERSION + "." + BUILD_VERSION;

	@Instance(MOD_ID)
	public static AtomicEngineering INSTANCE;

	@SidedProxy(clientSide = "flippity.aten.client.ClientProxy", serverSide = "flippity.aten.ServerProxy")
	public static CommonProxy proxy;

	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {

	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
