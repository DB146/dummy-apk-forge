package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzyv implements zzbh {
    private final ECPrivateKey zza;
    private final zzyx zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzzb zze;
    private final zzlq zzf;
    private final byte[] zzg;

    private zzyv(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzzb zzzbVar, zzlq zzlqVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzyx(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzzbVar;
        this.zzf = zzlqVar;
        this.zzg = bArr2;
    }

    public static zzbh zza(zzkh zzkhVar) {
        ECPrivateKey zza = zzyz.zza(zzyy.zza.zza((zznk<zzzc, zzke.zza>) ((zzke) ((zzlj) zzkhVar.zza())).zzd()), zznh.zza(zzkhVar.zzf().zza(zzbj.zza())));
        byte[] bArr = new byte[0];
        if (((zzke) ((zzlj) zzkhVar.zza())).zzh() != null) {
            bArr = ((zzke) ((zzlj) zzkhVar.zza())).zzh().zzb();
        }
        return new zzyv(zza, bArr, zzyy.zza(((zzke) ((zzlj) zzkhVar.zza())).zze()), zzyy.zzb.zza((zznk<zzzb, zzke.zzc>) ((zzke) ((zzlj) zzkhVar.zza())).zzf()), zzlm.zza((zzke) ((zzlj) zzkhVar.zza())), zzkhVar.zzh().zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int i7;
        int i10;
        if (!zzqq.zza(this.zzg, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        int length = this.zzg.length;
        EllipticCurve curve = this.zza.getParams().getCurve();
        zzzb zzzbVar = this.zze;
        int zza = zzyz.zza(curve);
        int ordinal = zzzbVar.ordinal();
        if (ordinal == 0) {
            zza *= 2;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new GeneralSecurityException("unknown EC point format");
            }
            i7 = zza * 2;
            i10 = i7 + length;
            if (bArr.length >= i10) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i10), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i10);
        }
        i7 = zza + 1;
        i10 = i7 + length;
        if (bArr.length >= i10) {
        }
    }
}
