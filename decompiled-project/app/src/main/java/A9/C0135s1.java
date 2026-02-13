package A9;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* renamed from: A9.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0135s1 extends H2.K {

    /* renamed from: d, reason: collision with root package name */
    public J1 f1361d;

    /* renamed from: e, reason: collision with root package name */
    public T f1362e;

    /* renamed from: f, reason: collision with root package name */
    public C0154x0 f1363f;
    public C0134s0 g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1364h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final Z f1365i = new Z(this, 1);

    @Override // H2.K
    public final int a() {
        J1 j12 = this.f1361d;
        if (j12 != null) {
            return j12.e();
        }
        return 0;
    }

    @Override // H2.K
    public final long b(int i7) {
        this.f1361d.getClass();
        return -1L;
    }

    @Override // H2.K
    public final int c(int i7) {
        J1 j12 = this.f1361d;
        AbstractC0113m2 a9 = j12.f852b.a(j12.a(i7));
        int indexOf = this.f1364h.indexOf(a9);
        if (indexOf < 0) {
            this.f1364h.add(a9);
            indexOf = this.f1364h.indexOf(a9);
            m(a9, indexOf);
            C0134s0 c0134s0 = this.g;
            if (c0134s0 != null) {
                c0134s0.D(a9, indexOf);
            }
        }
        return indexOf;
    }

    @Override // H2.K
    public final void e(H2.i0 i0Var, int i7) {
        C0131r1 c0131r1 = (C0131r1) i0Var;
        Object a9 = this.f1361d.a(i7);
        c0131r1.f1356w = a9;
        c0131r1.f1354u.c(c0131r1.f1355v, a9);
        o(c0131r1);
        C0134s0 c0134s0 = this.g;
        if (c0134s0 != null) {
            c0134s0.F(c0131r1);
        }
    }

    @Override // H2.K
    public final void f(H2.i0 i0Var, int i7) {
        C0131r1 c0131r1 = (C0131r1) i0Var;
        Object a9 = this.f1361d.a(i7);
        c0131r1.f1356w = a9;
        c0131r1.f1354u.c(c0131r1.f1355v, a9);
        o(c0131r1);
        C0134s0 c0134s0 = this.g;
        if (c0134s0 != null) {
            c0134s0.F(c0131r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [A9.k3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.FrameLayout, A9.b3, android.view.View, android.view.ViewGroup] */
    @Override // H2.K
    public final H2.i0 g(ViewGroup viewGroup, int i7) {
        C0109l2 d10;
        View view;
        AbstractC0113m2 abstractC0113m2 = (AbstractC0113m2) this.f1364h.get(i7);
        T t5 = this.f1362e;
        if (t5 != null) {
            Context context = viewGroup.getContext();
            e3 e3Var = (e3) t5.f964a;
            if (!e3Var.f1130e) {
                throw new IllegalArgumentException();
            }
            int i10 = e3Var.f1126a;
            boolean z8 = e3Var.f1127b;
            float f4 = e3Var.g;
            float f10 = e3Var.f1132h;
            int i11 = e3Var.f1131f;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f1070e = 1;
            if (frameLayout.f1066a) {
                throw new IllegalStateException();
            }
            frameLayout.f1066a = true;
            frameLayout.f1069d = i11 > 0;
            frameLayout.f1070e = i10;
            if (i10 == 2) {
                frameLayout.setLayoutMode(1);
                LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.lb_shadow, (ViewGroup) frameLayout, true);
                ?? obj = new Object();
                obj.f1265a = frameLayout.findViewById(R.id.lb_shadow_normal);
                obj.f1266b = frameLayout.findViewById(R.id.lb_shadow_focused);
                frameLayout.f1067b = obj;
            } else if (i10 == 3) {
                frameLayout.f1067b = Z9.x.c(frameLayout, f4, f10, i11);
            }
            if (z8) {
                frameLayout.setWillNotDraw(false);
                frameLayout.f1072u = 0;
                Paint paint = new Paint();
                frameLayout.f1071f = paint;
                paint.setColor(frameLayout.f1072u);
                frameLayout.f1071f.setStyle(Paint.Style.FILL);
            } else {
                frameLayout.setWillNotDraw(true);
                frameLayout.f1071f = null;
            }
            d10 = abstractC0113m2.d(viewGroup);
            this.f1362e.getClass();
            if (!frameLayout.f1066a || frameLayout.f1068c != null) {
                throw new IllegalStateException();
            }
            View view2 = d10.f1271a;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
                layoutParams.width = layoutParams.width == -1 ? -1 : -2;
                layoutParams.height = layoutParams.height == -1 ? -1 : -2;
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.addView(view2, layoutParams2);
            } else {
                frameLayout.addView(view2);
            }
            if (frameLayout.f1069d && frameLayout.f1070e != 3) {
                Y6.b.w(frameLayout, frameLayout.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
            }
            frameLayout.f1068c = view2;
            view = frameLayout;
        } else {
            d10 = abstractC0113m2.d(viewGroup);
            view = d10.f1271a;
        }
        C0131r1 c0131r1 = new C0131r1(abstractC0113m2, view, d10);
        p(c0131r1);
        C0134s0 c0134s0 = this.g;
        if (c0134s0 != null) {
            c0134s0.G(c0131r1);
        }
        View view3 = c0131r1.f1355v.f1271a;
        View.OnFocusChangeListener onFocusChangeListener = view3.getOnFocusChangeListener();
        C0154x0 c0154x0 = this.f1363f;
        if (c0154x0 != null) {
            if (onFocusChangeListener instanceof ViewOnFocusChangeListenerC0128q1) {
                ViewOnFocusChangeListenerC0128q1 viewOnFocusChangeListenerC0128q1 = (ViewOnFocusChangeListenerC0128q1) onFocusChangeListener;
                viewOnFocusChangeListenerC0128q1.f1349b = this.f1362e != null;
                viewOnFocusChangeListenerC0128q1.f1350c = c0154x0;
            } else {
                view3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0128q1(onFocusChangeListener, this.f1362e != null, c0154x0));
            }
            this.f1363f.a(view).a(false, true);
        } else if (onFocusChangeListener instanceof ViewOnFocusChangeListenerC0128q1) {
            view3.setOnFocusChangeListener(((ViewOnFocusChangeListenerC0128q1) onFocusChangeListener).f1348a);
        }
        return c0131r1;
    }

    @Override // H2.K
    public final void h(H2.i0 i0Var) {
        k(i0Var);
    }

    @Override // H2.K
    public final void i(H2.i0 i0Var) {
        C0131r1 c0131r1 = (C0131r1) i0Var;
        n(c0131r1);
        C0134s0 c0134s0 = this.g;
        if (c0134s0 != null) {
            c0134s0.E(c0131r1);
        }
        c0131r1.f1354u.f(c0131r1.f1355v);
    }

    @Override // H2.K
    public final void j(H2.i0 i0Var) {
        C0131r1 c0131r1 = (C0131r1) i0Var;
        c0131r1.f1354u.g(c0131r1.f1355v);
        q(c0131r1);
        C0134s0 c0134s0 = this.g;
        if (c0134s0 != null) {
            c0134s0.H(c0131r1);
        }
    }

    @Override // H2.K
    public final void k(H2.i0 i0Var) {
        C0131r1 c0131r1 = (C0131r1) i0Var;
        c0131r1.f1354u.e(c0131r1.f1355v);
        r(c0131r1);
        C0134s0 c0134s0 = this.g;
        if (c0134s0 != null) {
            c0134s0.I(c0131r1);
        }
        c0131r1.f1356w = null;
    }

    public void m(AbstractC0113m2 abstractC0113m2, int i7) {
    }

    public void n(C0131r1 c0131r1) {
    }

    public void o(C0131r1 c0131r1) {
    }

    public void p(C0131r1 c0131r1) {
    }

    public void q(C0131r1 c0131r1) {
    }

    public void r(C0131r1 c0131r1) {
    }

    public final void s(J1 j12) {
        J1 j13 = this.f1361d;
        if (j12 == j13) {
            return;
        }
        Z z8 = this.f1365i;
        if (j13 != null) {
            j13.f851a.unregisterObserver(z8);
        }
        this.f1361d = j12;
        if (j12 == null) {
            d();
            return;
        }
        j12.f851a.registerObserver(z8);
        boolean z10 = this.f4600b;
        this.f1361d.getClass();
        if (z10) {
            this.f1361d.getClass();
            l(false);
        }
        d();
    }
}
