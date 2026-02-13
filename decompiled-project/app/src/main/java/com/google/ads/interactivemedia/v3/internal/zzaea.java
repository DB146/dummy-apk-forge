package com.google.ads.interactivemedia.v3.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzaea extends zzadh {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzaea.class.getName());
    private static final boolean zzd = zzaht.zzx();
    zzaeb zza;

    private zzaea() {
    }

    public /* synthetic */ zzaea(zzadz zzadzVar) {
    }

    @Deprecated
    public static int zzt(int i7, zzafz zzafzVar, zzags zzagsVar) {
        int zzat = ((zzadb) zzafzVar).zzat(zzagsVar);
        int zzx = zzx(i7 << 3);
        return zzx + zzx + zzat;
    }

    public static int zzu(int i7) {
        if (i7 >= 0) {
            return zzx(i7);
        }
        return 10;
    }

    public static int zzv(zzafz zzafzVar, zzags zzagsVar) {
        int zzat = ((zzadb) zzafzVar).zzat(zzagsVar);
        return zzx(zzat) + zzat;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zzahy.zze(str);
        } catch (zzahx unused) {
            length = str.getBytes(zzafa.zzb).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j) {
        int i7;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i7 += 2;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static zzaea zzz(byte[] bArr, int i7, int i10) {
        return new zzadx(bArr, 0, i10);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzB(String str, zzahx zzahxVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzahxVar);
        byte[] bytes = str.getBytes(zzafa.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzady(e2);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b2);

    public abstract void zzd(int i7, boolean z8);

    public abstract void zze(int i7, zzadr zzadrVar);

    public abstract void zzf(int i7, int i10);

    public abstract void zzg(int i7);

    public abstract void zzh(int i7, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i7, int i10);

    public abstract void zzk(int i7);

    public abstract void zzl(byte[] bArr, int i7, int i10);

    public abstract void zzm(int i7, String str);

    public abstract void zzo(int i7, int i10);

    public abstract void zzp(int i7, int i10);

    public abstract void zzq(int i7);

    public abstract void zzr(int i7, long j);

    public abstract void zzs(long j);
}
