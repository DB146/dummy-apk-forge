package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzun extends zzuk {
    private zzun() {
        super(null);
    }

    public /* synthetic */ zzun(zzum zzumVar) {
        super(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuk
    public final int zza(zzuo zzuoVar) {
        int i7;
        int i10;
        synchronized (zzuoVar) {
            i7 = zzuoVar.remaining;
            i10 = i7 - 1;
            zzuoVar.remaining = i10;
        }
        return i10;
    }
}
