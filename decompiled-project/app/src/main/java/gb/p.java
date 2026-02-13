package gb;

import java.util.Objects;
import lb.CallableC1516a;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class p<T> {
    public static tb.b b(Throwable th) {
        return new tb.b(new CallableC1516a(th), 2);
    }

    public static tb.b c(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new tb.b(obj, 3);
    }

    public final void d(q qVar) {
        try {
            e(qVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void e(q qVar);

    public final ob.m f(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new ob.m(5, this, oVar);
    }

    public final i g() {
        return new qb.m(this, 7);
    }
}
