package N6;

/* loaded from: classes.dex */
public final class z0 extends L {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f7378w;

    /* renamed from: x, reason: collision with root package name */
    public static final z0 f7379x;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f7380d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f7381e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f7382f;

    /* renamed from: u, reason: collision with root package name */
    public final transient int f7383u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f7384v;

    static {
        Object[] objArr = new Object[0];
        f7378w = objArr;
        f7379x = new z0(objArr, 0, objArr, 0, 0);
    }

    public z0(Object[] objArr, int i7, Object[] objArr2, int i10, int i11) {
        this.f7380d = objArr;
        this.f7381e = i7;
        this.f7382f = objArr2;
        this.f7383u = i10;
        this.f7384v = i11;
    }

    @Override // N6.C
    /* renamed from: C */
    public final H0 iterator() {
        return b().listIterator(0);
    }

    @Override // N6.L
    public final H G() {
        return H.D(this.f7384v, this.f7380d);
    }

    @Override // N6.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f7382f;
            if (objArr.length != 0) {
                int t5 = r.t(obj);
                while (true) {
                    int i7 = t5 & this.f7383u;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    t5 = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // N6.L, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7381e;
    }

    @Override // N6.C
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.f7380d;
        int i10 = this.f7384v;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override // N6.C
    public final Object[] o() {
        return this.f7380d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7384v;
    }

    @Override // N6.C
    public final int t() {
        return this.f7384v;
    }

    @Override // N6.C
    public final int y() {
        return 0;
    }

    @Override // N6.C
    public final boolean z() {
        return false;
    }
}
