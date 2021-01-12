package me.JustKC.Game;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class DeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Bukkit.broadcastMessage("Hell;o");
        event.setDeathMessage(event.getEntity().getDisplayName() + " absolutely roledon");
        event.getEntity().getKiller().getInventory().addItem(new ItemStack(Material.ARROW, 1));

    }
}
