package D4;

import n5.AbstractC1705a;
import n5.v;
import s4.C1979g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f3224a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3225b;

    public e(int i7, long j) {
        AbstractC1705a.h(j >= 0);
        this.f3224a = i7;
        this.f3225b = j;
    }

    public /* synthetic */ e(int i7, long j, boolean z8) {
        this.f3224a = i7;
        this.f3225b = j;
    }

    public static e b(C1979g c1979g, v vVar) {
        c1979g.x(vVar.f21229a, 0, 8, false);
        vVar.G(0);
        return new e(vVar.h(), vVar.m(), false);
    }

    public boolean a() {
        int i7 = this.f3224a;
        return i7 == 0 || i7 == 1;
    }
}
