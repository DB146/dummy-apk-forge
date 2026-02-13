package kc;

import cc.A;
import hc.AbstractC1273a;

/* renamed from: kc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1441d extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final C1441d f19098d;

    /* JADX WARN: Type inference failed for: r0v0, types: [kc.g, kc.d, cc.A] */
    static {
        int i7 = j.f19106c;
        int i10 = j.f19107d;
        long j = j.f19108e;
        String str = j.f19104a;
        ?? a9 = new A();
        a9.f19100c = new ExecutorC1439b(i7, i10, j, str);
        f19098d = a9;
    }

    @Override // cc.A
    public final A W(int i7) {
        AbstractC1273a.a(1);
        return 1 >= j.f19106c ? this : super.W(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // cc.A
    public final String toString() {
        return "Dispatchers.Default";
    }
}
