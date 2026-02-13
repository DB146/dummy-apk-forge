package o4;

import ea.C1108c;
import m4.C1549C;
import m4.G0;
import m4.SurfaceHolderCallbackC1596z;

/* renamed from: o4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1803q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1108c f21873b;

    public /* synthetic */ RunnableC1803q(C1108c c1108c, int i7, long j, long j10) {
        this.f21872a = 6;
        this.f21873b = c1108c;
    }

    public /* synthetic */ RunnableC1803q(C1108c c1108c, long j) {
        this.f21872a = 3;
        this.f21873b = c1108c;
    }

    public /* synthetic */ RunnableC1803q(C1108c c1108c, Object obj, int i7) {
        this.f21872a = i7;
        this.f21873b = c1108c;
    }

    public /* synthetic */ RunnableC1803q(C1108c c1108c, String str, long j, long j10) {
        this.f21872a = 1;
        this.f21873b = c1108c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1108c c1108c = this.f21873b;
        int i7 = this.f21872a;
        c1108c.getClass();
        switch (i7) {
            case 0:
                int i10 = n5.D.f21141a;
                n4.f fVar = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a.f19821E;
                fVar.Q(fVar.P(), 1012, new G0(23));
                return;
            case 1:
                int i11 = n5.D.f21141a;
                n4.f fVar2 = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a.f19821E;
                fVar2.Q(fVar2.P(), 1008, new G0(4));
                return;
            case 2:
                int i12 = n5.D.f21141a;
                n4.f fVar3 = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a.f19821E;
                fVar3.Q(fVar3.P(), 1029, new n4.c(20));
                return;
            case 3:
                int i13 = n5.D.f21141a;
                n4.f fVar4 = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a.f19821E;
                fVar4.Q(fVar4.P(), 1010, new G0(25));
                return;
            case 4:
                int i14 = n5.D.f21141a;
                C1549C c1549c = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a;
                c1549c.getClass();
                n4.f fVar5 = c1549c.f19821E;
                fVar5.Q(fVar5.P(), 1007, new n4.c(6));
                return;
            case 5:
                int i15 = n5.D.f21141a;
                n4.f fVar6 = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a.f19821E;
                fVar6.Q(fVar6.P(), 1014, new n4.c(2));
                return;
            default:
                int i16 = n5.D.f21141a;
                n4.f fVar7 = ((SurfaceHolderCallbackC1596z) c1108c.f16830b).f20525a.f19821E;
                fVar7.Q(fVar7.P(), 1011, new n4.c(12));
                return;
        }
    }
}
