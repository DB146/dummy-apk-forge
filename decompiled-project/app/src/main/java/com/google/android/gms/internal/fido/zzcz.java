package com.google.android.gms.internal.fido;

import A3.c;
import h3.o;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzcz implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzcz zzb = new zzcw(zzde.zzd);
    private static final zzcy zzd;
    private int zzc = 0;

    static {
        int i7 = zzcp.zza;
        zzd = new zzcy(null);
        zza = new zzcr();
    }

    public static int zzj(int i7, int i10, int i11) {
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

    public static zzcz zzl(byte[] bArr, int i7, int i10) {
        zzj(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new zzcw(bArr2);
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
        return new zzcq(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzdg.zza(this) : zzdg.zza(zzg(0, 47)).concat("...");
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

    public abstract zzcz zzg(int i7, int i10);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzde.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
