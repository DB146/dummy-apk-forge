package A9;

import android.graphics.PointF;
import android.view.View;

/* loaded from: classes2.dex */
public final class K0 extends I0 {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f856s;

    /* renamed from: t, reason: collision with root package name */
    public int f857t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N0 f858u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(N0 n02, int i7, boolean z8) {
        super(n02);
        this.f858u = n02;
        this.f857t = i7;
        this.f856s = z8;
        this.f4572a = -2;
    }

    @Override // H2.B
    public final PointF g(int i7) {
        int i10 = this.f857t;
        if (i10 == 0) {
            return null;
        }
        N0 n02 = this.f858u;
        int i11 = ((n02.f875B & 262144) == 0 ? i10 >= 0 : i10 <= 0) ? 1 : -1;
        return n02.f910s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // A9.I0
    public final void m() {
        super.m();
        this.f857t = 0;
        View h10 = h(this.f4572a);
        if (h10 != null) {
            this.f858u.A1(h10, true);
        }
    }
}
