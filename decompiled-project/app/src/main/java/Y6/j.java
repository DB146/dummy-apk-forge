package Y6;

import cc.F;
import f7.InterfaceC1142a;
import java.util.concurrent.Executor;
import p7.p;

/* loaded from: classes.dex */
public final class j implements p7.c {

    /* renamed from: b, reason: collision with root package name */
    public static final j f12049b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f12050c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f12051d = new j(2);

    /* renamed from: e, reason: collision with root package name */
    public static final j f12052e = new j(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12053a;

    public /* synthetic */ j(int i7) {
        this.f12053a = i7;
    }

    @Override // p7.c
    public final Object g(T6.a aVar) {
        switch (this.f12053a) {
            case 0:
                Object g = aVar.g(new p(InterfaceC1142a.class, Executor.class));
                kotlin.jvm.internal.l.d(g, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g);
            case 1:
                Object g2 = aVar.g(new p(f7.c.class, Executor.class));
                kotlin.jvm.internal.l.d(g2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g2);
            case 2:
                Object g10 = aVar.g(new p(f7.b.class, Executor.class));
                kotlin.jvm.internal.l.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g10);
            default:
                Object g11 = aVar.g(new p(f7.d.class, Executor.class));
                kotlin.jvm.internal.l.d(g11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g11);
        }
    }
}
