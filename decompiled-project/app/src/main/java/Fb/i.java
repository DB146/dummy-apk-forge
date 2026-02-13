package Fb;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class i extends Eb.i implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f4215b;

    /* renamed from: a, reason: collision with root package name */
    public final f f4216a;

    static {
        f fVar = f.f4197B;
        f4215b = new i(f.f4197B);
    }

    public i() {
        this(new f());
    }

    public i(f backing) {
        l.e(backing, "backing");
        this.f4216a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f4216a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        l.e(elements, "elements");
        this.f4216a.c();
        return super.addAll(elements);
    }

    @Override // Eb.i
    public final int b() {
        return this.f4216a.f4207w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4216a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4216a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4216a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f4216a;
        fVar.getClass();
        return new c(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f4216a;
        fVar.c();
        int h10 = fVar.h(obj);
        if (h10 < 0) {
            return false;
        }
        fVar.m(h10);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        l.e(elements, "elements");
        this.f4216a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        l.e(elements, "elements");
        this.f4216a.c();
        return super.retainAll(elements);
    }
}
