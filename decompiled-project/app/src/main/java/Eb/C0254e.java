package Eb;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: Eb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0254e extends AbstractC0255f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0255f f3876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3877b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3878c;

    public C0254e(AbstractC0255f list, int i7, int i10) {
        kotlin.jvm.internal.l.e(list, "list");
        this.f3876a = list;
        this.f3877b = i7;
        tc.b.n(i7, i10, list.b());
        this.f3878c = i10 - i7;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        return this.f3878c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i10 = this.f3878c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        return this.f3876a.get(this.f3877b + i7);
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final List subList(int i7, int i10) {
        tc.b.n(i7, i10, this.f3878c);
        int i11 = this.f3877b;
        return new C0254e(this.f3876a, i7 + i11, i11 + i10);
    }
}
