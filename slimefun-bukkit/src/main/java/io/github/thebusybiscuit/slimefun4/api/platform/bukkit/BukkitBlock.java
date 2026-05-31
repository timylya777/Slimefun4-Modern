package io.github.thebusybiscuit.slimefun4.api.platform.bukkit;

import io.github.thebusybiscuit.slimefun4.api.platform.SFBlock;
import io.github.thebusybiscuit.slimefun4.api.platform.SFWorld;
import org.bukkit.block.Block;
import javax.annotation.Nonnull;

/**
 * Bukkit implementation of the SFBlock wrapper.
 */
public class BukkitBlock implements SFBlock {
    private final Block block;
    private final SFWorld world;

    public BukkitBlock(@Nonnull Block block) {
        this.block = block;
        this.world = new BukkitWorld(block.getWorld());
    }

    @Nonnull
    @Override
    public String getMaterialName() {
        return block.getType().name();
    }

    @Nonnull
    @Override
    public SFWorld getWorld() {
        return world;
    }

    @Override
    public int getX() {
        return block.getX();
    }

    @Override
    public int getY() {
        return block.getY();
    }

    @Override
    public int getZ() {
        return block.getZ();
    }

    @Nonnull
    @Override
    public Block getNativeBlock() {
        return block;
    }
}
