package io.github.thebusybiscuit.slimefun4.api.platform.bukkit;

import io.github.thebusybiscuit.slimefun4.api.platform.SFWorld;
import org.bukkit.World;
import javax.annotation.Nonnull;

/**
 * Bukkit implementation of the SFWorld wrapper.
 */
public class BukkitWorld implements SFWorld {
    private final World world;

    public BukkitWorld(@Nonnull World world) {
        this.world = world;
    }

    @Nonnull
    @Override
    public String getName() {
        return world.getName();
    }

    @Nonnull
    @Override
    public World getNativeWorld() {
        return world;
    }
}
