package N6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r0 extends s0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f7332a = new s0();

    @Override // N6.s0
    public final s0 a() {
        return A0.f7209a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
