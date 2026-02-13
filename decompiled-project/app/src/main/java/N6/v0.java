package N6;

import java.util.Map;

/* loaded from: classes.dex */
public final class v0 extends L {

    /* renamed from: d, reason: collision with root package name */
    public final transient y0 f7358d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f7359e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f7360f;

    public v0(y0 y0Var, Object[] objArr, int i7) {
        this.f7358d = y0Var;
        this.f7359e = objArr;
        this.f7360f = i7;
    }

    @Override // N6.C
    /* renamed from: C */
    public final H0 iterator() {
        return b().listIterator(0);
    }

    @Override // N6.L
    public final H G() {
        return new u0(this);
    }

    @Override // N6.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f7358d.get(key));
    }

    @Override // N6.C
    public final int i(int i7, Object[] objArr) {
        return b().i(i7, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7360f;
    }

    @Override // N6.C
    public final boolean z() {
        return true;
    }
}
