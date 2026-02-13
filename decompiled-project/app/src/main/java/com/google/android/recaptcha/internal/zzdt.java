package com.google.android.recaptcha.internal;

import Db.g;
import Db.m;
import Db.q;
import Eb.o;
import Eb.p;
import Hb.d;
import Ib.a;
import Zb.i;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.support.v4.media.session.b;
import cc.B;
import cc.F;
import cc.H0;
import cc.InterfaceC0937i0;
import com.bumptech.glide.c;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final g zzd;
    private final g zze;
    private final g zzf;
    private final g zzg;
    private final g zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i7 = zzav.zza;
        this.zzd = b.z(zzdm.zza);
        this.zze = b.z(zzdn.zza);
        this.zzf = b.z(zzdo.zza);
        this.zzg = b.z(zzdp.zza);
        this.zzh = b.z(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsc zzscVar, long j, d dVar) {
        zzdj zzdjVar;
        int i7;
        Object zzc;
        zzdt zzdtVar;
        Throwable a9;
        Zb.g children;
        if (dVar instanceof zzdj) {
            zzdjVar = (zzdj) dVar;
            int i10 = zzdjVar.zzd;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i10 - Integer.MIN_VALUE;
                Object obj = zzdjVar.zzb;
                a aVar = a.f5345a;
                i7 = zzdjVar.zzd;
                if (i7 != 0) {
                    c.c0(obj);
                    zzy(zzscVar.zzO());
                    Iterator it = zzw().iterator();
                    while (it.hasNext()) {
                        this.zzc.zzf((zze) it.next());
                    }
                    zzl zzlVar = this.zzc;
                    zzek zzekVar = this.zzb;
                    zzdjVar.zza = this;
                    zzdjVar.zzd = 1;
                    zzc = zzlVar.zzc(j, zzscVar, zzekVar, zzdjVar);
                    if (zzc != aVar) {
                        zzdtVar = this;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) zzdjVar.zza;
                    c.c0(obj);
                    throw th;
                }
                zzdtVar = (zzdt) zzdjVar.zza;
                c.c0(obj);
                zzc = ((m) obj).f3357a;
                a9 = m.a(zzc);
                if (a9 != null) {
                    return q.f3365a;
                }
                InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) zzdtVar.zzi.zzd().l().get(B.f14467b);
                if (interfaceC0937i0 != null && (children = interfaceC0937i0.getChildren()) != null) {
                    Iterator it2 = children.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0937i0) it2.next()).cancel(null);
                    }
                }
                List P10 = i.P(F.r(zzdtVar.zzi.zzd().l()).getChildren());
                zzdjVar.zza = a9;
                zzdjVar.zzd = 2;
                if (F.y(P10, zzdjVar) != aVar) {
                    throw a9;
                }
                return aVar;
            }
        }
        zzdjVar = new zzdj(this, dVar);
        Object obj2 = zzdjVar.zzb;
        a aVar2 = a.f5345a;
        i7 = zzdjVar.zzd;
        if (i7 != 0) {
        }
        a9 = m.a(zzc);
        if (a9 != null) {
        }
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return o.s0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i7 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i7 = zzav.zza;
            ((zzfu) b.z(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e2.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(String str, long j, d dVar) {
        zzdd zzddVar;
        int i7;
        Exception e2;
        zzen zzenVar;
        zzbd e10;
        H0 e11;
        if (dVar instanceof zzdd) {
            zzddVar = (zzdd) dVar;
            int i10 = zzddVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzddVar.zza;
                a aVar = a.f5345a;
                i7 = zzddVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    zzen zzf = zzu(str).zzf(27);
                    try {
                        zzl zzlVar = this.zzc;
                        zzddVar.zzd = zzf;
                        zzddVar.zzc = 1;
                        Object zzb = zzlVar.zzb(str, j, zzddVar);
                        if (zzb == aVar) {
                            return aVar;
                        }
                        obj = zzb;
                        zzenVar = zzf;
                    } catch (H0 e12) {
                        e11 = e12;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e11.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar;
                    } catch (zzbd e13) {
                        e10 = e13;
                        zzenVar = zzf;
                        zzenVar.zzb(e10);
                        throw e10;
                    } catch (Exception e14) {
                        e2 = e14;
                        zzenVar = zzf;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e2.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzddVar.zzd;
                    try {
                        c.c0(obj);
                    } catch (H0 e15) {
                        e11 = e15;
                        zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e11.getMessage());
                        zzenVar.zzb(zzbdVar3);
                        throw zzbdVar3;
                    } catch (zzbd e16) {
                        e10 = e16;
                        zzenVar.zzb(e10);
                        throw e10;
                    } catch (Exception e17) {
                        e2 = e17;
                        zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzaa, e2.getMessage());
                        zzenVar.zzb(zzbdVar22);
                        throw zzbdVar22;
                    }
                }
                zzsi zzsiVar = (zzsi) obj;
                zzenVar.zza();
                return zzsiVar;
            }
        }
        zzddVar = new zzdd(this, dVar);
        Object obj2 = zzddVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzddVar.zzc;
        if (i7 != 0) {
        }
        zzsi zzsiVar2 = (zzsi) obj2;
        zzenVar.zza();
        return zzsiVar2;
    }

    public final Object zzm(zzsp zzspVar, String str, long j, d dVar) {
        return F.K(this.zzi.zza().l(), new zzdg(this, str, j, zzspVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(zzsc zzscVar, long j, d dVar) {
        zzdk zzdkVar;
        int i7;
        try {
            if (dVar instanceof zzdk) {
                zzdkVar = (zzdk) dVar;
                int i10 = zzdkVar.zzc;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzdkVar.zzc = i10 - Integer.MIN_VALUE;
                    Object obj = zzdkVar.zza;
                    a aVar = a.f5345a;
                    i7 = zzdkVar.zzc;
                    if (i7 != 0) {
                        c.c0(obj);
                        zzdl zzdlVar = new zzdl(this, zzscVar, j, null);
                        zzdkVar.zzc = 1;
                        if (F.L(j, zzdlVar, zzdkVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.c0(obj);
                    }
                    return q.f3365a;
                }
            }
            if (i7 != 0) {
            }
            return q.f3365a;
        } catch (H0 e2) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
        } catch (zzbd e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e11.getMessage());
        }
        zzdkVar = new zzdk(this, dVar);
        Object obj2 = zzdkVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzdkVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j, d dVar) {
        zzdr zzdrVar;
        int i7;
        zzdt zzdtVar;
        Exception e2;
        zzen zzenVar;
        zzbd e10;
        H0 e11;
        if (dVar instanceof zzdr) {
            zzdrVar = (zzdr) dVar;
            int i10 = zzdrVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzdrVar.zza;
                a aVar = a.f5345a;
                i7 = zzdrVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    zzen zzf = this.zzb.zzf(22);
                    try {
                        zzds zzdsVar = new zzds(this, zzf, null);
                        zzdrVar.zzd = this;
                        zzdrVar.zze = zzf;
                        zzdrVar.zzc = 1;
                        Object L = F.L(j, zzdsVar, zzdrVar);
                        if (L == aVar) {
                            return aVar;
                        }
                        zzdtVar = this;
                        obj = L;
                        zzenVar = zzf;
                    } catch (H0 e12) {
                        zzdtVar = this;
                        e11 = e12;
                        zzenVar = zzf;
                        zzbd zzs = zzdtVar.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                        zzenVar.zzb(zzs);
                        throw zzs;
                    } catch (zzbd e13) {
                        zzdtVar = this;
                        e10 = e13;
                        zzenVar = zzf;
                        if (l.a(e10.zzb(), zzbb.zzc)) {
                        }
                        zzenVar.zzb(e10);
                        throw e10;
                    } catch (Exception e14) {
                        zzdtVar = this;
                        e2 = e14;
                        zzenVar = zzf;
                        zzbd zzs2 = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzaw, e2.getMessage()));
                        zzenVar.zzb(zzs2);
                        throw zzs2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzdrVar.zze;
                    zzdtVar = zzdrVar.zzd;
                    try {
                        c.c0(obj);
                    } catch (H0 e15) {
                        e11 = e15;
                        zzbd zzs3 = zzdtVar.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                        zzenVar.zzb(zzs3);
                        throw zzs3;
                    } catch (zzbd e16) {
                        e10 = e16;
                        if (l.a(e10.zzb(), zzbb.zzc)) {
                            e10 = zzdtVar.zzs(e10, e10);
                        }
                        zzenVar.zzb(e10);
                        throw e10;
                    } catch (Exception e17) {
                        e2 = e17;
                        zzbd zzs22 = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzaw, e2.getMessage()));
                        zzenVar.zzb(zzs22);
                        throw zzs22;
                    }
                }
                return (zzsc) obj;
            }
        }
        zzdrVar = new zzdr(this, dVar);
        Object obj2 = zzdrVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzdrVar.zzc;
        if (i7 != 0) {
        }
        return (zzsc) obj2;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            int F10 = Eb.B.F(p.S(zzk, 10));
            if (F10 < 16) {
                F10 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(F10);
            for (zzst zzstVar : zzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e2) {
            zzf.zzb(e2);
        } catch (Exception e10) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e10.getMessage()));
        }
    }
}
