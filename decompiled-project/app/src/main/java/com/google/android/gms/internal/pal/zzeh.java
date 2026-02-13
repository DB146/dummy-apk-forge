package com.google.android.gms.internal.pal;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzeh extends zzfg {
    private static final zzfh zzi = new zzfh();
    private final Context zzj;

    public zzeh(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10, Context context) {
        super(zzduVar, "joxZSCFIfSio2J1Z0g3HMtlcDGNvogfMyrj1e2b+qPNv6DXnDVXfwkgCXW9zFWFC", "iJiFXDBrMwFOGpG8WmWNKc3sGwXbWv8N6fPQac0mMm0=", zzrVar, i7, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        this.zze.zzn("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zzf.invoke(null, this.zzj));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzbj.zza(str.getBytes(), true));
        }
    }
}
