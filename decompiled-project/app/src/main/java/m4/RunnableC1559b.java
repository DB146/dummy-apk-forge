package m4;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import o4.C1791e;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1559b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20231c;

    public /* synthetic */ RunnableC1559b(Object obj, int i7, int i10) {
        this.f20229a = i10;
        this.f20231c = obj;
        this.f20230b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20229a) {
            case 0:
                C1563d c1563d = ((C1561c) this.f20231c).f20263b;
                c1563d.getClass();
                int i7 = this.f20230b;
                if (i7 == -3 || i7 == -2) {
                    if (i7 != -2) {
                        C1791e c1791e = c1563d.f20334d;
                        if (!(c1791e != null && c1791e.f21839a == 1)) {
                            c1563d.b(3);
                            return;
                        }
                    }
                    SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = c1563d.f20333c;
                    if (surfaceHolderCallbackC1596z != null) {
                        C1549C c1549c = surfaceHolderCallbackC1596z.f20525a;
                        boolean c02 = c1549c.c0();
                        c1549c.B0(c02, 0, c02 ? 2 : 1);
                    }
                    c1563d.b(2);
                    return;
                }
                if (i7 == -1) {
                    SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z2 = c1563d.f20333c;
                    if (surfaceHolderCallbackC1596z2 != null) {
                        C1549C c1549c2 = surfaceHolderCallbackC1596z2.f20525a;
                        boolean c03 = c1549c2.c0();
                        c1549c2.B0(c03, -1, c03 ? 2 : 1);
                    }
                    c1563d.a();
                    return;
                }
                if (i7 != 1) {
                    h3.o.u(i7, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
                c1563d.b(1);
                SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z3 = c1563d.f20333c;
                if (surfaceHolderCallbackC1596z3 != null) {
                    C1549C c1549c3 = surfaceHolderCallbackC1596z3.f20525a;
                    c1549c3.B0(c1549c3.c0(), 1, 1);
                    return;
                }
                return;
            case 1:
                ((n1.b) this.f20231c).i(this.f20230b);
                return;
            case 2:
                ((ya.j) this.f20231c).u0(this.f20230b - 1);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f20231c;
                View view = (View) sideSheetBehavior.f15430p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, this.f20230b, false);
                    return;
                }
                return;
        }
    }
}
