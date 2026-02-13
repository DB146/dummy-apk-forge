package x7;

import h3.o;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f26246a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26247b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f26248c;

    public c(String str, long j, Map additionalCustomKeys) {
        kotlin.jvm.internal.l.e(additionalCustomKeys, "additionalCustomKeys");
        this.f26246a = str;
        this.f26247b = j;
        this.f26248c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.f26246a, cVar.f26246a) && this.f26247b == cVar.f26247b && kotlin.jvm.internal.l.a(this.f26248c, cVar.f26248c);
    }

    public final int hashCode() {
        return this.f26248c.hashCode() + o.f(this.f26246a.hashCode() * 31, 31, this.f26247b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f26246a + ", timestamp=" + this.f26247b + ", additionalCustomKeys=" + this.f26248c + ')';
    }
}
