package Ic;

import h3.o;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5355a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5356b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5357c;

    public a(int i7, long j, long j10) {
        this.f5355a = i7;
        this.f5356b = j;
        this.f5357c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5355a == aVar.f5355a && this.f5356b == aVar.f5356b && this.f5357c == aVar.f5357c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5357c) + o.f(Integer.hashCode(this.f5355a) * 31, 31, this.f5356b);
    }

    public final String toString() {
        return "AdsVersionEntity(id=" + this.f5355a + ", version=" + this.f5356b + ", lastUpdated=" + this.f5357c + ")";
    }
}
