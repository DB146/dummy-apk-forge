package G3;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f4325b;

    /* renamed from: a, reason: collision with root package name */
    public Object f4326a;

    static {
        char[] cArr = W3.o.f10619a;
        f4325b = new ArrayDeque(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q a(Object obj) {
        q qVar;
        q qVar2;
        ArrayDeque arrayDeque = f4325b;
        synchronized (arrayDeque) {
            qVar = (q) arrayDeque.poll();
            qVar2 = qVar;
        }
        if (qVar == null) {
            qVar2 = new Object();
        }
        qVar2.f4326a = obj;
        return qVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        qVar.getClass();
        return this.f4326a.equals(qVar.f4326a);
    }

    public final int hashCode() {
        return this.f4326a.hashCode();
    }
}
