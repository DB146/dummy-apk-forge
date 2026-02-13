package A9;

import a2.AbstractC0708a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.HorizontalGridView;
import com.kt.apps.media.xemtv.beta.R;
import f2.C1129a;
import java.util.HashMap;

/* renamed from: A9.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0151w1 extends AbstractC0156x2 {

    /* renamed from: n, reason: collision with root package name */
    public static int f1449n;

    /* renamed from: o, reason: collision with root package name */
    public static int f1450o;

    /* renamed from: p, reason: collision with root package name */
    public static int f1451p;

    /* renamed from: l, reason: collision with root package name */
    public e3 f1456l;

    /* renamed from: m, reason: collision with root package name */
    public T f1457m;

    /* renamed from: e, reason: collision with root package name */
    public final int f1452e = 1;
    public boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f1454h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1455i = true;
    public final boolean j = true;
    public final HashMap k = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final int f1453f = 2;

    public static void B(C0147v1 c0147v1) {
        if (c0147v1.f1463h && c0147v1.g) {
            HorizontalGridView horizontalGridView = c0147v1.f1433o;
            C0131r1 c0131r1 = (C0131r1) horizontalGridView.I(horizontalGridView.getSelectedPosition(), false);
            z(c0147v1, c0131r1 == null ? null : c0131r1.f4707a, false);
        }
    }

    public static void z(C0147v1 c0147v1, View view, boolean z8) {
        InterfaceC0153x interfaceC0153x;
        InterfaceC0153x interfaceC0153x2;
        if (view == null) {
            if (!z8 || (interfaceC0153x = c0147v1.f1466m) == null) {
                return;
            }
            interfaceC0153x.a(null, null, c0147v1, c0147v1.f1460d);
            return;
        }
        if (c0147v1.g) {
            C0131r1 c0131r1 = (C0131r1) c0147v1.f1433o.L(view);
            if (!z8 || (interfaceC0153x2 = c0147v1.f1466m) == null) {
                return;
            }
            interfaceC0153x2.a(c0131r1.f1355v, c0131r1.f1356w, c0147v1, c0147v1.f1460d);
        }
    }

    public final void A(C0147v1 c0147v1) {
        int i7;
        int i10 = 0;
        if (c0147v1.f1463h) {
            C0140t2 c0140t2 = c0147v1.f1459c;
            if (c0140t2 != null) {
                C0144u2 c0144u2 = this.f1470b;
                View view = c0140t2.f1271a;
                if (c0144u2 != null) {
                    int paddingBottom = view.getPaddingBottom();
                    if (view instanceof TextView) {
                        TextView textView = (TextView) view;
                        Paint paint = c0144u2.f1410c;
                        if (paint.getTextSize() != textView.getTextSize()) {
                            paint.setTextSize(textView.getTextSize());
                        }
                        if (paint.getTypeface() != textView.getTypeface()) {
                            paint.setTypeface(textView.getTypeface());
                        }
                        paddingBottom += (int) paint.descent();
                    }
                    i10 = paddingBottom;
                } else {
                    i10 = view.getPaddingBottom();
                }
            }
            i10 = (c0147v1.g ? f1450o : c0147v1.f1435q) - i10;
            i7 = f1451p;
        } else {
            boolean z8 = c0147v1.g;
            int i11 = c0147v1.f1436r;
            if (z8) {
                i7 = f1449n;
                i10 = i7 - i11;
            } else {
                i7 = i11;
            }
        }
        c0147v1.f1433o.setPadding(c0147v1.f1437s, i10, c0147v1.f1438t, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [A9.x1, android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    @Override // A9.AbstractC0156x2
    public final C0152w2 i(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (f1449n == 0) {
            f1449n = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_selected_row_top_padding);
            f1450o = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_selected_row_top_padding);
            f1451p = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_row_no_hovercard_bottom_padding);
        }
        Context context2 = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context2, null, 0);
        LayoutInflater.from(context2).inflate(R.layout.lb_list_row, (ViewGroup) linearLayout);
        HorizontalGridView horizontalGridView = (HorizontalGridView) linearLayout.findViewById(R.id.row_content);
        linearLayout.f1469a = horizontalGridView;
        horizontalGridView.setHasFixedSize(false);
        linearLayout.setOrientation(1);
        linearLayout.setDescendantFocusability(262144);
        HorizontalGridView gridView = linearLayout.getGridView();
        if (this.f1454h < 0) {
            TypedArray obtainStyledAttributes = gridView.getContext().obtainStyledAttributes(AbstractC0708a.f12484b);
            this.f1454h = (int) obtainStyledAttributes.getDimension(5, 0.0f);
            obtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.f1454h);
        return new C0147v1(linearLayout, linearLayout.getGridView());
    }

    @Override // A9.AbstractC0156x2
    public final void j(C0152w2 c0152w2, boolean z8) {
        InterfaceC0153x interfaceC0153x;
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        HorizontalGridView horizontalGridView = c0147v1.f1433o;
        C0131r1 c0131r1 = (C0131r1) horizontalGridView.I(horizontalGridView.getSelectedPosition(), false);
        if (c0131r1 == null) {
            super.j(c0152w2, z8);
        } else {
            if (!z8 || (interfaceC0153x = c0152w2.f1466m) == null) {
                return;
            }
            interfaceC0153x.a(c0131r1.f1355v, c0131r1.f1356w, c0147v1, c0147v1.f1460d);
        }
    }

    @Override // A9.AbstractC0156x2
    public final void k(C0152w2 c0152w2, boolean z8) {
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        boolean z10 = !z8;
        c0147v1.f1433o.setScrollEnabled(z10);
        c0147v1.f1433o.setAnimateChildLayout(z10);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [A9.x0, java.lang.Object] */
    @Override // A9.AbstractC0156x2
    public final void m(C0152w2 c0152w2) {
        super.m(c0152w2);
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        Context context = c0152w2.f1271a.getContext();
        if (this.f1456l == null) {
            c3 c3Var = new c3();
            c3Var.f1093a = this.f1471c;
            c3Var.f1095c = this.g;
            c3Var.f1094b = !C1129a.a(context).f16937b && this.f1455i;
            c3Var.f1096d = !C1129a.a(context).f16936a;
            c3Var.f1097e = this.j;
            c3Var.f1098f = d3.f1110a;
            e3 a9 = c3Var.a(context);
            this.f1456l = a9;
            if (a9.f1130e) {
                this.f1457m = new T(a9);
            }
        }
        B0 b02 = new B0(this, c0147v1, 1);
        c0147v1.f1434p = b02;
        b02.f1362e = this.f1457m;
        int i7 = this.f1456l.f1126a;
        HorizontalGridView horizontalGridView = c0147v1.f1433o;
        if (i7 == 2) {
            horizontalGridView.setLayoutMode(1);
        }
        B0 b03 = c0147v1.f1434p;
        int i10 = this.f1453f;
        if (i10 == 0) {
            b03.f1363f = null;
        } else {
            ?? obj = new Object();
            if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException("Unhandled zoom index");
            }
            obj.f1468a = i10;
            b03.f1363f = obj;
        }
        horizontalGridView.setFocusDrawingOrderEnabled(this.f1456l.f1126a != 3);
        horizontalGridView.setOnChildSelectedListener(new q3.c(2, this, c0147v1));
        horizontalGridView.setOnUnhandledKeyListener(new T(c0147v1));
        horizontalGridView.setNumRows(this.f1452e);
    }

    @Override // A9.AbstractC0156x2
    public final boolean n() {
        return false;
    }

    @Override // A9.AbstractC0156x2
    public final void o(C0152w2 c0152w2, Object obj) {
        CharSequence charSequence;
        super.o(c0152w2, obj);
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        C0139t1 c0139t1 = (C0139t1) obj;
        c0147v1.f1434p.s(c0139t1.f1371b);
        B0 b02 = c0147v1.f1434p;
        HorizontalGridView horizontalGridView = c0147v1.f1433o;
        horizontalGridView.setAdapter(b02);
        C0096i1 c0096i1 = c0139t1.f1358a;
        if (c0096i1 != null) {
            charSequence = (SpannableString) c0096i1.f1229c;
            if (charSequence == null) {
                charSequence = (String) c0096i1.f1227a;
            }
        } else {
            charSequence = null;
        }
        horizontalGridView.setContentDescription(charSequence);
    }

    @Override // A9.AbstractC0156x2
    public final void r(C0152w2 c0152w2, boolean z8) {
        super.r(c0152w2, z8);
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        A(c0147v1);
        B(c0147v1);
    }

    @Override // A9.AbstractC0156x2
    public final void s(C0152w2 c0152w2, boolean z8) {
        super.s(c0152w2, z8);
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        A(c0147v1);
        B(c0147v1);
    }

    @Override // A9.AbstractC0156x2
    public final void t(C0152w2 c0152w2) {
        super.t(c0152w2);
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        HorizontalGridView horizontalGridView = c0147v1.f1433o;
        int childCount = horizontalGridView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            y(c0147v1, horizontalGridView.getChildAt(i7));
        }
    }

    @Override // A9.AbstractC0156x2
    public final void u(C0152w2 c0152w2) {
        C0147v1 c0147v1 = (C0147v1) c0152w2;
        c0147v1.f1433o.setAdapter(null);
        c0147v1.f1434p.s(null);
        super.u(c0152w2);
    }

    @Override // A9.AbstractC0156x2
    public final void v(C0152w2 c0152w2, boolean z8) {
        super.v(c0152w2, z8);
        ((C0147v1) c0152w2).f1433o.setChildrenVisibility(z8 ? 0 : 4);
    }

    public final void y(C0147v1 c0147v1, View view) {
        e3 e3Var = this.f1456l;
        if (e3Var == null || !e3Var.f1127b) {
            return;
        }
        int color = c0147v1.k.f16488c.getColor();
        if (this.f1456l.f1130e) {
            ((b3) view).setOverlayColor(color);
            return;
        }
        Drawable foreground = view.getForeground();
        if (foreground instanceof ColorDrawable) {
            ((ColorDrawable) foreground).setColor(color);
        } else {
            view.setForeground(new ColorDrawable(color));
        }
    }
}
