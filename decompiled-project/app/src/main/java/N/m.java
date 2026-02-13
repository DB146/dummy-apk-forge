package N;

import Q.C0480b;
import Q.C0506o;
import x.i0;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7059a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y.e f7060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7061c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0411a c0411a, z zVar, H h10, Y.e eVar, int i7) {
        super(2);
        this.f7062d = c0411a;
        this.f7063e = zVar;
        this.f7064f = h10;
        this.f7060b = eVar;
        this.f7061c = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i0 i0Var, w.H h10, w.I i7, Y.e eVar, int i10) {
        super(2);
        this.f7062d = i0Var;
        this.f7063e = h10;
        this.f7064f = i7;
        this.f7060b = eVar;
        this.f7061c = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7059a) {
            case 0:
                ((Number) obj2).intValue();
                int u3 = C0480b.u(this.f7061c | 1);
                Y.e eVar = this.f7060b;
                n.a((C0411a) this.f7062d, (z) this.f7063e, (H) this.f7064f, eVar, (C0506o) obj, u3);
                return Db.q.f3365a;
            default:
                ((Number) obj2).intValue();
                int u10 = C0480b.u(this.f7061c | 1);
                Y.e eVar2 = this.f7060b;
                androidx.compose.animation.b.c((i0) this.f7062d, (w.H) this.f7063e, (w.I) this.f7064f, eVar2, (C0506o) obj, u10);
                return Db.q.f3365a;
        }
    }
}
