package hc;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: hc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1275c {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f17936a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f17936a = method;
    }
}
