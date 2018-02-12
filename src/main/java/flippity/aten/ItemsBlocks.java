package flippity.aten;

//===================================================================\\
//==============================Imports===============================\\
//=====================================================================\\
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.buildingMaterials.ReinforcedGlowstone;
import flippity.aten.blocks.buildingMaterials.HardBricks;
import flippity.aten.blocks.lead.BlockLead;
import flippity.aten.blocks.lead.OreLead;
import flippity.aten.blocks.nickel.BlockNickel;
import flippity.aten.blocks.nickel.OreNickel;
import flippity.aten.blocks.nuclear.OreUranium;
import flippity.aten.blocks.osmium.BlockOsmium;
import flippity.aten.blocks.osmium.OreOsmium;
import flippity.aten.blocks.platinum.BlockPlatinum;
import flippity.aten.blocks.platinum.OrePlatinum;
import flippity.aten.blocks.silver.BlockSilver;
import flippity.aten.blocks.silver.OreSilver;
import flippity.aten.blocks.steel.BlockSteel;
import flippity.aten.blocks.tin.BlockTin;
import flippity.aten.blocks.tin.OreTin;
import flippity.aten.blocks.zinc.BlockZinc;
import flippity.aten.blocks.zinc.OreZinc;
import flippity.aten.items.gold.GoldDust;
import flippity.aten.items.gold.GoldPipe;
import flippity.aten.items.gold.GoldPlate;
import flippity.aten.items.gold.GoldRod;
import flippity.aten.items.iron.IronDust;
import flippity.aten.items.iron.IronPipe;
import flippity.aten.items.iron.IronPlate;
import flippity.aten.items.iron.IronRod;
import flippity.aten.items.lead.LeadDust;
import flippity.aten.items.lead.LeadIngot;
import flippity.aten.items.lead.LeadPipe;
import flippity.aten.items.lead.LeadPlate;
import flippity.aten.items.lead.LeadRod;
import flippity.aten.items.misc.buildingMaterials.ConcreteMix;
import flippity.aten.items.misc.buildingMaterials.HardBrick;
import flippity.aten.items.nickel.NickelDust;
import flippity.aten.items.nickel.NickelIngot;
import flippity.aten.items.nickel.NickelPipe;
import flippity.aten.items.nickel.NickelPlate;
import flippity.aten.items.nickel.NickelRod;
import flippity.aten.items.nuclear.UraniumPuck235;
import flippity.aten.items.nuclear.UraniumPuck238;
import flippity.aten.items.nuclear.Yellowcake;
import flippity.aten.items.osmium.OsmiumDust;
import flippity.aten.items.osmium.OsmiumIngot;
import flippity.aten.items.osmium.OsmiumPipe;
import flippity.aten.items.osmium.OsmiumPlate;
import flippity.aten.items.osmium.OsmiumRod;
import flippity.aten.items.platinum.PlatinumDust;
import flippity.aten.items.platinum.PlatinumIngot;
import flippity.aten.items.platinum.PlatinumPipe;
import flippity.aten.items.platinum.PlatinumPlate;
import flippity.aten.items.platinum.PlatinumRod;
import flippity.aten.items.silver.SilverDust;
import flippity.aten.items.silver.SilverIngot;
import flippity.aten.items.silver.SilverPipe;
import flippity.aten.items.silver.SilverPlate;
import flippity.aten.items.silver.SilverRod;
import flippity.aten.items.steel.SteelDust;
import flippity.aten.items.steel.SteelIngot;
import flippity.aten.items.steel.SteelPipe;
import flippity.aten.items.steel.SteelPlate;
import flippity.aten.items.steel.SteelRod;
import flippity.aten.items.tin.TinDust;
import flippity.aten.items.tin.TinIngot;
import flippity.aten.items.tin.TinPipe;
import flippity.aten.items.tin.TinPlate;
import flippity.aten.items.tin.TinRod;
import flippity.aten.items.tools.antidote;
import flippity.aten.items.tools.hazmatArmor;
import flippity.aten.items.zinc.ZincDust;
import flippity.aten.items.zinc.ZincIngot;
import flippity.aten.items.zinc.ZincPipe;
import flippity.aten.items.zinc.ZincPlate;
import flippity.aten.items.zinc.ZincRod;
import flippity.aten.lib.PotionEvent;
import flippity.aten.lib.RadiationEffect;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

