package me.matt5262.itemsTestPlugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {


        if (commandSender instanceof Player player){
            ItemStack flower = new ItemStack(Material.FLOWERING_AZALEA, 2);
            player.getInventory().setItem(1, flower);

            ItemStack food = new ItemStack(Material.BEEF, 16);
            ItemMeta foodMeta = food.getItemMeta();
            foodMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eBEEEF"));

            List<String> foodLore = new ArrayList<>();
            foodLore.add("This is a beeefy beef!");
            foodLore.add("You want to eat me really bad..");
            foodMeta.setLore(foodLore);

            foodMeta.addEnchant(Enchantment.KNOCKBACK, 10000, true);

            food.setItemMeta(foodMeta);
            player.getInventory().addItem(food);
        }



        return true;
    }
}
