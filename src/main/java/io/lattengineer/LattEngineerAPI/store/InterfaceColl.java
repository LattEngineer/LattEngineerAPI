package io.lattengineer.LattEngineerAPI.store;

import io.lattengineer.LattEngineerAPI.entity.LattEngineerEntity;
import io.lattengineer.LattEngineerAPI.plugin.LattEngineerPlugin;

public interface InterfaceColl<E extends LattEngineerEntity<E>>
{
	public String getId();
	public Class<E> getGenericClass();
	public LattEngineerPlugin getPlugin();
	public Runnable getTick();
}
