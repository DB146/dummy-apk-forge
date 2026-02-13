package Ha;

import N.AbstractC0413c;
import N.C0411a;
import Q.C0505n0;
import Q.C0506o;
import Y.e;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j0.n;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0411a f4911a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0411a f4912b;

    static {
        long j = n.f18548b;
        f4911a = AbstractC0413c.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8193, 15);
        f4912b = AbstractC0413c.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8193, 15);
    }

    public static final void a(boolean z8, e eVar, C0506o c0506o, int i7) {
        c0506o.U(-1631968757);
        if (((i7 | 50) & 147) == 146 && c0506o.x()) {
            c0506o.N();
        } else {
            c0506o.P();
            if ((i7 & 1) == 0 || c0506o.w()) {
                z8 = (((Configuration) c0506o.k(AndroidCompositionLocals_androidKt.f13206a)).uiMode & 48) == 32;
            } else {
                c0506o.N();
            }
            c0506o.q();
            c0506o.S(-658905020);
            C0411a c0411a = z8 ? f4911a : f4912b;
            c0506o.p(false);
            N.n.a(c0411a, null, c.f4913a, eVar, c0506o, 3456);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new a(z8, eVar, i7, 0);
        }
    }
}
