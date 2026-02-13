package com.google.android.gms.internal.auth;

import X.c;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class zzec extends zzeb {
    protected final byte[] zza;

    public zzec(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzef) || zzd() != ((zzef) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzec)) {
            return obj.equals(this);
        }
        zzec zzecVar = (zzec) obj;
        int zzj = zzj();
        int zzj2 = zzecVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzecVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzecVar.zzd()) {
            throw new IllegalArgumentException(c.e(zzd, zzecVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzecVar.zza;
        zzecVar.zzc();
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

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final int zze(int i7, int i10, int i11) {
        return zzfa.zzb(i7, this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final zzef zzf(int i7, int i10) {
        int zzi = zzef.zzi(0, i10, zzd());
        return zzi == 0 ? zzef.zzb : new zzdz(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean zzh() {
        return zzhn.zzc(this.zza, 0, zzd());
    }
}
