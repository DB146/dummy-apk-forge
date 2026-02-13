package k5;

import N6.AbstractC0452z;
import m4.L;

/* renamed from: k5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18893a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18894b;

    public C1428g(L l10, int i7) {
        this.f18893a = (l10.f20088d & 1) != 0;
        this.f18894b = q.e(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1428g c1428g = (C1428g) obj;
        return AbstractC0452z.f7375a.c(this.f18894b, c1428g.f18894b).c(this.f18893a, c1428g.f18893a).e();
    }
}
