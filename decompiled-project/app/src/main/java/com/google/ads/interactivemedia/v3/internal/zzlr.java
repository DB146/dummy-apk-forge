package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzlr extends zzmh {
    private final zzkl zzi;

    public zzlr(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i7, int i10, zzkl zzklVar) {
        super(zzktVar, "arUAIOjzzWAni7xTOswaHQr3wtwyzPRaYoBef/ZyPO7309A9Cz1g/8S+xyESDVpo", "HeIaWctQk46NnQnOwQLKiY+3aHDGAM/VBIR1Ph30xLs=", zzafVar, i7, 94);
        this.zzi = zzklVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() {
        int intValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzat.zza(intValue));
        }
    }
}
