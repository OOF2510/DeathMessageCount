package me.nate.deathmessagecount.listeners;

import me.nate.deathmessagecount.DeathMessageCount;
import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListen implements Listener {
    private DeathMessageCount plugin;
    public DeathListen(DeathMessageCount plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void deathEvent(PlayerDeathEvent d) {
        Player p = d.getEntity();
        int c = p.getStatistic(Statistic.DEATHS);
        String cs = String.valueOf(c);
        String m = d.getDeathMessage();
        String n = "; their #"+cs+"death";
        d.setDeathMessage(m+n);
    }
}
