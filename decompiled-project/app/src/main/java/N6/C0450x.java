package N6;

import java.util.Comparator;

/* renamed from: N6.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450x extends AbstractC0452z {
    public static AbstractC0452z f(int i7) {
        return i7 < 0 ? AbstractC0452z.f7376b : i7 > 0 ? AbstractC0452z.f7377c : AbstractC0452z.f7375a;
    }

    @Override // N6.AbstractC0452z
    public final AbstractC0452z a(int i7, int i10) {
        return f(i7 < i10 ? -1 : i7 > i10 ? 1 : 0);
    }

    @Override // N6.AbstractC0452z
    public final AbstractC0452z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // N6.AbstractC0452z
    public final AbstractC0452z c(boolean z8, boolean z10) {
        return f(z8 == z10 ? 0 : z8 ? 1 : -1);
    }

    @Override // N6.AbstractC0452z
    public final AbstractC0452z d(boolean z8, boolean z10) {
        return f(z10 == z8 ? 0 : z10 ? 1 : -1);
    }

    @Override // N6.AbstractC0452z
    public final int e() {
        return 0;
    }
}
