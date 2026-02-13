package J8;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class c0 extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        return new AtomicBoolean(aVar.Z());
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        bVar.f0(((AtomicBoolean) obj).get());
    }
}
