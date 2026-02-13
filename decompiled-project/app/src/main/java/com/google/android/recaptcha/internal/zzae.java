package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import android.content.Context;
import cc.E;
import cc.F;
import com.bumptech.glide.c;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, E e2, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzg = zzkh.zzg();
        byte[] zzl = zzleVar.zzl();
        byte[] zzd = zzjz.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzk = zzle.zzk(zzd, 0, zzd.length);
        zzkh zzh = zzkh.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, d dVar) {
        return F.k(new zzac(this, str, null), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r13.zze(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzse zzseVar, d dVar) {
        zzad zzadVar;
        int i7;
        zzae zzaeVar;
        zzen zzenVar;
        if (dVar instanceof zzad) {
            zzadVar = (zzad) dVar;
            int i10 = zzadVar.zzd;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzadVar.zzd = i10 - Integer.MIN_VALUE;
                Object obj = zzadVar.zzb;
                a aVar = a.f5345a;
                i7 = zzadVar.zzd;
                q qVar = q.f3365a;
                if (i7 != 0) {
                    c.c0(obj);
                    zzen zzc = zzz.zzc(this);
                    if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
                        this.zzd = false;
                        zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
                        return qVar;
                    }
                    this.zze = zzi(zzseVar.zzg());
                    zzan zzanVar = this.zzc;
                    long zzf = zzseVar.zzf();
                    zzadVar.zza = this;
                    zzadVar.zze = zzc;
                    zzadVar.zzd = 1;
                    if (zzanVar.zzd(zzf, zzadVar) != aVar) {
                        zzaeVar = this;
                        zzenVar = zzc;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = (zzen) zzadVar.zza;
                    c.c0(obj);
                    zzenVar.zza();
                    return qVar;
                }
                zzenVar = zzadVar.zze;
                zzaeVar = (zzae) zzadVar.zza;
                c.c0(obj);
                zzan zzanVar2 = zzaeVar.zzc;
                zzadVar.zza = zzenVar;
                zzadVar.zze = null;
                zzadVar.zzd = 2;
            }
        }
        zzadVar = new zzad(this, dVar);
        Object obj2 = zzadVar.zzb;
        a aVar2 = a.f5345a;
        i7 = zzadVar.zzd;
        q qVar2 = q.f3365a;
        if (i7 != 0) {
        }
        zzan zzanVar22 = zzaeVar.zzc;
        zzadVar.zza = zzenVar;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
