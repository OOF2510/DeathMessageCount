package me.nate.deathmessagecount;

import me.nate.deathmessagecount.commands.DeathsCmd;
import me.nate.deathmessagecount.listeners.DeathListen;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathMessageCount extends JavaPlugin {

    @Override
    public void onEnable() {
        new DeathListen(this);
        this.getCommand("deaths").setExecutor(new DeathsCmd());
    }
}
