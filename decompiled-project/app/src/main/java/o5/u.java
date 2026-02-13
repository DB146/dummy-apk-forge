package o5;

import P4.B;
import java.io.Serializable;
import m4.G0;
import m4.SurfaceHolderCallbackC1596z;
import n5.D;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ha.g f22043b;

    public /* synthetic */ u(ha.g gVar, int i7, long j) {
        this.f22042a = 0;
        this.f22043b = gVar;
    }

    public /* synthetic */ u(ha.g gVar, long j, int i7) {
        this.f22042a = 4;
        this.f22043b = gVar;
    }

    public /* synthetic */ u(ha.g gVar, Serializable serializable, int i7) {
        this.f22042a = i7;
        this.f22043b = gVar;
    }

    public /* synthetic */ u(ha.g gVar, String str, long j, long j10) {
        this.f22042a = 3;
        this.f22043b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ha.g gVar = this.f22043b;
        int i7 = this.f22042a;
        gVar.getClass();
        switch (i7) {
            case 0:
                int i10 = D.f21141a;
                n4.f fVar = ((SurfaceHolderCallbackC1596z) gVar.f17916c).f20525a.f19821E;
                fVar.Q(fVar.M((B) fVar.f21089d.f9324e), 1018, new G0(28));
                return;
            case 1:
                int i11 = D.f21141a;
                n4.f fVar2 = ((SurfaceHolderCallbackC1596z) gVar.f17916c).f20525a.f19821E;
                fVar2.Q(fVar2.P(), 1019, new n4.c(11));
                return;
            case 2:
                int i12 = D.f21141a;
                n4.f fVar3 = ((SurfaceHolderCallbackC1596z) gVar.f17916c).f20525a.f19821E;
                fVar3.Q(fVar3.P(), 1030, new n4.c(19));
                return;
            case 3:
                int i13 = D.f21141a;
                n4.f fVar4 = ((SurfaceHolderCallbackC1596z) gVar.f17916c).f20525a.f19821E;
                fVar4.Q(fVar4.P(), 1016, new G0(19));
                return;
            default:
                int i14 = D.f21141a;
                n4.f fVar5 = ((SurfaceHolderCallbackC1596z) gVar.f17916c).f20525a.f19821E;
                fVar5.Q(fVar5.M((B) fVar5.f21089d.f9324e), 1021, new n4.c(3));
                return;
        }
    }
}
