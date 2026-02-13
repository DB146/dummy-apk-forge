package T4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9243a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9244b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9245c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9246d;

    public b(int i7, int i10, String str, String str2) {
        this.f9243a = str;
        this.f9244b = str2;
        this.f9245c = i7;
        this.f9246d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9245c == bVar.f9245c && this.f9246d == bVar.f9246d && O5.b.o(this.f9243a, bVar.f9243a) && O5.b.o(this.f9244b, bVar.f9244b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9243a, this.f9244b, Integer.valueOf(this.f9245c), Integer.valueOf(this.f9246d)});
    }
}
