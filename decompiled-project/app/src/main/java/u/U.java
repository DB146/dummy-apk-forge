package u;

import java.util.Arrays;
import v.AbstractC2121a;

/* loaded from: classes.dex */
public final class U implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24638a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f24639b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24640c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24641d;

    public U(int i7) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f24639b = new int[i13];
        this.f24640c = new Object[i13];
    }

    public final void a(int i7, Object obj) {
        int i10 = this.f24641d;
        if (i10 != 0 && i7 <= this.f24639b[i10 - 1]) {
            e(i7, obj);
            return;
        }
        if (this.f24638a && i10 >= this.f24639b.length) {
            AbstractC2065s.a(this);
        }
        int i11 = this.f24641d;
        if (i11 >= this.f24639b.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f24639b, i15);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            this.f24639b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f24640c, i15);
            kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
            this.f24640c = copyOf2;
        }
        this.f24639b[i11] = i7;
        this.f24640c[i11] = obj;
        this.f24641d = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final U clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.l.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        U u3 = (U) clone;
        u3.f24639b = (int[]) this.f24639b.clone();
        u3.f24640c = (Object[]) this.f24640c.clone();
        return u3;
    }

    public final Object c(int i7) {
        Object obj;
        int a9 = AbstractC2121a.a(this.f24641d, i7, this.f24639b);
        if (a9 < 0 || (obj = this.f24640c[a9]) == AbstractC2065s.f24716c) {
            return null;
        }
        return obj;
    }

    public final int d(int i7) {
        if (this.f24638a) {
            AbstractC2065s.a(this);
        }
        return this.f24639b[i7];
    }

    public final void e(int i7, Object obj) {
        int a9 = AbstractC2121a.a(this.f24641d, i7, this.f24639b);
        if (a9 >= 0) {
            this.f24640c[a9] = obj;
            return;
        }
        int i10 = ~a9;
        int i11 = this.f24641d;
        if (i10 < i11) {
            Object[] objArr = this.f24640c;
            if (objArr[i10] == AbstractC2065s.f24716c) {
                this.f24639b[i10] = i7;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f24638a && i11 >= this.f24639b.length) {
            AbstractC2065s.a(this);
            i10 = ~AbstractC2121a.a(this.f24641d, i7, this.f24639b);
        }
        int i12 = this.f24641d;
        if (i12 >= this.f24639b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f24639b, i16);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            this.f24639b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f24640c, i16);
            kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
            this.f24640c = copyOf2;
        }
        int i17 = this.f24641d;
        if (i17 - i10 != 0) {
            int[] iArr = this.f24639b;
            int i18 = i10 + 1;
            Eb.n.M(i18, i10, i17, iArr, iArr);
            Object[] objArr2 = this.f24640c;
            Eb.n.P(objArr2, i18, objArr2, i10, this.f24641d);
        }
        this.f24639b[i10] = i7;
        this.f24640c[i10] = obj;
        this.f24641d++;
    }

    public final int f() {
        if (this.f24638a) {
            AbstractC2065s.a(this);
        }
        return this.f24641d;
    }

    public final Object g(int i7) {
        if (this.f24638a) {
            AbstractC2065s.a(this);
        }
        Object[] objArr = this.f24640c;
        if (i7 < objArr.length) {
            return objArr[i7];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24641d * 28);
        sb2.append('{');
        int i7 = this.f24641d;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object g = g(i10);
            if (g != this) {
                sb2.append(g);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
