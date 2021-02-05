package me.nate.deathmessagecount.commands;

import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class DeathsCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1) {
            String ps = args[0];
            Player p = Bukkit.getServer().getPlayer(ps);
            String pn = p.getName();
            int c = p.getStatistic(Statistic.DEATHS);
            String cs = String.valueOf(c);
            String n = pn+" has "+cs+" deaths";
            if (sender instanceof Player) {
                Player e = (Player) sender;
                e.sendMessage(n);
            } else {
                ConsoleCommandSender ccs = Bukkit.getServer().getConsoleSender();
                ccs.sendMessage(n);
            }
        } else {
            Player p = (Player) sender;
            int c = p.getStatistic(Statistic.DEATHS);
            String cs = String.valueOf(c);
            String n = "You have "+cs+" deaths";
            p.sendMessage(n);
        }

        return true;
    }
}
