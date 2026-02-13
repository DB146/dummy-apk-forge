package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zzqp extends zzpq {
    public zzqp(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.pal.zzpq
    public final /* bridge */ /* synthetic */ Object zza(zzaef zzaefVar) {
        zzup zzupVar = (zzup) zzaefVar;
        int zzg = zzupVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzupVar.zzh().zzt(), "HMAC");
        int zza = zzupVar.zzg().zza();
        int i7 = zzg - 2;
        if (i7 == 1) {
            return new zzyo(new zzyn("HMACSHA1", secretKeySpec), zza);
        }
        if (i7 == 2) {
            return new zzyo(new zzyn("HMACSHA384", secretKeySpec), zza);
        }
        if (i7 == 3) {
            return new zzyo(new zzyn("HMACSHA256", secretKeySpec), zza);
        }
        if (i7 == 4) {
            return new zzyo(new zzyn("HMACSHA512", secretKeySpec), zza);
        }
        if (i7 == 5) {
            return new zzyo(new zzyn("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
