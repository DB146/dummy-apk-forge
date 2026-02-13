package Y0;

import A0.L;
import A0.t0;
import B0.C0197q;
import B0.D;
import android.view.WindowInsets;
import java.util.HashMap;
import y0.InterfaceC2345m;
import y1.K;
import y1.p0;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f11075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q qVar, L l10, int i7) {
        super(1);
        this.f11073a = i7;
        this.f11074b = qVar;
        this.f11075c = l10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        WindowInsets g;
        switch (this.f11073a) {
            case 0:
                t0 t0Var = (t0) obj;
                D d10 = t0Var instanceof D ? (D) t0Var : null;
                q qVar = this.f11074b;
                if (d10 != null) {
                    HashMap<j, L> holderToLayoutNode = d10.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    L l10 = this.f11075c;
                    holderToLayoutNode.put(qVar, l10);
                    d10.getAndroidViewsHandler$ui_release().addView(qVar);
                    d10.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(l10, qVar);
                    qVar.setImportantForAccessibility(1);
                    K.n(qVar, new C0197q(d10, l10, d10));
                }
                if (qVar.getView().getParent() != qVar) {
                    qVar.addView(qVar.getView());
                }
                return Db.q.f3365a;
            case 1:
                k.d(this.f11074b, this.f11075c);
                return Db.q.f3365a;
            default:
                q qVar2 = this.f11074b;
                k.d(qVar2, this.f11075c);
                ((D) qVar2.f11107c).L = true;
                int[] iArr = qVar2.f11094B;
                int i7 = iArr[0];
                int i10 = iArr[1];
                qVar2.getView().getLocationOnScreen(iArr);
                long j = qVar2.f11095C;
                long z8 = ((InterfaceC2345m) obj).z();
                qVar2.f11095C = z8;
                p0 p0Var = qVar2.f11096D;
                if (p0Var != null && ((i7 != iArr[0] || i10 != iArr[1] || !V0.k.a(j, z8)) && (g = qVar2.n(p0Var).g()) != null)) {
                    qVar2.getView().dispatchApplyWindowInsets(g);
                }
                return Db.q.f3365a;
        }
    }
}
