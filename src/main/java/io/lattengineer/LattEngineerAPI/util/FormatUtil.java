package io.lattengineer.LattEngineerAPI.util;

import org.bukkit.ChatColor;

public class FormatUtil
{
	public static boolean isNumber(Object arg0)
	{
		try {
			if(arg0 instanceof Number) return true;
			if(arg0 instanceof String) {
				if(((String) arg0).contains("(?i)^0x")) {
					arg0 = ((String) arg0).replaceFirst("(?i)^0x", "");
					Integer.parseInt((String) arg0, 16);
				}
				else {
					Double.parseDouble((String) arg0);
				}
				return true;
			}
			else {
				return false;
			}
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	public static boolean isHexFormat(String arg0)
	{
		if(arg0.contains("(?i)^0x")) {
			try {
				arg0 = ((String) arg0).replaceFirst("(?i)^0x", "");
				Integer.parseInt((String) arg0, 16);
				return true;
			}
			catch(NumberFormatException e) {
				return false;
			}
		}
		else return false;
	}

	public static boolean isBukkitColorMessage(String arg0)
	{
		return ! arg0.equalsIgnoreCase(ChatColor.stripColor(arg0));
	}
}
