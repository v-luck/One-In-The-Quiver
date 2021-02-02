package me.JustKC.Game;

import org.bukkit.entity.Arrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ArrowDamage implements Listener {
    @EventHandler
    public void damageEvent(EntityDamageByEntityEvent entity) {
        if (entity.getDamager() instanceof Arrow) {
            entity.setDamage(100);

        }

    }
}
