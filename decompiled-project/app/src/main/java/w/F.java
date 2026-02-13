package w;

import x.c0;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f25499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(G g, int i7) {
        super(1);
        this.f25498a = i7;
        this.f25499b = g;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f25498a) {
            case 0:
                c0 c0Var = (c0) obj;
                x xVar = x.f25625a;
                x xVar2 = x.f25626b;
                boolean b2 = c0Var.b(xVar, xVar2);
                x.Q q10 = null;
                G g = this.f25499b;
                if (b2) {
                    C2194v c2194v = g.f25503F.f25510a.f25541b;
                    if (c2194v != null) {
                        q10 = c2194v.f25620c;
                    }
                } else if (c0Var.b(xVar2, x.f25627c)) {
                    C2194v c2194v2 = g.f25504G.f25513a.f25541b;
                    if (c2194v2 != null) {
                        q10 = c2194v2.f25620c;
                    }
                } else {
                    q10 = AbstractC2173C.f25490d;
                }
                return q10 == null ? AbstractC2173C.f25490d : q10;
            default:
                c0 c0Var2 = (c0) obj;
                x xVar3 = x.f25625a;
                x xVar4 = x.f25626b;
                boolean b10 = c0Var2.b(xVar3, xVar4);
                G g2 = this.f25499b;
                if (b10) {
                    H h10 = g2.f25503F;
                    return AbstractC2173C.f25489c;
                }
                if (!c0Var2.b(xVar4, x.f25627c)) {
                    return AbstractC2173C.f25489c;
                }
                V v10 = g2.f25504G.f25513a;
                return AbstractC2173C.f25489c;
        }
    }
}
