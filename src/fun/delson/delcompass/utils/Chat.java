package fun.delson.delcompass.utils;

import org.bukkit.ChatColor;

public class Chat {
	
	/**
	 * Translates the given string to accept Bukkit Color Codes.
	 * @param s String to be formatted.
	 * @return Formatted String
	 */
	public static String color (String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}

}
