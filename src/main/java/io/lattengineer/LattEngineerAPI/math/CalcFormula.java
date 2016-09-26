package io.lattengineer.LattEngineerAPI.math;

public class CalcFormula implements Formula
{
	protected final String formula;
	
	public CalcFormula(String formula)
	{
		if(formula == null) throw new NullPointerException("formula cannot be null");
	}
	
	public CalcFormula(Formula formula)
	{
		
	}
}
