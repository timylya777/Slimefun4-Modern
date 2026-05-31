package io.github.thebusybiscuit.slimefun4.api.platform;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Platform-independent abstraction wrapper for an ItemStack.
 * Helps isolate Slimefun core logic from Bukkit/Spigot/Paper or Fabric/Forge APIs.
 */
public interface SFItemStack {

    @Nonnull
    String getMaterialName();

    int getAmount();

    void setAmount(int amount);

    @Nullable
    String getDisplayName();

    boolean hasCustomNbt(@Nonnull String key);

    @Nullable
    String getCustomNbtString(@Nonnull String key);

    void setCustomNbtString(@Nonnull String key, @Nonnull String value);

    @Nonnull
    Object getNativeItemStack();
}
