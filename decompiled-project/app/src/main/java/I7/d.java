package I7;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f5239a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5240b;

    public d(i iVar, Comparator comparator, boolean z8) {
        this.f5240b = z8;
        while (!iVar.isEmpty()) {
            this.f5239a.push((k) iVar);
            iVar = z8 ? iVar.m() : iVar.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5239a.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f5239a;
        try {
            k kVar = (k) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(kVar.f5246a, kVar.f5247b);
            if (this.f5240b) {
                for (i iVar = kVar.f5248c; !iVar.isEmpty(); iVar = iVar.m()) {
                    arrayDeque.push((k) iVar);
                }
            } else {
                for (i iVar2 = kVar.f5249d; !iVar2.isEmpty(); iVar2 = iVar2.e()) {
                    arrayDeque.push((k) iVar2);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
