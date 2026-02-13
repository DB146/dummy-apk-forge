package w;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f25496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(G g, long j, int i7) {
        super(1);
        this.f25495a = i7;
        this.f25496b = g;
        this.f25497c = j;
    }

    /* JADX WARN: Type inference failed for: r15v14, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r15v24, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r15v6, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        int ordinal;
        switch (this.f25495a) {
            case 0:
                G g = this.f25496b;
                g.getClass();
                int ordinal2 = ((x) obj).ordinal();
                long j = this.f25497c;
                if (ordinal2 == 0) {
                    C2194v c2194v = g.f25503F.f25510a.f25541b;
                    if (c2194v != null) {
                        j = ((V0.k) c2194v.f25619b.invoke(new V0.k(j))).f9981a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new Db.d(1);
                    }
                    C2194v c2194v2 = g.f25504G.f25513a.f25541b;
                    if (c2194v2 != null) {
                        j = ((V0.k) c2194v2.f25619b.invoke(new V0.k(j))).f9981a;
                    }
                }
                return new V0.k(j);
            default:
                x xVar = (x) obj;
                G g2 = this.f25496b;
                long j10 = 0;
                if (g2.f25508K != null && g2.p0() != null && !kotlin.jvm.internal.l.a(g2.f25508K, g2.p0()) && (ordinal = xVar.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new Db.d(1);
                    }
                    C2194v c2194v3 = g2.f25504G.f25513a.f25541b;
                    if (c2194v3 != null) {
                        long j11 = this.f25497c;
                        long j12 = ((V0.k) c2194v3.f25619b.invoke(new V0.k(j11))).f9981a;
                        c0.e p02 = g2.p0();
                        kotlin.jvm.internal.l.b(p02);
                        V0.l lVar = V0.l.f9982a;
                        long a9 = p02.a(j11, j12, lVar);
                        c0.e eVar = g2.f25508K;
                        kotlin.jvm.internal.l.b(eVar);
                        j10 = V0.i.b(a9, eVar.a(j11, j12, lVar));
                    }
                }
                return new V0.i(j10);
        }
    }
}
