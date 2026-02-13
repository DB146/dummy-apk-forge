package S;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class d implements ListIterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8957a;

    /* renamed from: b, reason: collision with root package name */
    public int f8958b;

    public d(int i7, List list) {
        this.f8957a = list;
        this.f8958b = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f8957a.add(this.f8958b, obj);
        this.f8958b++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8958b < this.f8957a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8958b > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i7 = this.f8958b;
        this.f8958b = i7 + 1;
        return this.f8957a.get(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8958b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i7 = this.f8958b - 1;
        this.f8958b = i7;
        return this.f8957a.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8958b - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7 = this.f8958b - 1;
        this.f8958b = i7;
        this.f8957a.remove(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f8957a.set(this.f8958b, obj);
    }
}
