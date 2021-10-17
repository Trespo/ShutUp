package me.trespo.shutup.response;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ShutUp implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        if (!(event.getPlayer() instanceof Player)) {
            event.getPlayer().sendMessage("I only tell players to shut up.");
            return;
        }

        Player player = event.getPlayer();

        player.sendMessage("SHUT UP!");

    }

}
