
package cn.org.qlm.www.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlassingotItem extends Item {
	public GlassingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
