package io.lattengineer.LattEngineerAPI.store;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import io.lattengineer.LattEngineerAPI.database.LEDatabase;
import io.lattengineer.LattEngineerAPI.entity.LattEngineerEntity;
import io.lattengineer.LattEngineerAPI.plugin.LattEngineerPlugin;

public class LattEngineerColl<E extends LattEngineerEntity<E>> extends LattEngineerCollAbstract<E>
{
	protected final String id;
	@Override public String getId() { return this.id; }
	public String getFixedId()
	{
		return this.getPlugin().getDescription().getName().toLowerCase() + "_" + this.getGenericClass().getSimpleName().toLowerCase();
	}
	
	protected final Class<E> genericClazz;
	@Override public Class<E> getGenericClass() { return this.genericClazz; }
	
	@SuppressWarnings("unchecked")
	public Class<E> getFixedGenericClass()
	{
		Class<?> clazz = this.getClass();
		ParameterizedType superType = (ParameterizedType) clazz.getGenericSuperclass();
		Type[] typeArguments = superType.getActualTypeArguments();
		return (Class<E>) typeArguments[0];
	}
	
	protected final LattEngineerPlugin plugin;
	@Override public LattEngineerPlugin getPlugin() { return this.plugin; }
	public LattEngineerPlugin getFixedPlugin()
	{
		int pluginLength = -1;
		LattEngineerPlugin leplugin = null;
		String name = this.getClass().getName();
		for(Plugin plugin : Bukkit.getPluginManager().getPlugins())
		{
			if(!(plugin instanceof LattEngineerPlugin)) continue;
			LattEngineerPlugin pl = (LattEngineerPlugin) plugin;
			String name2 = plugin.getDescription().getMain();
			
			String[] strArray = new String[]{name, name2};
			String prefix = StringUtils.getCommonPrefix(strArray);
			
			if(prefix == null) continue;
			int length = prefix.length();
			if(length <= pluginLength) continue;
			
			pluginLength = length;
			leplugin = pl;
		}
		
		if(leplugin == null) throw new RuntimeException("the plugin cannot be null");
		return leplugin;
	}
	
	public LattEngineerColl()
	{
		this(null, null, null);
	}
	
	public LattEngineerColl(String id)
	{
		this(id, null, null);
	}
	
	public LattEngineerColl(String id, Class<E> clazz, LattEngineerPlugin plugin)
	{
		this(id, clazz, plugin, null);
	}
	
	public LattEngineerColl(String id, Class<E> clazz, LattEngineerPlugin plugin, LEDatabase db)
	{
		if(id == null) id = this.getFixedId();
		this.id = id;
		
		if(clazz == null) clazz = this.getFixedGenericClass();
		this.genericClazz = clazz;
		
		if(plugin == null) plugin = this.getFixedPlugin();
		this.plugin = plugin;
	}
}
