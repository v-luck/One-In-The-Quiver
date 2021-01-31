package me.JustKC.Game;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CreateGame implements CommandExecutor {
    private Main main;
    private boolean deathListen;
    public CreateGame(Main mainPlugin) {
        this.main = mainPlugin;
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("listplayer")) {
            if (!(commandSender instanceof Player)) {
                return true;
            }

            Player commandPlayer = (Player) commandSender;
            for (Player player : Bukkit.getOnlinePlayers()) {
                commandPlayer.sendMessage(player.getDisplayName());
                player.giveExp(69);
                player.setHealth(1);
                player.setHealthScale(0.20);
                player.setFoodLevel(20);
                player.setAllowFlight(true);
                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(1.0);
                player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(20);

                if (!(main.returnDeathMessage())) {
                    Bukkit.getPluginManager().registerEvents(new DeathListener(), main);
                    main.setDeathMessage();
                }
            }
            return true;
        }
        return false;
    }
}
