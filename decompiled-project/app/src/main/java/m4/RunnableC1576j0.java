package m4;

import android.util.Pair;
import ea.C1111f;

/* renamed from: m4.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1576j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1111f f20413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f20414c;

    public /* synthetic */ RunnableC1576j0(C1111f c1111f, Pair pair, int i7) {
        this.f20412a = i7;
        this.f20413b = c1111f;
        this.f20414c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20412a) {
            case 0:
                n4.f fVar = (n4.f) ((C1584n0) this.f20413b.f16838c).f20449i;
                Pair pair = this.f20414c;
                fVar.s(((Integer) pair.first).intValue(), (P4.B) pair.second);
                return;
            case 1:
                n4.f fVar2 = (n4.f) ((C1584n0) this.f20413b.f16838c).f20449i;
                Pair pair2 = this.f20414c;
                fVar2.f(((Integer) pair2.first).intValue(), (P4.B) pair2.second);
                return;
            default:
                n4.f fVar3 = (n4.f) ((C1584n0) this.f20413b.f16838c).f20449i;
                Pair pair3 = this.f20414c;
                fVar3.C(((Integer) pair3.first).intValue(), (P4.B) pair3.second);
                return;
        }
    }
}
