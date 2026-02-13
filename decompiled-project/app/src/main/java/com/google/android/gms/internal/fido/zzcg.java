package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzcg extends zzch {
    private volatile zzch zza;
    final zzcd zzb;
    final Character zzc;

    public zzcg(zzcd zzcdVar, Character ch) {
        this.zzb = zzcdVar;
        if (ch != null && zzcdVar.zzc('=')) {
            throw new IllegalArgumentException(zzaq.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public zzcg(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.zzb.equals(zzcgVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzcgVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return hashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcg(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public void zzb(Appendable appendable, byte[] bArr, int i7, int i10) {
        int i11 = 0;
        zzap.zze(0, i10, bArr.length);
        while (i11 < i10) {
            zze(appendable, bArr, i11, Math.min(this.zzb.zzd, i10 - i11));
            i11 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final int zzc(int i7) {
        zzcd zzcdVar = this.zzb;
        return zzcj.zza(i7, zzcdVar.zzd, RoundingMode.CEILING) * zzcdVar.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final zzch zzd() {
        zzch zzchVar = this.zza;
        if (zzchVar == null) {
            zzcd zzb = this.zzb.zzb();
            zzchVar = zzb == this.zzb ? this : zza(zzb, this.zzc);
            this.zza = zzchVar;
        }
        return zzchVar;
    }

    public final void zze(Appendable appendable, byte[] bArr, int i7, int i10) {
        zzap.zze(i7, i7 + i10, bArr.length);
        int i11 = 0;
        zzap.zzc(i10 <= this.zzb.zzd);
        long j = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j = (j | (bArr[i7 + i12] & 255)) << 8;
        }
        int i13 = ((i10 + 1) * 8) - this.zzb.zzb;
        while (i11 < i10 * 8) {
            zzcd zzcdVar = this.zzb;
            appendable.append(zzcdVar.zza(zzcdVar.zza & ((int) (j >>> (i13 - i11)))));
            i11 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i11 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i11 += this.zzb.zzb;
            }
        }
    }
}
