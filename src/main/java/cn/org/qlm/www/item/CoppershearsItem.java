
package cn.org.qlm.www.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CoppershearsItem extends Item {
	public CoppershearsItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
