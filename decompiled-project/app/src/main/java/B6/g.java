package B6;

import android.database.DataSetObserver;
import androidx.leanback.tab.LeanbackTabLayout;
import e3.AbstractC1084i;
import o.C1770y0;

/* loaded from: classes.dex */
public final class g extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2120a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2121b;

    public g(LeanbackTabLayout leanbackTabLayout) {
        this.f2120a = 2;
        this.f2121b = leanbackTabLayout;
    }

    public /* synthetic */ g(Object obj, int i7) {
        this.f2120a = i7;
        this.f2121b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f2120a) {
            case 0:
                ((o) this.f2121b).i();
                return;
            case 1:
                ((AbstractC1084i) this.f2121b).e();
                return;
            case 2:
                ((LeanbackTabLayout) this.f2121b).o();
                return;
            default:
                C1770y0 c1770y0 = (C1770y0) this.f2121b;
                if (c1770y0.f21637N.isShowing()) {
                    c1770y0.c();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f2120a) {
            case 0:
                ((o) this.f2121b).i();
                return;
            case 1:
                ((AbstractC1084i) this.f2121b).e();
                return;
            case 2:
                ((LeanbackTabLayout) this.f2121b).o();
                return;
            default:
                ((C1770y0) this.f2121b).dismiss();
                return;
        }
    }
}
