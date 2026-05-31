package io.github.thebusybiscuit.slimefun4.api.platform;

import java.util.UUID;
import javax.annotation.Nonnull;

/**
 * Platform-independent abstraction wrapper for a Player.
 * Helps isolate Slimefun core logic from Bukkit/Spigot/Paper or Fabric/Forge APIs.
 */
public interface SFPlayer {

    @Nonnull
    UUID getUniqueId();

    @Nonnull
    String getName();

    void sendMessage(@Nonnull String message);

    boolean hasPermission(@Nonnull String permission);

    @Nonnull
    Object getNativePlayer();
}
