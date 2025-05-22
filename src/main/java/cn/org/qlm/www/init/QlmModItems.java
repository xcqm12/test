
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.org.qlm.www.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import cn.org.qlm.www.item.ObsidianswordItem;
import cn.org.qlm.www.item.ObsidianshovelItem;
import cn.org.qlm.www.item.ObsidianpaxelItem;
import cn.org.qlm.www.item.ObsidianhoeItem;
import cn.org.qlm.www.item.ObsidianaxeItem;
import cn.org.qlm.www.item.ObsidianPickaxeItem;
import cn.org.qlm.www.item.ObsidianArmorItem;
import cn.org.qlm.www.item.MusicdiscgouhuoItem;
import cn.org.qlm.www.item.GlassswordItem;
import cn.org.qlm.www.item.GlassstickItem;
import cn.org.qlm.www.item.GlassshovelItem;
import cn.org.qlm.www.item.GlasspickaxeItem;
import cn.org.qlm.www.item.GlassingotItem;
import cn.org.qlm.www.item.GlasshoeItem;
import cn.org.qlm.www.item.GlasshelmetItem;
import cn.org.qlm.www.item.GlassaxeItem;
import cn.org.qlm.www.item.CopperswordItem;
import cn.org.qlm.www.item.CoppershovelItem;
import cn.org.qlm.www.item.CoppershearsItem;
import cn.org.qlm.www.item.CopperpickaxeItem;
import cn.org.qlm.www.item.CopperhorsearmorItem;
import cn.org.qlm.www.item.CopperhoeItem;
import cn.org.qlm.www.item.CopperhelmetItem;
import cn.org.qlm.www.item.CopperaxeItem;
import cn.org.qlm.www.item.CopperarrowItem;
import cn.org.qlm.www.QlmMod;

public class QlmModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, QlmMod.MODID);
	public static final RegistryObject<Item> COPPERAXE = REGISTRY.register("copperaxe", () -> new CopperaxeItem());
	public static final RegistryObject<Item> COPPERHOE = REGISTRY.register("copperhoe", () -> new CopperhoeItem());
	public static final RegistryObject<Item> COPPERPICKAXE = REGISTRY.register("copperpickaxe", () -> new CopperpickaxeItem());
	public static final RegistryObject<Item> COPPERSHOVEL = REGISTRY.register("coppershovel", () -> new CoppershovelItem());
	public static final RegistryObject<Item> COPPERSWORD = REGISTRY.register("coppersword", () -> new CopperswordItem());
	public static final RegistryObject<Item> COPPERHELMET_HELMET = REGISTRY.register("copperhelmet_helmet", () -> new CopperhelmetItem.Helmet());
	public static final RegistryObject<Item> COPPERHELMET_CHESTPLATE = REGISTRY.register("copperhelmet_chestplate", () -> new CopperhelmetItem.Chestplate());
	public static final RegistryObject<Item> COPPERHELMET_LEGGINGS = REGISTRY.register("copperhelmet_leggings", () -> new CopperhelmetItem.Leggings());
	public static final RegistryObject<Item> COPPERHELMET_BOOTS = REGISTRY.register("copperhelmet_boots", () -> new CopperhelmetItem.Boots());
	public static final RegistryObject<Item> COPPERHORSEARMOR = REGISTRY.register("copperhorsearmor", () -> new CopperhorsearmorItem());
	public static final RegistryObject<Item> COPPERARROW = REGISTRY.register("copperarrow", () -> new CopperarrowItem());
	public static final RegistryObject<Item> COPPERSHEARS = REGISTRY.register("coppershears", () -> new CoppershearsItem());
	public static final RegistryObject<Item> GLASSAXE = REGISTRY.register("glassaxe", () -> new GlassaxeItem());
	public static final RegistryObject<Item> GLASSHOE = REGISTRY.register("glasshoe", () -> new GlasshoeItem());
	public static final RegistryObject<Item> GLASSPICKAXE = REGISTRY.register("glasspickaxe", () -> new GlasspickaxeItem());
	public static final RegistryObject<Item> GLASSSHOVEL = REGISTRY.register("glassshovel", () -> new GlassshovelItem());
	public static final RegistryObject<Item> GLASSSWORD = REGISTRY.register("glasssword", () -> new GlassswordItem());
	public static final RegistryObject<Item> GLASSHELMET_HELMET = REGISTRY.register("glasshelmet_helmet", () -> new GlasshelmetItem.Helmet());
	public static final RegistryObject<Item> GLASSHELMET_CHESTPLATE = REGISTRY.register("glasshelmet_chestplate", () -> new GlasshelmetItem.Chestplate());
	public static final RegistryObject<Item> GLASSHELMET_LEGGINGS = REGISTRY.register("glasshelmet_leggings", () -> new GlasshelmetItem.Leggings());
	public static final RegistryObject<Item> GLASSHELMET_BOOTS = REGISTRY.register("glasshelmet_boots", () -> new GlasshelmetItem.Boots());
	public static final RegistryObject<Item> GLASSINGOT = REGISTRY.register("glassingot", () -> new GlassingotItem());
	public static final RegistryObject<Item> GLASSSTICK = REGISTRY.register("glassstick", () -> new GlassstickItem());
	public static final RegistryObject<Item> MUSICDISCGOUHUO = REGISTRY.register("musicdiscgouhuo", () -> new MusicdiscgouhuoItem());
	public static final RegistryObject<Item> OBSIDIANHOE = REGISTRY.register("obsidianhoe", () -> new ObsidianhoeItem());
	public static final RegistryObject<Item> OBSIDIANAXE = REGISTRY.register("obsidianaxe", () -> new ObsidianaxeItem());
	public static final RegistryObject<Item> OBSIDIANPAXEL = REGISTRY.register("obsidianpaxel", () -> new ObsidianpaxelItem());
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = REGISTRY.register("obsidian_pickaxe", () -> new ObsidianPickaxeItem());
	public static final RegistryObject<Item> OBSIDIANSHOVEL = REGISTRY.register("obsidianshovel", () -> new ObsidianshovelItem());
	public static final RegistryObject<Item> OBSIDIANSWORD = REGISTRY.register("obsidiansword", () -> new ObsidianswordItem());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_HELMET = REGISTRY.register("obsidian_armor_helmet", () -> new ObsidianArmorItem.Helmet());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_CHESTPLATE = REGISTRY.register("obsidian_armor_chestplate", () -> new ObsidianArmorItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_LEGGINGS = REGISTRY.register("obsidian_armor_leggings", () -> new ObsidianArmorItem.Leggings());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_BOOTS = REGISTRY.register("obsidian_armor_boots", () -> new ObsidianArmorItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}
