package com.tenjava.entries.legostarwarszach.t3;

import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
	
	public static double version = 1.0;
	
	@Override
	public void onEnable() {
		System.out.print("Enableing TenJava Entry for Legostarwarszach v." + version + "");
		System.out.print("Enabled!");
	}
	
	@Override
	public void onDisable() {
		System.out.print("Disableing TenJava Entry for Legostarwarszach v." + version + "");
		System.out.print("Disabled!");
	}
	
}
