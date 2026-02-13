package p;

import E2.d;
import Z9.x;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1843a extends x {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1843a f22962d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f22963e = new d(2);

    /* renamed from: c, reason: collision with root package name */
    public final C1844b f22964c = new C1844b();

    public static C1843a a0() {
        if (f22962d != null) {
            return f22962d;
        }
        synchronized (C1843a.class) {
            try {
                if (f22962d == null) {
                    f22962d = new C1843a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f22962d;
    }
}
