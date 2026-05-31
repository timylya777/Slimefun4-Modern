package io.github.thebusybiscuit.slimefun4.api.platform.bukkit;

import io.github.thebusybiscuit.slimefun4.api.platform.SFInventory;
import io.github.thebusybiscuit.slimefun4.api.platform.SFItemStack;
import io.github.thebusybiscuit.slimefun4.api.platform.SFPlatform;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Bukkit implementation of the SFInventory wrapper.
 */
public class BukkitInventory implements SFInventory {
    private final Inventory inventory;

    public BukkitInventory(@Nonnull Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public int getSize() {
        return inventory.getSize();
    }

    @Nullable
    @Override
    public SFItemStack getItem(int slot) {
        ItemStack item = inventory.getItem(slot);
        return item != null ? SFPlatform.wrapItemStack(item) : null;
    }

    @Override
    public void setItem(int slot, @Nullable SFItemStack item) {
        inventory.setItem(slot, item != null ? (ItemStack) item.getNativeItemStack() : null);
    }

    @Nonnull
    @Override
    public Inventory getNativeInventory() {
        return inventory;
    }
}
