package U;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f9403c;

    /* renamed from: d, reason: collision with root package name */
    public final j f9404d;

    public g(Object[] objArr, int i7, Object[] objArr2, int i10, int i11) {
        super(i7, i10);
        this.f9403c = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f9404d = new j(objArr, i7 > i12 ? i12 : i7, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f9404d;
        if (jVar.hasNext()) {
            this.f9385a++;
            return jVar.next();
        }
        int i7 = this.f9385a;
        this.f9385a = i7 + 1;
        return this.f9403c[i7 - jVar.f9386b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f9385a;
        j jVar = this.f9404d;
        int i10 = jVar.f9386b;
        if (i7 <= i10) {
            this.f9385a = i7 - 1;
            return jVar.previous();
        }
        int i11 = i7 - 1;
        this.f9385a = i11;
        return this.f9403c[i11 - i10];
    }
}
