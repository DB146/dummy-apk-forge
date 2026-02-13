package vb;

import y7.u0;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f25436a;

    static {
        boolean z8 = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                z8 = "true".equals(property);
            }
        } catch (Throwable th) {
            u0.L(th);
        }
        f25436a = z8;
    }
}
