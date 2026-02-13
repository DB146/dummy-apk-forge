package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import h3.o;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzajp implements Serializable, Iterable<Byte> {
    public static final zzajp zza = new zzajw(zzalb.zzb);
    private static final zzajs zzb = new zzajz();
    private int zzc = 0;

    static {
        new zzajr();
    }

    public static /* synthetic */ int zza(byte b2) {
        return b2 & 255;
    }

    public static int zza(int i7, int i10, int i11) {
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

    public static zzajp zza(String str) {
        return new zzajw(str.getBytes(zzalb.zza));
    }

    public static zzajp zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzajp zza(byte[] bArr, int i7, int i10) {
        zza(i7, i7 + i10, bArr.length);
        return new zzajw(zzb.zza(bArr, i7, i10));
    }

    public static zzajp zzb(byte[] bArr) {
        return new zzajw(bArr);
    }

    public static zzaju zzc(int i7) {
        return new zzaju(i7);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zzc;
        if (i7 == 0) {
            int zzb2 = zzb();
            i7 = zzb(zzb2, 0, zzb2);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zzc = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzajo(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzb2 = zzb();
        String zza2 = zzb() <= 50 ? zzanh.zza(this) : X.c.h(zzanh.zza(zza(0, 47)), "...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(zzb2);
        sb2.append(" contents=\"");
        return o.p(sb2, zza2, "\">");
    }

    public abstract byte zza(int i7);

    public final int zza() {
        return this.zzc;
    }

    public abstract zzajp zza(int i7, int i10);

    public abstract void zza(zzajm zzajmVar);

    public abstract void zza(byte[] bArr, int i7, int i10, int i11);

    public abstract byte zzb(int i7);

    public abstract int zzb();

    public abstract int zzb(int i7, int i10, int i11);

    public abstract zzakb zzc();

    public final byte[] zzd() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzalb.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }
}
