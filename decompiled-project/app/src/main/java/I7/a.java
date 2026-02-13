package I7;

import java.util.AbstractMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f5233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f5235c;

    public a(b bVar, int i7, boolean z8) {
        this.f5235c = bVar;
        this.f5234b = z8;
        this.f5233a = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5234b) {
            if (this.f5233a < 0) {
                return false;
            }
        } else if (this.f5233a >= this.f5235c.f5236a.length) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b bVar = this.f5235c;
        Object[] objArr = bVar.f5236a;
        int i7 = this.f5233a;
        Object obj = objArr[i7];
        Object obj2 = bVar.f5237b[i7];
        this.f5233a = this.f5234b ? i7 - 1 : i7 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
