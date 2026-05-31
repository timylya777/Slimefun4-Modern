package io.github.thebusybiscuit.slimefun4.api.platform;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Platform-independent abstraction wrapper for an Inventory.
 * Helps isolate Slimefun GUI and container logic from Bukkit/Spigot/Paper or Fabric/Forge APIs.
 */
public interface SFInventory {

    int getSize();

    @Nullable
    SFItemStack getItem(int slot);

    void setItem(int slot, @Nullable SFItemStack item);

    @Nonnull
    Object getNativeInventory();
}
