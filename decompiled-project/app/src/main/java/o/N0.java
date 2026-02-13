package o;

import androidx.appcompat.widget.Toolbar;
import n.C1680n;

/* loaded from: classes.dex */
public final /* synthetic */ class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f21415b;

    public /* synthetic */ N0(Toolbar toolbar, int i7) {
        this.f21414a = i7;
        this.f21415b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21414a) {
            case 0:
                P0 p02 = this.f21415b.f13084c0;
                C1680n c1680n = p02 == null ? null : p02.f21417b;
                if (c1680n != null) {
                    c1680n.collapseActionView();
                    return;
                }
                return;
            default:
                this.f21415b.n();
                return;
        }
    }
}
