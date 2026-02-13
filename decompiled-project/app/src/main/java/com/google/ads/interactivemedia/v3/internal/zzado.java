package com.google.ads.interactivemedia.v3.internal;

import h3.o;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzado extends zzadn {
    protected final byte[] zza;

    public zzado(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzadr) || zzd() != ((zzadr) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzado)) {
            return obj.equals(this);
        }
        zzado zzadoVar = (zzado) obj;
        int zzq = zzq();
        int zzq2 = zzadoVar.zzq();
        if (zzq == 0 || zzq2 == 0 || zzq == zzq2) {
            return zzg(zzadoVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zza, i7, bArr, i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadn
    public final boolean zzg(zzadr zzadrVar, int i7, int i10) {
        if (i10 > zzadrVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i10 + zzd());
        }
        int i11 = i7 + i10;
        if (i11 > zzadrVar.zzd()) {
            int zzd = zzadrVar.zzd();
            StringBuilder q10 = o.q(i7, i10, "Ran off end of other: ", ", ", ", ");
            q10.append(zzd);
            throw new IllegalArgumentException(q10.toString());
        }
        if (!(zzadrVar instanceof zzado)) {
            return zzadrVar.zzk(i7, i11).equals(zzk(0, i10));
        }
        zzado zzadoVar = (zzado) zzadrVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzadoVar.zza;
        int zzc = zzc() + i10;
        int zzc2 = zzc();
        int zzc3 = zzadoVar.zzc() + i7;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzi(int i7, int i10, int i11) {
        return zzafa.zzb(i7, this.zza, zzc() + i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzj(int i7, int i10, int i11) {
        int zzc = zzc() + i10;
        return zzahy.zzf(i7, this.zza, zzc, i11 + zzc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadr zzk(int i7, int i10) {
        int zzp = zzadr.zzp(i7, i10, zzd());
        return zzp == 0 ? zzadr.zzb : new zzadl(this.zza, zzc() + i7, zzp);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadv zzl() {
        return zzadv.zzu(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zzn(zzadh zzadhVar) {
        ((zzadx) zzadhVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean zzo() {
        int zzc = zzc();
        return zzahy.zzi(this.zza, zzc, zzd() + zzc);
    }
}
