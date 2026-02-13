package Y5;

import I2.C0330t;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S0 f11373b;

    public H0(S0 s02) {
        this.f11372a = 1;
        Objects.requireNonNull(s02);
        this.f11373b = s02;
    }

    public /* synthetic */ H0(S0 s02, int i7) {
        this.f11372a = i7;
        this.f11373b = s02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11372a) {
            case 0:
                this.f11373b.f0();
                return;
            case 1:
                R7.b bVar = this.f11373b.f11544F;
                C0646q0 c0646q0 = (C0646q0) bVar.f8929b;
                C0640o0 c0640o0 = c0646q0.f11913u;
                C0646q0.l(c0640o0);
                c0640o0.J();
                if (bVar.B()) {
                    boolean A10 = bVar.A();
                    S0 s02 = c0646q0.f11890A;
                    C0613f0 c0613f0 = c0646q0.f11911e;
                    if (A10) {
                        C0646q0.j(c0613f0);
                        c0613f0.f11739K.u(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C0646q0.k(s02);
                        s02.Q("auto", "_cmpx", bundle);
                    } else {
                        C0646q0.j(c0613f0);
                        C0330t c0330t = c0613f0.f11739K;
                        String t5 = c0330t.t();
                        if (TextUtils.isEmpty(t5)) {
                            W w10 = c0646q0.f11912f;
                            C0646q0.l(w10);
                            w10.f11578u.a("Cache still valid but referrer not found");
                        } else {
                            long f4 = c0613f0.L.f() / 3600000;
                            Uri parse = Uri.parse(t5);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (f4 - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C0646q0.k(s02);
                            s02.Q(str2, "_cmp", (Bundle) pair.second);
                        }
                        c0330t.u(null);
                    }
                    C0646q0.j(c0613f0);
                    c0613f0.L.g(0L);
                    return;
                }
                return;
            case 2:
                S0 s03 = this.f11373b;
                s03.J();
                C0646q0 c0646q02 = (C0646q0) s03.f3094a;
                C0613f0 c0613f02 = c0646q02.f11911e;
                C0646q0.j(c0613f02);
                boolean a9 = c0613f02.f11736H.a();
                W w11 = c0646q02.f11912f;
                if (a9) {
                    C0646q0.l(w11);
                    w11.f11572A.a("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                C0613f0 c0613f03 = c0646q02.f11911e;
                C0646q0.j(c0613f03);
                C0610e0 c0610e0 = c0613f03.f11737I;
                long f10 = c0610e0.f();
                c0610e0.g(1 + f10);
                if (f10 >= 5) {
                    C0646q0.l(w11);
                    w11.f11580w.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    c0613f03.f11736H.b(true);
                    return;
                } else {
                    if (s03.f11546H == null) {
                        s03.f11546H = new I0(s03, c0646q02, 3);
                    }
                    s03.f11546H.b(0L);
                    return;
                }
            default:
                this.f11373b.f0();
                return;
        }
    }
}
