package N6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class t0 extends H {

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f7341e = new t0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f7342c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7343d;

    public t0(Object[] objArr, int i7) {
        this.f7342c = objArr;
        this.f7343d = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Q5.e.l(i7, this.f7343d);
        Object obj = this.f7342c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // N6.H, N6.C
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.f7342c;
        int i10 = this.f7343d;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override // N6.C
    public final Object[] o() {
        return this.f7342c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7343d;
    }

    @Override // N6.C
    public final int t() {
        return this.f7343d;
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
