package M1;

import java.util.concurrent.atomic.AtomicInteger;
import jb.InterfaceC1395f;

/* renamed from: M1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386a implements InterfaceC1395f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f6654a;

    public C0386a() {
        this.f6654a = new AtomicInteger(0);
    }

    public C0386a(AtomicInteger atomicInteger) {
        this.f6654a = atomicInteger;
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        Throwable it = (Throwable) obj;
        kotlin.jvm.internal.l.e(it, "it");
        return kotlin.jvm.internal.l.a(it.getMessage(), "canretry") && this.f6654a.decrementAndGet() >= 0;
    }
}
