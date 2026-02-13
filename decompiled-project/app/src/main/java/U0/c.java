package U0;

import j0.AbstractC1362A;

/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final long f9416a;

    public c(long j) {
        this.f9416a = j;
        if (j != 16) {
            return;
        }
        P0.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // U0.p
    public final float a() {
        return j0.n.d(this.f9416a);
    }

    @Override // U0.p
    public final long b() {
        return this.f9416a;
    }

    @Override // U0.p
    public final AbstractC1362A c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j0.n.c(this.f9416a, ((c) obj).f9416a);
    }

    public final int hashCode() {
        int i7 = j0.n.f18553h;
        return Long.hashCode(this.f9416a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) j0.n.i(this.f9416a)) + ')';
    }
}
