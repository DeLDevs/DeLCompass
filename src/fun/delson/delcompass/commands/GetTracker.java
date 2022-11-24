package fun.delson.delcompass.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fun.delson.delcompass.utils.Chat;
import fun.delson.delcompass.utils.CompassUtils;

public class GetTracker implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (sender instanceof Player) {
			
			Inventory inventory = player.getInventory();
			
			if (args.length > 0 && Bukkit.getPlayer(args[0]) != null) {
				Player playerArg = Bukkit.getPlayer(args[0]);
				inventory.addItem(CompassUtils.makeTracker(playerArg));
			} else {
				inventory.addItem(CompassUtils.makeTracker());
			}
			return true;
			
		} else {
			
			sender.sendMessage(Chat.color("&6You must be a player to use this command."));
			return false;
			
		}
		
	}

}
