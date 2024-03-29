package net.emir.practicecore;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PracticeCore extends JavaPlugin implements Listener {

    public static String PrimaryColor = "§d";
    public static String SecondaryColor = "§f";



    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
        Bukkit.broadcastMessage("§7[" + PrimaryColor + "PracticeCore" + "§7] " + SecondaryColor + " Attempting to load PracticeCore.");
        for (Player player : Bukkit.getOnlinePlayers()){
            CoreUtils.GivePracticeSpawnItems(player);
        }
        Bukkit.broadcastMessage("§7[" + PrimaryColor + "PracticeCore" + "§7] " + SecondaryColor + "PracticeCore Loaded!");
    }

    @EventHandler
    public static void PlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        CoreUtils.GivePracticeSpawnItems(player);
    }

}
