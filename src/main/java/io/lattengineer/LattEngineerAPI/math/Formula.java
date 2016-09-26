package io.lattengineer.LattEngineerAPI.math;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author SkaiDream
 *
 */
public interface Formula
{
	//
	// SYMBOL
	//
	public String getSymbolFormat();
	public void setSymbolFormat(String arg0);
	
	//
	// VALUE
	//
	public Set<Entry<String, Object>> getValueEntrySet();
	public Map<String, Object> getValueMap();
	public Collection<String> getKey();

	public void putValue(String key, Object value);
	public void putValueEntry(Entry<String, Object> v);
	public void putValueMap(Map<String, Object> v);
	public void putAll(Map<? extends String, ? extends Object> v);
	
	//
	//
	// FORMULA
	//
	public String getFormula();
	public void setFormula(String arg0);
	
	//
	// RESULT
	//
	public int getResultInteger();
	public int getResultInteger(String arg0);
	public int getResultInteger(String arg0, Map<String, Object> v);
	public int getResultDouble();
	public double getResultDouble(String arg0);
	public double getResultDouble(String arg0, Map<String, Object> v);
	public Object getResult();
	public Object getResult(String arg0);
	public Object getResult(String arg0, Map<String, Object> v);
}
