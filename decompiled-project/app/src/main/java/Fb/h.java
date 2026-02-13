package Fb;

import V.m;
import V.n;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class h extends AbstractCollection implements Collection, Sb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4213a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4214b;

    public /* synthetic */ h(Object obj, int i7) {
        this.f4213a = i7;
        this.f4214b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4213a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f4213a) {
            case 0:
                l.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4213a) {
            case 0:
                ((f) this.f4214b).clear();
                return;
            default:
                ((Y.i) this.f4214b).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4213a) {
            case 0:
                return ((f) this.f4214b).containsValue(obj);
            default:
                return ((Y.i) this.f4214b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4213a) {
            case 0:
                return ((f) this.f4214b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4213a) {
            case 0:
                f fVar = (f) this.f4214b;
                fVar.getClass();
                return new c(fVar, 2);
            default:
                m[] mVarArr = new m[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    mVarArr[i7] = new n(2);
                }
                return new V.e((Y.i) this.f4214b, mVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4213a) {
            case 0:
                f fVar = (f) this.f4214b;
                fVar.c();
                int j = fVar.j(obj);
                if (j < 0) {
                    return false;
                }
                fVar.m(j);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f4213a) {
            case 0:
                l.e(elements, "elements");
                ((f) this.f4214b).c();
                return super.removeAll(elements);
            default:
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f4213a) {
            case 0:
                l.e(elements, "elements");
                ((f) this.f4214b).c();
                return super.retainAll(elements);
            default:
                return super.retainAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4213a) {
            case 0:
                return ((f) this.f4214b).f4207w;
            default:
                Y.i iVar = (Y.i) this.f4214b;
                iVar.getClass();
                return iVar.f11051e;
        }
    }
}
