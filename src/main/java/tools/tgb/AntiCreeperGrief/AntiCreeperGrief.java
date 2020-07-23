package tools.tgb.AntiCreeperGrief;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiCreeperGrief extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Anti Creeper Grief Enabled!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Anti Creeper Grief Disabled!");
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        if(event.getEntityType() == EntityType.CREEPER) {
            event.setCancelled(true);
        }
    }

}
