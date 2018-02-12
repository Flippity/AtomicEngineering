package flippity.aten;

import java.util.logging.Logger;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.machinery.energy.turbine.turbine;
import flippity.aten.blocks.mud.mud;
import flippity.aten.items.machines.research.tables;
import flippity.aten.lib.AluminumGen;
import flippity.aten.lib.CopperGen;
import flippity.aten.lib.LeadGen;
import flippity.aten.lib.NickelGen;
import flippity.aten.lib.Reference;
import flippity.aten.lib.SilverGen;
import flippity.aten.lib.TinGen;
import flippity.aten.lib.UraniumGen;
import flippity.aten.lib.ZincGen;
import flippity.aten.lib.proxies.ClientProxy;
import flippity.aten.lib.proxies.CommonProxy;
import flippity.aten.registrys.concreteBlock;
import flippity.aten.registrys.machineRegister;
import flippity.aten.registrys.magnetRegistry;
import flippity.aten.registrys.mudRegistry;
import flippity.aten.registrys.metalRegistry.Aluminum;
import flippity.aten.registrys.metalRegistry.Brass;
import flippity.aten.registrys.metalRegistry.Bronze;
import flippity.aten.registrys.metalRegistry.Copper;
import flippity.aten.registrys.recipes.Recipes;
import flippity.aten.utils.itemRemover;
import flippity.aten.lib.OsmiumGen;
import flippity.aten.lib.PlatinumGen;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER)

public class AtomicEngineering {

	public enum GUI_ENUM {
		URANIUM_ENRICHMENT
	}

	// ===================================================================\\
	// ==============================Proxy=================================\\
	// =====================================================================\\

	@SidedProxy(clientSide = "flippity.aten.lib.proxies.ClientProxy", serverSide = "flippity.aten.lib.proxies.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ItemsBlocks.initBlocks();
		ItemsBlocks.initItems();
		Aluminum.initBlocks();
		Aluminum.initItems();
		Brass.initBlocks();
		Brass.initItems();
		Bronze.initBlocks();
		Bronze.initItems();
		Copper.initBlocks();
		Copper.initItems();
		concreteBlock.initBlocks();
		concreteBlock.initItems();
		mudRegistry.initBlocks();
		tables.initBlocks();
		magnetRegistry.initItems();
		machineRegister.registerBlocks();
		ClientProxy.registerRenderers();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		RenderingRegistry.addNewArmourRendererPrefix("5");

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}
