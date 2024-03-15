package nl.bryansuk.nugget.nuggettransportation;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String name, @NotNull String[] args) {
        List<String> aliases = new ArrayList<>();
        aliases.add("nt");
        aliases.add("nugget");

        if(sender instanceof Player) {
            if(command.getName().equalsIgnoreCase("nuggettransportation")) {
                if(args[0].equals("give")) {
                    ItemStack item = new ItemStack(Material.DIAMOND_HOE);
                    ItemMeta meta = item.getItemMeta();
                    meta.setCustomModelData(101);
                    item.setItemMeta(meta);
                    ((Player) sender).getInventory().addItem(item);
                    return true;
                }
            }
        }
        return false;
    }
}
