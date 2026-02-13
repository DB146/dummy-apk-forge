package c0;

import java.util.concurrent.CancellationException;
import u0.u;
import z.AbstractC2556g0;

/* loaded from: classes.dex */
public final class n extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, int i7) {
        super(str);
        this.f14125a = i7;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f14125a) {
            case 0:
                setStackTrace(o.f14126a);
                return this;
            case 1:
                setStackTrace(u.f24800a);
                return this;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                setStackTrace(AbstractC2556g0.f27984d);
                return this;
        }
    }
}
