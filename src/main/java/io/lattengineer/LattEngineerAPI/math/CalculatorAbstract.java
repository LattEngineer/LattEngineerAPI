package io.lattengineer.LattEngineerAPI.math;

import java.util.Map;
import java.util.Map.Entry;

import io.lattengineer.LattEngineerAPI.util.FormatType;

public abstract class CalculatorAbstract extends FormatType implements Formula
{	
	@Override
	public Formula get()
	{
		return this.get(null);
	}
	
	@Override
	public void putValue(String key, Object value)
	{
		this.putValue(key, value, true);
	}
	
	@Override
	public void putValueEntry(Entry<String, Object> v)
	{
		this.putValueEntry(v, true);
	}
	
	@Override
	public void putValueMap(Map<String, Object> v)
	{
		this.putValueMap(v, true);
	}
	
	@Override
	public Object getResult()
	{
		return this.getResult(null);
	}
	
	@Override
	public Object getResult(String arg0)
	{
		return this.getResult(arg0, null);
	}
}
