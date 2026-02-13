package I8;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public m f5280a;

    /* renamed from: b, reason: collision with root package name */
    public m f5281b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f5282c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f5283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5284e;

    public k(n nVar, int i7) {
        this.f5284e = i7;
        this.f5283d = nVar;
        this.f5280a = nVar.f5302f.f5290d;
        this.f5282c = nVar.f5301e;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.f5280a;
        n nVar = this.f5283d;
        if (mVar == nVar.f5302f) {
            throw new NoSuchElementException();
        }
        if (nVar.f5301e != this.f5282c) {
            throw new ConcurrentModificationException();
        }
        this.f5280a = mVar.f5290d;
        this.f5281b = mVar;
        return mVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5280a != this.f5283d.f5302f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f5284e) {
            case 1:
                return b().f5292f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        m mVar = this.f5281b;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        n nVar = this.f5283d;
        nVar.c(mVar, true);
        this.f5281b = null;
        this.f5282c = nVar.f5301e;
    }
}
