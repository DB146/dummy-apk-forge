package Q;

/* renamed from: Q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478a {

    /* renamed from: a, reason: collision with root package name */
    public int f8373a;

    public C0478a(int i7) {
        this.f8373a = i7;
    }

    public final boolean a() {
        return this.f8373a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return A3.c.k(sb2, this.f8373a, " }");
    }
}
