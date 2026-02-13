package com.google.android.recaptcha.internal;

import Db.q;
import Eb.n;
import Hb.d;
import Ib.a;
import com.bumptech.glide.c;
import kotlin.jvm.internal.l;
import mc.AbstractC1660e;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class zzcb {
    private Object zza;
    private final InterfaceC1656a zzb = AbstractC1660e.a();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, d dVar) {
        zzby zzbyVar;
        int i7;
        InterfaceC1656a interfaceC1656a;
        zzcb zzcbVar;
        try {
            if (dVar instanceof zzby) {
                zzbyVar = (zzby) dVar;
                int i10 = zzbyVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzbyVar.zzd = i10 - Integer.MIN_VALUE;
                    Object obj2 = zzbyVar.zzb;
                    a aVar = a.f5345a;
                    i7 = zzbyVar.zzd;
                    if (i7 != 0) {
                        c.c0(obj2);
                        interfaceC1656a = this.zzb;
                        zzbyVar.zze = this;
                        zzbyVar.zzf = (zzje) obj;
                        zzbyVar.zza = interfaceC1656a;
                        zzbyVar.zzd = 1;
                        if (interfaceC1656a.n(zzbyVar) == aVar) {
                            return aVar;
                        }
                        zzcbVar = this;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC1656a interfaceC1656a2 = (InterfaceC1656a) zzbyVar.zza;
                        zzje zzjeVar = zzbyVar.zzf;
                        zzcbVar = zzbyVar.zze;
                        c.c0(obj2);
                        interfaceC1656a = interfaceC1656a2;
                        obj = zzjeVar;
                    }
                    return Boolean.valueOf(l.a(zzcbVar.zza, obj));
                }
            }
            return Boolean.valueOf(l.a(zzcbVar.zza, obj));
        } finally {
            interfaceC1656a.l(null);
        }
        zzbyVar = new zzby(this, dVar);
        Object obj22 = zzbyVar.zzb;
        a aVar2 = a.f5345a;
        i7 = zzbyVar.zzd;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, d dVar) {
        zzbz zzbzVar;
        int i7;
        InterfaceC1656a interfaceC1656a;
        zzcb zzcbVar;
        try {
            if (dVar instanceof zzbz) {
                zzbzVar = (zzbz) dVar;
                int i10 = zzbzVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzbzVar.zzd = i10 - Integer.MIN_VALUE;
                    Object obj = zzbzVar.zzb;
                    a aVar = a.f5345a;
                    i7 = zzbzVar.zzd;
                    if (i7 != 0) {
                        c.c0(obj);
                        interfaceC1656a = this.zzb;
                        zzbzVar.zze = this;
                        zzbzVar.zzf = (zzje[]) objArr;
                        zzbzVar.zza = interfaceC1656a;
                        zzbzVar.zzd = 1;
                        if (interfaceC1656a.n(zzbzVar) == aVar) {
                            return aVar;
                        }
                        zzcbVar = this;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC1656a interfaceC1656a2 = (InterfaceC1656a) zzbzVar.zza;
                        zzje[] zzjeVarArr = zzbzVar.zzf;
                        zzcbVar = zzbzVar.zze;
                        c.c0(obj);
                        interfaceC1656a = interfaceC1656a2;
                        objArr = zzjeVarArr;
                    }
                    return Boolean.valueOf(n.K(objArr, zzcbVar.zza));
                }
            }
            return Boolean.valueOf(n.K(objArr, zzcbVar.zza));
        } finally {
            interfaceC1656a.l(null);
        }
        zzbzVar = new zzbz(this, dVar);
        Object obj2 = zzbzVar.zzb;
        a aVar2 = a.f5345a;
        i7 = zzbzVar.zzd;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, d dVar) {
        zzca zzcaVar;
        int i7;
        InterfaceC1656a interfaceC1656a;
        zzcb zzcbVar;
        try {
            if (dVar instanceof zzca) {
                zzcaVar = (zzca) dVar;
                int i10 = zzcaVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzcaVar.zzd = i10 - Integer.MIN_VALUE;
                    Object obj2 = zzcaVar.zzb;
                    a aVar = a.f5345a;
                    i7 = zzcaVar.zzd;
                    if (i7 != 0) {
                        c.c0(obj2);
                        interfaceC1656a = this.zzb;
                        zzcaVar.zze = this;
                        zzcaVar.zzf = (zzje) obj;
                        zzcaVar.zza = interfaceC1656a;
                        zzcaVar.zzd = 1;
                        if (interfaceC1656a.n(zzcaVar) == aVar) {
                            return aVar;
                        }
                        zzcbVar = this;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC1656a interfaceC1656a2 = (InterfaceC1656a) zzcaVar.zza;
                        zzje zzjeVar = zzcaVar.zzf;
                        zzcbVar = zzcaVar.zze;
                        c.c0(obj2);
                        interfaceC1656a = interfaceC1656a2;
                        obj = zzjeVar;
                    }
                    zzcbVar.zza = obj;
                    interfaceC1656a.l(null);
                    return q.f3365a;
                }
            }
            zzcbVar.zza = obj;
            interfaceC1656a.l(null);
            return q.f3365a;
        } catch (Throwable th) {
            interfaceC1656a.l(null);
            throw th;
        }
        zzcaVar = new zzca(this, dVar);
        Object obj22 = zzcaVar.zzb;
        a aVar2 = a.f5345a;
        i7 = zzcaVar.zzd;
        if (i7 != 0) {
        }
    }
}
