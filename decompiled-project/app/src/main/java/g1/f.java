package g1;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import d1.C1040c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17302a;

    /* renamed from: b, reason: collision with root package name */
    public int f17303b;

    /* renamed from: c, reason: collision with root package name */
    public int f17304c;

    /* renamed from: d, reason: collision with root package name */
    public int f17305d;

    /* renamed from: e, reason: collision with root package name */
    public int f17306e;

    /* renamed from: f, reason: collision with root package name */
    public int f17307f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f17308h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f17308h = constraintLayout;
        this.f17302a = constraintLayout2;
    }

    public static boolean a(int i7, int i10, int i11) {
        if (i7 == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i7);
        return View.MeasureSpec.getMode(i10) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i11 == View.MeasureSpec.getSize(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00ea, code lost:
    
        if (r10 == 2) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d1.d dVar, e1.b bVar) {
        int makeMeasureSpec;
        int i7;
        int b2;
        int makeMeasureSpec2;
        d1.e eVar;
        int max;
        int i10;
        int i11;
        boolean z8;
        int baseline;
        int i12;
        if (dVar == null) {
            return;
        }
        if (dVar.f16377g0 == 8) {
            bVar.f16667e = 0;
            bVar.f16668f = 0;
            bVar.g = 0;
            return;
        }
        if (dVar.f16358T == null) {
            return;
        }
        r rVar = ConstraintLayout.f13218D;
        ConstraintLayout constraintLayout = this.f17308h;
        int i13 = bVar.f16663a;
        int i14 = bVar.f16664b;
        int i15 = bVar.f16665c;
        int i16 = bVar.f16666d;
        int i17 = this.f17303b + this.f17304c;
        int i18 = this.f17305d;
        View view = dVar.f16376f0;
        int b10 = P.c.b(i13);
        C1040c c1040c = dVar.f16350K;
        C1040c c1040c2 = dVar.f16348I;
        if (b10 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else if (b10 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f17307f, i18, -2);
        } else {
            if (b10 != 2) {
                if (b10 != 3) {
                    i7 = 0;
                } else {
                    int i19 = this.f17307f;
                    int i20 = c1040c2 != null ? c1040c2.g : 0;
                    if (c1040c != null) {
                        i20 += c1040c.g;
                    }
                    i7 = ViewGroup.getChildMeasureSpec(i19, i18 + i20, -1);
                }
                b2 = P.c.b(i14);
                if (b2 != 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                } else if (b2 == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                } else if (b2 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                    boolean z10 = dVar.f16396s == 1;
                    int i21 = bVar.j;
                    int i22 = i21 != 1 ? 2 : 2;
                    boolean z11 = view.getMeasuredWidth() == dVar.q();
                    if (bVar.j == i22 || !z10 || ((z10 && z11) || dVar.B())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                    }
                } else if (b2 != 3) {
                    makeMeasureSpec2 = 0;
                } else {
                    int i23 = this.g;
                    int i24 = c1040c2 != null ? dVar.f16349J.g : 0;
                    if (c1040c != null) {
                        i24 += dVar.L.g;
                    }
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i23, i17 + i24, -1);
                }
                eVar = (d1.e) dVar.f16358T;
                if (eVar == null && d1.j.c(constraintLayout.f13230w, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f16366a0 && !dVar.z() && a(dVar.f16346G, i7, dVar.q()) && a(dVar.f16347H, makeMeasureSpec2, dVar.k())) {
                    bVar.f16667e = dVar.q();
                    bVar.f16668f = dVar.k();
                    bVar.g = dVar.f16366a0;
                    return;
                }
                boolean z12 = i13 != 3;
                boolean z13 = i14 != 3;
                boolean z14 = i14 != 4 || i14 == 1;
                boolean z15 = i13 != 4 || i13 == 1;
                boolean z16 = !z12 && dVar.f16361W > 0.0f;
                boolean z17 = !z13 && dVar.f16361W > 0.0f;
                if (view != null) {
                    return;
                }
                e eVar2 = (e) view.getLayoutParams();
                int i25 = bVar.j;
                if (i25 != 1 && i25 != 2 && z12 && dVar.f16395r == 0 && z13 && dVar.f16396s == 0) {
                    i11 = 0;
                    i12 = -1;
                    baseline = 0;
                    z8 = false;
                    max = 0;
                } else {
                    if ((view instanceof s) && (dVar instanceof d1.g)) {
                        ((s) view).j((d1.g) dVar, i7, makeMeasureSpec2);
                    } else {
                        view.measure(i7, makeMeasureSpec2);
                    }
                    dVar.f16346G = i7;
                    dVar.f16347H = makeMeasureSpec2;
                    dVar.g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i26 = dVar.f16398u;
                    max = i26 > 0 ? Math.max(i26, measuredWidth) : measuredWidth;
                    int i27 = dVar.f16399v;
                    if (i27 > 0) {
                        max = Math.min(i27, max);
                    }
                    int i28 = dVar.f16401x;
                    if (i28 > 0) {
                        i11 = Math.max(i28, measuredHeight);
                        i10 = makeMeasureSpec2;
                    } else {
                        i10 = makeMeasureSpec2;
                        i11 = measuredHeight;
                    }
                    int i29 = dVar.f16402y;
                    if (i29 > 0) {
                        i11 = Math.min(i29, i11);
                    }
                    if (!d1.j.c(constraintLayout.f13230w, 1)) {
                        if (z16 && z14) {
                            max = (int) ((i11 * dVar.f16361W) + 0.5f);
                        } else if (z17 && z15) {
                            i11 = (int) ((max / dVar.f16361W) + 0.5f);
                        }
                    }
                    if (measuredWidth == max && measuredHeight == i11) {
                        baseline = baseline2;
                        i12 = -1;
                        z8 = false;
                    } else {
                        if (measuredWidth != max) {
                            i7 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        int makeMeasureSpec3 = measuredHeight != i11 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : i10;
                        view.measure(i7, makeMeasureSpec3);
                        dVar.f16346G = i7;
                        dVar.f16347H = makeMeasureSpec3;
                        z8 = false;
                        dVar.g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        i11 = view.getMeasuredHeight();
                        max = measuredWidth2;
                        baseline = view.getBaseline();
                        i12 = -1;
                    }
                }
                boolean z18 = baseline != i12 ? true : z8;
                bVar.f16670i = (max == bVar.f16665c && i11 == bVar.f16666d) ? z8 : true;
                boolean z19 = eVar2.f17268c0 ? true : z18;
                if (z19 && baseline != -1 && dVar.f16366a0 != baseline) {
                    bVar.f16670i = true;
                }
                bVar.f16667e = max;
                bVar.f16668f = i11;
                bVar.f16669h = z19;
                bVar.g = baseline;
                return;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f17307f, i18, -2);
            boolean z20 = dVar.f16395r == 1;
            int i30 = bVar.j;
            if (i30 == 1 || i30 == 2) {
                boolean z21 = view.getMeasuredHeight() == dVar.k();
                if (bVar.j == 2 || !z20 || ((z20 && z21) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        }
        i7 = makeMeasureSpec;
        b2 = P.c.b(i14);
        if (b2 != 0) {
        }
        eVar = (d1.e) dVar.f16358T;
        if (eVar == null) {
        }
        if (i13 != 3) {
        }
        if (i14 != 3) {
        }
        if (i14 != 4) {
        }
        if (i13 != 4) {
        }
        if (z12) {
        }
        if (z13) {
        }
        if (view != null) {
        }
    }
}
