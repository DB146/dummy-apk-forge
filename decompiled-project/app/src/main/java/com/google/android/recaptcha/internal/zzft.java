package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import cc.E;
import cc.F;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzft implements zzfo {
    private final E zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(E e2, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = e2;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int zzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (zza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbk.zza;
        int zzk = zzufVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, d dVar) {
        Object k = F.k(new zzfq(zzgdVar, list, this, null), dVar);
        return k == a.f5345a ? k : q.f3365a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, d dVar) {
        Object k = F.k(new zzfr(exc, zzgdVar, this, null), dVar);
        return k == a.f5345a ? k : q.f3365a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        F.B(this.zza, null, 0, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
