package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes.dex */
final class zzas extends zzbw {
    private final float volume;

    private zzas(float f4) {
        this.volume = f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzbw) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((zzbw) obj).volume());
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        return "VolumeUpdateData{volume=" + this.volume + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbw
    public float volume() {
        return this.volume;
    }
}
