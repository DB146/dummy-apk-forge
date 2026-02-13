package G3;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class p extends W3.k {
    @Override // W3.k
    public final void c(Object obj, Object obj2) {
        q qVar = (q) obj;
        qVar.getClass();
        ArrayDeque arrayDeque = q.f4325b;
        synchronized (arrayDeque) {
            arrayDeque.offer(qVar);
        }
    }
}
