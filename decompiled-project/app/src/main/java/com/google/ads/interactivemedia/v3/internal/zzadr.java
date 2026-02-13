package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import com.google.android.gms.common.api.f;
import h3.o;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzadr implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzadr zzb = new zzado(zzafa.zzd);
    private static final zzadq zzd;
    private int zzc = 0;

    static {
        int i7 = zzadd.zza;
        zzd = new zzadq(null);
        zza = new zzadj();
    }

    private static zzadr zzc(Iterator it, int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(c.f(i7, "length (", ") must be >= 1"));
        }
        if (i7 == 1) {
            return (zzadr) it.next();
        }
        int i10 = i7 >>> 1;
        zzadr zzc = zzc(it, i10);
        zzadr zzc2 = zzc(it, i7 - i10);
        if (f.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
            return zzagr.zzz(zzc, zzc2);
        }
        throw new IllegalArgumentException(X.c.e(zzc.zzd(), zzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzp(int i7, int i10, int i11) {
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

    public static zzadr zzs(byte[] bArr, int i7, int i10) {
        zzp(i7, i7 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        return new zzado(bArr2);
    }

    public static zzadr zzt(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i7 = 256;
        while (true) {
            byte[] bArr = new byte[i7];
            int i10 = 0;
            while (i10 < i7) {
                int read = inputStream.read(bArr, i10, i7 - i10);
                if (read == -1) {
                    break;
                }
                i10 += read;
            }
            zzadr zzs = i10 == 0 ? null : zzs(bArr, 0, i10);
            if (zzs == null) {
                break;
            }
            arrayList.add(zzs);
            i7 = Math.min(i7 + i7, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzv(int i7, int i10) {
        if (((i10 - (i7 + 1)) | i7) < 0) {
            if (i7 >= 0) {
                throw new ArrayIndexOutOfBoundsException(X.c.e(i7, i10, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(o.l(i7, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zzc;
        if (i7 == 0) {
            int zzd2 = zzd();
            i7 = zzi(zzd2, 0, zzd2);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zzc = i7;
        }
        return i7;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzahh.zza(this) : zzahh.zza(zzk(0, 47)).concat("...");
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

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i7, int i10, int i11);

    public abstract int zzj(int i7, int i10, int i11);

    public abstract zzadr zzk(int i7, int i10);

    public abstract zzadv zzl();

    public abstract String zzm(Charset charset);

    public abstract void zzn(zzadh zzadhVar);

    public abstract boolean zzo();

    public final int zzq() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzadm iterator() {
        return new zzadi(this);
    }

    public final String zzu(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzw(byte[] bArr, int i7, int i10, int i11) {
        zzp(0, i11, zzd());
        zzp(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            zze(bArr, 0, i10, i11);
        }
    }

    public final byte[] zzx() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzafa.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
