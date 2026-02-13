package N6;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class G extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f7228c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f7230e;

    public G(H h10, int i7, int i10) {
        this.f7230e = h10;
        this.f7228c = i7;
        this.f7229d = i10;
    }

    @Override // N6.H, java.util.List
    /* renamed from: N */
    public final H subList(int i7, int i10) {
        Q5.e.o(i7, i10, this.f7229d);
        int i11 = this.f7228c;
        return this.f7230e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Q5.e.l(i7, this.f7229d);
        return this.f7230e.get(i7 + this.f7228c);
    }

    @Override // N6.H, N6.C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // N6.H, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // N6.H, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }

    @Override // N6.C
    public final Object[] o() {
        return this.f7230e.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7229d;
    }

    @Override // N6.C
    public final int t() {
        return this.f7230e.y() + this.f7228c + this.f7229d;
    }

    @Override // N6.C
    public final int y() {
        return this.f7230e.y() + this.f7228c;
    }

    @Override // N6.C
    public final boolean z() {
        return true;
    }
}
