package A9;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public final class H0 extends I0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N0 f834s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(N0 n02) {
        super(n02);
        this.f834s = n02;
    }

    @Override // H2.B
    public final PointF g(int i7) {
        if (this.f4573b.f13614B.y() == 0) {
            return null;
        }
        N0 n02 = this.f834s;
        int O10 = androidx.recyclerview.widget.a.O(n02.x(0));
        int i10 = ((n02.f875B & 262144) == 0 ? i7 >= O10 : i7 <= O10) ? 1 : -1;
        return n02.f910s == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }
}
