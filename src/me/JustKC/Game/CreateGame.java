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
                if (!(main.returnDeathMessage())) {
                    Bukkit.getPluginManager().registerEvents(new DeathListener(), main);
                    Bukkit.getPluginManager().registerEvents(new ArrowDamage(), main);
                    main.setDeathMessage();
                }
            }
            return true;
        }
        return false;
    }
}
