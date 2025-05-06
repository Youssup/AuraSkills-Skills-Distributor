package com.youssup.auraSkillsSkillsDistributor;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AuraSkillsSkillsDistributor extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("AuraSkillsSkillsDistributor plugin has started");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        event.setJoinMessage("unfortunately "+event.getPlayer()+" has joined the server");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("AuraSkillsSkillsDistributor plugin has stopped");
    }
}
