package com.tenjava.entries.legostarwarszach.t3.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener{
	
	@EventHandler(ignoreCancelled = true)
	public void onBlockBreak(BlockBreakEvent e){
		if(e.getPlayer() instanceof Player){
			Player p = e.getPlayer();
			Block b = e.getBlock();
			if(b.getType() == Material.DIAMOND){
				p.getWorld().strikeLightningEffect(b.getLocation());
				return;
			}if(b.getType() == Material.GRASS){
				p.getWorld().spawnCreature(b.getLocation(), CreatureType.CHICKEN);
				return;
			}
		}
	}

}
