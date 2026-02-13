package i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import ea.C1108c;
import h3.H;
import java.util.WeakHashMap;
import y1.AbstractC2377z;
import y1.K;

/* loaded from: classes.dex */
public final class n extends H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18085c;

    public /* synthetic */ n(Object obj, int i7) {
        this.f18084b = i7;
        this.f18085c = obj;
    }

    @Override // y1.T
    public final void a() {
        Object obj = this.f18085c;
        switch (this.f18084b) {
            case 0:
                v vVar = ((l) obj).f18082b;
                vVar.f18120J.setAlpha(1.0f);
                vVar.f18122M.d(null);
                vVar.f18122M = null;
                return;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f18120J.setAlpha(1.0f);
                vVar2.f18122M.d(null);
                vVar2.f18122M = null;
                return;
            default:
                C1108c c1108c = (C1108c) obj;
                ((v) c1108c.f16830b).f18120J.setVisibility(8);
                v vVar3 = (v) c1108c.f16830b;
                PopupWindow popupWindow = vVar3.f18121K;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f18120J.getParent() instanceof View) {
                    View view = (View) vVar3.f18120J.getParent();
                    WeakHashMap weakHashMap = K.f26642a;
                    AbstractC2377z.c(view);
                }
                vVar3.f18120J.e();
                vVar3.f18122M.d(null);
                vVar3.f18122M = null;
                ViewGroup viewGroup = vVar3.f18125P;
                WeakHashMap weakHashMap2 = K.f26642a;
                AbstractC2377z.c(viewGroup);
                return;
        }
    }

    @Override // h3.H, y1.T
    public void c() {
        Object obj = this.f18085c;
        switch (this.f18084b) {
            case 0:
                ((l) obj).f18082b.f18120J.setVisibility(0);
                return;
            case 1:
                v vVar = (v) obj;
                vVar.f18120J.setVisibility(0);
                if (vVar.f18120J.getParent() instanceof View) {
                    View view = (View) vVar.f18120J.getParent();
                    WeakHashMap weakHashMap = K.f26642a;
                    AbstractC2377z.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
