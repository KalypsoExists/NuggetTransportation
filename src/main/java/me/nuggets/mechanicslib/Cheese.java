package me.nuggets.mechanicslib;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cheese extends JavaPlugin {

    private static DataHandler settings;
    private static Cheese plugin;

    @Override
    public void onEnable() {
        plugin = this;
        settings = new DataHandler(this, "settings");
    }

    @Override
    public void onDisable() {
    }

    public static Cheese getInstance() {
        return plugin;
    }

    public static FileConfiguration getSettings() {
        return settings.getConfig();
    }
}
