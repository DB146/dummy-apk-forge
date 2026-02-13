package q8;

import cc.F;
import f7.InterfaceC1142a;
import f7.b;
import f7.d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import p7.c;
import p7.p;

/* renamed from: q8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1906a implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final C1906a f23546b = new C1906a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1906a f23547c = new C1906a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1906a f23548d = new C1906a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C1906a f23549e = new C1906a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23550a;

    public /* synthetic */ C1906a(int i7) {
        this.f23550a = i7;
    }

    @Override // p7.c
    public final Object g(T6.a aVar) {
        switch (this.f23550a) {
            case 0:
                Object g = aVar.g(new p(InterfaceC1142a.class, Executor.class));
                l.d(g, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g);
            case 1:
                Object g2 = aVar.g(new p(f7.c.class, Executor.class));
                l.d(g2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g2);
            case 2:
                Object g10 = aVar.g(new p(b.class, Executor.class));
                l.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g10);
            default:
                Object g11 = aVar.g(new p(d.class, Executor.class));
                l.d(g11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.o((Executor) g11);
        }
    }
}
