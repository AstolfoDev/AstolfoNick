package tech.astolfo.astolfonick;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static org.inventivetalent.nicknamer.api.NickNamerAPI.getNickManager;

public final class AstolfoNick extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new AstolfoNick(), this);
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        getNickManager().setNick(event.getPlayer().getUniqueId(),  event.getPlayer().getDisplayName());
    }
}
