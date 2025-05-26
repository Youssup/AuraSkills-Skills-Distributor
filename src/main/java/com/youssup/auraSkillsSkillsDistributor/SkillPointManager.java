package com.youssup.auraSkillsSkillsDistributor;

import dev.aurelium.auraskills.api.AuraSkillsApi;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.*;

// Manages Skills for each player
public class SkillPointManager implements Listener {
    // Track each player's unspent points by UUID
    private final Map<UUID, Integer> unspentPoints = new HashMap<>();
    private final AuraSkillsApi auraSkills;

    public SkillPointManager() {
        // Register this class as an event listener
        Bukkit.getPluginManager().registerEvents(this, AuraSkillsSkillsDistributor.getPlugin());

        // Get AuraSkills API instance
        this.auraSkills = AuraSkillsApi.get();
    }
}
