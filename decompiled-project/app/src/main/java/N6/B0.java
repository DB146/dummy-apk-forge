package N6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class B0 extends s0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f7213a;

    public B0(s0 s0Var) {
        this.f7213a = s0Var;
    }

    @Override // N6.s0
    public final s0 a() {
        return this.f7213a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f7213a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B0) {
            return this.f7213a.equals(((B0) obj).f7213a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f7213a.hashCode();
    }

    public final String toString() {
        return this.f7213a + ".reverse()";
    }
}
