package Db;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3354a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3355b;

    public j(Object obj, Object obj2) {
        this.f3354a = obj;
        this.f3355b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(this.f3354a, jVar.f3354a) && kotlin.jvm.internal.l.a(this.f3355b, jVar.f3355b);
    }

    public final int hashCode() {
        Object obj = this.f3354a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3355b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3354a + ", " + this.f3355b + ')';
    }
}
