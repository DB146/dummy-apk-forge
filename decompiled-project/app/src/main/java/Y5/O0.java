package Y5;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f11486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f11487c;

    public O0(S0 s02, Bundle bundle, int i7) {
        this.f11485a = i7;
        switch (i7) {
            case 1:
                this.f11486b = bundle;
                Objects.requireNonNull(s02);
                this.f11487c = s02;
                return;
            case 2:
                this.f11487c = s02;
                this.f11486b = bundle;
                return;
            default:
                this.f11486b = bundle;
                Objects.requireNonNull(s02);
                this.f11487c = s02;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f11485a) {
            case 0:
                S0 s02 = this.f11487c;
                s02.J();
                s02.K();
                Bundle bundle2 = this.f11486b;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                com.google.android.gms.common.internal.G.d(string);
                com.google.android.gms.common.internal.G.d(string2);
                com.google.android.gms.common.internal.G.g(bundle2.get("value"));
                C0646q0 c0646q0 = (C0646q0) s02.f3094a;
                if (!c0646q0.a()) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11573B.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                K1 k12 = new K1(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                try {
                    M1 m12 = c0646q0.f11915w;
                    C0646q0.j(m12);
                    bundle2.getString("app_id");
                    C0648s l02 = m12.l0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                    C0646q0.j(m12);
                    bundle2.getString("app_id");
                    C0648s l03 = m12.l0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                    bundle2.getString("app_id");
                    c0646q0.o().c0(new C0609e(bundle2.getString("app_id"), string2, k12, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), l03, bundle2.getLong("trigger_timeout"), l02, bundle2.getLong("time_to_live"), m12.l0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                S0 s03 = this.f11487c;
                s03.J();
                s03.K();
                Bundle bundle3 = this.f11486b;
                String string3 = bundle3.getString("name");
                com.google.android.gms.common.internal.G.d(string3);
                C0646q0 c0646q02 = (C0646q0) s03.f3094a;
                if (!c0646q02.a()) {
                    W w11 = c0646q02.f11912f;
                    C0646q0.l(w11);
                    w11.f11573B.a("Conditional property not cleared since app measurement is disabled");
                    return;
                } else {
                    K1 k13 = new K1(0L, null, string3, "");
                    try {
                        M1 m13 = c0646q02.f11915w;
                        C0646q0.j(m13);
                        bundle3.getString("app_id");
                        c0646q02.o().c0(new C0609e(bundle3.getString("app_id"), "", k13, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), m13.l0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        return;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                S0 s04 = this.f11487c;
                s04.getClass();
                Bundle bundle4 = this.f11486b;
                boolean isEmpty = bundle4.isEmpty();
                C0646q0 c0646q03 = (C0646q0) s04.f3094a;
                if (isEmpty) {
                    bundle = bundle4;
                } else {
                    C0613f0 c0613f0 = c0646q03.f11911e;
                    C0646q0.j(c0613f0);
                    bundle = new Bundle(c0613f0.f11740M.n());
                    Iterator<String> it = bundle4.keySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        R7.b bVar = s04.f11549K;
                        C0615g c0615g = c0646q03.f11910d;
                        W w12 = c0646q03.f11912f;
                        M1 m14 = c0646q03.f11915w;
                        if (hasNext) {
                            String next = it.next();
                            Object obj = bundle4.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                C0646q0.j(m14);
                                if (M1.R0(obj)) {
                                    M1.Z(bVar, null, 27, null, null, 0);
                                }
                                C0646q0.l(w12);
                                w12.f11582y.c("Invalid default event parameter type. Name, value", next, obj);
                            } else if (M1.h0(next)) {
                                C0646q0.l(w12);
                                w12.f11582y.b(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundle.remove(next);
                            } else {
                                C0646q0.j(m14);
                                c0615g.getClass();
                                if (m14.S0("param", next, 500, obj)) {
                                    m14.Y(bundle, next, obj);
                                }
                            }
                        } else {
                            C0646q0.j(m14);
                            M1 m15 = ((C0646q0) c0615g.f3094a).f11915w;
                            C0646q0.j(m15);
                            int i7 = m15.o0(201500000) ? 100 : 25;
                            if (bundle.size() > i7) {
                                Iterator it2 = new TreeSet(bundle.keySet()).iterator();
                                int i10 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i10++;
                                    if (i10 > i7) {
                                        bundle.remove(str);
                                    }
                                }
                                C0646q0.j(m14);
                                M1.Z(bVar, null, 26, null, null, 0);
                                C0646q0.l(w12);
                                w12.f11582y.a("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                        }
                    }
                }
                C0613f0 c0613f02 = c0646q03.f11911e;
                C0646q0.j(c0613f02);
                c0613f02.f11740M.r(bundle);
                if (bundle4.isEmpty()) {
                    if (!c0646q03.f11910d.T(null, F.f11297W0)) {
                        return;
                    }
                }
                c0646q03.o().O(bundle);
                return;
        }
    }
}
