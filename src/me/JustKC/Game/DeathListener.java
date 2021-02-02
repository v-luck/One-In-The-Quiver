package me.JustKC.Game;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class DeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Bukkit.broadcastMessage("Hello");
        Player player = (Player) event.getEntity();

        if (player.getLastDamageCause() instanceof EntityDamageByEntityEvent) {
            EntityDamageByEntityEvent entityDamageByEntityEvent =  (EntityDamageByEntityEvent) player.getLastDamageCause();
            event.setDeathMessage(event.getEntity().getDisplayName() + " absolutely roledon by " + entityDamageByEntityEvent.getDamager().getName());
        }
    }
}
