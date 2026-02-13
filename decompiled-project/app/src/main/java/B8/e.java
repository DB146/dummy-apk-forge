package B8;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2232a;

    public e(String str) {
        this.f2232a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && l.a(this.f2232a, ((e) obj).f2232a);
    }

    public final int hashCode() {
        return this.f2232a.hashCode();
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("SessionDetails(sessionId="), this.f2232a, ')');
    }
}
