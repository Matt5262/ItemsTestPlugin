package me.matt5262.itemsTestPlugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        
        if (e.getWhoClicked() instanceof Player player){
            
            var clickedItem = e.getCurrentItem();

            if (clickedItem != null && clickedItem.getType() != Material.AIR) {
                player.sendMessage(clickedItem.getType().toString());
                if (e.isRightClick()){
                    ItemMeta diamondMeta = clickedItem.getItemMeta();

                    if (diamondMeta != null) {
                        diamondMeta.setDisplayName(ChatColor.AQUA + "EPIC DIAMOND");
                    }
                    clickedItem.setItemMeta(diamondMeta);
                    clickedItem.setType(Material.DIAMOND);
                }


            }


        }
        
    }

}
