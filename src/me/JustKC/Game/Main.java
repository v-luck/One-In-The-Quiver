package me.JustKC.Game;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private boolean canDeathMessage = false;

    @Override
    public void onEnable() {
        this.getCommand("listplayer").setExecutor(new CreateGame(this));
    }

    @Override
    public void onDisable() {

    }
    public boolean returnDeathMessage() {
        return this.canDeathMessage;
    }

    public void setDeathMessage() {
        this.canDeathMessage = true;
    }




}
