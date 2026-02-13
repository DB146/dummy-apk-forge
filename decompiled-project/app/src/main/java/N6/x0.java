package N6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x0 extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f7364c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7365d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f7366e;

    public x0(Object[] objArr, int i7, int i10) {
        this.f7364c = objArr;
        this.f7365d = i7;
        this.f7366e = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Q5.e.l(i7, this.f7366e);
        Object obj = this.f7364c[(i7 * 2) + this.f7365d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7366e;
    }

    @Override // N6.C
    public final boolean z() {
        return true;
    }
}
