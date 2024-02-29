package fun.delson.delcompass.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import fun.delson.delcompass.utils.Chat;
import fun.delson.delcompass.utils.CompassUtils;

public class CompassRefresh implements Listener {
	
	@EventHandler
	public void onRightClick (PlayerInteractEvent event) {
		
		ItemStack item = event.getItem();
		Player player = event.getPlayer();
		
		if (item != null) {
			if (CompassUtils.checkTracker(item)) {
				if (item.getItemMeta().getLore().size() > 1) {
					Player trackedPlayer = Bukkit.getPlayer(item.getItemMeta().getLore().get(1));
					String trackedDisplayName = trackedPlayer.getDisplayName();
					CompassUtils.refresh(item);
					player.sendMessage(Chat.color("&bTracker is now pointing toward " + trackedDisplayName));
				}
			} else if (CompassUtils.checkCompass(item)) {
				Location spawn = player.getWorld().getSpawnLocation();
				player.setCompassTarget(spawn);
				player.sendMessage(Chat.color("&bTracker is now pointing toward spawn."));
			}
		}
		
	}

}
