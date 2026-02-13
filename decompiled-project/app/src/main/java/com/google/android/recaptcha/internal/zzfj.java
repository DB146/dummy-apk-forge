package com.google.android.recaptcha.internal;

import Db.g;
import Hb.d;
import Ib.a;
import android.support.v4.media.session.b;
import cc.F;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzfj {
    private final g zza;

    public zzfj() {
        int i7 = zzav.zza;
        this.zza = b.z(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, d dVar) {
        zzfg zzfgVar;
        int i7;
        if (dVar instanceof zzfg) {
            zzfgVar = (zzfg) dVar;
            int i10 = zzfgVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzfgVar.zza;
                a aVar = a.f5345a;
                i7 = zzfgVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
                    zzfgVar.zzc = 1;
                    obj = F.k(zzfhVar, zzfgVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                }
                return obj;
            }
        }
        zzfgVar = new zzfg(zzfjVar, dVar);
        Object obj2 = zzfgVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzfgVar.zzc;
        if (i7 != 0) {
        }
        return obj2;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, d dVar) {
        return zzc(this, zzbrVar, zzspVar, dVar);
    }
}
