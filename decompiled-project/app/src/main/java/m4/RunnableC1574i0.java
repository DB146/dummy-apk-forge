package m4;

import P4.C0474w;
import android.util.Pair;
import ea.C1111f;

/* renamed from: m4.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1574i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1111f f20400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f20401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P4.r f20402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0474w f20403e;

    public /* synthetic */ RunnableC1574i0(C1111f c1111f, Pair pair, P4.r rVar, C0474w c0474w, int i7) {
        this.f20399a = i7;
        this.f20400b = c1111f;
        this.f20401c = pair;
        this.f20402d = rVar;
        this.f20403e = c0474w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20399a) {
            case 0:
                n4.f fVar = (n4.f) ((C1584n0) this.f20400b.f16838c).f20449i;
                Pair pair = this.f20401c;
                fVar.F(((Integer) pair.first).intValue(), (P4.B) pair.second, this.f20402d, this.f20403e);
                return;
            case 1:
                n4.f fVar2 = (n4.f) ((C1584n0) this.f20400b.f16838c).f20449i;
                Pair pair2 = this.f20401c;
                fVar2.E(((Integer) pair2.first).intValue(), (P4.B) pair2.second, this.f20402d, this.f20403e);
                return;
            default:
                n4.f fVar3 = (n4.f) ((C1584n0) this.f20400b.f16838c).f20449i;
                Pair pair3 = this.f20401c;
                fVar3.B(((Integer) pair3.first).intValue(), (P4.B) pair3.second, this.f20402d, this.f20403e);
                return;
        }
    }
}
