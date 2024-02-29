package fun.delson.delcompass;

import org.bukkit.plugin.java.JavaPlugin;

import fun.delson.delcompass.commands.GetTracker;
import fun.delson.delcompass.commands.SetPlayer;
import fun.delson.delcompass.listeners.CompassRefresh;

public class DeLCompass extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		// Listeners
		getServer().getPluginManager().registerEvents(new CompassRefresh(), this);
		
		// Commands
		getCommand("maketracker").setExecutor(new GetTracker());
		getCommand("settarget").setExecutor(new SetPlayer());
		
	}

}
