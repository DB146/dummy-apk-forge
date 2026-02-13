package g6;

import E5.k;
import Z9.x;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import y1.K;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199a extends x {

    /* renamed from: c, reason: collision with root package name */
    public int f17461c;

    /* renamed from: d, reason: collision with root package name */
    public int f17462d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f17463e;

    public C1199a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f17463e = swipeDismissBehavior;
    }

    @Override // Z9.x
    public final void I(View view, int i7) {
        this.f17462d = i7;
        this.f17461c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f17463e;
            swipeDismissBehavior.f15177c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f15177c = false;
        }
    }

    @Override // Z9.x
    public final void J(int i7) {
    }

    @Override // Z9.x
    public final void K(View view, int i7, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f17463e;
        float f4 = width * swipeDismissBehavior.f15179e;
        float width2 = view.getWidth() * swipeDismissBehavior.f15180f;
        float abs = Math.abs(i7 - this.f17461c);
        if (abs <= f4) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f4) / (width2 - f4))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f17461c) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // Z9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(View view, float f4, float f10) {
        int i7;
        this.f17462d = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f17463e;
        boolean z8 = true;
        if (f4 != 0.0f) {
            WeakHashMap weakHashMap = K.f26642a;
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = swipeDismissBehavior.f15178d;
            if (i10 != 2) {
                if (i10 == 0) {
                    i7 = this.f17461c;
                    z8 = false;
                } else {
                    i7 = this.f17461c;
                    z8 = false;
                }
            }
            if (f4 >= 0.0f) {
                int left = view.getLeft();
                int i11 = this.f17461c;
                if (left >= i11) {
                    i7 = i11 + width;
                }
            }
            i7 = this.f17461c - width;
        }
        if (swipeDismissBehavior.f15175a.o(i7, view.getTop())) {
            k kVar = new k(swipeDismissBehavior, view, z8);
            WeakHashMap weakHashMap2 = K.f26642a;
            view.postOnAnimation(kVar);
        }
    }

    @Override // Z9.x
    public final boolean W(View view, int i7) {
        int i10 = this.f17462d;
        return (i10 == -1 || i10 == i7) && this.f17463e.v(view);
    }

    @Override // Z9.x
    public final int g(View view, int i7) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = K.f26642a;
        boolean z8 = view.getLayoutDirection() == 1;
        int i10 = this.f17463e.f15178d;
        if (i10 == 0) {
            if (z8) {
                width = this.f17461c - view.getWidth();
                width2 = this.f17461c;
            } else {
                width = this.f17461c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 != 1) {
            width = this.f17461c - view.getWidth();
            width2 = view.getWidth() + this.f17461c;
        } else if (z8) {
            width = this.f17461c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f17461c - view.getWidth();
            width2 = this.f17461c;
        }
        return Math.min(Math.max(width, i7), width2);
    }

    @Override // Z9.x
    public final int h(View view, int i7) {
        return view.getTop();
    }

    @Override // Z9.x
    public final int x(View view) {
        return view.getWidth();
    }
}
