package V;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class m implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f9962a = l.f9957e.f9961d;

    /* renamed from: b, reason: collision with root package name */
    public int f9963b;

    /* renamed from: c, reason: collision with root package name */
    public int f9964c;

    public final void a(Object[] objArr, int i7, int i10) {
        this.f9962a = objArr;
        this.f9963b = i7;
        this.f9964c = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9964c < this.f9963b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
