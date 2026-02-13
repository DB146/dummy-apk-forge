package J8;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b0 extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        try {
            return new AtomicInteger(aVar.b0());
        } catch (NumberFormatException e2) {
            throw new Db.d(4, e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        bVar.c0(((AtomicInteger) obj).get());
    }
}
