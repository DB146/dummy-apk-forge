package o5;

import P4.B;
import m4.C1549C;
import m4.G0;
import m4.SurfaceHolderCallbackC1596z;
import n4.C1703a;
import n5.D;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ha.g f22045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q4.d f22046c;

    public /* synthetic */ v(ha.g gVar, q4.d dVar, int i7) {
        this.f22044a = i7;
        this.f22045b = gVar;
        this.f22046c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22044a) {
            case 0:
                ha.g gVar = this.f22045b;
                q4.d dVar = this.f22046c;
                gVar.getClass();
                synchronized (dVar) {
                }
                SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = (SurfaceHolderCallbackC1596z) gVar.f17916c;
                int i7 = D.f21141a;
                C1549C c1549c = surfaceHolderCallbackC1596z.f20525a;
                n4.f fVar = c1549c.f19821E;
                C1703a M3 = fVar.M((B) fVar.f21089d.f9324e);
                fVar.Q(M3, 1020, new Q9.a(M3, dVar, 26));
                c1549c.f19844b0 = null;
                c1549c.f19859m0 = null;
                return;
            default:
                ha.g gVar2 = this.f22045b;
                gVar2.getClass();
                int i10 = D.f21141a;
                SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z2 = (SurfaceHolderCallbackC1596z) gVar2.f17916c;
                q4.d dVar2 = this.f22046c;
                C1549C c1549c2 = surfaceHolderCallbackC1596z2.f20525a;
                c1549c2.f19859m0 = dVar2;
                n4.f fVar2 = c1549c2.f19821E;
                fVar2.Q(fVar2.P(), 1015, new G0(17));
                return;
        }
    }
}
