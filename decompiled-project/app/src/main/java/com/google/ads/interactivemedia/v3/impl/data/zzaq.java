package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes.dex */
final class zzaq extends zzbv {
    private byte set$0;
    private float volume;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbv
    public zzbw build() {
        if (this.set$0 == 1) {
            return new zzas(this.volume);
        }
        throw new IllegalStateException("Missing required properties: volume");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbv
    public zzbv volume(float f4) {
        this.volume = f4;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }
}
