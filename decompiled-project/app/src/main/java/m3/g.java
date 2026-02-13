package m3;

import h3.o;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19787a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19788b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19789c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19790d;

    public g(boolean z8, boolean z10, boolean z11, boolean z12) {
        this.f19787a = z8;
        this.f19788b = z10;
        this.f19789c = z11;
        this.f19790d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f19787a == gVar.f19787a && this.f19788b == gVar.f19788b && this.f19789c == gVar.f19789c && this.f19790d == gVar.f19790d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19790d) + o.g(this.f19789c, o.g(this.f19788b, Boolean.hashCode(this.f19787a) * 31, 31), 31);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f19787a + ", isValidated=" + this.f19788b + ", isMetered=" + this.f19789c + ", isNotRoaming=" + this.f19790d + ')';
    }
}
