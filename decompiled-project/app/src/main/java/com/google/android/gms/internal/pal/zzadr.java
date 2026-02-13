package com.google.android.gms.internal.pal;

import java.util.List;

/* loaded from: classes.dex */
final class zzadr extends zzadt {
    private zzadr() {
        super(null);
    }

    public /* synthetic */ zzadr(zzadq zzadqVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final List zza(Object obj, long j) {
        zzadf zzadfVar = (zzadf) zzafs.zzf(obj, j);
        if (zzadfVar.zzc()) {
            return zzadfVar;
        }
        int size = zzadfVar.size();
        zzadf zzd = zzadfVar.zzd(size == 0 ? 10 : size + size);
        zzafs.zzs(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzb(Object obj, long j) {
        ((zzadf) zzafs.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzc(Object obj, Object obj2, long j) {
        zzadf zzadfVar = (zzadf) zzafs.zzf(obj, j);
        zzadf zzadfVar2 = (zzadf) zzafs.zzf(obj2, j);
        int size = zzadfVar.size();
        int size2 = zzadfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzadfVar.zzc()) {
                zzadfVar = zzadfVar.zzd(size2 + size);
            }
            zzadfVar.addAll(zzadfVar2);
        }
        if (size > 0) {
            zzadfVar2 = zzadfVar;
        }
        zzafs.zzs(obj, j, zzadfVar2);
    }
}
