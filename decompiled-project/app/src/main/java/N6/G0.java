package N6;

/* loaded from: classes.dex */
public final class G0 extends L {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f7231d;

    public G0(Object obj) {
        obj.getClass();
        this.f7231d = obj;
    }

    @Override // N6.C
    /* renamed from: C */
    public final H0 iterator() {
        return new N(this.f7231d);
    }

    @Override // N6.L, N6.C
    public final H b() {
        return H.K(this.f7231d);
    }

    @Override // N6.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7231d.equals(obj);
    }

    @Override // N6.L, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7231d.hashCode();
    }

    @Override // N6.C
    public final int i(int i7, Object[] objArr) {
        objArr[i7] = this.f7231d;
        return i7 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f7231d.toString() + ']';
    }

    @Override // N6.C
    public final boolean z() {
        return false;
    }
}
