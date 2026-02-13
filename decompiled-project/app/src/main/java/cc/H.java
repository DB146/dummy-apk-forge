package cc;

import kc.C1441d;

/* loaded from: classes2.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final K f14482a;

    static {
        String str;
        K k;
        int i7 = hc.w.f17973a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            C1441d c1441d = P.f14498a;
            dc.d dVar = hc.o.f17967a;
            dc.d dVar2 = dVar.f16631f;
            k = dVar;
            if (dVar == null) {
                k = G.f14479x;
            }
        } else {
            k = G.f14479x;
        }
        f14482a = k;
    }
}
