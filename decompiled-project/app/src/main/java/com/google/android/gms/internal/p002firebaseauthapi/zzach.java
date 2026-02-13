package com.google.android.gms.internal.p002firebaseauthapi;

import Q5.e;
import Y6.i;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n7.AbstractC1712c;
import n7.B;
import n7.C1710a;
import n7.C1713d;
import n7.l;
import n7.m;
import n7.r;
import n7.u;
import n7.x;
import o7.C1815e;
import o7.C1816f;
import o7.C1817g;
import o7.InterfaceC1819i;
import o7.InterfaceC1820j;
import o7.t;
import o7.v;

/* loaded from: classes.dex */
public final class zzach extends zzafg {
    public zzach(i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaef(iVar, scheduledExecutorService);
        this.zzb = executor;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o7.c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o7.c] */
    public static C1815e zza(i iVar, zzahc zzahcVar) {
        G.g(iVar);
        G.g(zzahcVar);
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        G.d("firebase");
        String zzi = zzahcVar.zzi();
        G.d(zzi);
        obj.f22060a = zzi;
        obj.f22061b = "firebase";
        obj.f22064e = zzahcVar.zzh();
        obj.f22062c = zzahcVar.zzg();
        Uri zzc = zzahcVar.zzc();
        if (zzc != null) {
            obj.f22063d = zzc.toString();
        }
        obj.f22066u = zzahcVar.zzm();
        obj.f22067v = null;
        obj.f22065f = zzahcVar.zzj();
        arrayList.add(obj);
        List<zzaht> zzl = zzahcVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i7 = 0; i7 < zzl.size(); i7++) {
                zzaht zzahtVar = zzl.get(i7);
                ?? obj2 = new Object();
                G.g(zzahtVar);
                obj2.f22060a = zzahtVar.zzd();
                String zzf = zzahtVar.zzf();
                G.d(zzf);
                obj2.f22061b = zzf;
                obj2.f22062c = zzahtVar.zzb();
                Uri zza = zzahtVar.zza();
                if (zza != null) {
                    obj2.f22063d = zza.toString();
                }
                obj2.f22064e = zzahtVar.zzc();
                obj2.f22065f = zzahtVar.zze();
                obj2.f22066u = false;
                obj2.f22067v = zzahtVar.zzg();
                arrayList.add(obj2);
            }
        }
        C1815e c1815e = new C1815e(iVar, arrayList);
        c1815e.f22077w = new C1816f(zzahcVar.zzb(), zzahcVar.zza());
        c1815e.f22078x = zzahcVar.zzn();
        c1815e.f22079y = zzahcVar.zze();
        c1815e.D(e.U(zzahcVar.zzk()));
        List zzd = zzahcVar.zzd();
        if (zzd == null) {
            zzd = new ArrayList();
        }
        c1815e.f22068A = zzd;
        return c1815e;
    }

    public final Task<zzahj> zza() {
        return zza(new zzacr());
    }

    public final Task<Void> zza(i iVar, String str, String str2) {
        return zza((zzack) new zzack(str, str2).zza(iVar));
    }

    public final Task<Void> zza(i iVar, String str, String str2, String str3) {
        return zza((zzacm) new zzacm(str, str2, str3).zza(iVar));
    }

    public final Task<Object> zza(i iVar, String str, String str2, String str3, String str4, v vVar) {
        return zza((zzacl) new zzacl(str, str2, str3, str4).zza(iVar).zza((zzaex<Object, v>) vVar));
    }

    public final Task<Object> zza(i iVar, String str, String str2, v vVar) {
        return zza((zzado) new zzado(str, str2).zza(iVar).zza((zzaex<Object, v>) vVar));
    }

    public final Task<Void> zza(i iVar, String str, C1710a c1710a, String str2, String str3) {
        c1710a.f21275w = 1;
        return zza((zzadk) new zzadk(str, c1710a, str2, str3, "sendPasswordResetEmail").zza(iVar));
    }

    public final Task<Void> zza(i iVar, C1710a c1710a, String str) {
        return zza((zzadh) new zzadh(str, c1710a).zza(iVar));
    }

    public final Task<Object> zza(i iVar, AbstractC1712c abstractC1712c, String str, v vVar) {
        return zza((zzadl) new zzadl(abstractC1712c, str).zza(iVar).zza((zzaex<Object, v>) vVar));
    }

    public final Task<Object> zza(i iVar, C1713d c1713d, String str, v vVar) {
        return zza((zzadq) new zzadq(c1713d, str).zza(iVar).zza((zzaex<Object, v>) vVar));
    }

    public final Task<Void> zza(i iVar, l lVar, String str, String str2, String str3, String str4, t tVar) {
        return zza((zzadb) new zzadb(str, str2, str3, str4).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Void> zza(i iVar, l lVar, String str, String str2, t tVar) {
        return zza((zzadt) new zzadt(((C1815e) lVar).f22069a.zzf(), str, str2).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<m> zza(i iVar, l lVar, String str, t tVar) {
        return zza((zzacs) new zzacs(str).zza(iVar).zza(lVar).zza((zzaex<m, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Void> zza(i iVar, l lVar, B b2, t tVar) {
        return zza((zzadz) new zzadz(b2).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zza(i iVar, l lVar, AbstractC1712c abstractC1712c, String str, t tVar) {
        G.g(iVar);
        G.g(abstractC1712c);
        G.g(lVar);
        G.g(tVar);
        ArrayList arrayList = ((C1815e) lVar).f22074f;
        if (arrayList != null && arrayList.contains(abstractC1712c.t())) {
            return Tasks.forException(zzaei.zza(new Status(17015, null, null, null)));
        }
        if (abstractC1712c instanceof C1713d) {
            C1713d c1713d = (C1713d) abstractC1712c;
            return TextUtils.isEmpty(c1713d.f21283c) ? zza((zzact) new zzact(c1713d, str).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar)) : zza((zzacy) new zzacy(c1713d).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
        }
        if (!(abstractC1712c instanceof r)) {
            return zza((zzacw) new zzacw(abstractC1712c).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
        }
        zzaft.zza();
        return zza((zzacv) new zzacv((r) abstractC1712c).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Void> zza(i iVar, l lVar, C1713d c1713d, String str, t tVar) {
        return zza((zzacz) new zzacz(c1713d, str).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Void> zza(i iVar, l lVar, r rVar, String str, t tVar) {
        zzaft.zza();
        return zza((zzadd) new zzadd(rVar, str).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Void> zza(i iVar, l lVar, r rVar, t tVar) {
        zzaft.zza();
        return zza((zzaea) new zzaea(rVar).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zza(i iVar, l lVar, u uVar, String str, v vVar) {
        zzaft.zza();
        zzacp zzacpVar = new zzacp(uVar, str, null);
        zzacpVar.zza(iVar).zza((zzaex<Object, v>) vVar);
        if (lVar != null) {
            zzacpVar.zza(lVar);
        }
        return zza(zzacpVar);
    }

    public final Task<Object> zza(i iVar, l lVar, x xVar, String str, String str2, v vVar) {
        zzacp zzacpVar = new zzacp(xVar, str, str2);
        zzacpVar.zza(iVar).zza((zzaex<Object, v>) vVar);
        if (lVar != null) {
            zzacpVar.zza(lVar);
        }
        return zza(zzacpVar);
    }

    public final Task<Void> zza(i iVar, l lVar, t tVar) {
        return zza((zzadf) new zzadf().zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zza(i iVar, r rVar, String str, v vVar) {
        zzaft.zza();
        return zza((zzadp) new zzadp(rVar, str).zza(iVar).zza((zzaex<Object, v>) vVar));
    }

    public final Task<Void> zza(i iVar, u uVar, l lVar, String str, v vVar) {
        zzaft.zza();
        zzacq zzacqVar = new zzacq(uVar, ((C1815e) lVar).f22069a.zzf(), str, null);
        zzacqVar.zza(iVar).zza((zzaex<Void, v>) vVar);
        return zza(zzacqVar);
    }

    public final Task<Void> zza(i iVar, x xVar, l lVar, String str, String str2, v vVar) {
        zzacq zzacqVar = new zzacq(xVar, ((C1815e) lVar).f22069a.zzf(), str, str2);
        zzacqVar.zza(iVar).zza((zzaex<Void, v>) vVar);
        return zza(zzacqVar);
    }

    public final Task<Object> zza(i iVar, v vVar, String str) {
        return zza((zzadm) new zzadm(str).zza(iVar).zza((zzaex<Object, v>) vVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzadj(str));
    }

    public final Task<zzahk> zza(String str, String str2) {
        return zza(new zzacu(str, str2));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadi(str, str2, str3, str4));
    }

    public final Task<Void> zza(String str, String str2, C1710a c1710a) {
        c1710a.f21275w = 7;
        return zza(new zzaec(str, str2, c1710a));
    }

    public final Task<Void> zza(l lVar, InterfaceC1820j interfaceC1820j) {
        return zza((zzaco) new zzaco().zza(lVar).zza((zzaex<Void, InterfaceC1820j>) interfaceC1820j).zza((InterfaceC1819i) interfaceC1820j));
    }

    public final Task<zzaij> zza(C1817g c1817g, String str) {
        return zza(new zzadr(c1817g, str));
    }

    public final Task<Void> zza(C1817g c1817g, String str, String str2, long j, boolean z8, boolean z10, String str3, String str4, String str5, boolean z11, n7.t tVar, Executor executor, Activity activity) {
        zzads zzadsVar = new zzads(c1817g, str, str2, j, z8, z10, str3, str4, str5, z11);
        zzadsVar.zza(tVar, activity, executor, str);
        return zza(zzadsVar);
    }

    public final Task<Void> zza(C1817g c1817g, n7.v vVar, String str, long j, boolean z8, boolean z10, String str2, String str3, String str4, boolean z11, n7.t tVar, Executor executor, Activity activity) {
        String str5 = c1817g.f22084b;
        G.d(str5);
        zzadu zzaduVar = new zzadu(vVar, str5, str, j, z8, z10, str2, str3, str4, z11);
        zzaduVar.zza(tVar, activity, executor, vVar.f21301a);
        return zza(zzaduVar);
    }

    public final void zza(i iVar, zzaib zzaibVar, n7.t tVar, Activity activity, Executor executor) {
        zza((zzaee) new zzaee(zzaibVar).zza(iVar).zza(tVar, activity, executor, zzaibVar.zzd()));
    }

    public final Task<Object> zzb(i iVar, String str, String str2) {
        return zza((zzacj) new zzacj(str, str2).zza(iVar));
    }

    public final Task<Object> zzb(i iVar, String str, String str2, String str3, String str4, v vVar) {
        return zza((zzadn) new zzadn(str, str2, str3, str4).zza(iVar).zza((zzaex<Object, v>) vVar));
    }

    public final Task<Void> zzb(i iVar, String str, C1710a c1710a, String str2, String str3) {
        c1710a.f21275w = 6;
        return zza((zzadk) new zzadk(str, c1710a, str2, str3, "sendSignInLinkToEmail").zza(iVar));
    }

    public final Task<Object> zzb(i iVar, l lVar, String str, String str2, String str3, String str4, t tVar) {
        return zza((zzade) new zzade(str, str2, str3, str4).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zzb(i iVar, l lVar, String str, t tVar) {
        G.g(iVar);
        G.d(str);
        G.g(lVar);
        G.g(tVar);
        ArrayList arrayList = ((C1815e) lVar).f22074f;
        if ((arrayList != null && !arrayList.contains(str)) || lVar.z()) {
            return Tasks.forException(zzaei.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        return !str.equals("password") ? zza((zzadv) new zzadv(str).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar)) : zza((zzadw) new zzadw().zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Void> zzb(i iVar, l lVar, AbstractC1712c abstractC1712c, String str, t tVar) {
        return zza((zzacx) new zzacx(abstractC1712c, str).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zzb(i iVar, l lVar, C1713d c1713d, String str, t tVar) {
        return zza((zzadc) new zzadc(c1713d, str).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zzb(i iVar, l lVar, r rVar, String str, t tVar) {
        zzaft.zza();
        return zza((zzadg) new zzadg(rVar, str).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zzc(i iVar, String str, String str2) {
        return zza((zzacn) new zzacn(str, str2).zza(iVar));
    }

    public final Task<Void> zzc(i iVar, l lVar, String str, t tVar) {
        return zza((zzady) new zzady(str).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<Object> zzc(i iVar, l lVar, AbstractC1712c abstractC1712c, String str, t tVar) {
        return zza((zzada) new zzada(abstractC1712c, str).zza(iVar).zza(lVar).zza((zzaex<Object, v>) tVar).zza((InterfaceC1819i) tVar));
    }

    public final Task<String> zzd(i iVar, String str, String str2) {
        return zza((zzaeb) new zzaeb(str, str2).zza(iVar));
    }

    public final Task<Void> zzd(i iVar, l lVar, String str, t tVar) {
        return zza((zzadx) new zzadx(str).zza(iVar).zza(lVar).zza((zzaex<Void, v>) tVar).zza((InterfaceC1819i) tVar));
    }
}
