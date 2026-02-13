package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzet extends zzfg {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzet(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "Cv0JAL9ptzpRvgIi9AFTFGn0l5MhpPgpRN4VfZybymKMuiqBn9AG0bgJaX/QotAk", "/xONYRXeBwNZknPQ1yARx5KZSPQPbfL2mKAb1nbkf2s=", zzrVar, i7, 1);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                try {
                    if (zzi == null) {
                        zzi = (String) this.zzf.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
