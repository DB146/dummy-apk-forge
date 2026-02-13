package i;

import android.view.ViewGroup;
import y1.K;
import y1.S;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f18082b;

    public /* synthetic */ l(v vVar, int i7) {
        this.f18081a = i7;
        this.f18082b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f18081a) {
            case 0:
                v vVar = this.f18082b;
                if ((vVar.f18150o0 & 1) != 0) {
                    vVar.u(0);
                }
                if ((vVar.f18150o0 & 4096) != 0) {
                    vVar.u(108);
                }
                vVar.f18149n0 = false;
                vVar.f18150o0 = 0;
                return;
            default:
                v vVar2 = this.f18082b;
                vVar2.f18121K.showAtLocation(vVar2.f18120J, 55, 0, 0);
                S s3 = vVar2.f18122M;
                if (s3 != null) {
                    s3.b();
                }
                if (!(vVar2.f18124O && (viewGroup = vVar2.f18125P) != null && viewGroup.isLaidOut())) {
                    vVar2.f18120J.setAlpha(1.0f);
                    vVar2.f18120J.setVisibility(0);
                    return;
                }
                vVar2.f18120J.setAlpha(0.0f);
                S a9 = K.a(vVar2.f18120J);
                a9.a(1.0f);
                vVar2.f18122M = a9;
                a9.d(new n(this, 0));
                return;
        }
    }
}
