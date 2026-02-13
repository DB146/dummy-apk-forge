package hc;

/* loaded from: classes2.dex */
public final class z implements Hb.h {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f17981a;

    public z(ThreadLocal threadLocal) {
        this.f17981a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.l.a(this.f17981a, ((z) obj).f17981a);
    }

    public final int hashCode() {
        return this.f17981a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f17981a + ')';
    }
}
