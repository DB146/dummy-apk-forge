package i6;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c2.q;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.k;
import com.kt.apps.media.xemtv.beta.R;
import i.x;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l2.X;
import y1.AbstractC2352B;
import y1.K;

/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: A, reason: collision with root package name */
    public g f18448A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f18449B;

    /* renamed from: C, reason: collision with root package name */
    public X f18450C;

    /* renamed from: D, reason: collision with root package name */
    public f f18451D;

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f18452f;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f18453u;

    /* renamed from: v, reason: collision with root package name */
    public CoordinatorLayout f18454v;

    /* renamed from: w, reason: collision with root package name */
    public FrameLayout f18455w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18456x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18457y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18458z;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f18452f == null) {
            h();
        }
        super.cancel();
    }

    public final void h() {
        if (this.f18453u == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f18453u = frameLayout;
            this.f18454v = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f18453u.findViewById(R.id.design_bottom_sheet);
            this.f18455w = frameLayout2;
            BottomSheetBehavior A10 = BottomSheetBehavior.A(frameLayout2);
            this.f18452f = A10;
            f fVar = this.f18451D;
            ArrayList arrayList = A10.f15202W;
            if (!arrayList.contains(fVar)) {
                arrayList.add(fVar);
            }
            this.f18452f.G(this.f18456x);
            this.f18450C = new X(this.f18452f, this.f18455w);
        }
    }

    public final FrameLayout i(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        int i10 = 2;
        h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f18453u.findViewById(R.id.coordinator);
        if (i7 != 0 && view == null) {
            view = getLayoutInflater().inflate(i7, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f18449B) {
            FrameLayout frameLayout = this.f18455w;
            R7.b bVar = new R7.b(this, 20);
            WeakHashMap weakHashMap = K.f26642a;
            AbstractC2352B.l(frameLayout, bVar);
        }
        this.f18455w.removeAllViews();
        if (layoutParams == null) {
            this.f18455w.addView(view);
        } else {
            this.f18455w.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new k(this, i10));
        K.n(this.f18455w, new com.google.android.material.datepicker.i(this, i10));
        this.f18455w.setOnTouchListener(new A6.b(1));
        return this.f18453u;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z8 = this.f18449B && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f18453u;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z8);
            }
            CoordinatorLayout coordinatorLayout = this.f18454v;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z8);
            }
            q.z(window, !z8);
            g gVar = this.f18448A;
            if (gVar != null) {
                gVar.e(window);
            }
        }
        X x2 = this.f18450C;
        if (x2 == null) {
            return;
        }
        boolean z10 = this.f18456x;
        View view = (View) x2.f19196d;
        t6.c cVar = (t6.c) x2.f19194b;
        if (z10) {
            if (cVar != null) {
                cVar.b((t6.b) x2.f19195c, view, false);
            }
        } else if (cVar != null) {
            cVar.c(view);
        }
    }

    @Override // i.x, c.DialogC0868l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        t6.c cVar;
        g gVar = this.f18448A;
        if (gVar != null) {
            gVar.e(null);
        }
        X x2 = this.f18450C;
        if (x2 == null || (cVar = (t6.c) x2.f19194b) == null) {
            return;
        }
        cVar.c((View) x2.f19196d);
    }

    @Override // c.DialogC0868l, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f18452f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.L != 5) {
            return;
        }
        bottomSheetBehavior.I(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z8) {
        X x2;
        super.setCancelable(z8);
        if (this.f18456x != z8) {
            this.f18456x = z8;
            BottomSheetBehavior bottomSheetBehavior = this.f18452f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z8);
            }
            if (getWindow() == null || (x2 = this.f18450C) == null) {
                return;
            }
            boolean z10 = this.f18456x;
            View view = (View) x2.f19196d;
            t6.c cVar = (t6.c) x2.f19194b;
            if (z10) {
                if (cVar != null) {
                    cVar.b((t6.b) x2.f19195c, view, false);
                }
            } else if (cVar != null) {
                cVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z8) {
        super.setCanceledOnTouchOutside(z8);
        if (z8 && !this.f18456x) {
            this.f18456x = true;
        }
        this.f18457y = z8;
        this.f18458z = true;
    }

    @Override // i.x, c.DialogC0868l, android.app.Dialog
    public final void setContentView(int i7) {
        super.setContentView(i(null, i7, null));
    }

    @Override // i.x, c.DialogC0868l, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // i.x, c.DialogC0868l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
