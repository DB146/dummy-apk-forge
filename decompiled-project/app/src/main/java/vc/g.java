package vc;

import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Constructor f25474a;

    static {
        try {
            f25474a = Class.forName("org.jsoup.helper.HttpClientExecutor").getConstructor(d.class, e.class);
        } catch (Exception unused) {
        }
    }
}
