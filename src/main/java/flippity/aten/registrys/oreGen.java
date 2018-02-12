package flippity.aten.registrys;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.lib.AluminumGen;
import flippity.aten.lib.CopperGen;
import flippity.aten.lib.LeadGen;
import flippity.aten.lib.NickelGen;
import flippity.aten.lib.OsmiumGen;
import flippity.aten.lib.PlatinumGen;
import flippity.aten.lib.SilverGen;
import flippity.aten.lib.TinGen;
import flippity.aten.lib.UraniumGen;
import flippity.aten.lib.ZincGen;

public class OreGen {
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new AluminumGen(), 0);
		GameRegistry.registerWorldGenerator(new CopperGen(), 0);
		GameRegistry.registerWorldGenerator(new LeadGen(), 0);
		GameRegistry.registerWorldGenerator(new NickelGen(), 0);
		GameRegistry.registerWorldGenerator(new OsmiumGen(), 0);
		GameRegistry.registerWorldGenerator(new PlatinumGen(), 0);
		GameRegistry.registerWorldGenerator(new TinGen(), 0);
		GameRegistry.registerWorldGenerator(new ZincGen(), 0);
		GameRegistry.registerWorldGenerator(new SilverGen(), 0);
		GameRegistry.registerWorldGenerator(new UraniumGen(), 0);
	}
}
