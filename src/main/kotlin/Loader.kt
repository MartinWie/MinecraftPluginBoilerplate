package main

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

public class Loader : JavaPlugin(),Listener,CommandExecutor{
    override fun onEnable() {
        super.onEnable()
        Bukkit.broadcastMessage("Plugin loaded!")
    }
}