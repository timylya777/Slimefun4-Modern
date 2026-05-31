package io.github.thebusybiscuit.slimefun4.api.platform.bukkit;

import io.github.thebusybiscuit.slimefun4.api.platform.SFItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Bukkit implementation of the SFItemStack wrapper using PersistentDataContainer.
 */
public class BukkitItemStack implements SFItemStack {
    private final ItemStack itemStack;

    public BukkitItemStack(@Nonnull ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    @Nonnull
    @Override
    public String getMaterialName() {
        return itemStack.getType().name();
    }

    @Override
    public int getAmount() {
        return itemStack.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        itemStack.setAmount(amount);
    }

    @Nullable
    @Override
    public String getDisplayName() {
        if (!itemStack.hasItemMeta()) return null;
        ItemMeta meta = itemStack.getItemMeta();
        return meta.hasDisplayName() ? meta.getDisplayName() : null;
    }

    @Override
    public boolean hasCustomNbt(@Nonnull String key) {
        if (!itemStack.hasItemMeta()) return false;
        ItemMeta meta = itemStack.getItemMeta();
        NamespacedKey nKey = NamespacedKey.fromString(key);
        if (nKey == null) return false;
        return meta.getPersistentDataContainer().has(nKey, PersistentDataType.STRING);
    }

    @Nullable
    @Override
    public String getCustomNbtString(@Nonnull String key) {
        if (!itemStack.hasItemMeta()) return null;
        ItemMeta meta = itemStack.getItemMeta();
        NamespacedKey nKey = NamespacedKey.fromString(key);
        if (nKey == null) return null;
        return meta.getPersistentDataContainer().get(nKey, PersistentDataType.STRING);
    }

    @Override
    public void setCustomNbtString(@Nonnull String key, @Nonnull String value) {
        if (!itemStack.hasItemMeta()) return;
        ItemMeta meta = itemStack.getItemMeta();
        NamespacedKey nKey = NamespacedKey.fromString(key);
        if (nKey == null) return;
        meta.getPersistentDataContainer().set(nKey, PersistentDataType.STRING, value);
        itemStack.setItemMeta(meta);
    }

    @Nonnull
    @Override
    public ItemStack getNativeItemStack() {
        return itemStack;
    }
}
