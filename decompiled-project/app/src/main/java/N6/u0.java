package N6;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u0 extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f7347c;

    public u0(v0 v0Var) {
        this.f7347c = v0Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        v0 v0Var = this.f7347c;
        Q5.e.l(i7, v0Var.f7360f);
        int i10 = i7 * 2;
        Object[] objArr = v0Var.f7359e;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7347c.f7360f;
    }

    @Override // N6.C
    public final boolean z() {
        return true;
    }
}
