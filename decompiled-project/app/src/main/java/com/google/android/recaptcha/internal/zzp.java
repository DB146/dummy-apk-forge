package com.google.android.recaptcha.internal;

import Db.g;
import Db.j;
import Db.q;
import Eb.B;
import Hb.d;
import android.support.v4.media.session.b;
import y7.u0;

/* loaded from: classes.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final g zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i7 = zzav.zza;
        this.zzb = b.z(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, d dVar) {
        zzen zzb = zzz.zzb(this, str);
        String zza = zzg().zza();
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza);
        zzf.zze(u0.x(zzf2.zzk()));
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, d dVar) {
        zzen zzc = zzz.zzc(this);
        int length = zzseVar.zzl().length();
        q qVar = q.f3365a;
        if (length == 0) {
            this.zzc = false;
            zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return qVar;
        }
        zzg().zzb(B.G(new j("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzc.zza();
        return qVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
