package K0;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final long f5851b = E6.b.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5852c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f5853a;

    public /* synthetic */ E(long j) {
        this.f5853a = j;
    }

    public static String a(long j) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return X.c.k(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return this.f5853a == ((E) obj).f5853a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5853a);
    }

    public final String toString() {
        return a(this.f5853a);
    }
}
