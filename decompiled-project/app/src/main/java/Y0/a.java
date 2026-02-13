package Y0;

import A0.C0031u;
import Z9.x;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0807j;
import ea.C1108c;
import java.util.List;
import q1.C1876b;
import y0.AbstractC2328M;
import y1.p0;

/* loaded from: classes.dex */
public final class a extends AbstractC0807j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f11067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i7) {
        super(1);
        this.f11066c = i7;
        this.f11067d = viewGroup;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final p0 f(p0 p0Var, List list) {
        switch (this.f11066c) {
            case 0:
                return ((q) this.f11067d).n(p0Var);
            default:
                Z0.i iVar = (Z0.i) this.f11067d;
                if (iVar.f12120z) {
                    return p0Var;
                }
                View childAt = iVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, iVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, iVar.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? p0Var : p0Var.f26731a.n(max, max2, max3, max4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final C1108c g(C1108c c1108c) {
        switch (this.f11066c) {
            case 0:
                C0031u c0031u = (C0031u) ((q) this.f11067d).f11104M.f60S.f226c;
                if (!c0031u.f310Y.f14112B) {
                    return c1108c;
                }
                long O10 = x.O(c0031u.A(0L));
                int i7 = (int) (O10 >> 32);
                if (i7 < 0) {
                    i7 = 0;
                }
                int i10 = (int) (O10 & 4294967295L);
                if (i10 < 0) {
                    i10 = 0;
                }
                long z8 = AbstractC2328M.g(c0031u).z();
                int i11 = (int) (z8 >> 32);
                int i12 = (int) (z8 & 4294967295L);
                long j = c0031u.f26556c;
                long O11 = x.O(c0031u.A((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i13 = i11 - ((int) (O11 >> 32));
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = i12 - ((int) (4294967295L & O11));
                int i15 = i14 >= 0 ? i14 : 0;
                return (i7 == 0 && i10 == 0 && i13 == 0 && i15 == 0) ? c1108c : new C1108c(19, j.m((C1876b) c1108c.f16831c, i7, i10, i13, i15), j.m((C1876b) c1108c.f16830b, i7, i10, i13, i15));
            default:
                Z0.i iVar = (Z0.i) this.f11067d;
                if (iVar.f12120z) {
                    return c1108c;
                }
                View childAt = iVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, iVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, iVar.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return c1108c;
                }
                C1876b b2 = C1876b.b(max, max2, max3, max4);
                C1876b c1876b = (C1876b) c1108c.f16831c;
                int i16 = b2.f23341a;
                int i17 = b2.f23342b;
                int i18 = b2.f23343c;
                int i19 = b2.f23344d;
                return new C1108c(19, p0.e(c1876b, i16, i17, i18, i19), p0.e((C1876b) c1108c.f16830b, i16, i17, i18, i19));
        }
    }
}
