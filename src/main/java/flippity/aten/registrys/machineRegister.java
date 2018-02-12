package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.building_mats.concrete.concrete;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import flippity.aten.blocks.machinery.energy.turbine.turbine;
import flippity.aten.blocks.machinery.conveyor.conveyorBelt;


public class machineRegister {
	public static Block turbine;
	public static Block conveyorBelt;
	public static Block conveyorBeltManipulator;
	public static void registerBlocks() {
		turbine = new turbine();
		GameRegistry.registerBlock(turbine, "turbine");
		conveyorBelt = new conveyorBelt();
		GameRegistry.registerBlock(conveyorBelt, "conveyorBelt");
	}
}
