package p9;

/* loaded from: classes2.dex */
public final class r implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f23214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23215b;

    public r(int i7, int i10) {
        this.f23214a = i7;
        this.f23215b = i10;
    }

    public final r a(r rVar) {
        int i7 = rVar.f23215b;
        int i10 = this.f23214a;
        int i11 = i10 * i7;
        int i12 = rVar.f23214a;
        int i13 = this.f23215b;
        return i11 <= i12 * i13 ? new r(i12, (i13 * i12) / i10) : new r((i10 * i7) / i13, i7);
    }

    public final r b(r rVar) {
        int i7 = rVar.f23215b;
        int i10 = this.f23214a;
        int i11 = i10 * i7;
        int i12 = rVar.f23214a;
        int i13 = this.f23215b;
        return i11 >= i12 * i13 ? new r(i12, (i13 * i12) / i10) : new r((i10 * i7) / i13, i7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        int i7 = this.f23215b * this.f23214a;
        int i10 = rVar.f23215b * rVar.f23214a;
        if (i10 < i7) {
            return 1;
        }
        return i10 > i7 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f23214a == rVar.f23214a && this.f23215b == rVar.f23215b;
    }

    public final int hashCode() {
        return (this.f23214a * 31) + this.f23215b;
    }

    public final String toString() {
        return this.f23214a + "x" + this.f23215b;
    }
}
