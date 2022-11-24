package fun.delson.delcompass.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CompassUtils {
	
	/**
	 * Checks an item to see if it is a tracking compass.
	 * @param item Item to check.
	 * @return Boolean value representing whether the item is a tracker.
	 */
	public static boolean checkTracker (ItemStack item) {
		if (item.getType().equals(Material.COMPASS) && item.getItemMeta().getLore() != null && item.getItemMeta().getLore().get(0).equals(Chat.color("&dTracking"))) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks an item to see if it is a normal compass.
	 * @param item Item to check.
	 * @return Boolean value representing whether the item is a regular compass.
	 */
	public static boolean checkCompass (ItemStack item) {
		if (item.getType().equals(Material.COMPASS) && (item.getItemMeta().getLore() == null || (item.getItemMeta().getLore() != null && !item.getItemMeta().getLore().get(0).equals(Chat.color("&dTracking"))))) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Makes a new tracking compass with no target.
	 * @return ItemStack for a tracker with no target.
	 */
	public static ItemStack makeTracker() {
		List<String> lore = new ArrayList<String>();
		lore.add(Chat.color("&dTracking"));
		ItemStack tracker = new ItemStack(Material.COMPASS);
		ItemMeta tracker_meta = tracker.getItemMeta();
		tracker_meta.setDisplayName(Chat.color("&rTracking Compass"));
		tracker_meta.setLore(lore);
		tracker_meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		tracker.setItemMeta(tracker_meta);
		return tracker;
	}
	
	/**
	 * Makes a new tracking compass with a target.
	 * @param player Player to be targeted.
	 * @return ItemStack for a tracker with a target.
	 */
	public static ItemStack makeTracker(Player player) {
		List<String> lore = new ArrayList<String>();
		lore.add(Chat.color("&dTracking"));
		lore.add(player.getDisplayName());
		ItemStack tracker = new ItemStack(Material.COMPASS);
		ItemMeta tracker_meta = tracker.getItemMeta();
		tracker_meta.setDisplayName(Chat.color("&rTracking Compass"));
		tracker_meta.setLore(lore);
		tracker_meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		tracker.setItemMeta(tracker_meta);
		return tracker;
	}
	
	/**
	 * Sets the target of the specified tracking compass.
	 * @param compass Tracker to be modified.
	 * @param player Player to be targeted.
	 */
	public static void setTarget (ItemStack compass, Player player) {
		
		List<String> lore = new ArrayList<String>();
		lore.add(Chat.color("&dTracking"));
		lore.add(player.getDisplayName());
		ItemMeta compass_meta = compass.getItemMeta();
		
		compass_meta.setLore(lore);
		compass_meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		
		compass.setItemMeta(compass_meta);
		
	}

}
