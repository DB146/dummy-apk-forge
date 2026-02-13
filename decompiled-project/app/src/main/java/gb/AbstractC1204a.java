package gb;

import java.util.Objects;
import jb.InterfaceC1390a;
import ob.C1842j;
import y7.u0;

/* renamed from: gb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1204a {
    public final ob.k a(InterfaceC1390a interfaceC1390a) {
        return new ob.k(this, lb.b.f19615d, interfaceC1390a);
    }

    public final C1842j b(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new C1842j(this, oVar, 0);
    }

    public final void c(b bVar) {
        Objects.requireNonNull(bVar, "observer is null");
        try {
            d(bVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            com.bumptech.glide.d.t(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(b bVar);

    public final C1842j e(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new C1842j(this, oVar, 1);
    }
}
