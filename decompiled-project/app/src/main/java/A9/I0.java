package A9;

import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class I0 extends H2.B {

    /* renamed from: q, reason: collision with root package name */
    public boolean f837q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N0 f838r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(N0 n02) {
        super(n02.f909r.getContext());
        this.f838r = n02;
    }

    @Override // H2.B
    public final float d(DisplayMetrics displayMetrics) {
        return super.d(displayMetrics) * this.f838r.f907p;
    }

    @Override // H2.B
    public final int f(int i7) {
        int f4 = super.f(i7);
        int i10 = ((v3) this.f838r.f898Z.f23859d).f1447i;
        if (i10 <= 0) {
            return f4;
        }
        float f10 = (30.0f / i10) * i7;
        return ((float) f4) < f10 ? (int) f10 : f4;
    }

    @Override // H2.B
    public final void j() {
        super.j();
        if (!this.f837q) {
            m();
        }
        N0 n02 = this.f838r;
        if (n02.f881H == this) {
            n02.f881H = null;
        }
        if (n02.f882I == this) {
            n02.f882I = null;
        }
    }

    @Override // H2.B
    public final void k(View view, H2.c0 c0Var) {
        int i7;
        int i10;
        int[] iArr = N0.f873j0;
        N0 n02 = this.f838r;
        if (n02.f1(view, null, iArr)) {
            if (n02.f910s == 0) {
                i7 = iArr[0];
                i10 = iArr[1];
            } else {
                i7 = iArr[1];
                i10 = iArr[0];
            }
            c0Var.b(i7, i10, e((int) Math.sqrt((i10 * i10) + (i7 * i7))), this.j);
        }
    }

    public void m() {
        View h10 = h(this.f4572a);
        N0 n02 = this.f838r;
        if (h10 == null) {
            int i7 = this.f4572a;
            if (i7 >= 0) {
                n02.z1(false, i7, 0);
                return;
            }
            return;
        }
        int i10 = n02.f879F;
        int i11 = this.f4572a;
        if (i10 != i11) {
            n02.f879F = i11;
        }
        if (n02.S()) {
            n02.f875B |= 32;
            h10.requestFocus();
            n02.f875B &= -33;
        }
        n02.X0();
        n02.Y0();
    }
}
