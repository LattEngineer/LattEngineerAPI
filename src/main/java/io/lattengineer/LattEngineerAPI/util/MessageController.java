package io.lattengineer.LattEngineerAPI.util;

import java.util.Map;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class MessageController extends FormatType
{
	protected final CommandSender sender;
	
	public MessageController(Player player) { this.sender = player; }
	
	public MessageController(ConsoleCommandSender console) { this.sender = console; }
	
	public MessageController(CommandSender sender) { this.sender = sender; }
	
	public void send(String message)
	{
		
	}
	
	public void send(String message, Map<String, Object> v)
	{
		
	}
	
	public void send(String message, Object... v)
	{
		
	}
	
	public static void send(CommandSender sender, String message)
	{
		
	}
}
