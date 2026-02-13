package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class zzku {
    private final Class zza;
    private zzkv zzc;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzrb zzd = zzrb.zza;

    public /* synthetic */ zzku(Class cls, zzkt zzktVar) {
        this.zza = cls;
    }

    private final zzku zze(Object obj, zzwa zzwaVar, boolean z8) {
        byte[] array;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (zzwaVar.zzi() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentMap concurrentMap = this.zzb;
        Integer valueOf = Integer.valueOf(zzwaVar.zza());
        if (zzwaVar.zzj() == 5) {
            valueOf = null;
        }
        zzka zza = zzpj.zzb().zza(zzps.zzf(zzwaVar.zzc().zzg(), zzwaVar.zzc().zzf(), zzwaVar.zzc().zzc(), zzwaVar.zzj(), valueOf), zzlg.zza());
        zzks zzkzVar = zza instanceof zzpc ? new zzkz(zzwaVar.zzc().zzg(), zzwaVar.zzj(), null) : zza.zza();
        int zzj = zzwaVar.zzj() - 2;
        if (zzj != 1) {
            if (zzj != 2) {
                if (zzj == 3) {
                    array = zzjv.zza;
                } else if (zzj != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzwaVar.zza()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzwaVar.zza()).array();
        }
        zzkv zzkvVar = new zzkv(obj, array, zzwaVar.zzi(), zzwaVar.zzj(), zzwaVar.zza(), zza, zzkzVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzkvVar);
        zzkx zzkxVar = new zzkx(zzkvVar.zzd(), null);
        List list = (List) concurrentMap.put(zzkxVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(zzkvVar);
            concurrentMap.put(zzkxVar, Collections.unmodifiableList(arrayList2));
        }
        if (z8) {
            if (this.zzc != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzc = zzkvVar;
        }
        return this;
    }

    public final zzku zza(Object obj, zzwa zzwaVar) {
        zze(obj, zzwaVar, true);
        return this;
    }

    public final zzku zzb(Object obj, zzwa zzwaVar) {
        zze(obj, zzwaVar, false);
        return this;
    }

    public final zzku zzc(zzrb zzrbVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zzd = zzrbVar;
        return this;
    }

    public final zzlb zzd() {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzlb zzlbVar = new zzlb(concurrentMap, this.zzc, this.zzd, this.zza, null);
        this.zzb = null;
        return zzlbVar;
    }
}
