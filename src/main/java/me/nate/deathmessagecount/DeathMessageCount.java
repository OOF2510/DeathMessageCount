package me.nate.deathmessagecount;

import me.nate.deathmessagecount.listeners.DeathListen;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathMessageCount extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new DeathListen(this);
    }
}
