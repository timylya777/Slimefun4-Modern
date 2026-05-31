package io.github.thebusybiscuit.slimefun4.api.platform;

import javax.annotation.Nonnull;

/**
 * Access point to get the current platform provider.
 */
public final class SFPlatform {
    private static PlatformProvider provider;

    private SFPlatform() {}

    public static void setProvider(@Nonnull PlatformProvider platformProvider) {
        provider = platformProvider;
    }

    @Nonnull
    public static PlatformProvider getProvider() {
        if (provider == null) {
            throw new IllegalStateException("PlatformProvider is not initialized yet!");
        }
        return provider;
    }

    @Nonnull
    public static SFPlayer wrapPlayer(@Nonnull Object nativePlayer) {
        return getProvider().wrapPlayer(nativePlayer);
    }

    @Nonnull
    public static SFItemStack wrapItemStack(@Nonnull Object nativeItemStack) {
        return getProvider().wrapItemStack(nativeItemStack);
    }

    @Nonnull
    public static SFBlock wrapBlock(@Nonnull Object nativeBlock) {
        return getProvider().wrapBlock(nativeBlock);
    }

    @Nonnull
    public static SFWorld wrapWorld(@Nonnull Object nativeWorld) {
        return getProvider().wrapWorld(nativeWorld);
    }
}
