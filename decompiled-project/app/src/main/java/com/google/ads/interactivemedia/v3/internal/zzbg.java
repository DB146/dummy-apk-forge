package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzbg extends zzaet implements zzaga {
    private static final zzbg zzb;
    private int zzd;
    private zzadr zze;
    private zzadr zzf;
    private zzadr zzg;
    private zzadr zzh;

    static {
        zzbg zzbgVar = new zzbg();
        zzb = zzbgVar;
        zzaet.zzaM(zzbg.class, zzbgVar);
    }

    private zzbg() {
        zzadr zzadrVar = zzadr.zzb;
        this.zze = zzadrVar;
        this.zzf = zzadrVar;
        this.zzg = zzadrVar;
        this.zzh = zzadrVar;
    }

    public static zzbf zza() {
        return (zzbf) zzb.zzay();
    }

    public static zzbg zzc(byte[] bArr, zzaef zzaefVar) {
        return (zzbg) zzaet.zzaD(zzb, bArr, zzaefVar);
    }

    public static /* synthetic */ void zzh(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 1;
        zzbgVar.zze = zzadrVar;
    }

    public static /* synthetic */ void zzi(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 2;
        zzbgVar.zzf = zzadrVar;
    }

    public static /* synthetic */ void zzk(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 4;
        zzbgVar.zzg = zzadrVar;
    }

    public static /* synthetic */ void zzl(zzbg zzbgVar, zzadr zzadrVar) {
        zzbgVar.zzd |= 8;
        zzbgVar.zzh = zzadrVar;
    }

    public final zzadr zzd() {
        return this.zze;
    }

    public final zzadr zze() {
        return this.zzf;
    }

    public final zzadr zzf() {
        return this.zzh;
    }

    public final zzadr zzg() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzbg();
        }
        if (i10 == 4) {
            return new zzbf(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
