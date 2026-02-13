package k5;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422a {

    /* renamed from: a, reason: collision with root package name */
    public final long f18851a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18852b;

    public C1422a(long j, long j10) {
        this.f18851a = j;
        this.f18852b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422a)) {
            return false;
        }
        C1422a c1422a = (C1422a) obj;
        return this.f18851a == c1422a.f18851a && this.f18852b == c1422a.f18852b;
    }

    public final int hashCode() {
        return (((int) this.f18851a) * 31) + ((int) this.f18852b);
    }
}
