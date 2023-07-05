package org.tacowasa.chat_time_logger;

import java.util.Date;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerChatEvent;

public class Listener implements org.bukkit.event.Listener {
    @Deprecated
    @EventHandler(priority = EventPriority.HIGH)
    public boolean onPlayerChat(PlayerChatEvent event) {
        Player p = event.getPlayer();
        String name = p.getName();
        String message = event.getMessage();
        Date date = new Date();
        event.setCancelled(true);
        Bukkit.broadcastMessage(ChatColor.GREEN+"||"+date+"||"+ChatColor.WHITE+"<"+name+"> "+message);
        return true;
    }
}
