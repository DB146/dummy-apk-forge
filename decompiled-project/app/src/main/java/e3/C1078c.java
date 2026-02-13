package e3;

import A9.O;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import q1.C1876b;
import s6.o;
import y1.InterfaceC2366n;
import y1.K;
import y1.m0;
import y1.p0;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078c implements InterfaceC2366n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16711a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16713c;

    public C1078c(O o10, E3.h hVar) {
        this.f16711a = 1;
        this.f16712b = o10;
        this.f16713c = hVar;
    }

    public C1078c(AbstractC1084i abstractC1084i) {
        this.f16711a = 0;
        this.f16713c = abstractC1084i;
        this.f16712b = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    @Override // y1.InterfaceC2366n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p0 l(View view, p0 p0Var) {
        boolean z8;
        boolean z10;
        switch (this.f16711a) {
            case 0:
                p0 i7 = K.i(view, p0Var);
                if (i7.f26731a.o()) {
                    return i7;
                }
                int b2 = i7.b();
                Rect rect = (Rect) this.f16712b;
                rect.left = b2;
                rect.top = i7.d();
                rect.right = i7.c();
                rect.bottom = i7.a();
                AbstractC1084i abstractC1084i = (AbstractC1084i) this.f16713c;
                int childCount = abstractC1084i.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    p0 b10 = K.b(abstractC1084i.getChildAt(i10), i7);
                    rect.left = Math.min(b10.b(), rect.left);
                    rect.top = Math.min(b10.d(), rect.top);
                    rect.right = Math.min(b10.c(), rect.right);
                    rect.bottom = Math.min(b10.a(), rect.bottom);
                }
                return i7.f(rect.left, rect.top, rect.right, rect.bottom);
            default:
                E3.h hVar = (E3.h) this.f16713c;
                int i11 = hVar.f3537a;
                O o10 = (O) this.f16712b;
                m0 m0Var = p0Var.f26731a;
                C1876b g = m0Var.g(519);
                C1876b g2 = m0Var.g(32);
                int i12 = g.f23342b;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) o10.f921b;
                bottomSheetBehavior.f15230w = i12;
                boolean f4 = o.f(view);
                int paddingBottom = view.getPaddingBottom();
                int paddingLeft = view.getPaddingLeft();
                int paddingRight = view.getPaddingRight();
                boolean z11 = bottomSheetBehavior.f15222o;
                if (z11) {
                    int a9 = p0Var.a();
                    bottomSheetBehavior.f15229v = a9;
                    paddingBottom = a9 + hVar.f3539c;
                }
                int i13 = hVar.f3538b;
                boolean z12 = bottomSheetBehavior.f15223p;
                int i14 = g.f23341a;
                if (z12) {
                    paddingLeft = (f4 ? i13 : i11) + i14;
                }
                boolean z13 = bottomSheetBehavior.f15224q;
                int i15 = g.f23343c;
                if (z13) {
                    if (!f4) {
                        i11 = i13;
                    }
                    paddingRight = i11 + i15;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                boolean z14 = true;
                if (!bottomSheetBehavior.f15226s || marginLayoutParams.leftMargin == i14) {
                    z8 = false;
                } else {
                    marginLayoutParams.leftMargin = i14;
                    z8 = true;
                }
                if (bottomSheetBehavior.f15227t && marginLayoutParams.rightMargin != i15) {
                    marginLayoutParams.rightMargin = i15;
                    z8 = true;
                }
                if (bottomSheetBehavior.f15228u) {
                    int i16 = marginLayoutParams.topMargin;
                    int i17 = g.f23342b;
                    if (i16 != i17) {
                        marginLayoutParams.topMargin = i17;
                        if (z14) {
                            view.setLayoutParams(marginLayoutParams);
                        }
                        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                        z10 = o10.f920a;
                        if (z10) {
                            bottomSheetBehavior.f15220m = g2.f23344d;
                        }
                        if (!z11 || z10) {
                            bottomSheetBehavior.P();
                        }
                        return p0Var;
                    }
                }
                z14 = z8;
                if (z14) {
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z10 = o10.f920a;
                if (z10) {
                }
                if (!z11) {
                }
                bottomSheetBehavior.P();
                return p0Var;
        }
    }
}
