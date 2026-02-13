package A9;

import com.kt.apps.core.base.leanback.VerticalGridView;

/* renamed from: A9.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0161z extends H2.L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1485a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1486b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W1.C f1487c;

    public /* synthetic */ C0161z(int i7, W1.C c10) {
        this.f1485a = i7;
        this.f1487c = c10;
    }

    @Override // H2.L
    public final void a() {
        switch (this.f1485a) {
            case 0:
                boolean z8 = this.f1486b;
                A2 a22 = (A2) this.f1487c;
                if (z8) {
                    this.f1486b = false;
                    a22.f752o0.f4599a.unregisterObserver(this);
                }
                VerticalGridView verticalGridView = a22.f751n0;
                if (verticalGridView != null) {
                    verticalGridView.setSelectedPosition(a22.f753p0);
                    return;
                }
                return;
            default:
                if (this.f1486b) {
                    this.f1486b = false;
                    ((c2.w) this.f1487c).f14247n0.f4599a.unregisterObserver(this);
                    return;
                }
                return;
        }
    }

    @Override // H2.L
    public final void c(int i7, int i10) {
        switch (this.f1485a) {
            case 0:
                boolean z8 = this.f1486b;
                A2 a22 = (A2) this.f1487c;
                if (z8) {
                    this.f1486b = false;
                    a22.f752o0.f4599a.unregisterObserver(this);
                }
                VerticalGridView verticalGridView = a22.f751n0;
                if (verticalGridView != null) {
                    verticalGridView.setSelectedPosition(a22.f753p0);
                    return;
                }
                return;
            default:
                if (this.f1486b) {
                    this.f1486b = false;
                    ((c2.w) this.f1487c).f14247n0.f4599a.unregisterObserver(this);
                    return;
                }
                return;
        }
    }
}
