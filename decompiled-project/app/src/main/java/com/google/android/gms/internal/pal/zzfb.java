package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzfb extends zzfg {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzfb(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "5BhEc19mhLCb3gixLpO/usqpdcrz8iDHUvKRNr8tUAX9rUzF0wog6vEOJrftvcpW", "yZHUQ89G8fTgEsMNs0hBrXwZIrb4VL1iE12C/t/Y3UE=", zzrVar, i7, 33);
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
            this.zze.zzW(zzi.longValue());
        }
    }
}
