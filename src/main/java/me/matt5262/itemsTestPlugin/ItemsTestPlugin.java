package me.matt5262.itemsTestPlugin;

import me.matt5262.itemsTestPlugin.commands.MenuCommand;
import me.matt5262.itemsTestPlugin.listeners.InventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemsTestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("menu").setExecutor(new MenuCommand());
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
