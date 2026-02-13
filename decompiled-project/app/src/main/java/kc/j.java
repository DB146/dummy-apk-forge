package kc;

import A9.C0154x0;
import hc.AbstractC1273a;
import hc.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19104a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f19105b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19106c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19107d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f19108e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f19109f;
    public static final C0154x0 g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0154x0 f19110h;

    static {
        String str;
        int i7 = w.f17973a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f19104a = str;
        f19105b = AbstractC1273a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = w.f17973a;
        if (i10 < 2) {
            i10 = 2;
        }
        f19106c = AbstractC1273a.k(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f19107d = AbstractC1273a.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f19108e = TimeUnit.SECONDS.toNanos(AbstractC1273a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f19109f = f.f19099a;
        g = new C0154x0(0);
        f19110h = new C0154x0(1);
    }
}
