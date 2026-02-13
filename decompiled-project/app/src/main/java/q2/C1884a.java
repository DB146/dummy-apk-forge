package q2;

import Hb.i;
import cc.E;
import cc.F;
import kotlin.jvm.internal.l;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884a implements AutoCloseable, E {

    /* renamed from: a, reason: collision with root package name */
    public final i f23361a;

    public C1884a(i coroutineContext) {
        l.e(coroutineContext, "coroutineContext");
        this.f23361a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        F.h(this.f23361a, null);
    }

    @Override // cc.E
    public final i l() {
        return this.f23361a;
    }
}
