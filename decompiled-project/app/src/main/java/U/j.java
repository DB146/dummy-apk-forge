package U;

import h3.H;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: c, reason: collision with root package name */
    public int f9411c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9412d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9413e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i7, int i10, int i11) {
        super(i7, i10);
        this.f9411c = i11;
        Object[] objArr2 = new Object[i11];
        this.f9412d = objArr2;
        ?? r52 = i7 == i10 ? 1 : 0;
        this.f9413e = r52;
        objArr2[0] = objArr;
        b(i7 - r52, 1);
    }

    public final Object a() {
        int i7 = this.f9385a & 31;
        Object obj = this.f9412d[this.f9411c - 1];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i7];
    }

    public final void b(int i7, int i10) {
        int i11 = (this.f9411c - i10) * 5;
        while (i10 < this.f9411c) {
            Object[] objArr = this.f9412d;
            Object obj = objArr[i10 - 1];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i10] = ((Object[]) obj)[H.y(i7, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void c(int i7) {
        int i10 = 0;
        while (H.y(this.f9385a, i10) == i7) {
            i10 += 5;
        }
        if (i10 > 0) {
            b(this.f9385a, ((this.f9411c - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a9 = a();
        int i7 = this.f9385a + 1;
        this.f9385a = i7;
        if (i7 == this.f9386b) {
            this.f9413e = true;
            return a9;
        }
        c(0);
        return a9;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f9385a--;
        if (this.f9413e) {
            this.f9413e = false;
            return a();
        }
        c(31);
        return a();
    }
}
