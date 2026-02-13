package gb;

import java.util.Objects;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class f {
    public final void b(g gVar) {
        try {
            c(gVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(g gVar);

    public final qb.q d(vb.n nVar) {
        Objects.requireNonNull(nVar, "scheduler is null");
        return new qb.q(this, nVar, 2);
    }
}
