package io.github.thebusybiscuit.slimefun4.api.platform;

import javax.annotation.Nonnull;

/**
 * Accessor for platform wrapper conversions.
 */
public interface PlatformProvider {

    @Nonnull
    SFPlayer wrapPlayer(@Nonnull Object nativePlayer);

    @Nonnull
    SFItemStack wrapItemStack(@Nonnull Object nativeItemStack);

    @Nonnull
    SFBlock wrapBlock(@Nonnull Object nativeBlock);

    @Nonnull
    SFWorld wrapWorld(@Nonnull Object nativeWorld);

    @Nonnull
    SFInventory wrapInventory(@Nonnull Object nativeInventory);
}
