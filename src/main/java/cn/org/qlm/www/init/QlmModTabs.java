
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.org.qlm.www.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import cn.org.qlm.www.QlmMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class QlmModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QlmMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(QlmModItems.COPPERAXE.get());
			tabData.accept(QlmModItems.COPPERSWORD.get());
			tabData.accept(QlmModItems.COPPERHELMET_HELMET.get());
			tabData.accept(QlmModItems.COPPERHELMET_CHESTPLATE.get());
			tabData.accept(QlmModItems.COPPERHELMET_LEGGINGS.get());
			tabData.accept(QlmModItems.COPPERHELMET_BOOTS.get());
			tabData.accept(QlmModItems.COPPERARROW.get());
			tabData.accept(QlmModItems.GLASSSWORD.get());
			tabData.accept(QlmModItems.GLASSHELMET_HELMET.get());
			tabData.accept(QlmModItems.GLASSHELMET_CHESTPLATE.get());
			tabData.accept(QlmModItems.GLASSHELMET_LEGGINGS.get());
			tabData.accept(QlmModItems.GLASSHELMET_BOOTS.get());
			tabData.accept(QlmModItems.OBSIDIANAXE.get());
			tabData.accept(QlmModItems.OBSIDIANPAXEL.get());
			tabData.accept(QlmModItems.OBSIDIANSWORD.get());
			tabData.accept(QlmModItems.OBSIDIAN_ARMOR_HELMET.get());
			tabData.accept(QlmModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
			tabData.accept(QlmModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
			tabData.accept(QlmModItems.OBSIDIAN_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(QlmModItems.COPPERHOE.get());
			tabData.accept(QlmModItems.COPPERPICKAXE.get());
			tabData.accept(QlmModItems.COPPERSHOVEL.get());
			tabData.accept(QlmModItems.GLASSAXE.get());
			tabData.accept(QlmModItems.GLASSHOE.get());
			tabData.accept(QlmModItems.GLASSPICKAXE.get());
			tabData.accept(QlmModItems.GLASSSHOVEL.get());
			tabData.accept(QlmModItems.MUSICDISCGOUHUO.get());
			tabData.accept(QlmModItems.OBSIDIANHOE.get());
			tabData.accept(QlmModItems.OBSIDIAN_PICKAXE.get());
			tabData.accept(QlmModItems.OBSIDIANSHOVEL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(QlmModItems.GLASSINGOT.get());
			tabData.accept(QlmModItems.GLASSSTICK.get());
		}
	}
}
