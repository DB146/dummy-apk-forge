package vb;

import hb.InterfaceC1269b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e implements Future {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1269b f25385a;

    public e(InterfaceC1269b interfaceC1269b) {
        this.f25385a = interfaceC1269b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        this.f25385a.b();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }
}
