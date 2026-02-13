package gc;

import fc.P;
import fc.Z;

/* loaded from: classes2.dex */
public final class F extends P implements Z {
    @Override // fc.Z
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f17093v;
            kotlin.jvm.internal.l.b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f17094w + ((int) ((n() + this.f17096y) - this.f17094w))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i7) {
        synchronized (this) {
            Object[] objArr = this.f17093v;
            kotlin.jvm.internal.l.b(objArr);
            p(Integer.valueOf(((Number) objArr[((int) ((this.f17094w + ((int) ((n() + this.f17096y) - this.f17094w))) - 1)) & (objArr.length - 1)]).intValue() + i7));
        }
    }
}
