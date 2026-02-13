package com.google.android.recaptcha.internal;

import Hb.d;
import Ib.a;
import Rb.c;
import cc.F;
import h3.H;

/* loaded from: classes.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[PHI: r0
      0x0083: PHI (r0v4 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:14:0x0080, B:31:0x005c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b0 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(c cVar, long j, long j10, double d10, c cVar2, d dVar) {
        zzbp zzbpVar;
        int i7;
        long j11;
        long j12;
        double d11;
        c cVar3;
        zzbp zzbpVar2;
        c cVar4;
        c cVar5;
        long j13;
        double d12;
        Exception e2;
        if (dVar instanceof zzbp) {
            zzbpVar = (zzbp) dVar;
            int i10 = zzbpVar.zzh;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzbpVar.zzh = i10 - Integer.MIN_VALUE;
                Object obj = zzbpVar.zzf;
                a aVar = a.f5345a;
                i7 = zzbpVar.zzh;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j11 = zzbpVar.zzd;
                        d12 = zzbpVar.zze;
                        j13 = zzbpVar.zzc;
                        cVar3 = (c) zzbpVar.zzb;
                        cVar5 = (c) zzbpVar.zza;
                        com.bumptech.glide.c.c0(obj);
                        c cVar6 = cVar5;
                        zzbpVar2 = zzbpVar;
                        cVar4 = cVar6;
                        double d13 = d12;
                        j12 = j13;
                        d11 = d13;
                        try {
                        } catch (Exception e10) {
                            e2 = e10;
                            zzbp zzbpVar3 = zzbpVar2;
                            cVar5 = cVar4;
                            zzbpVar = zzbpVar3;
                            long j14 = j12;
                            d12 = d11;
                            j13 = j14;
                            if (((Boolean) cVar5.invoke(e2)).booleanValue()) {
                            }
                        }
                        zzbpVar2.zza = cVar4;
                        zzbpVar2.zzb = cVar3;
                        zzbpVar2.zzc = j12;
                        zzbpVar2.zze = d11;
                        zzbpVar2.zzd = j11;
                        zzbpVar2.zzh = 1;
                        obj = cVar3.invoke(zzbpVar2);
                        return obj == aVar ? aVar : obj;
                    }
                    j11 = zzbpVar.zzd;
                    d12 = zzbpVar.zze;
                    j13 = zzbpVar.zzc;
                    cVar3 = (c) zzbpVar.zzb;
                    cVar5 = (c) zzbpVar.zza;
                    try {
                        com.bumptech.glide.c.c0(obj);
                    } catch (Exception e11) {
                        e2 = e11;
                        if (((Boolean) cVar5.invoke(e2)).booleanValue()) {
                            throw e2;
                        }
                        j11 = H.h((long) (j11 * d12), j13);
                        zzbpVar.zza = cVar5;
                        zzbpVar.zzb = cVar3;
                        zzbpVar.zzc = j13;
                        zzbpVar.zze = d12;
                        zzbpVar.zzd = j11;
                        zzbpVar.zzh = 2;
                        if (F.l(j11, zzbpVar) == aVar) {
                            return aVar;
                        }
                        c cVar62 = cVar5;
                        zzbpVar2 = zzbpVar;
                        cVar4 = cVar62;
                        double d132 = d12;
                        j12 = j13;
                        d11 = d132;
                        zzbpVar2.zza = cVar4;
                        zzbpVar2.zzb = cVar3;
                        zzbpVar2.zzc = j12;
                        zzbpVar2.zze = d11;
                        zzbpVar2.zzd = j11;
                        zzbpVar2.zzh = 1;
                        obj = cVar3.invoke(zzbpVar2);
                        if (obj == aVar) {
                        }
                    }
                }
                com.bumptech.glide.c.c0(obj);
                j11 = j;
                j12 = j10;
                d11 = d10;
                cVar3 = cVar2;
                zzbpVar2 = zzbpVar;
                cVar4 = cVar;
                zzbpVar2.zza = cVar4;
                zzbpVar2.zzb = cVar3;
                zzbpVar2.zzc = j12;
                zzbpVar2.zze = d11;
                zzbpVar2.zzd = j11;
                zzbpVar2.zzh = 1;
                obj = cVar3.invoke(zzbpVar2);
                if (obj == aVar) {
                }
            }
        }
        zzbpVar = new zzbp(this, dVar);
        Object obj2 = zzbpVar.zzf;
        a aVar2 = a.f5345a;
        i7 = zzbpVar.zzh;
        if (i7 == 0) {
        }
    }
}
