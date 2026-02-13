package Db;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3356a;

    public l(Throwable exception) {
        kotlin.jvm.internal.l.e(exception, "exception");
        this.f3356a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (kotlin.jvm.internal.l.a(this.f3356a, ((l) obj).f3356a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3356a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3356a + ')';
    }
}
