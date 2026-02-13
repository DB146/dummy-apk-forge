package T4;

import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f9285a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9286b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9287c;

    /* renamed from: d, reason: collision with root package name */
    public int f9288d;

    public j(long j, long j10, String str) {
        this.f9287c = str == null ? "" : str;
        this.f9285a = j;
        this.f9286b = j10;
    }

    public final j a(j jVar, String str) {
        long j;
        String N10 = AbstractC1705a.N(str, this.f9287c);
        if (jVar == null || !N10.equals(AbstractC1705a.N(str, jVar.f9287c))) {
            return null;
        }
        long j10 = this.f9286b;
        long j11 = jVar.f9286b;
        if (j10 != -1) {
            long j12 = this.f9285a;
            j = j10;
            if (j12 + j10 == jVar.f9285a) {
                return new j(j12, j11 == -1 ? -1L : j + j11, N10);
            }
        } else {
            j = j10;
        }
        if (j11 != -1) {
            long j13 = jVar.f9285a;
            if (j13 + j11 == this.f9285a) {
                return new j(j13, j == -1 ? -1L : j11 + j, N10);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9285a == jVar.f9285a && this.f9286b == jVar.f9286b && this.f9287c.equals(jVar.f9287c);
    }

    public final int hashCode() {
        if (this.f9288d == 0) {
            this.f9288d = this.f9287c.hashCode() + ((((527 + ((int) this.f9285a)) * 31) + ((int) this.f9286b)) * 31);
        }
        return this.f9288d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f9287c);
        sb2.append(", start=");
        sb2.append(this.f9285a);
        sb2.append(", length=");
        return X.c.f(this.f9286b, ")", sb2);
    }
}
