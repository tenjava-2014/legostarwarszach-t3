package com.tenjava.entries.legostarwarszach.t3.Events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EntityDeath implements Listener {

	@EventHandler
	public void EntityDeathEvent(org.bukkit.event.entity.EntityDeathEvent e) {
		if (e.getEntity() instanceof Creeper) {
			Location l1 = new Location(e.getEntity().getWorld(), e.getEntity()
					.getLocation().getBlockX() + 1, e.getEntity().getLocation()
					.getBlockY() + 1, e.getEntity().getLocation().getBlockZ());
			Location l2 = new Location(e.getEntity().getWorld(), e.getEntity()
					.getLocation().getBlockX() - 1, e.getEntity().getLocation()
					.getBlockY() + 1, e.getEntity().getLocation().getBlockZ());
			Location l3 = new Location(e.getEntity().getWorld(), e.getEntity()
					.getLocation().getBlockX(), e.getEntity().getLocation()
					.getBlockY() + 1, e.getEntity().getLocation().getBlockZ() + 1);
			Location l4 = new Location(e.getEntity().getWorld(), e.getEntity()
					.getLocation().getBlockX() - 1, e.getEntity().getLocation()
					.getBlockY() + 1, e.getEntity().getLocation().getBlockZ() - 1);
			l1.getBlock().setType(Material.FIRE);
			l2.getBlock().setType(Material.FIRE);
			l3.getBlock().setType(Material.FIRE);
			l4.getBlock().setType(Material.FIRE);
		}
	}

}
