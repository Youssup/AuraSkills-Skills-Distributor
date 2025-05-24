package com.youssup.auraSkillsSkillsDistributor;

import org.bukkit.event.Listener;

import java.util.*;

// Manages Skills for each player
public class SkillPointManager implements Listener {
    // Track each player's unspent points by UUID
    private final Map<UUID, Integer> unspentPoints = new HashMap<>();
}
