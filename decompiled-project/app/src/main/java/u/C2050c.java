package u;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2050c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f24662a;

    /* renamed from: b, reason: collision with root package name */
    public int f24663b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2052e f24665d;

    public C2050c(C2052e c2052e) {
        this.f24665d = c2052e;
        this.f24662a = c2052e.f24637c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f24664c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f24663b;
        C2052e c2052e = this.f24665d;
        return kotlin.jvm.internal.l.a(key, c2052e.f(i7)) && kotlin.jvm.internal.l.a(entry.getValue(), c2052e.k(this.f24663b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f24664c) {
            return this.f24665d.f(this.f24663b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f24664c) {
            return this.f24665d.k(this.f24663b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24663b < this.f24662a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f24664c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f24663b;
        C2052e c2052e = this.f24665d;
        Object f4 = c2052e.f(i7);
        Object k = c2052e.k(this.f24663b);
        return (f4 == null ? 0 : f4.hashCode()) ^ (k != null ? k.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24663b++;
        this.f24664c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24664c) {
            throw new IllegalStateException();
        }
        this.f24665d.h(this.f24663b);
        this.f24663b--;
        this.f24662a--;
        this.f24664c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f24664c) {
            return this.f24665d.j(this.f24663b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
