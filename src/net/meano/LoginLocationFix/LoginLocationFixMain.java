package net.meano.LoginLocationFix;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LoginLocationFixMain extends JavaPlugin{
	public void onEnable(){
		//Log开始记录
		getLogger().info("LoginLocationFix 0.1,by Meano. 正在载入.");
		PluginManager PM = Bukkit.getServer().getPluginManager();
		PM.registerEvents(new LoginLocationFixListeners(this), this);
	}
	public void onDisable(){
		
	}
}
