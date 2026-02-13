package z3;

import W3.o;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f28238a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28239b;

    public i(int i7, int i10) {
        this.f28238a = i7;
        this.f28239b = i10;
        if (!o.i(i7)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!o.i(i10)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f28238a == iVar.f28238a && this.f28239b == iVar.f28239b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28239b) + (Integer.hashCode(this.f28238a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Size(width=");
        sb2.append(this.f28238a);
        sb2.append(", height=");
        return X.c.k(sb2, this.f28239b, ')');
    }
}
