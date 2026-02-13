package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzfn extends zzme implements zznm {
    private static final zzfn zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private zzfh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzfn zzfnVar = new zzfn();
        zzj = zzfnVar;
        zzme.zzcp(zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    public static zzfm zzi() {
        return (zzfm) zzj.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final zzfh zzd() {
        zzfh zzfhVar = this.zzf;
        return zzfhVar == null ? zzfh.zzi() : zzfhVar;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 32) != 0;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final /* synthetic */ void zzj(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzme.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzfn();
        }
        if (i10 == 4) {
            return new zzfm(null);
        }
        if (i10 == 5) {
            return zzj;
        }
        throw null;
    }
}