public class ItemsBlocks {
	// ===================================================================\\
	// ==============================Molds=================================\\
	// =====================================================================\\

	public static Item antidote;

	// armor
	public static ArmorMaterial HAZMAT = EnumHelper.addArmorMaterial("HAZMAT", 99, new int[] { 0, 0, 0, 0 }, 0);
	// tools
	public static ToolMaterial Rock = EnumHelper.addToolMaterial("Rock", 1, 50, 5, 1, 0);
	public static ToolMaterial Steel = EnumHelper.addToolMaterial("Steel", 3, 500, 12, 6, 10);
	public static Block uraniumOre;

	// ===================================================================\\
	// ==============================Metal=================================\\
	// =====================================================================\\
	// natural elements
	// metal

	// lead stuff
	public static Block leadBlock;
	public static Block leadOre;
	public static Item leadIngot;
	public static Item leadDust;
	public static Item leadPipe;
	public static Item leadPlate;
	public static Item leadRod;
	// nickel stuff
	public static Block nickelBlock;
	public static Block nickelOre;
	public static Item nickelIngot;
	public static Item nickelDust;
	public static Item nickelPipe;
	public static Item nickelPlate;
	public static Item nickelRod;
	// osmium stuff
	public static Block osmiumBlock;
	public static Block osmiumOre;
	public static Item osmiumIngot;
	public static Item osmiumDust;
	public static Item osmiumPipe;
	public static Item osmiumPlate;
	public static Item osmiumRod;
	// platinum stuff
	public static Block platinumBlock;
	public static Block platinumOre;
	public static Item platinumIngot;
	public static Item platinumDust;
	public static Item platinumPipe;
	public static Item platinumPlate;
	public static Item platinumRod;
	// tin stuff
	public static Block tinBlock;
	public static Block tinOre;
	public static Item tinIngot;
	public static Item tinDust;
	public static Item tinPipe;
	public static Item tinPlate;
	public static Item tinRod;
	// zinc stuff
	public static Block zincBlock;
	public static Block zincOre;
	public static Item zincIngot;
	public static Item zincDust;
	public static Item zincPipe;
	public static Item zincPlate;
	public static Item zincRod;
	// silver stuff
	public static Block silverBlock;
	public static Block silverOre;
	public static Item silverIngot;
	public static Item silverDust;
	public static Item silverPipe;
	public static Item silverPlate;
	public static Item silverRod;
	// steel stuff
	public static Block steelBlock;
	public static Item steelIngot;
	public static Item steelDust;
	public static Item steelPipe;
	public static Item steelPlate;
	public static Item steelRod;
	// unnatrual elements
	// ===================================================================\\
	// ==============================Misc==================================\\
	// =====================================================================\\
	// hard brick
	public static Block HardBricks;
	public static Item HardBrick;
	// concrete mix
	public static Item concreteMix;
	// radioactive
	public static Item yellowcake;
	// reinforcedGlowstone
	public static Block reinforcedGlowstone;
	// hammer
	public static Item Rockhammer;
	public static Item Ironhammer;
	public static Item Steelhammer;
	// saws
	public static Item IronSaw;
	public static Item RockSaw;
	public static Item SteelSaw;
	// uranium puck
	public static Item uraniumPuck235;
	public static Item uraniumPuck238;

	public static Potion Radiation;
	public static Item hazmatHelmet;
	public static Item hazmatChest;
	public static Item hazmatPants;
	public static Item hazmatBoots;

	
	
	// ===================================================================\\
	// ==============================Metal=================================\\
	// =====================================================================\\

