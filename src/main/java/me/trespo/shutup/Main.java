package me.trespo.shutup;

import me.trespo.shutup.response.ShutUp;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ShutUp(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
