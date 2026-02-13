package y;

import j0.AbstractC1362A;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final long f26433a;

    /* renamed from: b, reason: collision with root package name */
    public final C.F f26434b;

    public T() {
        long c10 = AbstractC1362A.c(4284900966L);
        float f4 = 0;
        C.F f10 = new C.F(f4, f4, f4, f4);
        this.f26433a = c10;
        this.f26434b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!T.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        T t5 = (T) obj;
        return j0.n.c(this.f26433a, t5.f26433a) && kotlin.jvm.internal.l.a(this.f26434b, t5.f26434b);
    }

    public final int hashCode() {
        int i7 = j0.n.f18553h;
        return this.f26434b.hashCode() + (Long.hashCode(this.f26433a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        S.d(this.f26433a, ", drawPadding=", sb2);
        sb2.append(this.f26434b);
        sb2.append(')');
        return sb2.toString();
    }
}