	public static void initItems() {
		GameRegistry.registerItem(hazmatHelmet = new hazmatArmor("hazmatHelmet", HAZMAT, "hazmat", 0), "hazmatHelmet"); // 0
																														// for
																														// helmet
		GameRegistry.registerItem(hazmatChest = new hazmatArmor("hazmatChest", HAZMAT, "hazmat", 1), "hazmatChest"); // 1
																														// for
																														// chestplate
		GameRegistry.registerItem(hazmatPants = new hazmatArmor("hazmatPants", HAZMAT, "hazmat", 2), "hazmatPants"); // 2
																														// for
																														// leggings
		GameRegistry.registerItem(hazmatBoots = new hazmatArmor("hazmatBoots", HAZMAT, "hazmat", 3), "hazmatBoots"); // 3

		// lead
		leadIngot = new LeadIngot();
		GameRegistry.registerItem(leadIngot, "leadIngot");
		leadDust = new LeadDust();
		GameRegistry.registerItem(leadDust, "leadDust");
		leadPipe = new LeadPipe();
		GameRegistry.registerItem(leadPipe, "leadPipe");
		leadPlate = new LeadPlate();
		GameRegistry.registerItem(leadPlate, "leadPlate");
		leadRod = new LeadRod();
		GameRegistry.registerItem(leadRod, "leadRod");
		// nickel
		nickelIngot = new NickelIngot();
		GameRegistry.registerItem(nickelIngot, "nickelIngot");
		nickelDust = new NickelDust();
		GameRegistry.registerItem(nickelDust, "nickelDust");
		nickelPipe = new NickelPipe();
		GameRegistry.registerItem(nickelPipe, "nickelPipe");
		nickelPlate = new NickelPlate();
		GameRegistry.registerItem(nickelPlate, "nickelPlate");
		nickelRod = new NickelRod();
		GameRegistry.registerItem(nickelRod, "nickelRod");
		// osmium
		osmiumIngot = new OsmiumIngot();
		GameRegistry.registerItem(osmiumIngot, "osmiumIngot");
		osmiumDust = new OsmiumDust();
		GameRegistry.registerItem(osmiumDust, "osmiumDust");
		osmiumPipe = new OsmiumPipe();
		GameRegistry.registerItem(osmiumPipe, "osmiumPipe");
		osmiumPlate = new OsmiumPlate();
		GameRegistry.registerItem(osmiumPlate, "osmiumPlate");
		osmiumRod = new OsmiumRod();
		GameRegistry.registerItem(osmiumRod, "osmiumRod");
		// platinum
		platinumIngot = new PlatinumIngot();
		GameRegistry.registerItem(platinumIngot, "platinumIngot");
		platinumDust = new PlatinumDust();
		GameRegistry.registerItem(platinumDust, "platinumDust");
		platinumPipe = new PlatinumPipe();
		GameRegistry.registerItem(platinumPipe, "platinumPipe");
		platinumPlate = new PlatinumPlate();
		GameRegistry.registerItem(platinumPlate, "platinumPlate");
		platinumRod = new PlatinumRod();
		GameRegistry.registerItem(platinumRod, "platinumRod");
		// tin
		tinIngot = new TinIngot();
		GameRegistry.registerItem(tinIngot, "tinIngot");
		tinDust = new TinDust();
		GameRegistry.registerItem(tinDust, "tinDust");
		tinPipe = new TinPipe();
		GameRegistry.registerItem(tinPipe, "tinPipe");
		tinPlate = new TinPlate();
		GameRegistry.registerItem(tinPlate, "tinPlate");
		tinRod = new TinRod();
		GameRegistry.registerItem(tinRod, "tinRod");
		// zinc
		zincIngot = new ZincIngot();
		GameRegistry.registerItem(zincIngot, "zincIngot");
		zincDust = new ZincDust();
		GameRegistry.registerItem(zincDust, "zincDust");
		zincPipe = new ZincPipe();
		GameRegistry.registerItem(zincPipe, "zincPipe");
		zincPlate = new ZincPlate();
		GameRegistry.registerItem(zincPlate, "zincPlate");
		zincRod = new ZincRod();
		GameRegistry.registerItem(zincRod, "zincRod");
		// silver
		silverIngot = new SilverIngot();
		GameRegistry.registerItem(silverIngot, "silverIngot");
		silverDust = new SilverDust();
		GameRegistry.registerItem(silverDust, "silverDust");
		silverPipe = new SilverPipe();
		GameRegistry.registerItem(silverPipe, "silverPipe");
		silverPlate = new SilverPlate();
		GameRegistry.registerItem(silverPlate, "silverPlate");
		silverRod = new SilverRod();
		GameRegistry.registerItem(silverRod, "silverRod");
		// steel
		steelIngot = new SteelIngot();
		GameRegistry.registerItem(steelIngot, "steelIngot");
		steelDust = new SteelDust();
		GameRegistry.registerItem(steelDust, "steelDust");
		steelPipe = new SteelPipe();
		GameRegistry.registerItem(steelPipe, "steelPipe");
		steelPlate = new SteelPlate();
		GameRegistry.registerItem(steelPlate, "steelPlate");
		steelRod = new SteelRod();
		GameRegistry.registerItem(steelRod, "steelRod");
		// ===================================================================\\
		// ==============================Misc==================================\\
		// =====================================================================\\
		// hard brick
		HardBrick = new HardBrick();
		GameRegistry.registerItem(HardBrick, "HardBrick");
		// concrete mix
		concreteMix = new ConcreteMix();
		GameRegistry.registerItem(concreteMix, "concreteMix");
		// Radioactive
		yellowcake = new Yellowcake();
		GameRegistry.registerItem(yellowcake, "yellowcake");

		Radiation = new RadiationEffect(25, true, 0).setIconIndex(0, 0).setPotionName("potion.radiationEffect");
		MinecraftForge.EVENT_BUS.register(new PotionEvent());

		uraniumPuck238 = new UraniumPuck238();
		GameRegistry.registerItem(uraniumPuck238, "uraniumPuck238");
		uraniumPuck235 = new UraniumPuck235();
		GameRegistry.registerItem(uraniumPuck235, "uraniumPuck235");

		antidote = new antidote(null, 0, 0, false);
		GameRegistry.registerItem(antidote, "antidote");


	}

