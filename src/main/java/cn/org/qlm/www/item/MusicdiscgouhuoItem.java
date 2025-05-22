
package cn.org.qlm.www.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicdiscgouhuoItem extends RecordItem {
	public MusicdiscgouhuoItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("qlm:gouhuo")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 4000);
	}
}
