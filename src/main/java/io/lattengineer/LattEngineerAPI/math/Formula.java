package io.lattengineer.LattEngineerAPI.math;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import io.lattengineer.LattEngineerAPI.Stabilized;

import java.util.Set;

/**
 * @author SkaiDream
 *
 */
public interface Formula extends Stabilized<Formula>
{
	public String getSymbolFormat();
	public void setSymbolFormat(String arg0);
	
	public Set<Entry<String, Object>> getValueEntrySet();
	public Map<String, Object> getValueMap();
	public Collection<String> getKey();
	public Collection<Object> getValues();

	public void putValue(String key, Object value);
	public void putValue(String key, Object value, boolean arg0);
	public void putValueEntry(Entry<String, Object> v);
	public void putValueEntry(Entry<String, Object> v, boolean arg0);
	public void putValueMap(Map<String, Object> v);
	public void putValueMap(Map<String, Object> v, boolean arg0);

	public void putAll(Map<? extends String, ? extends Object> v);
	
	public boolean remove(String arg0);
	public boolean removeAll();
	
	public boolean isExist(String arg0);
	public boolean isDefinedValue(String arg0);
	
	public String getFormula();
	public void setFormula(String arg0);
	
	public int getResultInteger();
	public int getResultInteger(String arg0);
	public int getResultInteger(String arg0, Map<String, Object> v);
	public double getResultDouble();
	public double getResultDouble(String arg0);
	public double getResultDouble(String arg0, Map<String, Object> v);
	public Object getResult();
	public Object getResult(String arg0);
	public Object getResult(String arg0, Map<String, Object> v);
}
