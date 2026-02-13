package a5;

import N6.F;
import N6.H;
import N6.t0;
import java.util.List;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f12749a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f12750b;

    public /* synthetic */ e(long j, t0 t0Var) {
        this.f12749a = j;
        this.f12750b = t0Var;
    }

    @Override // a5.g
    public int b(long j) {
        return this.f12749a > j ? 0 : -1;
    }

    @Override // a5.g
    public long d(int i7) {
        AbstractC1705a.h(i7 == 0);
        return this.f12749a;
    }

    @Override // a5.g
    public List j(long j) {
        if (j >= this.f12749a) {
            return this.f12750b;
        }
        F f4 = H.f7232b;
        return t0.f7341e;
    }

    @Override // a5.g
    public int o() {
        return 1;
    }
}
