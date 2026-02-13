package e9;

/* renamed from: e9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1102b {

    /* renamed from: a, reason: collision with root package name */
    public final int f16814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16815b;

    public C1102b(int i7, int i10) {
        this.f16814a = i7;
        this.f16815b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1102b)) {
            return false;
        }
        C1102b c1102b = (C1102b) obj;
        return this.f16814a == c1102b.f16814a && this.f16815b == c1102b.f16815b;
    }

    public final int hashCode() {
        return this.f16814a ^ this.f16815b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16814a);
        sb2.append("(");
        return X.c.k(sb2, this.f16815b, ')');
    }
}
