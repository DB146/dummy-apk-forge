package e0;

import g3.C1191j;
import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f16656a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16657b;

    /* renamed from: c, reason: collision with root package name */
    public final e f16658c;

    /* renamed from: d, reason: collision with root package name */
    public final C1191j f16659d;

    public d(int i7, long j, e eVar, C1191j c1191j) {
        this.f16656a = i7;
        this.f16657b = j;
        this.f16658c = eVar;
        this.f16659d = c1191j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16656a == dVar.f16656a && this.f16657b == dVar.f16657b && this.f16658c == dVar.f16658c && l.a(this.f16659d, dVar.f16659d);
    }

    public final int hashCode() {
        int hashCode = (this.f16658c.hashCode() + o.f(Integer.hashCode(this.f16656a) * 31, 31, this.f16657b)) * 31;
        C1191j c1191j = this.f16659d;
        return hashCode + (c1191j == null ? 0 : c1191j.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f16656a + ", timestamp=" + this.f16657b + ", type=" + this.f16658c + ", structureCompat=" + this.f16659d + ')';
    }
}
