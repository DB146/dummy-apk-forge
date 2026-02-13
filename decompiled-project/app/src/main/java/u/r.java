package u;

import java.util.Arrays;
import v.AbstractC2121a;

/* loaded from: classes.dex */
public final class r implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24710a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f24711b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24712c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24713d;

    public r(int i7) {
        if (i7 == 0) {
            this.f24711b = AbstractC2121a.f24922b;
            this.f24712c = AbstractC2121a.f24923c;
            return;
        }
        int i10 = i7 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f24711b = new long[i13];
        this.f24712c = new Object[i13];
    }

    public /* synthetic */ r(Object obj) {
        this(10);
    }

    public final void a() {
        int i7 = this.f24713d;
        Object[] objArr = this.f24712c;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        this.f24713d = 0;
        this.f24710a = false;
    }

    public final Object b(long j) {
        Object obj;
        int b2 = AbstractC2121a.b(this.f24711b, this.f24713d, j);
        if (b2 < 0 || (obj = this.f24712c[b2]) == AbstractC2065s.f24714a) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.f24710a) {
            int i7 = this.f24713d;
            long[] jArr = this.f24711b;
            Object[] objArr = this.f24712c;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC2065s.f24714a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f24710a = false;
            this.f24713d = i10;
        }
        return AbstractC2121a.b(this.f24711b, this.f24713d, j);
    }

    public final Object clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.l.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        r rVar = (r) clone;
        rVar.f24711b = (long[]) this.f24711b.clone();
        rVar.f24712c = (Object[]) this.f24712c.clone();
        return rVar;
    }

    public final long d(int i7) {
        if (!(i7 >= 0 && i7 < this.f24713d)) {
            AbstractC2121a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f24710a) {
            int i10 = this.f24713d;
            long[] jArr = this.f24711b;
            Object[] objArr = this.f24712c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC2065s.f24714a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24710a = false;
            this.f24713d = i11;
        }
        return this.f24711b[i7];
    }

    public final void e(Object obj, long j) {
        int b2 = AbstractC2121a.b(this.f24711b, this.f24713d, j);
        if (b2 >= 0) {
            this.f24712c[b2] = obj;
            return;
        }
        int i7 = ~b2;
        int i10 = this.f24713d;
        Object obj2 = AbstractC2065s.f24714a;
        if (i7 < i10) {
            Object[] objArr = this.f24712c;
            if (objArr[i7] == obj2) {
                this.f24711b[i7] = j;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f24710a) {
            long[] jArr = this.f24711b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f24712c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f24710a = false;
                this.f24713d = i11;
                i7 = ~AbstractC2121a.b(this.f24711b, i11, j);
            }
        }
        int i13 = this.f24713d;
        if (i13 >= this.f24711b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f24711b, i17);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            this.f24711b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f24712c, i17);
            kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
            this.f24712c = copyOf2;
        }
        int i18 = this.f24713d;
        if (i18 - i7 != 0) {
            long[] jArr2 = this.f24711b;
            int i19 = i7 + 1;
            Eb.n.O(jArr2, jArr2, i19, i7, i18);
            Object[] objArr3 = this.f24712c;
            Eb.n.P(objArr3, i19, objArr3, i7, this.f24713d);
        }
        this.f24711b[i7] = j;
        this.f24712c[i7] = obj;
        this.f24713d++;
    }

    public final void f(long j) {
        int b2 = AbstractC2121a.b(this.f24711b, this.f24713d, j);
        if (b2 >= 0) {
            Object[] objArr = this.f24712c;
            Object obj = objArr[b2];
            Object obj2 = AbstractC2065s.f24714a;
            if (obj != obj2) {
                objArr[b2] = obj2;
                this.f24710a = true;
            }
        }
    }

    public final int g() {
        if (this.f24710a) {
            int i7 = this.f24713d;
            long[] jArr = this.f24711b;
            Object[] objArr = this.f24712c;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC2065s.f24714a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f24710a = false;
            this.f24713d = i10;
        }
        return this.f24713d;
    }

    public final Object h(int i7) {
        if (!(i7 >= 0 && i7 < this.f24713d)) {
            AbstractC2121a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f24710a) {
            int i10 = this.f24713d;
            long[] jArr = this.f24711b;
            Object[] objArr = this.f24712c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC2065s.f24714a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24710a = false;
            this.f24713d = i11;
        }
        return this.f24712c[i7];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24713d * 28);
        sb2.append('{');
        int i7 = this.f24713d;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object h10 = h(i10);
            if (h10 != sb2) {
                sb2.append(h10);
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
