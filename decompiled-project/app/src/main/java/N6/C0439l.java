package N6;

import java.util.List;
import java.util.ListIterator;

/* renamed from: N6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439l extends C0426d implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0440m f7305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439l(C0440m c0440m) {
        super(c0440m);
        this.f7305e = c0440m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439l(C0440m c0440m, int i7) {
        super(c0440m, ((List) c0440m.f7317b).listIterator(i7));
        this.f7305e = c0440m;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0440m c0440m = this.f7305e;
        boolean isEmpty = c0440m.isEmpty();
        b().add(obj);
        c0440m.f7321f.f7330e++;
        if (isEmpty) {
            c0440m.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f7283b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }
}
