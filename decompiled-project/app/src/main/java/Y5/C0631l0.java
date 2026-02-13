package Y5;

import java.lang.Thread;
import java.util.Objects;

/* renamed from: Y5.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631l0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f11812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0640o0 f11813b;

    public C0631l0(C0640o0 c0640o0, String str) {
        Objects.requireNonNull(c0640o0);
        this.f11813b = c0640o0;
        this.f11812a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        W w10 = ((C0646q0) this.f11813b.f3094a).f11912f;
        C0646q0.l(w10);
        w10.f11577f.b(th, this.f11812a);
    }
}
