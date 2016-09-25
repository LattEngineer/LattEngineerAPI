package io.lattengineer.LattEngineerAPI.event;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LattEngineerEvent extends Event implements Cancellable, Runnable
{
	private final Map<String, Object> customData = new LinkedHashMap<>();
	public Map<String, Object> getCustomData() { return this.customData; }
	
	private final static HandlerList handler = new HandlerList();
	private boolean cancel;
	
	public LattEngineerEvent()
	{
		super();
	}
	
	public LattEngineerEvent(Entry<String, Object> data)
	{
		super(false);
		this.customData.put(data.getKey(), data.getValue());
	}
	
	public LattEngineerEvent(Map<String, Object> data)
	{
		super(false);
		this.customData.putAll(data);
	}
	
	public LattEngineerEvent(boolean isSync)
	{
		super(isSync);
	}
	
	public LattEngineerEvent(boolean isSync, Entry<String, Object> data)
	{
		super(isSync);
		this.customData.put(data.getKey(), data.getValue());
	}
	
	public LattEngineerEvent(boolean isSync, Map<String, Object> data)
	{
		super(isSync);
		this.customData.putAll(data);
	}

	@Override
	public HandlerList getHandlers() { return handler; }

	public boolean isCancelled() { return this.cancel; }

	public void setCancelled(boolean cancel) { this.cancel = cancel; }
	
	public void run() { Bukkit.getPluginManager().callEvent(this); }
	
	public static HandlerList getHandlerList() { return handler; }
}
