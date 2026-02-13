package I7;

import L7.C0385e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5250a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f5251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f5252c;

    public l(m mVar) {
        this.f5252c = mVar;
        this.f5251b = mVar.f5254b - 1;
    }

    public l(C0385e c0385e) {
        this.f5252c = c0385e;
        this.f5251b = c0385e.f6339b;
    }

    private final void a() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5250a) {
            case 0:
                return this.f5251b >= 0;
            default:
                return this.f5251b < ((C0385e) this.f5252c).f6340c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5250a) {
            case 0:
                int i7 = this.f5251b;
                Object obj = new Object();
                Math.pow(2.0d, i7);
                this.f5251b--;
                return obj;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements.");
                }
                T7.c[] cVarArr = ((C0385e) this.f5252c).f6338a;
                int i10 = this.f5251b;
                T7.c cVar = cVarArr[i10];
                this.f5251b = i10 + 1;
                return cVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5250a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }
}
