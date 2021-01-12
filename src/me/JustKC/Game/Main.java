package me.JustKC.Game;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("listplayer").setExecutor(new CreateGame());
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
    }

    @Override
    public void onDisable() {

    }




}
