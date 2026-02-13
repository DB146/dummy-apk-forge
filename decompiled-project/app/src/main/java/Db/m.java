package Db;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3357a;

    public static final Throwable a(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).f3356a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.l.a(this.f3357a, ((m) obj).f3357a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3357a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3357a;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
