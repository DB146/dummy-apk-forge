package com.bumptech.glide.load;

import A3.f;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f14667a;

    ImageHeaderParser$ImageType(boolean z8) {
        this.f14667a = z8;
    }

    public boolean hasAlpha() {
        return this.f14667a;
    }

    public boolean isWebp() {
        int i7 = f.f352a[ordinal()];
        return i7 == 1 || i7 == 2 || i7 == 3;
    }
}
