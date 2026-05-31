package io.github.thebusybiscuit.slimefun4.api.platform;

import javax.annotation.Nonnull;

/**
 * Platform-independent abstraction wrapper for a World.
 * Helps isolate Slimefun core logic from Bukkit/Spigot/Paper or Fabric/Forge APIs.
 */
public interface SFWorld {

    @Nonnull
    String getName();

    @Nonnull
    Object getNativeWorld();
}
