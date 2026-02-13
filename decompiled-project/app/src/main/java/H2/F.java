package H2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class F extends B {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4589q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4590r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(Object obj, Context context, int i7) {
        super(context);
        this.f4589q = i7;
        this.f4590r = obj;
    }

    @Override // H2.B
    public int b(View view, int i7) {
        switch (this.f4589q) {
            case 1:
                ((CarouselLayoutManager) this.f4590r).getClass();
                return 0;
            default:
                return super.b(view, i7);
        }
    }

    @Override // H2.B
    public int c(View view, int i7) {
        switch (this.f4589q) {
            case 1:
                ((CarouselLayoutManager) this.f4590r).getClass();
                return 0;
            default:
                return super.c(view, i7);
        }
    }

    @Override // H2.B
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f4589q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // H2.B
    public int f(int i7) {
        switch (this.f4589q) {
            case 0:
                return Math.min(100, super.f(i7));
            default:
                return super.f(i7);
        }
    }

    @Override // H2.B
    public PointF g(int i7) {
        switch (this.f4589q) {
            case 1:
                ((CarouselLayoutManager) this.f4590r).getClass();
                return null;
            default:
                return super.g(i7);
        }
    }

    @Override // H2.B
    public void k(View view, c0 c0Var) {
        switch (this.f4589q) {
            case 0:
                G g = (G) this.f4590r;
                int[] a9 = g.a(g.f4591a.getLayoutManager(), view);
                int i7 = a9[0];
                int i10 = a9[1];
                int e2 = e(Math.max(Math.abs(i7), Math.abs(i10)));
                if (e2 > 0) {
                    c0Var.b(i7, i10, e2, this.j);
                    return;
                }
                return;
            default:
                super.k(view, c0Var);
                return;
        }
    }
}
