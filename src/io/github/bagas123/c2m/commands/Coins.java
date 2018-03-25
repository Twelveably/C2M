package io.github.bagas123.c2m.commands;

import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.earth2me.essentials.api.NoLoanPermittedException;
import com.earth2me.essentials.api.UserDoesNotExistException;

import io.github.bagas123.c2m.Main;
import net.ess3.api.Economy;
import net.md_5.bungee.api.ChatColor;

public class Coins implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

	Player p = (Player) sender;

	if (sender instanceof Player) {
	    if (args.length == 0) { // no args

	    } else if (args[0].equals("buy")) {
		if (args.length == 3) {
		    if (isNumeric(args[2])) {

			ItemStack coins1 = createItem(new ItemStack(Material.PRISMARINE_CRYSTALS, 1),
				ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
				new String[] { "", ChatColor.translateAlternateColorCodes('&',
					"&8&l[&r&2Coin&8&l]&8&l[&r&3Tier 1&8&l]") });

			ItemStack coins2 = createItem(new ItemStack(Material.GOLD_NUGGET, 1),
				ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
				new String[] { "", ChatColor.translateAlternateColorCodes('&',
					"&8&l[&r&2Coin&8&l]&8&l[&r&2Tier 2&8&l]") });

			ItemStack coins3 = createItem(new ItemStack(Material.EMERALD, 1),
				ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
				new String[] { "", ChatColor.translateAlternateColorCodes('&',
					"&8&l[&r&2Coin&8&l]&8&l[&r&cTier 3&8&l]") });

			if (args[1].equals("t1")) {
			    try {
				if (Economy.getMoney(p.getName()) > Main.instance.getConfig().getInt("price1")
					* Integer.parseInt(args[2]) - 1) {
				    p.sendMessage("You bought " + args[2] + " coins for "
					    + Main.instance.getConfig().getInt("price1") * Integer.parseInt(args[2]));

				    ItemStack coin1 = createItem(
					    new ItemStack(Material.PRISMARINE_CRYSTALS, Integer.parseInt(args[2])),
					    ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
					    new String[] { "", ChatColor.translateAlternateColorCodes('&',
						    "&8&l[&r&2Coin&8&l]&8&l[&r&3Tier 1&8&l]") });

				    p.getInventory().addItem(coin1);
				    Economy.setMoney(p.getName(), Economy.getMoney(p.getName())
					    - Main.instance.getConfig().getInt("price1") * Integer.parseInt(args[2]));
				} else {
				    p.sendMessage("You don't have enough money!");
				}
			    } catch (NumberFormatException | UserDoesNotExistException | NoLoanPermittedException e) {
				e.printStackTrace();
			    }
			}

			if (args[1].equals("t2")) {
			    try {
				if (Economy.getMoney(p.getName()) > Main.instance.getConfig().getInt("price2")
					* Integer.parseInt(args[2]) - 1) {
				    p.sendMessage("You bought " + args[2] + " coins for "
					    + Main.instance.getConfig().getInt("price2") * Integer.parseInt(args[2]));

				    ItemStack coin1 = createItem(
					    new ItemStack(Material.GOLD_NUGGET, Integer.parseInt(args[2])),
					    ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
					    new String[] { "", ChatColor.translateAlternateColorCodes('&',
						    "&8&l[&r&2Coin&8&l]&8&l[&r&2Tier 2&8&l]") });

				    p.getInventory().addItem(coin1);
				    Economy.setMoney(p.getName(), Economy.getMoney(p.getName())
					    - Main.instance.getConfig().getInt("price2") * Integer.parseInt(args[2]));
				} else {
				    p.sendMessage("You don't have enough money!");
				}
			    } catch (NumberFormatException | UserDoesNotExistException | NoLoanPermittedException e) {
				e.printStackTrace();
			    }
			}
			if (args[1].equals("t3")) {
			    try {
				if (Economy.getMoney(p.getName()) > Main.instance.getConfig().getInt("price3")
					* Integer.parseInt(args[2]) - 1) {
				    p.sendMessage("You bought " + args[2] + " coins for "
					    + Main.instance.getConfig().getInt("price3") * Integer.parseInt(args[2]));

				    ItemStack coin1 = createItem(
					    new ItemStack(Material.EMERALD, Integer.parseInt(args[2])),
					    ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
					    new String[] { "", ChatColor.translateAlternateColorCodes('&',
						    "&8&l[&r&2Coin&8&l]&8&l[&r&cTier 3&8&l]") });

				    p.getInventory().addItem(coin1);
				    Economy.setMoney(p.getName(), Economy.getMoney(p.getName())
					    - Main.instance.getConfig().getInt("price3") * Integer.parseInt(args[2]));
				} else {
				    p.sendMessage("You don't have enough money!");
				}
			    } catch (NumberFormatException | UserDoesNotExistException | NoLoanPermittedException e) {
				e.printStackTrace();
			    }
			}
		    } else {
			p.sendMessage("Please specify a number!");
		    }
		} else {
		    p.sendMessage("Wrong usage!");
		}
	    } else if (args[0].equals("sell")) {
		if (args.length == 3) {
		    if (isNumeric(args[2])) {

			ItemStack coins1 = createItem(new ItemStack(Material.PRISMARINE_CRYSTALS, 1),
				ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
				new String[] { "", ChatColor.translateAlternateColorCodes('&',
					"&8&l[&r&2Coin&8&l]&8&l[&r&3Tier 1&8&l]") });

			ItemStack coins2 = createItem(new ItemStack(Material.GOLD_NUGGET, 1),
				ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
				new String[] { "", ChatColor.translateAlternateColorCodes('&',
					"&8&l[&r&2Coin&8&l]&8&l[&r&2Tier 2&8&l]") });

			ItemStack coins3 = createItem(new ItemStack(Material.EMERALD, 1),
				ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
				new String[] { "", ChatColor.translateAlternateColorCodes('&',
					"&8&l[&r&2Coin&8&l]&8&l[&r&cTier 3&8&l]") });

			if (args[1].equals("t1")) {
			    if (p.getInventory().containsAtLeast(coins1, Integer.parseInt(args[2]))) {
				removeCoin1(p.getInventory(), Integer.parseInt(args[2]));
				try {
				    Economy.add(p.getName(),
					    Main.instance.getConfig().getInt("price1") * Integer.parseInt(args[2]));
				} catch (NumberFormatException | NoLoanPermittedException
					| UserDoesNotExistException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				p.sendMessage("You sold " + Integer.parseInt(args[2]) + " coins for "
					+ Main.instance.getConfig().getInt("price1") * Integer.parseInt(args[2]));
			    } else {
				p.sendMessage("You don't have enough coins!");
			    }
			}

			if (args[1].equals("t2")) {
			    if (p.getInventory().containsAtLeast(coins2, Integer.parseInt(args[2]))) {
				removeCoin2(p.getInventory(), Integer.parseInt(args[2]));
				try {
				    Economy.add(p.getName(),
					    Main.instance.getConfig().getInt("price2") * Integer.parseInt(args[2]));
				} catch (NumberFormatException | NoLoanPermittedException
					| UserDoesNotExistException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				p.sendMessage("You sold " + Integer.parseInt(args[2]) + " coins for "
					+ Main.instance.getConfig().getInt("price2") * Integer.parseInt(args[2]));
			    } else {
				p.sendMessage("You don't have enough coins!");
			    }
			}

			if (args[1].equals("t3")) {
			    if (p.getInventory().containsAtLeast(coins3, Integer.parseInt(args[2]))) {
				removeCoin3(p.getInventory(), Integer.parseInt(args[2]));
				try {
				    Economy.add(p.getName(),
					    Main.instance.getConfig().getInt("price3") * Integer.parseInt(args[2]));
				} catch (NumberFormatException | NoLoanPermittedException
					| UserDoesNotExistException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				p.sendMessage("You sold " + Integer.parseInt(args[2]) + " coins for "
					+ Main.instance.getConfig().getInt("price3") * Integer.parseInt(args[2]));
			    } else {
				p.sendMessage("You don't have enough coins!");
			    }
			}
		    } else {
			p.sendMessage("Please specify a number!");
		    }
		} else {
		    p.sendMessage("Wrong usage!");
		}
	    } else if (args[0].equals("give")) {
		if (args.length == 4) {
		    if (isNumeric(args[3])) {
			String playerName = args[1];

			Player target = sender.getServer().getPlayerExact(playerName);
			if (target == null) { // check whether the player is
					      // online
			    sender.sendMessage("Player " + playerName + " is not online.");
			    return true;
			} else {
			    if (args[2].equals("t1")) {
				ItemStack coin = createItem(new ItemStack(Material.PRISMARINE_CRYSTALS, Integer.parseInt(args[3])),
					ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
					new String[] { "", ChatColor.translateAlternateColorCodes('&',
						"&8&l[&r&2Coin&8&l]&8&l[&r&3Tier 1&8&l]") });

				target.getInventory().addItem(coin);
				target.sendMessage(ChatColor.translateAlternateColorCodes('&',
					"Given " + args[3] + " &b&lOrthexa&r &a&lCoin&f(s) Tier 1 to " + args[1]));
			    }
			    if (args[2].equals("t2")) {
				ItemStack coin = createItem(new ItemStack(Material.GOLD_NUGGET, Integer.parseInt(args[3])),
					ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
					new String[] { "", ChatColor.translateAlternateColorCodes('&',
						"&8&l[&r&2Coin&8&l]&8&l[&r&2Tier 2&8&l]") });

				target.getInventory().addItem(coin);
				target.sendMessage(ChatColor.translateAlternateColorCodes('&',
					"Given " + args[3] + " &b&lOrthexa&r &a&lCoin&f(s) Tier 2 to " + args[1]));
			    }
			    if (args[2].equals("t3")) {
				ItemStack coin = createItem(new ItemStack(Material.EMERALD, Integer.parseInt(args[3])),
					ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"),
					new String[] { "", ChatColor.translateAlternateColorCodes('&',
						"&8&l[&r&2Coin&8&l]&8&l[&r&cTier 3&8&l]") });

				target.getInventory().addItem(coin);
				target.sendMessage(ChatColor.translateAlternateColorCodes('&',
					"Given " + args[3] + " &b&lOrthexa&r &a&lCoin&f(s) Tier 3 to " + args[1]));
			    }
			}
		    } else {
			p.sendMessage("Please specify a number!");
		    }
		} else {
		    p.sendMessage("Wrong usage!");
		}
	    }
	}
	return true;
    }

    public boolean isNumeric(String str) {
	return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static int removeCoin1(Inventory inventory, int amount) {

	ItemStack coins1 = createItem(new ItemStack(Material.PRISMARINE_CRYSTALS, amount),
		ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"), new String[] { "",
			ChatColor.translateAlternateColorCodes('&', "&8&l[&r&2Coin&8&l]&8&l[&r&3Tier 1&8&l]") });

	if (inventory == null)
	    return -1;
	if (amount <= 0)
	    return -1;

	if (amount == Integer.MAX_VALUE) {
	    inventory.remove(coins1);
	    return 0;
	}

	HashMap<Integer, ItemStack> retVal = inventory.removeItem(coins1);

	int notRemoved = 0;
	for (ItemStack item : retVal.values()) {
	    notRemoved += item.getAmount();
	}
	return notRemoved;
    }

    public static int removeCoin2(Inventory inventory, int amount) {

	ItemStack coins1 = createItem(new ItemStack(Material.GOLD_NUGGET, amount),
		ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"), new String[] { "",
			ChatColor.translateAlternateColorCodes('&', "&8&l[&r&2Coin&8&l]&8&l[&r&2Tier 2&8&l]") });

	if (inventory == null)
	    return -1;
	if (amount <= 0)
	    return -1;

	if (amount == Integer.MAX_VALUE) {
	    inventory.remove(coins1);
	    return 0;
	}

	HashMap<Integer, ItemStack> retVal = inventory.removeItem(coins1);

	int notRemoved = 0;
	for (ItemStack item : retVal.values()) {
	    notRemoved += item.getAmount();
	}
	return notRemoved;
    }

    public static int removeCoin3(Inventory inventory, int amount) {

	ItemStack coins1 = createItem(new ItemStack(Material.EMERALD, amount),
		ChatColor.translateAlternateColorCodes('&', "&b&lOrthexa&r &a&lCoin"), new String[] { "",
			ChatColor.translateAlternateColorCodes('&', "&8&l[&r&2Coin&8&l]&8&l[&r&cTier 3&8&l]") });

	if (inventory == null)
	    return -1;
	if (amount <= 0)
	    return -1;

	if (amount == Integer.MAX_VALUE) {
	    inventory.remove(coins1);
	    return 0;
	}

	HashMap<Integer, ItemStack> retVal = inventory.removeItem(coins1);

	int notRemoved = 0;
	for (ItemStack item : retVal.values()) {
	    notRemoved += item.getAmount();
	}
	return notRemoved;
    }

    private static ItemStack createItem(ItemStack item, String name, String[] lore) {
	ItemMeta im = item.getItemMeta();
	im.setDisplayName(name);
	im.setLore(Arrays.asList(lore));
	im.addEnchant(Enchantment.DURABILITY, 1, true);
	item.setItemMeta(im);
	return item;
    }

}
