package Y5;

import android.os.Bundle;
import java.util.Iterator;
import u.C2049b;
import u.C2052e;

/* renamed from: Y5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654v extends C {

    /* renamed from: b, reason: collision with root package name */
    public final C2052e f11959b;

    /* renamed from: c, reason: collision with root package name */
    public final C2052e f11960c;

    /* renamed from: d, reason: collision with root package name */
    public long f11961d;

    /* JADX WARN: Type inference failed for: r2v1, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [u.T, u.e] */
    public C0654v(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11960c = new u.T(0);
        this.f11959b = new u.T(0);
    }

    public final void K(String str, long j) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (str == null || str.length() == 0) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Ad unit id must be a non-empty string");
        } else {
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(new RunnableC0597a(this, str, j, 0));
        }
    }

    public final void L(String str, long j) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (str == null || str.length() == 0) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Ad unit id must be a non-empty string");
        } else {
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(new RunnableC0597a(this, str, j, 1));
        }
    }

    public final void M(long j) {
        C0605c1 c0605c1 = ((C0646q0) this.f3094a).f11918z;
        C0646q0.k(c0605c1);
        Z0 P10 = c0605c1.P(false);
        C2052e c2052e = this.f11959b;
        Iterator it = ((C2049b) c2052e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            O(str, j - ((Long) c2052e.get(str)).longValue(), P10);
        }
        if (!c2052e.isEmpty()) {
            N(j - this.f11961d, P10);
        }
        P(j);
    }

    public final void N(long j, Z0 z02) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (z02 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11573B.a("Not logging ad exposure. No active activity");
        } else {
            if (j < 1000) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11573B.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            M1.A0(z02, bundle, true);
            S0 s02 = c0646q0.f11890A;
            C0646q0.k(s02);
            s02.Q("am", "_xa", bundle);
        }
    }

    public final void O(String str, long j, Z0 z02) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (z02 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11573B.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11573B.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            M1.A0(z02, bundle, true);
            S0 s02 = c0646q0.f11890A;
            C0646q0.k(s02);
            s02.Q("am", "_xu", bundle);
        }
    }

    public final void P(long j) {
        C2052e c2052e = this.f11959b;
        Iterator it = ((C2049b) c2052e.keySet()).iterator();
        while (it.hasNext()) {
            c2052e.put((String) it.next(), Long.valueOf(j));
        }
        if (c2052e.isEmpty()) {
            return;
        }
        this.f11961d = j;
    }
}
