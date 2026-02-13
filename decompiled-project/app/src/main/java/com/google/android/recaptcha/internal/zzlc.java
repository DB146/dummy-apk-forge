package com.google.android.recaptcha.internal;

import X.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzlc extends zzlb {
    protected final byte[] zza;

    public zzlc(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzle) || zzd() != ((zzle) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return obj.equals(this);
        }
        zzlc zzlcVar = (zzlc) obj;
        int zzj = zzj();
        int zzj2 = zzlcVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException(c.e(zzd, zzlcVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlcVar.zza;
        zzlcVar.zzc();
        int i7 = 0;
        int i10 = 0;
        while (i7 < zzd) {
            if (bArr[i7] != bArr2[i10]) {
                return false;
            }
            i7++;
            i10++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final int zzf(int i7, int i10, int i11) {
        return zznl.zzb(i7, this.zza, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final zzle zzg(int i7, int i10) {
        int zzi = zzle.zzi(0, i10, zzd());
        return zzi == 0 ? zzle.zzb : new zzkz(this.zza, 0, zzi);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zzh(zzkw zzkwVar) {
        ((zzlk) zzkwVar).zzc(this.zza, 0, zzd());
    }
}
