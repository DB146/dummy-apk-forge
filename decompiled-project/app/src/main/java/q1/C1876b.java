package q1;

import android.graphics.Insets;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1876b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1876b f23340e = new C1876b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f23341a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23342b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23343c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23344d;

    public C1876b(int i7, int i10, int i11, int i12) {
        this.f23341a = i7;
        this.f23342b = i10;
        this.f23343c = i11;
        this.f23344d = i12;
    }

    public static C1876b a(C1876b c1876b, C1876b c1876b2) {
        return b(Math.max(c1876b.f23341a, c1876b2.f23341a), Math.max(c1876b.f23342b, c1876b2.f23342b), Math.max(c1876b.f23343c, c1876b2.f23343c), Math.max(c1876b.f23344d, c1876b2.f23344d));
    }

    public static C1876b b(int i7, int i10, int i11, int i12) {
        return (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f23340e : new C1876b(i7, i10, i11, i12);
    }

    public static C1876b c(Insets insets) {
        int i7;
        int i10;
        int i11;
        int i12;
        i7 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i7, i10, i11, i12);
    }

    public final Insets d() {
        return D0.b.h(this.f23341a, this.f23342b, this.f23343c, this.f23344d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1876b.class != obj.getClass()) {
            return false;
        }
        C1876b c1876b = (C1876b) obj;
        return this.f23344d == c1876b.f23344d && this.f23341a == c1876b.f23341a && this.f23343c == c1876b.f23343c && this.f23342b == c1876b.f23342b;
    }

    public final int hashCode() {
        return (((((this.f23341a * 31) + this.f23342b) * 31) + this.f23343c) * 31) + this.f23344d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f23341a);
        sb2.append(", top=");
        sb2.append(this.f23342b);
        sb2.append(", right=");
        sb2.append(this.f23343c);
        sb2.append(", bottom=");
        return X.c.k(sb2, this.f23344d, '}');
    }
}
