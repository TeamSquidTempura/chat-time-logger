package org.tacowasa.chat_time_logger;


import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerChatEvent;

import java.util.Arrays;
import java.util.Date;

public class Listener implements org.bukkit.event.Listener {
    @Deprecated
    @EventHandler(priority = EventPriority.HIGH)
    public boolean onPlayerChat(PlayerChatEvent event) {
        Player p = event.getPlayer();
        String name = p.getName();
        String message = event.getMessage();
        Date date = new Date();
        event.setCancelled(true);
        String n = ChatColor.WHITE+"<"+name+"> "+message;
        String x = "||"+date+"||";
        BaseComponent[] components = new ComponentBuilder(n).event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(x).create())).create();
        Bukkit.broadcast(components);
        return true;
    }
}
