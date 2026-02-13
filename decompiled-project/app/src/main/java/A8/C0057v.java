package A8;

/* renamed from: A8.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057v {

    /* renamed from: a, reason: collision with root package name */
    public final String f720a;

    public C0057v(String str) {
        this.f720a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0057v) && kotlin.jvm.internal.l.a(this.f720a, ((C0057v) obj).f720a);
    }

    public final int hashCode() {
        String str = this.f720a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("FirebaseSessionsData(sessionId="), this.f720a, ')');
    }
}
