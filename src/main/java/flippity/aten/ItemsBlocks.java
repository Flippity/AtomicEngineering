package flippity.aten;

//===================================================================\\
//==============================Imports===============================\\
//=====================================================================\\
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.building_mats.hardBrick;
import flippity.aten.blocks.building_mats.reinforcedGlowstone;
import flippity.aten.blocks.lead.leadBlock;
import flippity.aten.blocks.lead.leadOre;
import flippity.aten.blocks.nickel.nickelBlock;
import flippity.aten.blocks.nickel.nickelOre;
import flippity.aten.blocks.nuclear.uraniumOre;
import flippity.aten.blocks.osmium.osmiumBlock;
import flippity.aten.blocks.osmium.osmiumOre;
import flippity.aten.blocks.platinum.platinumBlock;
import flippity.aten.blocks.platinum.platinumOre;
import flippity.aten.blocks.silver.silverBlock;
import flippity.aten.blocks.silver.silverOre;
import flippity.aten.blocks.steel.steelBlock;
import flippity.aten.blocks.tin.tinBlock;
import flippity.aten.blocks.tin.tinOre;
import flippity.aten.blocks.zinc.zincBlock;
import flippity.aten.blocks.zinc.zincOre;
import flippity.aten.items.gold.goldDust;
import flippity.aten.items.gold.goldPipe;
import flippity.aten.items.gold.goldPlate;
import flippity.aten.items.gold.goldRod;
import flippity.aten.items.iron.ironDust;
import flippity.aten.items.iron.ironPipe;
import flippity.aten.items.iron.ironPlate;
import flippity.aten.items.iron.ironRod;
import flippity.aten.items.lead.leadDust;
import flippity.aten.items.lead.leadIngot;
import flippity.aten.items.lead.leadPipe;
import flippity.aten.items.lead.leadPlate;
import flippity.aten.items.lead.leadRod;
import flippity.aten.items.misc.building_mats.concreteMix;
import flippity.aten.items.misc.building_mats.hardbrick;
import flippity.aten.items.nickel.nickelDust;
import flippity.aten.items.nickel.nickelIngot;
import flippity.aten.items.nickel.nickelPipe;
import flippity.aten.items.nickel.nickelPlate;
import flippity.aten.items.nickel.nickelRod;
import flippity.aten.items.nuclear.uraniumPuck235;
import flippity.aten.items.nuclear.uraniumPuck238;
import flippity.aten.items.nuclear.yellowcake;
import flippity.aten.items.osmium.osmiumDust;
import flippity.aten.items.osmium.osmiumIngot;
import flippity.aten.items.osmium.osmiumPipe;
import flippity.aten.items.osmium.osmiumPlate;
import flippity.aten.items.osmium.osmiumRod;
import flippity.aten.items.platinum.platinumDust;
import flippity.aten.items.platinum.platinumIngot;
import flippity.aten.items.platinum.platinumPipe;
import flippity.aten.items.platinum.platinumPlate;
import flippity.aten.items.platinum.platinumRod;
import flippity.aten.items.silver.silverDust;
import flippity.aten.items.silver.silverIngot;
import flippity.aten.items.silver.silverPipe;
import flippity.aten.items.silver.silverPlate;
import flippity.aten.items.silver.silverRod;
import flippity.aten.items.steel.steelDust;
import flippity.aten.items.steel.steelIngot;
import flippity.aten.items.steel.steelPipe;
import flippity.aten.items.steel.steelPlate;
import flippity.aten.items.steel.steelRod;
import flippity.aten.items.tin.tinDust;
import flippity.aten.items.tin.tinIngot;
import flippity.aten.items.tin.tinPipe;
import flippity.aten.items.tin.tinPlate;
import flippity.aten.items.tin.tinRod;
import flippity.aten.items.tools.antidote;
import flippity.aten.items.tools.hazmatArmor;
import flippity.aten.items.zinc.zincDust;
import flippity.aten.items.zinc.zincIngot;
import flippity.aten.items.zinc.zincPipe;
import flippity.aten.items.zinc.zincPlate;
import flippity.aten.items.zinc.zincRod;
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
	public static Block hardBrick;
	public static Item hardbrick;
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
		leadIngot = new leadIngot();
		GameRegistry.registerItem(leadIngot, "leadIngot");
		leadDust = new leadDust();
		GameRegistry.registerItem(leadDust, "leadDust");
		leadPipe = new leadPipe();
		GameRegistry.registerItem(leadPipe, "leadPipe");
		leadPlate = new leadPlate();
		GameRegistry.registerItem(leadPlate, "leadPlate");
		leadRod = new leadRod();
		GameRegistry.registerItem(leadRod, "leadRod");
		// nickel
		nickelIngot = new nickelIngot();
		GameRegistry.registerItem(nickelIngot, "nickelIngot");
		nickelDust = new nickelDust();
		GameRegistry.registerItem(nickelDust, "nickelDust");
		nickelPipe = new nickelPipe();
		GameRegistry.registerItem(nickelPipe, "nickelPipe");
		nickelPlate = new nickelPlate();
		GameRegistry.registerItem(nickelPlate, "nickelPlate");
		nickelRod = new nickelRod();
		GameRegistry.registerItem(nickelRod, "nickelRod");
		// osmium
		osmiumIngot = new osmiumIngot();
		GameRegistry.registerItem(osmiumIngot, "osmiumIngot");
		osmiumDust = new osmiumDust();
		GameRegistry.registerItem(osmiumDust, "osmiumDust");
		osmiumPipe = new osmiumPipe();
		GameRegistry.registerItem(osmiumPipe, "osmiumPipe");
		osmiumPlate = new osmiumPlate();
		GameRegistry.registerItem(osmiumPlate, "osmiumPlate");
		osmiumRod = new osmiumRod();
		GameRegistry.registerItem(osmiumRod, "osmiumRod");
		// platinum
		platinumIngot = new platinumIngot();
		GameRegistry.registerItem(platinumIngot, "platinumIngot");
		platinumDust = new platinumDust();
		GameRegistry.registerItem(platinumDust, "platinumDust");
		platinumPipe = new platinumPipe();
		GameRegistry.registerItem(platinumPipe, "platinumPipe");
		platinumPlate = new platinumPlate();
		GameRegistry.registerItem(platinumPlate, "platinumPlate");
		platinumRod = new platinumRod();
		GameRegistry.registerItem(platinumRod, "platinumRod");
		// tin
		tinIngot = new tinIngot();
		GameRegistry.registerItem(tinIngot, "tinIngot");
		tinDust = new tinDust();
		GameRegistry.registerItem(tinDust, "tinDust");
		tinPipe = new tinPipe();
		GameRegistry.registerItem(tinPipe, "tinPipe");
		tinPlate = new tinPlate();
		GameRegistry.registerItem(tinPlate, "tinPlate");
		tinRod = new tinRod();
		GameRegistry.registerItem(tinRod, "tinRod");
		// zinc
		zincIngot = new zincIngot();
		GameRegistry.registerItem(zincIngot, "zincIngot");
		zincDust = new zincDust();
		GameRegistry.registerItem(zincDust, "zincDust");
		zincPipe = new zincPipe();
		GameRegistry.registerItem(zincPipe, "zincPipe");
		zincPlate = new zincPlate();
		GameRegistry.registerItem(zincPlate, "zincPlate");
		zincRod = new zincRod();
		GameRegistry.registerItem(zincRod, "zincRod");
		// silver
		silverIngot = new silverIngot();
		GameRegistry.registerItem(silverIngot, "silverIngot");
		silverDust = new silverDust();
		GameRegistry.registerItem(silverDust, "silverDust");
		silverPipe = new silverPipe();
		GameRegistry.registerItem(silverPipe, "silverPipe");
		silverPlate = new silverPlate();
		GameRegistry.registerItem(silverPlate, "silverPlate");
		silverRod = new silverRod();
		GameRegistry.registerItem(silverRod, "silverRod");
		// steel
		steelIngot = new steelIngot();
		GameRegistry.registerItem(steelIngot, "steelIngot");
		steelDust = new steelDust();
		GameRegistry.registerItem(steelDust, "steelDust");
		steelPipe = new steelPipe();
		GameRegistry.registerItem(steelPipe, "steelPipe");
		steelPlate = new steelPlate();
		GameRegistry.registerItem(steelPlate, "steelPlate");
		steelRod = new steelRod();
		GameRegistry.registerItem(steelRod, "steelRod");
		// ===================================================================\\
		// ==============================Misc==================================\\
		// =====================================================================\\
		// hard brick
		hardbrick = new hardbrick();
		GameRegistry.registerItem(hardbrick, "hardbrick");
		// concrete mix
		concreteMix = new concreteMix();
		GameRegistry.registerItem(concreteMix, "concreteMix");
		// Radioactive
		yellowcake = new yellowcake();
		GameRegistry.registerItem(yellowcake, "yellowcake");

		Radiation = new RadiationEffect(25, true, 0).setIconIndex(0, 0).setPotionName("potion.radiationEffect");
		MinecraftForge.EVENT_BUS.register(new PotionEvent());

		uraniumPuck238 = new uraniumPuck238();
		GameRegistry.registerItem(uraniumPuck238, "uraniumPuck238");
		uraniumPuck235 = new uraniumPuck235();
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
		nickelBlock = new nickelBlock(Material.iron);
		GameRegistry.registerBlock(nickelBlock, "nickelBlock");
		nickelOre = new nickelOre(Material.rock);
		GameRegistry.registerBlock(nickelOre, "nickelOre");
		// osmium
		osmiumBlock = new osmiumBlock(Material.iron);
		GameRegistry.registerBlock(osmiumBlock, "osmiumBlock");
		osmiumOre = new osmiumOre(Material.rock);
		GameRegistry.registerBlock(osmiumOre, "osmiumOre");
		// lead
		leadBlock = new leadBlock(Material.iron);
		GameRegistry.registerBlock(leadBlock, "leadBlock");
		leadOre = new leadOre(Material.rock);
		GameRegistry.registerBlock(leadOre, "leadOre");
		// platinum
		platinumBlock = new platinumBlock(Material.iron);
		GameRegistry.registerBlock(platinumBlock, "platinumBlock");
		platinumOre = new platinumOre(Material.rock);
		GameRegistry.registerBlock(platinumOre, "platinumOre");
		// tin
		tinBlock = new tinBlock(Material.iron);
		GameRegistry.registerBlock(tinBlock, "tinBlock");
		tinOre = new tinOre(Material.rock);
		GameRegistry.registerBlock(tinOre, "tinOre");
		// zinc
		zincBlock = new zincBlock(Material.iron);
		GameRegistry.registerBlock(zincBlock, "zincBlock");
		zincOre = new zincOre(Material.rock);
		GameRegistry.registerBlock(zincOre, "zincOre");
		// silver
		silverBlock = new silverBlock(Material.iron);
		GameRegistry.registerBlock(silverBlock, "silverBlock");
		silverOre = new silverOre(Material.rock);
		GameRegistry.registerBlock(silverOre, "silverOre");
		// uranium
		uraniumOre = new uraniumOre(Material.rock);
		GameRegistry.registerBlock(uraniumOre, "uraniumOre");
		// ===================================================================\\
		// ==============================Misc==================================\\
		// =====================================================================\\
		// unnatural elements
		// Alloys or Extractants
		// steel
		steelBlock = new steelBlock(Material.iron);
		GameRegistry.registerBlock(steelBlock, "steelBlock");
		// Building Blocks
		hardBrick = new hardBrick(Material.rock);
		GameRegistry.registerBlock(hardBrick, "hardBrick");
		reinforcedGlowstone = new reinforcedGlowstone(Material.rock);
		GameRegistry.registerBlock(reinforcedGlowstone, "reinforcedGlowstone");
	}
	

}
