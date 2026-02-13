package i3;

import A9.N2;
import cc.C0943l0;
import cc.E;
import cc.F;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class y extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f18394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1340B f18395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1340B c1340b, Hb.d dVar) {
        super(2, dVar);
        this.f18395b = c1340b;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new y(this.f18395b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object tVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f18394a;
        C1340B c1340b = this.f18395b;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                C0943l0 c0943l0 = c1340b.f18327m;
                x xVar = new x(c1340b, null);
                this.f18394a = 1;
                obj = F.K(c0943l0, xVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
            tVar = (w) obj;
        } catch (r e2) {
            tVar = new v(e2.f18386a);
        } catch (CancellationException unused) {
            tVar = new t();
        } catch (Throwable th) {
            h3.z.e().d(AbstractC1341C.f18328a, "Unexpected error in WorkerWrapper", th);
            tVar = new t();
        }
        Object u3 = c1340b.f18324h.u(new N2(new L7.o(1, tVar, c1340b), 8));
        kotlin.jvm.internal.l.d(u3, "workDatabase.runInTransa…          }\n            )");
        return u3;
    }
}
