package Y5;

import G3.C0283e;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzqf;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzqx;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import jb.InterfaceC1393d;
import k4.InterfaceC1421a;
import l2.EnumC1474s;
import l2.InterfaceC1470n;
import o2.C1779a;
import q2.C1885b;
import rc.C1961e;
import v2.C2133e;
import v2.C2138j;

/* renamed from: Y5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0656w implements InterfaceC0650t, InterfaceC1421a, InterfaceC1393d, m5.K {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11971b = new C0656w(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11972c = new C0656w(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11973d = new C0656w(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11974e = new C0656w(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11975f = new C0656w(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11976u = new C0656w(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11977v = new C0656w(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C0656w f11978w = new C0656w(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11979a;

    public /* synthetic */ C0656w(int i7) {
        this.f11979a = i7;
    }

    public C0656w(c2.p pVar) {
        this.f11979a = 8;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rc.e] */
    public static final void c(C1961e c1961e, long j, boolean z8) {
        C1961e c1961e2;
        ReentrantLock reentrantLock = C1961e.f23957h;
        if (C1961e.f23959l == null) {
            C1961e.f23959l = new Object();
            F3.a aVar = new F3.a("Okio Watchdog");
            aVar.setDaemon(true);
            aVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j != 0 && z8) {
            c1961e.g = Math.min(j, c1961e.c() - nanoTime) + nanoTime;
        } else if (j != 0) {
            c1961e.g = j + nanoTime;
        } else {
            if (!z8) {
                throw new AssertionError();
            }
            c1961e.g = c1961e.c();
        }
        long j10 = c1961e.g - nanoTime;
        C1961e c1961e3 = C1961e.f23959l;
        kotlin.jvm.internal.l.b(c1961e3);
        while (true) {
            c1961e2 = c1961e3.f23961f;
            if (c1961e2 == null || j10 < c1961e2.g - nanoTime) {
                break;
            }
            kotlin.jvm.internal.l.b(c1961e2);
            c1961e3 = c1961e2;
        }
        c1961e.f23961f = c1961e2;
        c1961e3.f23961f = c1961e;
        if (c1961e3 == C1961e.f23959l) {
            C1961e.f23958i.signal();
        }
    }

    public static C1961e d() {
        C1961e c1961e = C1961e.f23959l;
        kotlin.jvm.internal.l.b(c1961e);
        C1961e c1961e2 = c1961e.f23961f;
        if (c1961e2 == null) {
            long nanoTime = System.nanoTime();
            C1961e.f23958i.await(C1961e.j, TimeUnit.MILLISECONDS);
            C1961e c1961e3 = C1961e.f23959l;
            kotlin.jvm.internal.l.b(c1961e3);
            if (c1961e3.f23961f != null || System.nanoTime() - nanoTime < C1961e.k) {
                return null;
            }
            return C1961e.f23959l;
        }
        long nanoTime2 = c1961e2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            C1961e.f23958i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C1961e c1961e4 = C1961e.f23959l;
        kotlin.jvm.internal.l.b(c1961e4);
        c1961e4.f23961f = c1961e2.f23961f;
        c1961e2.f23961f = null;
        c1961e2.f23960e = 2;
        return c1961e2;
    }

    public static l2.c0 e(l2.e0 owner, l2.a0 factory, int i7) {
        if ((i7 & 2) != 0) {
            kotlin.jvm.internal.l.e(owner, "owner");
            factory = owner instanceof InterfaceC1470n ? ((InterfaceC1470n) owner).n() : C1885b.f23362a;
        }
        kotlin.jvm.internal.l.e(owner, "owner");
        o2.c extras = owner instanceof InterfaceC1470n ? ((InterfaceC1470n) owner).o() : C1779a.f21662b;
        kotlin.jvm.internal.l.e(owner, "owner");
        kotlin.jvm.internal.l.e(factory, "factory");
        kotlin.jvm.internal.l.e(extras, "extras");
        return new l2.c0(owner.s(), factory, extras);
    }

    public static C2133e f(C0283e c0283e, v2.q destination, Bundle bundle, EnumC1474s hostLifecycleState, C2138j c2138j) {
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.d(uuid, "toString(...)");
        kotlin.jvm.internal.l.e(destination, "destination");
        kotlin.jvm.internal.l.e(hostLifecycleState, "hostLifecycleState");
        return new C2133e(c0283e, destination, bundle, hostLifecycleState, c2138j, uuid, null);
    }

    @Override // m5.K
    public void a() {
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        com.bumptech.glide.d.t((Throwable) obj);
    }

    @Override // k4.InterfaceC1421a
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f11979a) {
            case 0:
                List list = F.f11304a;
                return Long.valueOf(zzoy.zzj());
            case 1:
                List list2 = F.f11304a;
                return Long.valueOf(zzoy.zzZ());
            case 2:
                List list3 = F.f11304a;
                return Boolean.valueOf(zzoy.zzC());
            case 3:
                List list4 = F.f11304a;
                return Boolean.valueOf(zzqf.zza());
            case 4:
                List list5 = F.f11304a;
                return Boolean.valueOf(zzqu.zzb());
            case 5:
                List list6 = F.f11304a;
                return Boolean.valueOf(zzql.zzh());
            case 6:
                List list7 = F.f11304a;
                return Boolean.valueOf(zzql.zze());
            default:
                return new Boolean(zzqx.zza());
        }
    }
}
