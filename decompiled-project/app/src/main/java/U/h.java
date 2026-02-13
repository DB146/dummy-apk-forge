package U;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public final f f9405c;

    /* renamed from: d, reason: collision with root package name */
    public int f9406d;

    /* renamed from: e, reason: collision with root package name */
    public j f9407e;

    /* renamed from: f, reason: collision with root package name */
    public int f9408f;

    public h(f fVar, int i7) {
        super(i7, fVar.f9402v);
        this.f9405c = fVar;
        this.f9406d = fVar.z();
        this.f9408f = -1;
        b();
    }

    public final void a() {
        if (this.f9406d != this.f9405c.z()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // U.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i7 = this.f9385a;
        f fVar = this.f9405c;
        fVar.add(i7, obj);
        this.f9385a++;
        this.f9386b = fVar.b();
        this.f9406d = fVar.z();
        this.f9408f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f9405c;
        Object[] objArr = fVar.f9400f;
        if (objArr == null) {
            this.f9407e = null;
            return;
        }
        int i7 = (fVar.f9402v - 1) & (-32);
        int i10 = this.f9385a;
        if (i10 > i7) {
            i10 = i7;
        }
        int i11 = (fVar.f9398d / 5) + 1;
        j jVar = this.f9407e;
        if (jVar == null) {
            this.f9407e = new j(objArr, i10, i7, i11);
            return;
        }
        jVar.f9385a = i10;
        jVar.f9386b = i7;
        jVar.f9411c = i11;
        if (jVar.f9412d.length < i11) {
            jVar.f9412d = new Object[i11];
        }
        jVar.f9412d[0] = objArr;
        ?? r62 = i10 == i7 ? 1 : 0;
        jVar.f9413e = r62;
        jVar.b(i10 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f9385a;
        this.f9408f = i7;
        j jVar = this.f9407e;
        f fVar = this.f9405c;
        if (jVar == null) {
            Object[] objArr = fVar.f9401u;
            this.f9385a = i7 + 1;
            return objArr[i7];
        }
        if (jVar.hasNext()) {
            this.f9385a++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f9401u;
        int i10 = this.f9385a;
        this.f9385a = i10 + 1;
        return objArr2[i10 - jVar.f9386b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f9385a;
        this.f9408f = i7 - 1;
        j jVar = this.f9407e;
        f fVar = this.f9405c;
        if (jVar == null) {
            Object[] objArr = fVar.f9401u;
            int i10 = i7 - 1;
            this.f9385a = i10;
            return objArr[i10];
        }
        int i11 = jVar.f9386b;
        if (i7 <= i11) {
            this.f9385a = i7 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f9401u;
        int i12 = i7 - 1;
        this.f9385a = i12;
        return objArr2[i12 - i11];
    }

    @Override // U.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i7 = this.f9408f;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f9405c;
        fVar.o(i7);
        int i10 = this.f9408f;
        if (i10 < this.f9385a) {
            this.f9385a = i10;
        }
        this.f9386b = fVar.b();
        this.f9406d = fVar.z();
        this.f9408f = -1;
        b();
    }

    @Override // U.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i7 = this.f9408f;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f9405c;
        fVar.set(i7, obj);
        this.f9406d = fVar.z();
        b();
    }
}
