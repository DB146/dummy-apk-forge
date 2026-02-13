package m4;

import android.util.SparseBooleanArray;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class t0 implements InterfaceC1569g {

    /* renamed from: a, reason: collision with root package name */
    public final n5.f f20505a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC1705a.m(!false);
        new n5.f(sparseBooleanArray);
        int i7 = n5.D.f21141a;
        Integer.toString(0, 36);
    }

    public t0(n5.f fVar) {
        this.f20505a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return this.f20505a.equals(((t0) obj).f20505a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20505a.hashCode();
    }
}
