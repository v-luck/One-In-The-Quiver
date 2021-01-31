package me.JustKC.Game;

import net.minecraft.server.v1_16_R3.Entity;
import org.bukkit.entity.Arrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class ArrowDamage implements Listener {
    @EventHandler

    public void DamageEvent(EntityDamageByEntityEvent entity) {
        if (entity.getDamager() instanceof Arrow) {
            Arrow arrow = (Arrow) entity.getDamager();

        }

    }
}
