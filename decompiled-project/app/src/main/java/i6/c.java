package i6;

import Z9.x;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import h3.o;
import i1.AbstractC1291b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class c extends x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1291b f18437d;

    public /* synthetic */ c(AbstractC1291b abstractC1291b, int i7) {
        this.f18436c = i7;
        this.f18437d = abstractC1291b;
    }

    @Override // Z9.x
    public final void J(int i7) {
        switch (this.f18436c) {
            case 0:
                if (i7 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f18437d;
                    if (bottomSheetBehavior.f15191K) {
                        bottomSheetBehavior.J(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f18437d;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.w(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // Z9.x
    public final void K(View view, int i7, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f18436c) {
            case 0:
                ((BottomSheetBehavior) this.f18437d).y(i10);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f18437d;
                WeakReference weakReference = sideSheetBehavior.f15431q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f15418a.Y(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f15436v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f15418a.e(i7);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw o.j(it);
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.f15418a.C(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f15418a.o()) < java.lang.Math.abs(r7 - r0.f15418a.q())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r7 > r4.f15185E) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.C()) < java.lang.Math.abs(r6.getTop() - r4.f15185E)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f15184D) < java.lang.Math.abs(r7 - r4.f15187G)) goto L27;
     */
    @Override // Z9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(View view, float f4, float f10) {
        switch (this.f18436c) {
            case 0:
                int i7 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f18437d;
                if (f10 < 0.0f) {
                    if (!bottomSheetBehavior.f15208b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i7 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.L(view, i7, true);
                    return;
                }
                if (bottomSheetBehavior.f15189I && bottomSheetBehavior.K(view, f10)) {
                    if (Math.abs(f4) >= Math.abs(f10) || f10 <= bottomSheetBehavior.f15212d) {
                        if (view.getTop() <= (bottomSheetBehavior.C() + bottomSheetBehavior.f15199T) / 2) {
                            if (!bottomSheetBehavior.f15208b) {
                                break;
                            }
                            i7 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.L(view, i7, true);
                            return;
                        }
                    }
                    i7 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.L(view, i7, true);
                    return;
                }
                if (f10 == 0.0f || Math.abs(f4) > Math.abs(f10)) {
                    int top2 = view.getTop();
                    if (bottomSheetBehavior.f15208b) {
                        break;
                    } else {
                        int i10 = bottomSheetBehavior.f15185E;
                        if (top2 < i10) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.f15187G)) {
                                bottomSheetBehavior.getClass();
                            }
                            i7 = 3;
                        } else {
                            if (Math.abs(top2 - i10) < Math.abs(top2 - bottomSheetBehavior.f15187G)) {
                                bottomSheetBehavior.getClass();
                            }
                            i7 = 4;
                        }
                    }
                } else {
                    if (!bottomSheetBehavior.f15208b) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - bottomSheetBehavior.f15185E) < Math.abs(top3 - bottomSheetBehavior.f15187G)) {
                            bottomSheetBehavior.getClass();
                        }
                    }
                    i7 = 4;
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.L(view, i7, true);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f18437d;
                int i11 = 3;
                if (!sideSheetBehavior.f15418a.B(f4)) {
                    if (sideSheetBehavior.f15418a.R(view, f4)) {
                        if (!sideSheetBehavior.f15418a.D(f4, f10)) {
                            break;
                        }
                        i11 = 5;
                    } else {
                        if (f4 == 0.0f || Math.abs(f4) <= Math.abs(f10)) {
                            int left = view.getLeft();
                            break;
                        }
                        i11 = 5;
                    }
                }
                sideSheetBehavior.y(view, i11, true);
                return;
        }
    }

    @Override // Z9.x
    public final boolean W(View view, int i7) {
        WeakReference weakReference;
        switch (this.f18436c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f18437d;
                int i10 = bottomSheetBehavior.L;
                if (i10 == 1 || bottomSheetBehavior.f15209b0) {
                    return false;
                }
                if (i10 == 3 && bottomSheetBehavior.f15205Z == i7) {
                    WeakReference weakReference2 = bottomSheetBehavior.f15201V;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f15200U;
                return weakReference3 != null && weakReference3.get() == view;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f18437d;
                return (sideSheetBehavior.f15424h == 1 || (weakReference = sideSheetBehavior.f15430p) == null || weakReference.get() != view) ? false : true;
        }
    }

    @Override // Z9.x
    public final int g(View view, int i7) {
        switch (this.f18436c) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f18437d;
                return O5.b.j(i7, sideSheetBehavior.f15418a.s(), sideSheetBehavior.f15418a.r());
        }
    }

    @Override // Z9.x
    public final int h(View view, int i7) {
        switch (this.f18436c) {
            case 0:
                return O5.b.j(i7, ((BottomSheetBehavior) this.f18437d).C(), y());
            default:
                return view.getTop();
        }
    }

    @Override // Z9.x
    public int x(View view) {
        switch (this.f18436c) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f18437d;
                return sideSheetBehavior.f15426l + sideSheetBehavior.f15429o;
            default:
                return super.x(view);
        }
    }

    @Override // Z9.x
    public int y() {
        switch (this.f18436c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f18437d;
                return bottomSheetBehavior.f15189I ? bottomSheetBehavior.f15199T : bottomSheetBehavior.f15187G;
            default:
                return super.y();
        }
    }
}
