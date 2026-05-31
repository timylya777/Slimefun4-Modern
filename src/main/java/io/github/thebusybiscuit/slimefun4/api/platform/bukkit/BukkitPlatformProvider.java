package io.github.thebusybiscuit.slimefun4.api.platform.bukkit;

import io.github.thebusybiscuit.slimefun4.api.platform.*;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;

/**
 * Bukkit implementation of the PlatformProvider interface.
 */
public class BukkitPlatformProvider implements PlatformProvider {

    @Nonnull
    @Override
    public SFPlayer wrapPlayer(@Nonnull Object nativePlayer) {
        if (nativePlayer instanceof Player) {
            return new BukkitPlayer((Player) nativePlayer);
        }
        throw new IllegalArgumentException("Expected org.bukkit.entity.Player but got: " + nativePlayer.getClass().getName());
    }

    @Nonnull
    @Override
    public SFItemStack wrapItemStack(@Nonnull Object nativeItemStack) {
        if (nativeItemStack instanceof ItemStack) {
            return new BukkitItemStack((ItemStack) nativeItemStack);
        }
        throw new IllegalArgumentException("Expected org.bukkit.inventory.ItemStack but got: " + nativeItemStack.getClass().getName());
    }

    @Nonnull
    @Override
    public SFBlock wrapBlock(@Nonnull Object nativeBlock) {
        if (nativeBlock instanceof Block) {
            return new BukkitBlock((Block) nativeBlock);
        }
        throw new IllegalArgumentException("Expected org.bukkit.block.Block but got: " + nativeBlock.getClass().getName());
    }

    @Nonnull
    @Override
    public SFWorld wrapWorld(@Nonnull Object nativeWorld) {
        if (nativeWorld instanceof World) {
            return new BukkitWorld((World) nativeWorld);
        }
        throw new IllegalArgumentException("Expected org.bukkit.World but got: " + nativeWorld.getClass().getName());
    }
}
