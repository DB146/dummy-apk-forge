package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzep extends zzfg {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzep(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "N0mA2OgFUnHXhnZTWHrO10/LZw/fChWm76LMkbZzvR9G3lxQkMoE65IWMn9zBWSu", "uxIInGM9FQ+1gujg5A7z9IJxIqStl6tvqqzSbuEi494=", zzrVar, i7, 22);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        if (zzi == null) {
            synchronized (zzj) {
                try {
                    if (zzi == null) {
                        zzi = (Long) this.zzf.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzy(zzi.longValue());
        }
    }
}
