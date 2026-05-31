package io.github.thebusybiscuit.slimefun4.api.platform.bukkit;

import io.github.thebusybiscuit.slimefun4.api.platform.SFPlayer;
import org.bukkit.entity.Player;
import java.util.UUID;
import javax.annotation.Nonnull;

/**
 * Bukkit implementation of the SFPlayer wrapper.
 */
public class BukkitPlayer implements SFPlayer {
    private final Player player;

    public BukkitPlayer(@Nonnull Player player) {
        this.player = player;
    }

    @Nonnull
    @Override
    public UUID getUniqueId() {
        return player.getUniqueId();
    }

    @Nonnull
    @Override
    public String getName() {
        return player.getName();
    }

    @Override
    public void sendMessage(@Nonnull String message) {
        player.sendMessage(message);
    }

    @Override
    public boolean hasPermission(@Nonnull String permission) {
        return player.hasPermission(permission);
    }

    @Nonnull
    @Override
    public Player getNativePlayer() {
        return player;
    }
}
