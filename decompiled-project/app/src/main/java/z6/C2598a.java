package z6;

import Z9.x;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2598a extends x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28326c;

    /* renamed from: d, reason: collision with root package name */
    public final SideSheetBehavior f28327d;

    public /* synthetic */ C2598a(SideSheetBehavior sideSheetBehavior, int i7) {
        this.f28326c = i7;
        this.f28327d = sideSheetBehavior;
    }

    @Override // Z9.x
    public final boolean B(float f4) {
        switch (this.f28326c) {
            case 0:
                return f4 > 0.0f;
            default:
                return f4 < 0.0f;
        }
    }

    @Override // Z9.x
    public final boolean C(View view) {
        switch (this.f28326c) {
            case 0:
                return view.getRight() < (o() - q()) / 2;
            default:
                return view.getLeft() > (o() + this.f28327d.f15427m) / 2;
        }
    }

    @Override // Z9.x
    public final boolean D(float f4, float f10) {
        switch (this.f28326c) {
            case 0:
                if (Math.abs(f4) > Math.abs(f10)) {
                    float abs = Math.abs(f4);
                    this.f28327d.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f4) > Math.abs(f10)) {
                    float abs2 = Math.abs(f4);
                    this.f28327d.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // Z9.x
    public final boolean R(View view, float f4) {
        switch (this.f28326c) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f28327d;
                float abs = Math.abs((f4 * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                return abs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f28327d;
                float abs2 = Math.abs((f4 * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                return abs2 > 0.5f;
        }
    }

    @Override // Z9.x
    public final void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        switch (this.f28326c) {
            case 0:
                marginLayoutParams.leftMargin = i7;
                return;
            default:
                marginLayoutParams.rightMargin = i7;
                return;
        }
    }

    @Override // Z9.x
    public final void Y(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i10) {
        switch (this.f28326c) {
            case 0:
                if (i7 <= this.f28327d.f15427m) {
                    marginLayoutParams.leftMargin = i10;
                    return;
                }
                return;
            default:
                int i11 = this.f28327d.f15427m;
                if (i7 <= i11) {
                    marginLayoutParams.rightMargin = i11 - i7;
                    return;
                }
                return;
        }
    }

    @Override // Z9.x
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f28326c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // Z9.x
    public final float e(int i7) {
        switch (this.f28326c) {
            case 0:
                float q10 = q();
                return (i7 - q10) / (o() - q10);
            default:
                float f4 = this.f28327d.f15427m;
                return (f4 - i7) / (f4 - o());
        }
    }

    @Override // Z9.x
    public final int n(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f28326c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // Z9.x
    public final int o() {
        switch (this.f28326c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f28327d;
                return Math.max(0, sideSheetBehavior.f15428n + sideSheetBehavior.f15429o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f28327d;
                return Math.max(0, (sideSheetBehavior2.f15427m - sideSheetBehavior2.f15426l) - sideSheetBehavior2.f15429o);
        }
    }

    @Override // Z9.x
    public final int q() {
        switch (this.f28326c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f28327d;
                return (-sideSheetBehavior.f15426l) - sideSheetBehavior.f15429o;
            default:
                return this.f28327d.f15427m;
        }
    }

    @Override // Z9.x
    public final int r() {
        switch (this.f28326c) {
            case 0:
                return this.f28327d.f15429o;
            default:
                return this.f28327d.f15427m;
        }
    }

    @Override // Z9.x
    public final int s() {
        switch (this.f28326c) {
            case 0:
                return -this.f28327d.f15426l;
            default:
                return o();
        }
    }

    @Override // Z9.x
    public final int t(View view) {
        switch (this.f28326c) {
            case 0:
                return view.getRight() + this.f28327d.f15429o;
            default:
                return view.getLeft() - this.f28327d.f15429o;
        }
    }

    @Override // Z9.x
    public final int u(CoordinatorLayout coordinatorLayout) {
        switch (this.f28326c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // Z9.x
    public final int w() {
        switch (this.f28326c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
