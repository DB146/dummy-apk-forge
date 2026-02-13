package com.google.android.gms.internal.pal;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzadt {
    private static final zzadt zza = new zzadp(null);
    private static final zzadt zzb = new zzadr(0 == true ? 1 : 0);

    public /* synthetic */ zzadt(zzads zzadsVar) {
    }

    public static zzadt zzd() {
        return zza;
    }

    public static zzadt zze() {
        return zzb;
    }

    public abstract List zza(Object obj, long j);

    public abstract void zzb(Object obj, long j);

    public abstract void zzc(Object obj, Object obj2, long j);
}
