package flippity.aten.utils;

import java.util.Iterator;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class itemRemover {
	public static void removeCraftingRecipe(Item item) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();

		while (remover.hasNext()) {
			ItemStack itemstack = remover.next().getRecipeOutput();

			if (itemstack != null && itemstack.getItem() == item) {
				remover.remove();
			}
		}
	}

}
