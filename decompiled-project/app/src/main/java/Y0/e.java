package Y0;

import A0.L;
import A0.T;
import Eb.w;
import android.view.ViewGroup;
import java.util.List;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class e implements InterfaceC2316A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f11078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f11079b;

    public e(q qVar, L l10) {
        this.f11078a = qVar;
        this.f11079b = l10;
    }

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(T t5, List list, long j) {
        q qVar = this.f11078a;
        int childCount = qVar.getChildCount();
        w wVar = w.f3892a;
        if (childCount == 0) {
            return t5.Q(V0.a.j(j), V0.a.i(j), wVar, b.f11069c);
        }
        if (V0.a.j(j) != 0) {
            qVar.getChildAt(0).setMinimumWidth(V0.a.j(j));
        }
        if (V0.a.i(j) != 0) {
            qVar.getChildAt(0).setMinimumHeight(V0.a.i(j));
        }
        int j10 = V0.a.j(j);
        int h10 = V0.a.h(j);
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        kotlin.jvm.internal.l.b(layoutParams);
        int k = j.k(qVar, j10, h10, layoutParams.width);
        int i7 = V0.a.i(j);
        int g = V0.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = qVar.getLayoutParams();
        kotlin.jvm.internal.l.b(layoutParams2);
        qVar.measure(k, j.k(qVar, i7, g, layoutParams2.height));
        return t5.Q(qVar.getMeasuredWidth(), qVar.getMeasuredHeight(), wVar, new c(qVar, this.f11079b, 1));
    }
}
