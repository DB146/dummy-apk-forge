package m4;

import P4.C0474w;
import android.util.Pair;
import ea.C1111f;

/* renamed from: m4.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1578k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1111f f20418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f20419c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0474w f20420d;

    public /* synthetic */ RunnableC1578k0(C1111f c1111f, Pair pair, C0474w c0474w, int i7) {
        this.f20417a = i7;
        this.f20418b = c1111f;
        this.f20419c = pair;
        this.f20420d = c0474w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20417a) {
            case 0:
                n4.f fVar = (n4.f) ((C1584n0) this.f20418b.f16838c).f20449i;
                Pair pair = this.f20419c;
                fVar.I(((Integer) pair.first).intValue(), (P4.B) pair.second, this.f20420d);
                return;
            default:
                n4.f fVar2 = (n4.f) ((C1584n0) this.f20418b.f16838c).f20449i;
                Pair pair2 = this.f20419c;
                int intValue = ((Integer) pair2.first).intValue();
                P4.B b2 = (P4.B) pair2.second;
                b2.getClass();
                fVar2.H(intValue, b2, this.f20420d);
                return;
        }
    }
}
