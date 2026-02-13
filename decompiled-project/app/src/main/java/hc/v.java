package hc;

import a.AbstractC0672a;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17972a = 0;

    static {
        Object n6;
        Object n8;
        Exception exc = new Exception();
        String simpleName = AbstractC0672a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            n6 = Jb.a.class.getCanonicalName();
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        if (Db.m.a(n6) != null) {
            n6 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            n8 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            n8 = com.bumptech.glide.c.n(th2);
        }
        if (Db.m.a(n8) != null) {
            n8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
