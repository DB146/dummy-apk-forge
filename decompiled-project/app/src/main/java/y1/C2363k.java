package y1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: y1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2363k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f26718a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f26719b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f26720c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26721d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f26722e;

    public C2363k(ViewGroup viewGroup) {
        this.f26720c = viewGroup;
    }

    public final boolean a(float f4, float f10, boolean z8) {
        ViewParent e2;
        if (!this.f26721d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return e2.onNestedFling(this.f26720c, f4, f10, z8);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f4, float f10) {
        ViewParent e2;
        if (!this.f26721d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return e2.onNestedPreFling(this.f26720c, f4, f10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent e2;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f26721d || (e2 = e(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f26720c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f26722e == null) {
                this.f26722e = new int[2];
            }
            iArr3 = this.f26722e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e2 instanceof InterfaceC2364l) {
            ((InterfaceC2364l) e2).c(viewGroup, i7, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                e2.onNestedPreScroll(viewGroup, i7, i10, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent e2;
        int i14;
        int i15;
        int[] iArr3;
        if (!this.f26721d || (e2 = e(i13)) == null) {
            return false;
        }
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f26720c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i14 = iArr[0];
            i15 = iArr[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f26722e == null) {
                this.f26722e = new int[2];
            }
            int[] iArr4 = this.f26722e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e2 instanceof InterfaceC2365m) {
            ((InterfaceC2365m) e2).g(viewGroup, i7, i10, i11, i12, i13, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i11;
            iArr3[1] = iArr3[1] + i12;
            if (e2 instanceof InterfaceC2364l) {
                ((InterfaceC2364l) e2).h(viewGroup, i7, i10, i11, i12, i13);
            } else if (i13 == 0) {
                try {
                    e2.onNestedScroll(viewGroup, i7, i10, i11, i12);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i14;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    public final ViewParent e(int i7) {
        if (i7 == 0) {
            return this.f26718a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f26719b;
    }

    public final boolean f(int i7) {
        return e(i7) != null;
    }

    public final boolean g(int i7, int i10) {
        boolean onStartNestedScroll;
        if (f(i10)) {
            return true;
        }
        if (this.f26721d) {
            View view = this.f26720c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z8 = parent instanceof InterfaceC2364l;
                if (z8) {
                    onStartNestedScroll = ((InterfaceC2364l) parent).i(view2, view, i7, i10);
                } else {
                    if (i10 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i7);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i10 == 0) {
                        this.f26718a = parent;
                    } else if (i10 == 1) {
                        this.f26719b = parent;
                    }
                    if (z8) {
                        ((InterfaceC2364l) parent).a(view2, view, i7, i10);
                    } else if (i10 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i7);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void h(int i7) {
        ViewParent e2 = e(i7);
        if (e2 != null) {
            boolean z8 = e2 instanceof InterfaceC2364l;
            ViewGroup viewGroup = this.f26720c;
            if (z8) {
                ((InterfaceC2364l) e2).b(viewGroup, i7);
            } else if (i7 == 0) {
                try {
                    e2.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i7 == 0) {
                this.f26718a = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f26719b = null;
            }
        }
    }
}
