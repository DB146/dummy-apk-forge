package A8;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f622b;

    /* renamed from: c, reason: collision with root package name */
    public final int f623c;

    /* renamed from: d, reason: collision with root package name */
    public final long f624d;

    /* renamed from: e, reason: collision with root package name */
    public final C0047k f625e;

    /* renamed from: f, reason: collision with root package name */
    public final String f626f;
    public final String g;

    public a0(String sessionId, String firstSessionId, int i7, long j, C0047k c0047k, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.l.e(sessionId, "sessionId");
        kotlin.jvm.internal.l.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.l.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f621a = sessionId;
        this.f622b = firstSessionId;
        this.f623c = i7;
        this.f624d = j;
        this.f625e = c0047k;
        this.f626f = str;
        this.g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.l.a(this.f621a, a0Var.f621a) && kotlin.jvm.internal.l.a(this.f622b, a0Var.f622b) && this.f623c == a0Var.f623c && this.f624d == a0Var.f624d && kotlin.jvm.internal.l.a(this.f625e, a0Var.f625e) && kotlin.jvm.internal.l.a(this.f626f, a0Var.f626f) && kotlin.jvm.internal.l.a(this.g, a0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + A3.c.d((this.f625e.hashCode() + h3.o.f(A3.c.c(this.f623c, A3.c.d(this.f621a.hashCode() * 31, 31, this.f622b), 31), 31, this.f624d)) * 31, 31, this.f626f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f621a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f622b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f623c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f624d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f625e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f626f);
        sb2.append(", firebaseAuthenticationToken=");
        return A3.c.l(sb2, this.g, ')');
    }
}
