package M1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public static final M f6606a = new kotlin.jvm.internal.m(2);

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        T msg = (T) obj;
        Throwable th = (Throwable) obj2;
        kotlin.jvm.internal.l.e(msg, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f6632b.W(th);
        return Db.q.f3365a;
    }
}
