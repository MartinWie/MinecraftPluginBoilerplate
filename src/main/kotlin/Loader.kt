package main

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

public class Loader : JavaPlugin(),Listener,CommandExecutor{
    override fun onEnable() {
        super.onEnable()
        Bukkit.getPluginManager().registerEvents(this,this)
    }

    @EventHandler
    public fun joinEvent(event: PlayerJoinEvent){
        event.player.sendMessage("Hello ${event.player.name}")
    }
}