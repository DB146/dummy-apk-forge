package Q7;

import T7.l;
import T7.s;
import T7.t;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final e f8679f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final s f8680a = null;

    /* renamed from: b, reason: collision with root package name */
    public final T7.c f8681b = null;

    /* renamed from: c, reason: collision with root package name */
    public final s f8682c = null;

    /* renamed from: d, reason: collision with root package name */
    public final T7.c f8683d = null;

    /* renamed from: e, reason: collision with root package name */
    public final l f8684e = t.f9361a;

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        if (b()) {
            hashMap.put("sp", this.f8680a.getValue());
            T7.c cVar = this.f8681b;
            if (cVar != null) {
                hashMap.put("sn", cVar.f9331a);
            }
        }
        s sVar = this.f8682c;
        if (sVar != null) {
            hashMap.put("ep", sVar.getValue());
            T7.c cVar2 = this.f8683d;
            if (cVar2 != null) {
                hashMap.put("en", cVar2.f9331a);
            }
        }
        if (!this.f8684e.equals(t.f9361a)) {
            hashMap.put("i", this.f8684e.a());
        }
        return hashMap;
    }

    public final boolean b() {
        return this.f8680a != null;
    }

    public final boolean c() {
        return b();
    }

    public final boolean d() {
        return !b() && this.f8682c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f8684e.equals(eVar.f8684e)) {
            return false;
        }
        T7.c cVar = this.f8683d;
        if (cVar == null ? eVar.f8683d != null : !cVar.equals(eVar.f8683d)) {
            return false;
        }
        s sVar = this.f8682c;
        if (sVar == null ? eVar.f8682c != null : !sVar.equals(eVar.f8682c)) {
            return false;
        }
        T7.c cVar2 = this.f8681b;
        if (cVar2 == null ? eVar.f8681b != null : !cVar2.equals(eVar.f8681b)) {
            return false;
        }
        s sVar2 = this.f8680a;
        if (sVar2 == null ? eVar.f8680a == null : sVar2.equals(eVar.f8680a)) {
            return c() == eVar.c();
        }
        return false;
    }

    public final int hashCode() {
        int i7 = ((0 * 31) + (c() ? 1231 : 1237)) * 31;
        s sVar = this.f8680a;
        int hashCode = (i7 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        T7.c cVar = this.f8681b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.f9331a.hashCode() : 0)) * 31;
        s sVar2 = this.f8682c;
        int hashCode3 = (hashCode2 + (sVar2 != null ? sVar2.hashCode() : 0)) * 31;
        T7.c cVar2 = this.f8683d;
        return ((hashCode3 + (cVar2 != null ? cVar2.f9331a.hashCode() : 0)) * 31) + this.f8684e.hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
