package io.github.thebusybiscuit.slimefun4.api.platform;

import javax.annotation.Nonnull;

/**
 * Platform-independent abstraction wrapper for a Block.
 * Helps isolate Slimefun core logic from Bukkit/Spigot/Paper or Fabric/Forge APIs.
 */
public interface SFBlock {

    @Nonnull
    String getMaterialName();

    @Nonnull
    SFWorld getWorld();

    int getX();

    int getY();

    int getZ();

    @Nonnull
    Object getNativeBlock();
}
