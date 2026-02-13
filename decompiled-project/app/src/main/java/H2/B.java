package H2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    public int f4572a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f4573b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.a f4574c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4575d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4576e;

    /* renamed from: f, reason: collision with root package name */
    public View f4577f;
    public final c0 g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4578h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f4579i;
    public final DecelerateInterpolator j;
    public PointF k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f4580l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4581m;

    /* renamed from: n, reason: collision with root package name */
    public float f4582n;

    /* renamed from: o, reason: collision with root package name */
    public int f4583o;

    /* renamed from: p, reason: collision with root package name */
    public int f4584p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, H2.c0] */
    public B(Context context) {
        ?? obj = new Object();
        obj.f4653d = -1;
        obj.f4655f = false;
        obj.g = 0;
        obj.f4650a = 0;
        obj.f4651b = 0;
        obj.f4652c = Integer.MIN_VALUE;
        obj.f4654e = null;
        this.g = obj;
        this.f4579i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f4581m = false;
        this.f4583o = 0;
        this.f4584p = 0;
        this.f4580l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i7, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i7;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i7;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public int b(View view, int i7) {
        androidx.recyclerview.widget.a aVar = this.f4574c;
        if (aVar == null || !aVar.f()) {
            return 0;
        }
        T t5 = (T) view.getLayoutParams();
        return a(aVar.D(view) - ((ViewGroup.MarginLayoutParams) t5).leftMargin, aVar.G(view) + ((ViewGroup.MarginLayoutParams) t5).rightMargin, aVar.L(), aVar.f13717n - aVar.M(), i7);
    }

    public int c(View view, int i7) {
        androidx.recyclerview.widget.a aVar = this.f4574c;
        if (aVar == null || !aVar.g()) {
            return 0;
        }
        T t5 = (T) view.getLayoutParams();
        return a(aVar.H(view) - ((ViewGroup.MarginLayoutParams) t5).topMargin, aVar.B(view) + ((ViewGroup.MarginLayoutParams) t5).bottomMargin, aVar.N(), aVar.f13718o - aVar.K(), i7);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int e(int i7) {
        return (int) Math.ceil(f(i7) / 0.3356d);
    }

    public int f(int i7) {
        float abs = Math.abs(i7);
        if (!this.f4581m) {
            this.f4582n = d(this.f4580l);
            this.f4581m = true;
        }
        return (int) Math.ceil(abs * this.f4582n);
    }

    public PointF g(int i7) {
        Object obj = this.f4574c;
        if (obj instanceof d0) {
            return ((d0) obj).a(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + d0.class.getCanonicalName());
        return null;
    }

    public final View h(int i7) {
        return this.f4573b.f13614B.t(i7);
    }

    public final void i(int i7, int i10) {
        PointF g;
        RecyclerView recyclerView = this.f4573b;
        if (this.f4572a == -1 || recyclerView == null) {
            l();
        }
        if (this.f4575d && this.f4577f == null && this.f4574c != null && (g = g(this.f4572a)) != null) {
            float f4 = g.x;
            if (f4 != 0.0f || g.y != 0.0f) {
                recyclerView.g0((int) Math.signum(f4), (int) Math.signum(g.y), null);
            }
        }
        this.f4575d = false;
        View view = this.f4577f;
        c0 c0Var = this.g;
        if (view != null) {
            this.f4573b.getClass();
            i0 M3 = RecyclerView.M(view);
            if ((M3 != null ? M3.d() : -1) == this.f4572a) {
                View view2 = this.f4577f;
                e0 e0Var = recyclerView.f13676v0;
                k(view2, c0Var);
                c0Var.a(recyclerView);
                l();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f4577f = null;
            }
        }
        if (this.f4576e) {
            e0 e0Var2 = recyclerView.f13676v0;
            if (this.f4573b.f13614B.y() == 0) {
                l();
            } else {
                int i11 = this.f4583o;
                int i12 = i11 - i7;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                this.f4583o = i12;
                int i13 = this.f4584p;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                this.f4584p = i14;
                if (i12 == 0 && i14 == 0) {
                    PointF g2 = g(this.f4572a);
                    if (g2 != null) {
                        if (g2.x != 0.0f || g2.y != 0.0f) {
                            float f10 = g2.y;
                            float sqrt = (float) Math.sqrt((f10 * f10) + (r10 * r10));
                            float f11 = g2.x / sqrt;
                            g2.x = f11;
                            float f12 = g2.y / sqrt;
                            g2.y = f12;
                            this.k = g2;
                            this.f4583o = (int) (f11 * 10000.0f);
                            this.f4584p = (int) (f12 * 10000.0f);
                            c0Var.b((int) (this.f4583o * 1.2f), (int) (this.f4584p * 1.2f), (int) (f(10000) * 1.2f), this.f4579i);
                        }
                    }
                    c0Var.f4653d = this.f4572a;
                    l();
                }
            }
            boolean z8 = c0Var.f4653d >= 0;
            c0Var.a(recyclerView);
            if (z8 && this.f4576e) {
                this.f4575d = true;
                recyclerView.f13671s0.b();
            }
        }
    }

    public void j() {
        this.f4584p = 0;
        this.f4583o = 0;
        this.k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(View view, c0 c0Var) {
        int i7;
        PointF pointF;
        int e2;
        PointF pointF2 = this.k;
        int i10 = 0;
        if (pointF2 != null) {
            float f4 = pointF2.x;
            if (f4 != 0.0f) {
                i7 = f4 > 0.0f ? 1 : -1;
                int b2 = b(view, i7);
                pointF = this.k;
                if (pointF != null) {
                    float f10 = pointF.y;
                    if (f10 != 0.0f) {
                        i10 = f10 > 0.0f ? 1 : -1;
                    }
                }
                int c10 = c(view, i10);
                e2 = e((int) Math.sqrt((c10 * c10) + (b2 * b2)));
                if (e2 <= 0) {
                    c0Var.b(-b2, -c10, e2, this.j);
                    return;
                }
                return;
            }
        }
        i7 = 0;
        int b22 = b(view, i7);
        pointF = this.k;
        if (pointF != null) {
        }
        int c102 = c(view, i10);
        e2 = e((int) Math.sqrt((c102 * c102) + (b22 * b22)));
        if (e2 <= 0) {
        }
    }

    public final void l() {
        if (this.f4576e) {
            this.f4576e = false;
            j();
            this.f4573b.f13676v0.f4664a = -1;
            this.f4577f = null;
            this.f4572a = -1;
            this.f4575d = false;
            androidx.recyclerview.widget.a aVar = this.f4574c;
            if (aVar.f13711e == this) {
                aVar.f13711e = null;
            }
            this.f4574c = null;
            this.f4573b = null;
        }
    }
}
