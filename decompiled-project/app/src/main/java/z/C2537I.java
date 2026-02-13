package z;

import i0.C1289b;

/* renamed from: z.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2537I {

    /* renamed from: a, reason: collision with root package name */
    public final long f27879a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27880b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27881c;

    public C2537I(long j, long j10, boolean z8) {
        this.f27879a = j;
        this.f27880b = j10;
        this.f27881c = z8;
    }

    public final C2537I a(C2537I c2537i) {
        return new C2537I(C1289b.e(this.f27879a, c2537i.f27879a), Math.max(this.f27880b, c2537i.f27880b), this.f27881c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2537I)) {
            return false;
        }
        C2537I c2537i = (C2537I) obj;
        return C1289b.b(this.f27879a, c2537i.f27879a) && this.f27880b == c2537i.f27880b && this.f27881c == c2537i.f27881c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27881c) + h3.o.f(Long.hashCode(this.f27879a) * 31, 31, this.f27880b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) C1289b.g(this.f27879a)) + ", timeMillis=" + this.f27880b + ", shouldApplyImmediately=" + this.f27881c + ')';
    }
}
