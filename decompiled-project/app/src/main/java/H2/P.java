package H2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public J f4605a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4606b;

    /* renamed from: c, reason: collision with root package name */
    public long f4607c;

    /* renamed from: d, reason: collision with root package name */
    public long f4608d;

    /* renamed from: e, reason: collision with root package name */
    public long f4609e;

    /* renamed from: f, reason: collision with root package name */
    public long f4610f;

    public static void b(i0 i0Var) {
        int i7 = i0Var.j;
        if (!i0Var.i() && (i7 & 4) == 0) {
            i0Var.c();
        }
    }

    public abstract boolean a(i0 i0Var, i0 i0Var2, O o10, O o11);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(i0 i0Var) {
        J j = this.f4605a;
        if (j != null) {
            boolean z8 = true;
            i0Var.q(true);
            if (i0Var.f4713h != null && i0Var.f4714i == null) {
                i0Var.f4713h = null;
            }
            i0Var.f4714i = null;
            if ((i0Var.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = j.f4598a;
            recyclerView.n0();
            B4.j jVar = recyclerView.f13657f;
            A4.f fVar = (A4.f) jVar.f2091d;
            D5.i iVar = (D5.i) jVar.f2090c;
            int i7 = jVar.f2089b;
            View view = i0Var.f4707a;
            if (i7 != 1) {
                if (i7 == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    jVar.f2089b = 2;
                    int indexOfChild = ((RecyclerView) iVar.f3256b).indexOfChild(view);
                    if (indexOfChild == -1) {
                        jVar.A(view);
                    } else if (fVar.J(indexOfChild)) {
                        fVar.M(indexOfChild);
                        jVar.A(view);
                        iVar.x(indexOfChild);
                    }
                    if (z8) {
                        i0 M3 = RecyclerView.M(view);
                        Y y10 = recyclerView.f13651c;
                        y10.m(M3);
                        y10.j(M3);
                        if (RecyclerView.f13603P0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.o0(!z8);
                    if (z8 && i0Var.m()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    jVar.f2089b = 0;
                }
            }
            if (((View) jVar.f2093f) != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z8 = false;
            if (z8) {
            }
            recyclerView.o0(!z8);
            if (z8) {
            }
        }
    }

    public abstract void d(i0 i0Var);

    public abstract void e();

    public abstract boolean f();
}
