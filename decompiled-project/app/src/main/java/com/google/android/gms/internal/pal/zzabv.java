package com.google.android.gms.internal.pal;

import X.c;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzabv extends zzabu {
    protected final byte[] zza;

    public zzabv(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaby) || zzd() != ((zzaby) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzabv)) {
            return obj.equals(this);
        }
        zzabv zzabvVar = (zzabv) obj;
        int zzm = zzm();
        int zzm2 = zzabvVar.zzm();
        if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzabvVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzabvVar.zzd()) {
            throw new IllegalArgumentException(c.e(zzd, zzabvVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzabvVar.zza;
        zzabvVar.zzc();
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

    @Override // com.google.android.gms.internal.pal.zzaby
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final int zzf(int i7, int i10, int i11) {
        return zzadg.zzd(i7, this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final zzaby zzg(int i7, int i10) {
        int zzl = zzaby.zzl(0, i10, zzd());
        return zzl == 0 ? zzaby.zzb : new zzabs(this.zza, 0, zzl);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final zzacc zzh() {
        return zzacc.zzu(this.zza, 0, zzd(), true);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final void zzj(zzabo zzaboVar) {
        ((zzace) zzaboVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean zzk() {
        return zzafx.zzf(this.zza, 0, zzd());
    }
}
