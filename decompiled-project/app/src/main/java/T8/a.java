package T8;

import F6.j;
import android.os.Handler;
import ea.C1108c;
import m4.C1549C;
import m4.C1589s;
import m4.SurfaceHolderCallbackC1596z;
import n5.D;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9368c;

    public /* synthetic */ a(int i7, Object obj, boolean z8) {
        this.f9366a = i7;
        this.f9368c = obj;
        this.f9367b = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8 = this.f9367b;
        Object obj = this.f9368c;
        switch (this.f9366a) {
            case 0:
                ((b) obj).f9369a.e(z8);
                return;
            case 1:
                g gVar = (g) ((j) obj).f4156b;
                gVar.f9375b = z8;
                if (gVar.f9374a) {
                    ((Handler) gVar.f9378e).removeCallbacksAndMessages(null);
                    if (gVar.f9375b) {
                        ((Handler) gVar.f9378e).postDelayed((p9.f) gVar.f9379f, 300000L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C1108c c1108c = (C1108c) obj;
                c1108c.getClass();
                int i7 = D.f21141a;
                C1549C c1549c = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a;
                if (c1549c.f19863q0 == z8) {
                    return;
                }
                c1549c.f19863q0 = z8;
                c1549c.f19877z.e(23, new C1589s(1, z8));
                return;
            default:
                ((q9.f) obj).f23567c.e(z8);
                return;
        }
    }
}
