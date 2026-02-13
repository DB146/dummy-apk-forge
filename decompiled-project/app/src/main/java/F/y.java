package F;

import Q.C0487e0;
import Q.R0;

/* loaded from: classes.dex */
public final class y implements R0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0487e0 f4023a;

    /* renamed from: b, reason: collision with root package name */
    public int f4024b;

    public y(int i7) {
        int i10 = (i7 / 30) * 30;
        this.f4023a = new C0487e0(h3.H.I(Math.max(i10 - 100, 0), i10 + 130), Q.S.f8368f);
        this.f4024b = i7;
    }

    @Override // Q.R0
    public final Object getValue() {
        return (Xb.g) this.f4023a.getValue();
    }
}
