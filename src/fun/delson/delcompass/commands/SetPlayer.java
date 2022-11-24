package fun.delson.delcompass.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import fun.delson.delcompass.utils.Chat;
import fun.delson.delcompass.utils.CompassUtils;

public class SetPlayer implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (sender instanceof Player) {
			
			ItemStack mainHand = player.getInventory().getItemInMainHand();
			
			if ( args.length > 0 && Bukkit.getPlayer(args[0]) != null && CompassUtils.checkTracker(mainHand)) {
				CompassUtils.setTarget(mainHand, Bukkit.getPlayer(args[0]));
				return true;
			} else {
				player.sendMessage(Chat.color("&6You must specify a player and be holding a tracking compass."));
				return false;
			}
			
			
		} else {
			
			sender.sendMessage(Chat.color("&6You must be a player to use this command."));
			return false;
			
		}
		
	}

}
