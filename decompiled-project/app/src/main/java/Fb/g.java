package Fb;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class g extends Eb.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4211a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4212b;

    public /* synthetic */ g(f fVar, int i7) {
        this.f4211a = i7;
        this.f4212b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f4211a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                l.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f4211a) {
            case 0:
                l.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                l.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // Eb.i
    public final int b() {
        switch (this.f4211a) {
            case 0:
                return this.f4212b.f4207w;
            default:
                return this.f4212b.f4207w;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4211a) {
            case 0:
                this.f4212b.clear();
                return;
            default:
                this.f4212b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4211a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                l.e(element, "element");
                return this.f4212b.f(element);
            default:
                return this.f4212b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f4211a) {
            case 0:
                l.e(elements, "elements");
                return this.f4212b.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f4211a) {
            case 0:
                return this.f4212b.isEmpty();
            default:
                return this.f4212b.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4211a) {
            case 0:
                f fVar = this.f4212b;
                fVar.getClass();
                return new c(fVar, 0);
            default:
                f fVar2 = this.f4212b;
                fVar2.getClass();
                return new c(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4211a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                l.e(element, "element");
                f fVar = this.f4212b;
                fVar.getClass();
                fVar.c();
                int h10 = fVar.h(element.getKey());
                if (h10 < 0) {
                    return false;
                }
                Object[] objArr = fVar.f4200b;
                l.b(objArr);
                if (!l.a(objArr[h10], element.getValue())) {
                    return false;
                }
                fVar.m(h10);
                return true;
            default:
                f fVar2 = this.f4212b;
                fVar2.c();
                int h11 = fVar2.h(obj);
                if (h11 < 0) {
                    return false;
                }
                fVar2.m(h11);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f4211a) {
            case 0:
                l.e(elements, "elements");
                this.f4212b.c();
                return super.removeAll(elements);
            default:
                l.e(elements, "elements");
                this.f4212b.c();
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f4211a) {
            case 0:
                l.e(elements, "elements");
                this.f4212b.c();
                return super.retainAll(elements);
            default:
                l.e(elements, "elements");
                this.f4212b.c();
                return super.retainAll(elements);
        }
    }
}
