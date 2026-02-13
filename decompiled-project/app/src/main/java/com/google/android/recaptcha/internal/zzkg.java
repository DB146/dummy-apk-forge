package com.google.android.recaptcha.internal;

import h3.o;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch) {
        this.zza = zzkdVar;
        if (ch != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzb);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) {
        zzkd zzkdVar;
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf(o.l(zze.length(), "Invalid input length "));
        }
        int i7 = 0;
        int i10 = 0;
        while (i7 < zze.length()) {
            long j = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zzkdVar = this.zza;
                if (i11 >= zzkdVar.zzc) {
                    break;
                }
                j <<= zzkdVar.zzb;
                if (i7 + i11 < zze.length()) {
                    j |= this.zza.zzb(zze.charAt(i12 + i7));
                    i12++;
                }
                i11++;
            }
            int i13 = zzkdVar.zzd;
            int i14 = i12 * zzkdVar.zzb;
            int i15 = (i13 - 1) * 8;
            while (i15 >= (i13 * 8) - i14) {
                bArr[i10] = (byte) ((j >>> i15) & 255);
                i15 -= 8;
                i10++;
            }
            i7 += this.zza.zzc;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i7, int i10) {
        int i11 = 0;
        zzjf.zzd(0, i10, bArr.length);
        while (i11 < i10) {
            zzf(appendable, bArr, i11, Math.min(this.zza.zzd, i10 - i11));
            i11 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i7) {
        return (int) (((this.zza.zzb * i7) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i7) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i7, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i7, int i10) {
        zzjf.zzd(i7, i7 + i10, bArr.length);
        int i11 = 0;
        zzjf.zza(i10 <= this.zza.zzd);
        long j = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j = (j | (bArr[i7 + i12] & 255)) << 8;
        }
        int i13 = (i10 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i11 < i10 * 8) {
            long j10 = j >>> ((i13 - zzkdVar.zzb) - i11);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j10) & zzkdVar2.zza));
            i11 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i11 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i11 += this.zza.zzb;
            }
        }
    }
}
