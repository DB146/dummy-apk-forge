package Q7;

import L7.C0385e;
import T7.t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0385e f8685a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8686b;

    public f(C0385e c0385e, e eVar) {
        this.f8685a = c0385e;
        this.f8686b = eVar;
    }

    public static f a(C0385e c0385e) {
        return new f(c0385e, e.f8679f);
    }

    public final boolean b() {
        e eVar = this.f8686b;
        return eVar.d() && eVar.f8684e.equals(t.f9361a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f8685a.equals(fVar.f8685a) && this.f8686b.equals(fVar.f8686b);
    }

    public final int hashCode() {
        return this.f8686b.hashCode() + (this.f8685a.hashCode() * 31);
    }

    public final String toString() {
        return this.f8685a + ":" + this.f8686b;
    }
}
