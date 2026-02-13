package Y5;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Y5.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605c1 extends H {

    /* renamed from: c, reason: collision with root package name */
    public volatile Z0 f11686c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Z0 f11687d;

    /* renamed from: e, reason: collision with root package name */
    public Z0 f11688e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f11689f;

    /* renamed from: u, reason: collision with root package name */
    public zzdf f11690u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f11691v;

    /* renamed from: w, reason: collision with root package name */
    public volatile Z0 f11692w;

    /* renamed from: x, reason: collision with root package name */
    public Z0 f11693x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11694y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f11695z;

    public C0605c1(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11695z = new Object();
        this.f11689f = new ConcurrentHashMap();
    }

    @Override // Y5.H
    public final boolean M() {
        return false;
    }

    public final void N(Z0 z02, boolean z8, long j) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        C0654v c0654v = c0646q0.f11891B;
        C0646q0.i(c0654v);
        c0646q0.f11917y.getClass();
        c0654v.M(SystemClock.elapsedRealtime());
        boolean z10 = z02 != null && z02.f11614d;
        t1 t1Var = c0646q0.f11914v;
        C0646q0.k(t1Var);
        if (!t1Var.f11949f.a(j, z10, z8) || z02 == null) {
            return;
        }
        z02.f11614d = false;
    }

    public final Z0 O(zzdf zzdfVar) {
        com.google.android.gms.common.internal.G.g(zzdfVar);
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        ConcurrentHashMap concurrentHashMap = this.f11689f;
        Z0 z02 = (Z0) concurrentHashMap.get(valueOf);
        if (z02 == null) {
            String Q3 = Q(zzdfVar.zzb);
            M1 m12 = ((C0646q0) this.f3094a).f11915w;
            C0646q0.j(m12);
            Z0 z03 = new Z0(m12.F0(), null, Q3);
            concurrentHashMap.put(valueOf, z03);
            z02 = z03;
        }
        return this.f11692w != null ? this.f11692w : z02;
    }

    public final Z0 P(boolean z8) {
        K();
        J();
        if (!z8) {
            return this.f11688e;
        }
        Z0 z02 = this.f11688e;
        return z02 != null ? z02 : this.f11693x;
    }

    public final String Q(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.f11910d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c0646q0.f11910d.getClass();
        return str2.substring(0, 500);
    }

    public final void R(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!((C0646q0) this.f3094a).f11910d.X() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f11689f.put(Integer.valueOf(zzdfVar.zza), new Z0(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void S(String str, Z0 z02, boolean z8) {
        Z0 z03;
        Z0 z04 = this.f11686c == null ? this.f11687d : this.f11686c;
        if (z02.f11612b == null) {
            z03 = new Z0(z02.f11611a, str != null ? Q(str) : null, z02.f11613c, z02.f11615e, z02.f11616f);
        } else {
            z03 = z02;
        }
        this.f11687d = this.f11686c;
        this.f11686c = z03;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.f11917y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new RunnableC0599a1(this, z03, z04, elapsedRealtime, z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(Z0 z02, Z0 z03, long j, boolean z8, Bundle bundle) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        J();
        boolean z13 = false;
        if (z03 != null) {
            if (z03.f11613c == z02.f11613c && Objects.equals(z03.f11612b, z02.f11612b) && Objects.equals(z03.f11611a, z02.f11611a)) {
                z10 = false;
                if (z8 && this.f11688e != null) {
                    z13 = true;
                }
                z11 = z02.f11615e;
                C0646q0 c0646q0 = (C0646q0) this.f3094a;
                if (z10) {
                    z12 = z13;
                } else {
                    Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                    M1.A0(z02, bundle2, true);
                    if (z03 != null) {
                        String str = z03.f11611a;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        String str2 = z03.f11612b;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", z03.f11613c);
                    }
                    if (z13) {
                        t1 t1Var = c0646q0.f11914v;
                        C0646q0.k(t1Var);
                        A4.e eVar = t1Var.f11949f;
                        long j11 = j - eVar.f378b;
                        eVar.f378b = j;
                        if (j11 > 0) {
                            M1 m12 = c0646q0.f11915w;
                            C0646q0.j(m12);
                            m12.q0(bundle2, j11);
                        }
                    }
                    if (!c0646q0.f11910d.X()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    String str3 = true != z11 ? "auto" : "app";
                    c0646q0.f11917y.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z11) {
                        z12 = z13;
                        long j12 = z02.f11616f;
                        if (j12 != 0) {
                            j10 = j12;
                            S0 s02 = c0646q0.f11890A;
                            C0646q0.k(s02);
                            s02.R(str3, "_vs", bundle2, j10);
                        }
                    } else {
                        z12 = z13;
                    }
                    j10 = currentTimeMillis;
                    S0 s022 = c0646q0.f11890A;
                    C0646q0.k(s022);
                    s022.R(str3, "_vs", bundle2, j10);
                }
                if (z12) {
                    N(this.f11688e, true, j);
                }
                this.f11688e = z02;
                if (z11) {
                    this.f11693x = z02;
                }
                C0632l1 o10 = c0646q0.o();
                o10.J();
                o10.K();
                o10.X(new E5.k(o10, z02));
            }
        }
        z10 = true;
        if (z8) {
            z13 = true;
        }
        z11 = z02.f11615e;
        C0646q0 c0646q02 = (C0646q0) this.f3094a;
        if (z10) {
        }
        if (z12) {
        }
        this.f11688e = z02;
        if (z11) {
        }
        C0632l1 o102 = c0646q02.o();
        o102.J();
        o102.K();
        o102.X(new E5.k(o102, z02));
    }
}
