package i5;

import a5.C0776b;
import a5.g;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final b f18430b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List f18431a;

    public b() {
        this.f18431a = Collections.emptyList();
    }

    public b(C0776b c0776b) {
        this.f18431a = Collections.singletonList(c0776b);
    }

    @Override // a5.g
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // a5.g
    public final long d(int i7) {
        AbstractC1705a.h(i7 == 0);
        return 0L;
    }

    @Override // a5.g
    public final List j(long j) {
        return j >= 0 ? this.f18431a : Collections.emptyList();
    }

    @Override // a5.g
    public final int o() {
        return 1;
    }
}
