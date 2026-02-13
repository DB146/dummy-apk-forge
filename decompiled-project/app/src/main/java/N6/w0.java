package N6;

/* loaded from: classes.dex */
public final class w0 extends L {

    /* renamed from: d, reason: collision with root package name */
    public final transient y0 f7362d;

    /* renamed from: e, reason: collision with root package name */
    public final transient x0 f7363e;

    public w0(y0 y0Var, x0 x0Var) {
        this.f7362d = y0Var;
        this.f7363e = x0Var;
    }

    @Override // N6.C
    /* renamed from: C */
    public final H0 iterator() {
        return this.f7363e.listIterator(0);
    }

    @Override // N6.L, N6.C
    public final H b() {
        return this.f7363e;
    }

    @Override // N6.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7362d.get(obj) != null;
    }

    @Override // N6.C
    public final int i(int i7, Object[] objArr) {
        return this.f7363e.i(i7, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7362d.f7374f;
    }

    @Override // N6.C
    public final boolean z() {
        return true;
    }
}
