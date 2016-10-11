package io.lattengineer.LattEngineerAPI.plugin;

import org.bukkit.plugin.java.JavaPlugin;

import io.lattengineer.LattEngineerAPI.math.CalcFormula;
import io.lattengineer.LattEngineerAPI.math.Formula;

public class LattEngineerPlugin extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		Formula formula = CalcFormula.newFormula();
		formula.setFormula("22+14+29+42+8");
		double value = formula.getResultDouble();
	}
	
	@Override
	public void onDisable()
	{
		
	}
}
