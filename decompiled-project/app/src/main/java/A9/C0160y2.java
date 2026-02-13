package A9;

import com.kt.apps.core.base.leanback.VerticalGridView;

/* renamed from: A9.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0160y2 extends Q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1484d = 0;

    public C0160y2(A2 a22) {
        super(a22);
        this.f935a = true;
    }

    public /* synthetic */ C0160y2(W1.C c10) {
        super(c10);
    }

    private final void h(boolean z8) {
    }

    @Override // A9.Q
    public boolean a() {
        switch (this.f1484d) {
            case 0:
                VerticalGridView verticalGridView = ((A2) this.f936b).f751n0;
                return (verticalGridView == null || verticalGridView.getScrollState() == 0) ? false : true;
            default:
                return super.a();
        }
    }

    @Override // A9.Q
    public void b() {
        switch (this.f1484d) {
            case 0:
                ((A2) this.f936b).r0();
                return;
            default:
                return;
        }
    }

    @Override // A9.Q
    public void c() {
        switch (this.f1484d) {
            case 0:
                ((A2) this.f936b).s0();
                return;
            default:
                return;
        }
    }

    @Override // A9.Q
    public void d() {
        switch (this.f1484d) {
            case 0:
                A2 a22 = (A2) this.f936b;
                VerticalGridView verticalGridView = a22.f751n0;
                if (verticalGridView != null) {
                    verticalGridView.setPruneChild(false);
                    a22.f751n0.setFocusSearchDisabled(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // A9.Q
    public void e(int i7) {
        switch (this.f1484d) {
            case 0:
                ((A2) this.f936b).v0(i7);
                return;
            default:
                return;
        }
    }

    @Override // A9.Q
    public final void f(boolean z8) {
        switch (this.f1484d) {
            case 0:
                ((A2) this.f936b).w0(z8);
                return;
            default:
                return;
        }
    }

    @Override // A9.Q
    public void g(boolean z8) {
        switch (this.f1484d) {
            case 0:
                A2 a22 = (A2) this.f936b;
                a22.f761x0 = z8;
                VerticalGridView verticalGridView = a22.f751n0;
                if (verticalGridView != null) {
                    int childCount = verticalGridView.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        C0131r1 c0131r1 = (C0131r1) verticalGridView.L(verticalGridView.getChildAt(i7));
                        boolean z10 = a22.f761x0;
                        AbstractC0156x2 abstractC0156x2 = (AbstractC0156x2) c0131r1.f1354u;
                        abstractC0156x2.getClass();
                        C0152w2 l10 = AbstractC0156x2.l(c0131r1.f1355v);
                        l10.f1463h = z10;
                        abstractC0156x2.r(l10, z10);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
