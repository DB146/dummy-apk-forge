package com.google.android.gms.internal.pal;

import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class zzwx extends zzacz implements zzaeg {
    private static final zzwx zzb;
    private String zze = "";
    private zzadf zzf = zzacz.zzaz();

    static {
        zzwx zzwxVar = new zzwx();
        zzb = zzwxVar;
        zzacz.zzaF(zzwx.class, zzwxVar);
    }

    private zzwx() {
    }

    public static zzwx zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzvw.class});
        }
        if (i10 == 3) {
            return new zzwx();
        }
        if (i10 == 4) {
            return new zzww(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzd() {
        return this.zzf;
    }
}
