package U;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9389c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9390d;

    public d(Object obj, int i7) {
        super(i7, 1);
        this.f9390d = obj;
    }

    public d(Object[] objArr, int i7, int i10) {
        super(i7, i10);
        this.f9390d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9389c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f9385a;
                this.f9385a = i7 + 1;
                return ((Object[]) this.f9390d)[i7];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f9385a++;
                return this.f9390d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9389c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f9385a - 1;
                this.f9385a = i7;
                return ((Object[]) this.f9390d)[i7];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f9385a--;
                return this.f9390d;
        }
    }
}
