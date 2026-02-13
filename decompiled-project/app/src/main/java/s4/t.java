package s4;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final t f24086c = new t(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f24087a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24088b;

    public t(long j, long j10) {
        this.f24087a = j;
        this.f24088b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f24087a == tVar.f24087a && this.f24088b == tVar.f24088b;
    }

    public final int hashCode() {
        return (((int) this.f24087a) * 31) + ((int) this.f24088b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f24087a);
        sb2.append(", position=");
        return X.c.f(this.f24088b, "]", sb2);
    }
}
