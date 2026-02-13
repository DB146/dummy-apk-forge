package j0;

import i0.C1289b;
import y.S;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final C f18511d = new C(AbstractC1362A.c(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f18512a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18513b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18514c;

    public C(long j, long j10, float f4) {
        this.f18512a = j;
        this.f18513b = j10;
        this.f18514c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return n.c(this.f18512a, c10.f18512a) && C1289b.b(this.f18513b, c10.f18513b) && this.f18514c == c10.f18514c;
    }

    public final int hashCode() {
        int i7 = n.f18553h;
        return Float.hashCode(this.f18514c) + h3.o.f(Long.hashCode(this.f18512a) * 31, 31, this.f18513b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        S.d(this.f18512a, ", offset=", sb2);
        sb2.append((Object) C1289b.g(this.f18513b));
        sb2.append(", blurRadius=");
        sb2.append(this.f18514c);
        sb2.append(')');
        return sb2.toString();
    }
}
