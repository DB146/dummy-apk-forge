package com.google.android.gms.internal.pal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzach extends zzabo {
    private static final Logger zzb = Logger.getLogger(zzach.class.getName());
    private static final boolean zzc = zzafs.zzx();
    zzaci zza;

    private zzach() {
    }

    public /* synthetic */ zzach(zzacg zzacgVar) {
    }

    public static int zzA(int i7) {
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

    public static int zzB(long j) {
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
            i7 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static zzach zzC(byte[] bArr) {
        return new zzace(bArr, 0, bArr.length);
    }

    public static int zzt(zzaby zzabyVar) {
        int zzd = zzabyVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i7, zzaef zzaefVar, zzaer zzaerVar) {
        int zzA = zzA(i7 << 3);
        int i10 = zzA + zzA;
        zzabi zzabiVar = (zzabi) zzaefVar;
        int zzap = zzabiVar.zzap();
        if (zzap == -1) {
            zzap = zzaerVar.zza(zzabiVar);
            zzabiVar.zzar(zzap);
        }
        return i10 + zzap;
    }

    public static int zzv(int i7) {
        if (i7 >= 0) {
            return zzA(i7);
        }
        return 10;
    }

    public static int zzw(zzadl zzadlVar) {
        int zza = zzadlVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzaef zzaefVar, zzaer zzaerVar) {
        zzabi zzabiVar = (zzabi) zzaefVar;
        int zzap = zzabiVar.zzap();
        if (zzap == -1) {
            zzap = zzaerVar.zza(zzabiVar);
            zzabiVar.zzar(zzap);
        }
        return zzA(zzap) + zzap;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzafx.zzc(str);
        } catch (zzafw unused) {
            length = str.getBytes(zzadg.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i7) {
        return zzA(i7 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzafw zzafwVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzafwVar);
        byte[] bytes = str.getBytes(zzadg.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzacf(e2);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b2);

    public abstract void zzd(int i7, boolean z8);

    public abstract void zze(int i7, zzaby zzabyVar);

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
