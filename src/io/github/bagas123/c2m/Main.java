package io.github.bagas123.c2m;

import java.io.File;
import java.util.Arrays;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.bagas123.c2m.commands.Coins;

public class Main extends JavaPlugin {

    private File files;
    public static Main instance;

    @Override
    public void onEnable() {
	instance = this;
	saveResource("config.yml", false);
	this.files = new File(getDataFolder(), "config.yml");
	YamlConfiguration.loadConfiguration(this.files);

	this.getCommand("coins").setExecutor(new Coins());
    }

    @Override
    public void onDisable() {

    }

    public String getConfigString(String arg) {
	return getConfig().getString(arg);
    }

    public Integer getConfigInt(String arg) {
	return getConfig().getInt(arg);
    }

}
