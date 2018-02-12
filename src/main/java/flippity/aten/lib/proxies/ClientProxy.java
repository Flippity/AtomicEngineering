package flippity.aten.lib.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import flippity.aten.blocks.machinery.conveyor.ConveyorBeltEntity;
import flippity.aten.blocks.machinery.energy.turbine.TurbineEntity;
import flippity.aten.blocks.machinery.energy.turbine.TurbineRender;
import flippity.aten.blocks.researchTables.ResearchTableEntity;
import flippity.aten.blocks.researchTables.ResearchTableRender;
import flippity.aten.blocks.machinery.conveyor.ConveyorBeltRender;
import flippity.aten.items.machines.research.Tables;
import flippity.aten.registrys.MachineRegister;
import flippity.aten.utils.GenericBlockItemRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
public class ClientProxy extends CommonProxy {

	public static void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(ResearchTableEntity.class, new ResearchTableRender());
		ClientRegistry.bindTileEntitySpecialRenderer(TurbineEntity.class, new TurbineRender());
		ClientRegistry.bindTileEntitySpecialRenderer(ConveyorBeltEntity.class, new ConveyorBeltRender());
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
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Tables.researchTableMK1), new GenericBlockItemRenderer(new ResearchTableEntity(), new ResearchTableRender()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MachineRegister.turbine), new GenericBlockItemRenderer(new TurbineEntity(), new TurbineRender()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MachineRegister.conveyorBelt), new GenericBlockItemRenderer(new ConveyorBeltEntity(), new ConveyorBeltRender()));

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