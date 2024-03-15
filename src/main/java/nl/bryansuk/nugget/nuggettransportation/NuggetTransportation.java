package nl.bryansuk.nugget.nuggettransportation;

import org.bukkit.plugin.java.JavaPlugin;

public final class NuggetTransportation extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("nuggettransportation").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
    }
}
