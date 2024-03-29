package net.emir.practicecore;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CoreUtils {

    public static ItemStack GenerateItem(String Name, Material Type) {
        ItemStack Item = new ItemStack(Type, 1);
        ItemMeta ItemMeta = Item.getItemMeta();
        ItemMeta.setDisplayName(Name);
        Item.setItemMeta(ItemMeta);
        return Item;
    }



    public static void GivePracticeSpawnItems(Player player) {
        player.getInventory().clear();
        player.getInventory().setItem(0,GenerateItem(PracticeCore.PrimaryColor + "Unranked Queue §7(Right Click)", Material.IRON_SWORD));
        player.getInventory().setItem(1,GenerateItem(PracticeCore.PrimaryColor + "Ranked Queue §7(Right Click)", Material.DIAMOND_SWORD));
        player.getInventory().setItem(2,GenerateItem(PracticeCore.PrimaryColor + "Layout Editor §7(Right Click)", Material.BOOK));
        player.getInventory().setItem(3,GenerateItem(PracticeCore.PrimaryColor + "Play Previous §7(Right Click)", Material.PAPER));

        player.getInventory().setItem(5,GenerateItem(PracticeCore.PrimaryColor + "Create Party §7(Right Click)", Material.NAME_TAG));
        player.getInventory().setItem(6,GenerateItem(PracticeCore.PrimaryColor + "View Leaderboards §7(Right Click)", Material.ITEM_FRAME));
        player.getInventory().setItem(7,GenerateItem(PracticeCore.PrimaryColor + "Host Events §7(Right Click)", Material.EYE_OF_ENDER));
        player.getInventory().setItem(8,GenerateItem(PracticeCore.PrimaryColor + "Edit Settings §7(Right Click)", Material.SKULL_ITEM));
    }

}