	public static void initBlocks() {
		// ===================================================================\\
		// ==============================Metal=================================\\
		// =====================================================================\\
		// natural elements
		// Metals

		// nickel
		nickelBlock = new BlockNickel(Material.iron);
		GameRegistry.registerBlock(nickelBlock, "nickelBlock");
		nickelOre = new OreNickel(Material.rock);
		GameRegistry.registerBlock(nickelOre, "nickelOre");
		// osmium
		osmiumBlock = new BlockOsmium(Material.iron);
		GameRegistry.registerBlock(osmiumBlock, "osmiumBlock");
		osmiumOre = new OreOsmium(Material.rock);
		GameRegistry.registerBlock(osmiumOre, "osmiumOre");
		// lead
		leadBlock = new BlockLead(Material.iron);
		GameRegistry.registerBlock(leadBlock, "leadBlock");
		leadOre = new OreLead(Material.rock);
		GameRegistry.registerBlock(leadOre, "leadOre");
		// platinum
		platinumBlock = new BlockPlatinum(Material.iron);
		GameRegistry.registerBlock(platinumBlock, "platinumBlock");
		platinumOre = new OrePlatinum(Material.rock);
		GameRegistry.registerBlock(platinumOre, "platinumOre");
		// tin
		tinBlock = new BlockTin(Material.iron);
		GameRegistry.registerBlock(tinBlock, "tinBlock");
		tinOre = new OreTin(Material.rock);
		GameRegistry.registerBlock(tinOre, "tinOre");
		// zinc
		zincBlock = new BlockZinc(Material.iron);
		GameRegistry.registerBlock(zincBlock, "zincBlock");
		zincOre = new OreZinc(Material.rock);
		GameRegistry.registerBlock(zincOre, "zincOre");
		// silver
		silverBlock = new BlockSilver(Material.iron);
		GameRegistry.registerBlock(silverBlock, "silverBlock");
		silverOre = new OreSilver(Material.rock);
		GameRegistry.registerBlock(silverOre, "silverOre");
		// uranium
		uraniumOre = new OreUranium(Material.rock);
		GameRegistry.registerBlock(uraniumOre, "uraniumOre");
		// ===================================================================\\
		// ==============================Misc==================================\\
		// =====================================================================\\
		// unnatural elements
		// Alloys or Extractants
		// steel
		steelBlock = new BlockSteel(Material.iron);
		GameRegistry.registerBlock(steelBlock, "steelBlock");
		// Building Blocks
		HardBricks = new HardBricks(Material.rock);
		GameRegistry.registerBlock(HardBricks, "HardBrick");
		reinforcedGlowstone = new ReinforcedGlowstone(Material.rock);
		GameRegistry.registerBlock(reinforcedGlowstone, "reinforcedGlowstone");
	}
	

}
