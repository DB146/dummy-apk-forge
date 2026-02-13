package Y5;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzkl;
import i2.C1332t;
import java.util.concurrent.atomic.AtomicInteger;
import y6.C2399e;

/* renamed from: Y5.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646q0 implements InterfaceC0661y0 {

    /* renamed from: S, reason: collision with root package name */
    public static volatile C0646q0 f11889S;

    /* renamed from: A, reason: collision with root package name */
    public final S0 f11890A;

    /* renamed from: B, reason: collision with root package name */
    public final C0654v f11891B;

    /* renamed from: C, reason: collision with root package name */
    public final V0 f11892C;

    /* renamed from: D, reason: collision with root package name */
    public final String f11893D;

    /* renamed from: E, reason: collision with root package name */
    public P f11894E;

    /* renamed from: F, reason: collision with root package name */
    public C0632l1 f11895F;

    /* renamed from: G, reason: collision with root package name */
    public C0642p f11896G;

    /* renamed from: H, reason: collision with root package name */
    public N f11897H;

    /* renamed from: I, reason: collision with root package name */
    public W0 f11898I;

    /* renamed from: K, reason: collision with root package name */
    public Boolean f11900K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public volatile Boolean f11901M;

    /* renamed from: N, reason: collision with root package name */
    public volatile boolean f11902N;

    /* renamed from: O, reason: collision with root package name */
    public int f11903O;

    /* renamed from: P, reason: collision with root package name */
    public int f11904P;

    /* renamed from: R, reason: collision with root package name */
    public final long f11906R;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11907a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11908b;

    /* renamed from: c, reason: collision with root package name */
    public final C1332t f11909c;

    /* renamed from: d, reason: collision with root package name */
    public final C0615g f11910d;

    /* renamed from: e, reason: collision with root package name */
    public final C0613f0 f11911e;

    /* renamed from: f, reason: collision with root package name */
    public final W f11912f;

    /* renamed from: u, reason: collision with root package name */
    public final C0640o0 f11913u;

    /* renamed from: v, reason: collision with root package name */
    public final t1 f11914v;

    /* renamed from: w, reason: collision with root package name */
    public final M1 f11915w;

    /* renamed from: x, reason: collision with root package name */
    public final Q f11916x;

    /* renamed from: y, reason: collision with root package name */
    public final M5.b f11917y;

    /* renamed from: z, reason: collision with root package name */
    public final C0605c1 f11918z;

    /* renamed from: J, reason: collision with root package name */
    public boolean f11899J = false;

    /* renamed from: Q, reason: collision with root package name */
    public final AtomicInteger f11905Q = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r3v5, types: [Y5.g, C9.h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [Y5.V0, Y5.x0] */
    public C0646q0(G0 g02) {
        Context context = g02.f11363a;
        C1332t c1332t = new C1332t(17);
        this.f11909c = c1332t;
        D0.k = c1332t;
        this.f11907a = context;
        this.f11908b = g02.f11367e;
        this.f11901M = g02.f11364b;
        this.f11893D = g02.g;
        this.f11902N = true;
        zzkl.zzb(context);
        this.f11917y = M5.b.f6780a;
        Long l10 = g02.f11368f;
        this.f11906R = l10 != null ? l10.longValue() : System.currentTimeMillis();
        ?? hVar = new C9.h(this);
        hVar.f11755d = C2399e.f26999b;
        this.f11910d = hVar;
        C0613f0 c0613f0 = new C0613f0(this);
        c0613f0.M();
        this.f11911e = c0613f0;
        W w10 = new W(this);
        w10.M();
        this.f11912f = w10;
        M1 m12 = new M1(this);
        m12.M();
        this.f11915w = m12;
        this.f11916x = new Q(new R7.a(this, g02));
        this.f11891B = new C0654v(this);
        C0605c1 c0605c1 = new C0605c1(this);
        c0605c1.L();
        this.f11918z = c0605c1;
        S0 s02 = new S0(this);
        s02.L();
        this.f11890A = s02;
        t1 t1Var = new t1(this);
        t1Var.L();
        this.f11914v = t1Var;
        ?? abstractC0659x0 = new AbstractC0659x0(this);
        abstractC0659x0.M();
        this.f11892C = abstractC0659x0;
        C0640o0 c0640o0 = new C0640o0(this);
        c0640o0.M();
        this.f11913u = c0640o0;
        zzdd zzddVar = g02.f11366d;
        boolean z8 = zzddVar == null || zzddVar.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            k(s02);
            if (((C0646q0) s02.f3094a).f11907a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C0646q0) s02.f3094a).f11907a.getApplicationContext();
                if (s02.f11550c == null) {
                    s02.f11550c = new La.f(s02, 1);
                }
                if (z8) {
                    application.unregisterActivityLifecycleCallbacks(s02.f11550c);
                    application.registerActivityLifecycleCallbacks(s02.f11550c);
                    W w11 = ((C0646q0) s02.f3094a).f11912f;
                    l(w11);
                    w11.f11573B.a("Registered activity lifecycle callback");
                }
            }
        } else {
            l(w10);
            w10.f11580w.a("Application context is not an Application");
        }
        c0640o0.S(new E5.k(this, g02));
    }

    public static final void i(C c10) {
        if (c10 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void j(C9.h hVar) {
        if (hVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(H h10) {
        if (h10 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!h10.f11371b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(h10.getClass())));
        }
    }

    public static final void l(AbstractC0659x0 abstractC0659x0) {
        if (abstractC0659x0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC0659x0.f11992b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC0659x0.getClass())));
        }
    }

    public static C0646q0 r(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.zzd;
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
        }
        com.google.android.gms.common.internal.G.g(context);
        com.google.android.gms.common.internal.G.g(context.getApplicationContext());
        if (f11889S == null) {
            synchronized (C0646q0.class) {
                try {
                    if (f11889S == null) {
                        f11889S = new C0646q0(new G0(context, zzddVar, l10));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.G.g(f11889S);
            f11889S.f11901M = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.G.g(f11889S);
        return f11889S;
    }

    public final boolean a() {
        return g() == 0;
    }

    @Override // Y5.InterfaceC0661y0
    public final W b() {
        W w10 = this.f11912f;
        l(w10);
        return w10;
    }

    @Override // Y5.InterfaceC0661y0
    public final C0640o0 c() {
        C0640o0 c0640o0 = this.f11913u;
        l(c0640o0);
        return c0640o0;
    }

    @Override // Y5.InterfaceC0661y0
    public final Context d() {
        return this.f11907a;
    }

    @Override // Y5.InterfaceC0661y0
    public final M5.a e() {
        return this.f11917y;
    }

    @Override // Y5.InterfaceC0661y0
    public final C1332t f() {
        return this.f11909c;
    }

    public final int g() {
        C0640o0 c0640o0 = this.f11913u;
        l(c0640o0);
        c0640o0.J();
        C0615g c0615g = this.f11910d;
        if (c0615g.W()) {
            return 1;
        }
        l(c0640o0);
        c0640o0.J();
        if (!this.f11902N) {
            return 8;
        }
        C0613f0 c0613f0 = this.f11911e;
        j(c0613f0);
        c0613f0.J();
        Boolean valueOf = c0613f0.N().contains("measurement_enabled") ? Boolean.valueOf(c0613f0.N().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        C1332t c1332t = ((C0646q0) c0615g.f3094a).f11909c;
        Boolean V7 = c0615g.V("firebase_analytics_collection_enabled");
        return V7 != null ? V7.booleanValue() ? 0 : 4 : (this.f11901M == null || this.f11901M.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.L) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        if (!this.f11899J) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C0640o0 c0640o0 = this.f11913u;
        l(c0640o0);
        c0640o0.J();
        Boolean bool = this.f11900K;
        M5.b bVar = this.f11917y;
        if (bool != null && this.L != 0) {
            if (!bool.booleanValue()) {
                bVar.getClass();
            }
            return this.f11900K.booleanValue();
        }
        bVar.getClass();
        this.L = SystemClock.elapsedRealtime();
        M1 m12 = this.f11915w;
        j(m12);
        boolean z8 = false;
        if (m12.g0("android.permission.INTERNET") && m12.g0("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.f11907a;
            if (O5.c.a(context).i() || this.f11910d.M() || (M1.z0(context) && M1.c0(context))) {
                z8 = true;
            }
        }
        this.f11900K = Boolean.valueOf(z8);
        if (z8) {
            this.f11900K = Boolean.valueOf(m12.N(q().Q()));
        }
        return this.f11900K.booleanValue();
    }

    public final Q m() {
        return this.f11916x;
    }

    public final P n() {
        k(this.f11894E);
        return this.f11894E;
    }

    public final C0632l1 o() {
        k(this.f11895F);
        return this.f11895F;
    }

    public final C0642p p() {
        l(this.f11896G);
        return this.f11896G;
    }

    public final N q() {
        k(this.f11897H);
        return this.f11897H;
    }
}
