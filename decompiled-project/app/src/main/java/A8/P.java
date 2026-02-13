package A8;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final String f574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f576c;

    /* renamed from: d, reason: collision with root package name */
    public final long f577d;

    public P(String sessionId, String firstSessionId, int i7, long j) {
        kotlin.jvm.internal.l.e(sessionId, "sessionId");
        kotlin.jvm.internal.l.e(firstSessionId, "firstSessionId");
        this.f574a = sessionId;
        this.f575b = firstSessionId;
        this.f576c = i7;
        this.f577d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return kotlin.jvm.internal.l.a(this.f574a, p10.f574a) && kotlin.jvm.internal.l.a(this.f575b, p10.f575b) && this.f576c == p10.f576c && this.f577d == p10.f577d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f577d) + A3.c.c(this.f576c, A3.c.d(this.f574a.hashCode() * 31, 31, this.f575b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f574a + ", firstSessionId=" + this.f575b + ", sessionIndex=" + this.f576c + ", sessionStartTimestampUs=" + this.f577d + ')';
    }
}
