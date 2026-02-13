package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzli extends zzmh {
    public zzli(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i7, int i10) {
        super(zzktVar, "xROrTzATo2RpEUZnqjmzz/KxV50V2Zu/NCSSTz9KL4aCDCRzHSZ6wXUPoT05wTK4", "570CSH2ThsTn5d3BraANFK/v79ts3BH8wAiSy3z3JGg=", zzafVar, i7, 5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            try {
                this.zze.zzm(iArr[0]);
                this.zze.zzl(iArr[1]);
                int i7 = iArr[2];
                if (i7 != Integer.MIN_VALUE) {
                    this.zze.zzk(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
