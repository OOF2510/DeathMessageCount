package me.nate.deathmessagecount.commands;

import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DeathsCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        int c = p.getStatistic(Statistic.DEATHS);
        String cs = String.valueOf(c);
        String n = "you have "+cs+" deaths";
        p.sendMessage(n);

        return true;
    }
}
