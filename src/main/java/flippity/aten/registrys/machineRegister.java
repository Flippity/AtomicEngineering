package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import flippity.aten.blocks.machinery.energy.turbine.Turbine;
import flippity.aten.blocks.machinery.conveyor.ConveyorBelt;


public class MachineRegister {
	public static Block turbine;
	public static Block conveyorBelt;
	public static Block conveyorBeltManipulator;
	public static void registerBlocks() {
		turbine = new Turbine();
		GameRegistry.registerBlock(turbine, "turbine");
		conveyorBelt = new ConveyorBelt();
		GameRegistry.registerBlock(conveyorBelt, "conveyorBelt");
	}
}
