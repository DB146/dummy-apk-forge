package Zb;

import Eb.C0252c;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b implements g, c {

    /* renamed from: a, reason: collision with root package name */
    public final g f12337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12338b;

    public b(g gVar, int i7) {
        this.f12337a = gVar;
        this.f12338b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // Zb.c
    public final g a(int i7) {
        int i10 = this.f12338b + i7;
        return i10 < 0 ? new b(this, i7) : new b(this.f12337a, i10);
    }

    @Override // Zb.g
    public final Iterator iterator() {
        return new C0252c(this);
    }
}
