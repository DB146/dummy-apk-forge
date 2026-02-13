package h4;

import java.util.HashMap;
import k4.InterfaceC1421a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1421a f17726a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17727b;

    public b(InterfaceC1421a interfaceC1421a, HashMap hashMap) {
        this.f17726a = interfaceC1421a;
        this.f17727b = hashMap;
    }

    public final long a(Y3.d dVar, long j, int i7) {
        long b2 = j - this.f17726a.b();
        c cVar = (c) this.f17727b.get(dVar);
        long j10 = cVar.f17728a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i7 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r12))), b2), cVar.f17729b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17726a.equals(bVar.f17726a) && this.f17727b.equals(bVar.f17727b);
    }

    public final int hashCode() {
        return ((this.f17726a.hashCode() ^ 1000003) * 1000003) ^ this.f17727b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f17726a + ", values=" + this.f17727b + "}";
    }
}
