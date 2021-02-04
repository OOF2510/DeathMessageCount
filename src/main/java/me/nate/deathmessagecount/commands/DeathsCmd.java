package me.nate.deathmessagecount.commands;

import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DeathsCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length <= 1) {
            String ps = args[0];
            Player p = Bukkit.getServer().getPlayer(ps);
            int c = p.getStatistic(Statistic.DEATHS);
            String cs = String.valueOf(c);
            String n = "you have "+cs+" deaths";
            p.sendMessage(n);
        } else {
            Player p = (Player) sender;
            int c = p.getStatistic(Statistic.DEATHS);
            String cs = String.valueOf(c);
            String n = "you have "+cs+" deaths";
            p.sendMessage(n);
        }

        return true;
    }
}
