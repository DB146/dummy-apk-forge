package gc;

import fc.InterfaceC1162i;
import java.util.concurrent.CancellationException;

/* renamed from: gc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1206a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC1162i f17500a;

    public C1206a(InterfaceC1162i interfaceC1162i) {
        super("Flow was aborted, no more elements needed");
        this.f17500a = interfaceC1162i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
