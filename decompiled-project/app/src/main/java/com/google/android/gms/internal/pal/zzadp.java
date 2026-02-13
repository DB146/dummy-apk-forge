package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzadp extends zzadt {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzadp() {
        super(null);
    }

    public /* synthetic */ zzadp(zzado zzadoVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i7) {
        zzadm zzadmVar;
        List list = (List) zzafs.zzf(obj, j);
        if (list.isEmpty()) {
            List zzadmVar2 = list instanceof zzadn ? new zzadm(i7) : ((list instanceof zzaem) && (list instanceof zzadf)) ? ((zzadf) list).zzd(i7) : new ArrayList(i7);
            zzafs.zzs(obj, j, zzadmVar2);
            return zzadmVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            zzafs.zzs(obj, j, arrayList);
            zzadmVar = arrayList;
        } else {
            if (!(list instanceof zzafn)) {
                if (!(list instanceof zzaem) || !(list instanceof zzadf)) {
                    return list;
                }
                zzadf zzadfVar = (zzadf) list;
                if (zzadfVar.zzc()) {
                    return list;
                }
                zzadf zzd = zzadfVar.zzd(list.size() + i7);
                zzafs.zzs(obj, j, zzd);
                return zzd;
            }
            zzadm zzadmVar3 = new zzadm(list.size() + i7);
            zzadmVar3.addAll(zzadmVar3.size(), (zzafn) list);
            zzafs.zzs(obj, j, zzadmVar3);
            zzadmVar = zzadmVar3;
        }
        return zzadmVar;
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzafs.zzf(obj, j);
        if (list instanceof zzadn) {
            unmodifiableList = ((zzadn) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzaem) && (list instanceof zzadf)) {
                zzadf zzadfVar = (zzadf) list;
                if (zzadfVar.zzc()) {
                    zzadfVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzafs.zzs(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzafs.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzafs.zzs(obj, j, list);
    }
}
