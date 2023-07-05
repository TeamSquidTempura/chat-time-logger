package org.tacowasa.chat_time_logger;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatTimeLogger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Listener(), this);


    }

    @Override
    public void onDisable() {
        super.onDisable();
        // Plugin shutdown logic
    }
}
