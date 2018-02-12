package flippity.aten.lib.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import flippity.aten.blocks.machinery.conveyor.conveyorBeltEntity;
import flippity.aten.blocks.machinery.energy.turbine.turbineEntity;
import flippity.aten.blocks.machinery.energy.turbine.turbineRender;
import flippity.aten.blocks.researchTables.researchTableEntity;
import flippity.aten.blocks.researchTables.researchTableRender;
import flippity.aten.blocks.machinery.conveyor.conveyorBeltRender;
import flippity.aten.items.machines.research.tables;
import flippity.aten.registrys.machineRegister;
import flippity.aten.utils.GenericBlockItemRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
public class ClientProxy extends CommonProxy {

	public static void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(researchTableEntity.class, new researchTableRender());
		ClientRegistry.bindTileEntitySpecialRenderer(turbineEntity.class, new turbineRender());
		ClientRegistry.bindTileEntitySpecialRenderer(conveyorBeltEntity.class, new conveyorBeltRender());
		registerItemRenderers();
	}

	public static int clientTicks;
	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent event){
	 if(event.phase == Phase.END){
	 GuiScreen gui = Minecraft.getMinecraft().currentScreen;
	 if(gui == null || !gui.doesGuiPauseGame()) clientTicks++;
	 }
	}
	
	public static void registerItemRenderers() {
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(tables.researchTableMK1), new GenericBlockItemRenderer(new researchTableEntity(), new researchTableRender()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(machineRegister.turbine), new GenericBlockItemRenderer(new turbineEntity(), new turbineRender()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(machineRegister.conveyorBelt), new GenericBlockItemRenderer(new conveyorBeltEntity(), new conveyorBeltRender()));

	}

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);

	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);

	}

}