package io.lattengineer.LattEngineerAPI.math;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.lattengineer.LattEngineerAPI.util.FormatUtil;

public class CalcFormula extends CalculatorAbstract
{
	public static Formula newFormula()
	{
		return new CalcFormula();
	}
	
	public static Formula newFormula(String formula) throws IllegalArgumentException
	{
		return new CalcFormula(formula);
	}
	
	@Override
	public Formula get(Object value)
	{
		return this;
	}
	
	protected String formulaStr = null;
	protected String symbolFormat = "<$s>";
	@Override public String getSymbolFormat() { return this.symbolFormat; }
	@Override
	public void setSymbolFormat(String format) throws IllegalArgumentException
	{
		if(format == null) throw new NullPointerException("the format must be not null");
		if(! format.contains("\\$s")) throw new IllegalArgumentException("format type invaild");
		this.symbolFormat = format;
	}
	
	protected Map<String, Object> value;
	@Override public boolean isExist(String key) { return this.value.containsKey(key); }
	@Override public boolean isDefinedValue(String key)
	{ 
		try
		{
			this.value.get(key);
			return true;
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}
	
	
	@Override public Map<String, Object> getValueMap() { return this.value; }
	@Override public Set<Entry<String, Object>> getValueEntrySet() { return this.value.entrySet(); }
	
	@Override public Collection<String> getKey() { return this.value.keySet(); }
	@Override public Collection<Object> getValues() { return this.value.values(); }
	
	@Override
	public boolean remove(String key)
	{
		if(key == null) throw new NullPointerException("key must be not null");
		if(! value.containsKey(key)) return true;
		try
		{
			this.value.remove(key);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	@Override
	public boolean removeAll()
	{
		try
		{
			this.value = new LinkedHashMap<String, Object>();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	@Override
	public void putValue(String key, Object value, boolean chacked)
	{
		if(key == null) throw new NullPointerException("key must be not null");
		if(chacked) {
			if(FormatUtil.isNumber(value)) {
				if(value instanceof Number) {
					this.value.put(key, value);
					return;
				}
				else if(value instanceof String) {
					if(FormatUtil.isHexFormat((String) value)) {
						this.value.put(key, Integer.parseInt((String) value, 16));
						return;
					}
					else {
						this.value.put(key, Double.parseDouble((String) value));
						return;
					}
				}
			}
		}
		else this.value.put(key, value);
	}
	
	@Override
	public void putValueEntry(Entry<String,Object> entry, boolean chacked)
	{
		if(entry == null) throw new NullPointerException("the parameter entry cannot be null");
		if(chacked) {
			if(FormatUtil.isNumber(entry.getValue())) {
				if(value instanceof Number) {
					this.value.put(entry.getKey(), entry.getValue());
					return;
				}
				else if(entry.getValue() instanceof String) {
					if(FormatUtil.isHexFormat((String) entry.getValue())) {
						this.value.put(entry.getKey(), Integer.parseInt((String) entry.getValue(), 16));
						return;
					}
					else {
						this.value.put(entry.getKey(), Double.parseDouble((String) entry.getValue()));
						return;
					}
				}
			}
		}
		else this.value.put(entry.getKey(), entry.getValue());
		
	}
	@Override
	public void putValueMap(Map<String, Object> map, boolean chacked)
	{
		if(map == null) throw new NullPointerException("the parameter map cannot be null");
		if(chacked)
		{
			
		}
		else
		{
			
		}
	}

	protected String formula;
	@Override public String getFormula() { return this.formula; }
	@Override public void setFormula(String formula)
	{
		if(formula == null) throw new NullPointerException("formula cannot be null");
		this.formula = formula;
	}
	
	public CalcFormula()
	{
		this.value = new LinkedHashMap<String, Object>();
	}
	
	public CalcFormula(String formula) throws NullPointerException
	{
		if(formula == null) throw new NullPointerException();
		this.formula = formula;
		this.value = new LinkedHashMap<String, Object>();
	}
	
	public CalcFormula(Formula formula) throws ClassNotFoundException
	{
		if(formula == null) throw new ClassNotFoundException("formula cannot be null");
		this.formula = formula.getFormula();
		this.value = formula.getValueMap();
		this.value = new LinkedHashMap<String, Object>();
	}
	
	@Override
	public void putAll(Map<? extends String, ? extends Object> v)
	{
		this.value.putAll(v);
	}
	
	@Override
	public int getResultInteger()
	{
		return (int) this.getResult();
	}
	
	@Override
	public int getResultInteger(String formula)
	{
		Formula f = new CalcFormula(formula);
		return f.getResultInteger();
	}
	
	@Override
	public int getResultInteger(String formula, Map<String, Object> v)
	{
		Formula f = new CalcFormula(formula);
		f.putAll(v);
		return f.getResultInteger();
	}
	
	@Override
	public double getResultDouble()
	{
		return (Double)this.getResult();
	}
	
	@Override
	public double getResultDouble(String formula)
	{
		Formula f = new CalcFormula(formula);
		return f.getResultDouble();
	}
	
	@Override
	public double getResultDouble(String formula, Map<String, Object> v)
	{
		Formula f = new CalcFormula(formula);
		f.putAll(v);
		return f.getResultDouble();
	}
	
	@Override
	public Object getResult(String formula, Map<String, Object> v)
	{
		Formula f = new CalcFormula(formula);
		f.putValueMap(v);
		return f.getResult();
	}
}
