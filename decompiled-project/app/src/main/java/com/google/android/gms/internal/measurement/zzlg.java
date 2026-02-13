package com.google.android.gms.internal.measurement;

import h3.o;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzlg implements Iterable, Serializable {
    public static final zzlg zzb = new zzlf(zzmo.zzb);
    private int zza = 0;

    static {
        int i7 = zzku.zza;
    }

    public static zzlg zzh(byte[] bArr, int i7, int i10) {
        zzj(i7, i7 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        return new zzlf(bArr2);
    }

    public static int zzj(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i7);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < i7) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 44 + String.valueOf(i10).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i7);
            sb3.append(", ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length());
        sb4.append("End index: ");
        sb4.append(i10);
        sb4.append(" >= ");
        sb4.append(i11);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 == 0) {
            int zzc = zzc();
            i7 = zzg(zzc, 0, zzc);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zza = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkz(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzc = zzc();
        String zza = zzc() <= 50 ? zzof.zza(this) : zzof.zza(zze(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(zzc);
        sb2.append(" contents=\"");
        return o.p(sb2, zza, "\">");
    }

    public abstract byte zza(int i7);

    public abstract byte zzb(int i7);

    public abstract int zzc();

    public abstract zzlg zze(int i7, int i10);

    public abstract void zzf(zzky zzkyVar);

    public abstract int zzg(int i7, int i10, int i11);

    public final int zzi() {
        return this.zza;
    }
}
