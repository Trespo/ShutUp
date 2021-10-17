package me.trespo.shutup.response;

import me.trespo.shutup.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class ShutUp implements Listener {

    Main plugin;

    public ShutUp(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        new BukkitRunnable(){

            @Override
            public void run() {

                if (!(event.getPlayer() instanceof Player)) {
                    event.getPlayer().sendMessage("I only tell players to shut up.");
                    return;
                }

                Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "SHUT UP!");

            }
        }.runTaskLater(plugin, 3);
    }
}
