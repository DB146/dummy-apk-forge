package A9;

import android.view.View;
import com.kt.apps.core.base.leanback.HorizontalGridView;

/* loaded from: classes2.dex */
public final class A0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H2.i0 f733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f734c;

    public /* synthetic */ A0(Object obj, H2.i0 i0Var, int i7) {
        this.f732a = i7;
        this.f734c = obj;
        this.f733b = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f732a) {
            case 0:
                B0 b02 = (B0) this.f734c;
                E0 e02 = (E0) b02.k;
                InterfaceC0149w interfaceC0149w = e02.f1467n;
                if (interfaceC0149w != null) {
                    C0131r1 c0131r1 = (C0131r1) this.f733b;
                    interfaceC0149w.b(c0131r1.f1355v, c0131r1.f1356w, e02, e02.f1460d);
                }
                ((F0) b02.f767l).getClass();
                return;
            case 1:
                C0084f1 c0084f1 = (C0084f1) this.f734c;
                if (c0084f1.f1154s != null) {
                    return;
                }
                V0 v02 = (V0) c0084f1.f1140b.getAdapter();
                C0080e1 c0080e1 = (C0080e1) this.f733b;
                C0088g1 c0088g1 = v02.k;
                if (c0088g1 != null) {
                    c0088g1.a(c0080e1.f1118u);
                    return;
                }
                return;
            case 2:
                B0 b03 = (B0) this.f734c;
                HorizontalGridView horizontalGridView = ((C0147v1) b03.k).f1433o;
                C0131r1 c0131r12 = (C0131r1) this.f733b;
                C0131r1 c0131r13 = (C0131r1) horizontalGridView.L(c0131r12.f4707a);
                C0147v1 c0147v1 = (C0147v1) b03.k;
                InterfaceC0149w interfaceC0149w2 = c0147v1.f1467n;
                if (interfaceC0149w2 != null) {
                    interfaceC0149w2.b(c0131r12.f1355v, c0131r13.f1356w, c0147v1, (C0139t1) c0147v1.f1460d);
                    return;
                }
                return;
            default:
                N1 n12 = ((s3) this.f734c).j.f1417f;
                if (n12 != null) {
                    C0131r1 c0131r14 = (C0131r1) this.f733b;
                    n12.b(c0131r14.f1355v, c0131r14.f1356w, null, null);
                    return;
                }
                return;
        }
    }
}
