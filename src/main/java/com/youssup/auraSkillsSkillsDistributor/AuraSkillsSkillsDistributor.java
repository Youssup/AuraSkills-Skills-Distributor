package com.youssup.auraSkillsSkillsDistributor;

import org.bukkit.plugin.java.JavaPlugin;

public final class AuraSkillsSkillsDistributor extends JavaPlugin {

    private static AuraSkillsSkillsDistributor plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("AuraSkillsSkillsDistributor plugin by Youssup has started");
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("AuraSkillsSkillsDistributor plugin by Youssup has stopped");
    }

    public static AuraSkillsSkillsDistributor getPlugin() {
        return plugin;
    }
}
