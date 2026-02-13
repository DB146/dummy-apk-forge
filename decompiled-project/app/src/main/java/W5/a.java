package W5;

import L7.i;
import Y5.C0605c1;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.C0654v;
import Y5.K1;
import Y5.L0;
import Y5.M1;
import Y5.S0;
import Y5.W;
import Y5.Z0;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.G;
import i2.C1332t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import u.T;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final C0646q0 f10814a;

    /* renamed from: b, reason: collision with root package name */
    public final S0 f10815b;

    public a(C0646q0 c0646q0) {
        G.g(c0646q0);
        this.f10814a = c0646q0;
        S0 s02 = c0646q0.f11890A;
        C0646q0.k(s02);
        this.f10815b = s02;
    }

    @Override // Y5.T0
    public final void a(String str, String str2, Bundle bundle) {
        S0 s02 = this.f10814a.f11890A;
        C0646q0.k(s02);
        s02.X(str, str2, bundle);
    }

    @Override // Y5.T0
    public final List b(String str, String str2) {
        S0 s02 = this.f10815b;
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        boolean P10 = c0640o0.P();
        W w10 = c0646q0.f11912f;
        if (P10) {
            C0646q0.l(w10);
            w10.f11577f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C1332t.e()) {
            C0646q0.l(w10);
            w10.f11577f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.T(atomicReference, 5000L, "get conditional user properties", new i(s02, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return M1.y0(list);
        }
        C0646q0.l(w10);
        w10.f11577f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // Y5.T0
    public final void c(Bundle bundle) {
        S0 s02 = this.f10815b;
        ((C0646q0) s02.f3094a).f11917y.getClass();
        s02.W(bundle, System.currentTimeMillis());
    }

    @Override // Y5.T0
    public final int d(String str) {
        S0 s02 = this.f10815b;
        s02.getClass();
        G.d(str);
        ((C0646q0) s02.f3094a).getClass();
        return 25;
    }

    @Override // Y5.T0
    public final void e(String str) {
        C0646q0 c0646q0 = this.f10814a;
        C0654v c0654v = c0646q0.f11891B;
        C0646q0.i(c0654v);
        c0646q0.f11917y.getClass();
        c0654v.L(str, SystemClock.elapsedRealtime());
    }

    @Override // Y5.T0
    public final void f(String str, String str2, Bundle bundle) {
        S0 s02 = this.f10815b;
        ((C0646q0) s02.f3094a).f11917y.getClass();
        s02.O(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // Y5.T0
    public final void g(String str) {
        C0646q0 c0646q0 = this.f10814a;
        C0654v c0654v = c0646q0.f11891B;
        C0646q0.i(c0654v);
        c0646q0.f11917y.getClass();
        c0654v.K(str, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Map, u.T] */
    @Override // Y5.T0
    public final Map zzd(String str, String str2, boolean z8) {
        S0 s02 = this.f10815b;
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        boolean P10 = c0640o0.P();
        W w10 = c0646q0.f11912f;
        if (P10) {
            C0646q0.l(w10);
            w10.f11577f.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C1332t.e()) {
            C0646q0.l(w10);
            w10.f11577f.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.T(atomicReference, 5000L, "get user properties", new L0(s02, atomicReference, str, str2, z8));
        List<K1> list = (List) atomicReference.get();
        if (list == null) {
            C0646q0.l(w10);
            w10.f11577f.b(Boolean.valueOf(z8), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        ?? t5 = new T(list.size());
        for (K1 k12 : list) {
            Object t10 = k12.t();
            if (t10 != null) {
                t5.put(k12.f11429b, t10);
            }
        }
        return t5;
    }

    @Override // Y5.T0
    public final String zzh() {
        C0605c1 c0605c1 = ((C0646q0) this.f10815b.f3094a).f11918z;
        C0646q0.k(c0605c1);
        Z0 z02 = c0605c1.f11686c;
        if (z02 != null) {
            return z02.f11611a;
        }
        return null;
    }

    @Override // Y5.T0
    public final String zzi() {
        C0605c1 c0605c1 = ((C0646q0) this.f10815b.f3094a).f11918z;
        C0646q0.k(c0605c1);
        Z0 z02 = c0605c1.f11686c;
        if (z02 != null) {
            return z02.f11612b;
        }
        return null;
    }

    @Override // Y5.T0
    public final String zzj() {
        return (String) this.f10815b.f11554u.get();
    }

    @Override // Y5.T0
    public final String zzk() {
        return (String) this.f10815b.f11554u.get();
    }

    @Override // Y5.T0
    public final long zzl() {
        M1 m12 = this.f10814a.f11915w;
        C0646q0.j(m12);
        return m12.F0();
    }
}
