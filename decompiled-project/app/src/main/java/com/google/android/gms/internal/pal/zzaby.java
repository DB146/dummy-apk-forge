package com.google.android.gms.internal.pal;

import A3.c;
import h3.o;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzaby implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzaby zzb = new zzabv(zzadg.zzd);
    private static final zzabx zzd;
    private int zzc = 0;

    static {
        int i7 = zzabk.zza;
        zzd = new zzabx(null);
        zza = new zzabq();
    }

    public static int zzl(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(c.f(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(X.c.e(i10, i11, "End index: ", " >= "));
    }

    public static zzaby zzn(byte[] bArr) {
        return zzo(bArr, 0, bArr.length);
    }

    public static zzaby zzo(byte[] bArr, int i7, int i10) {
        zzl(i7, i7 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        return new zzabv(bArr2);
    }

    public static zzaby zzp(String str) {
        return new zzabv(str.getBytes(zzadg.zzb));
    }

    public static zzaby zzq(byte[] bArr) {
        return new zzabv(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zzc;
        if (i7 == 0) {
            int zzd2 = zzd();
            i7 = zzf(zzd2, 0, zzd2);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zzc = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzabp(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzafg.zza(this) : zzafg.zza(zzg(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(zzd2);
        sb2.append(" contents=\"");
        return o.p(sb2, zza2, "\">");
    }

    public abstract byte zza(int i7);

    public abstract byte zzb(int i7);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i7, int i10, int i11);

    public abstract int zzf(int i7, int i10, int i11);

    public abstract zzaby zzg(int i7, int i10);

    public abstract zzacc zzh();

    public abstract String zzi(Charset charset);

    public abstract void zzj(zzabo zzaboVar);

    public abstract boolean zzk();

    public final int zzm() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzi(charset);
    }

    public final boolean zzs() {
        return zzd() == 0;
    }

    public final byte[] zzt() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzadg.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
