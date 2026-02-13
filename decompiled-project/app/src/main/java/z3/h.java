package z3;

import h3.o;
import kotlin.jvm.internal.l;
import y.S;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f28234a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28235b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28236c;

    /* renamed from: d, reason: collision with root package name */
    public final A3.a f28237d;

    public h(int i7, Object obj, boolean z8, A3.a dataSource) {
        o.t(i7, "status");
        l.e(dataSource, "dataSource");
        this.f28234a = i7;
        this.f28235b = obj;
        this.f28236c = z8;
        this.f28237d = dataSource;
        int b2 = P.c.b(i7);
        if (b2 == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (b2 != 1 && b2 != 2 && b2 != 3) {
            throw new Db.d(1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f28234a == hVar.f28234a && this.f28235b.equals(hVar.f28235b) && this.f28236c == hVar.f28236c && this.f28237d == hVar.f28237d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f28235b.hashCode() + (P.c.b(this.f28234a) * 31)) * 31;
        boolean z8 = this.f28236c;
        int i7 = z8;
        if (z8 != 0) {
            i7 = 1;
        }
        return this.f28237d.hashCode() + ((hashCode + i7) * 31);
    }

    public final String toString() {
        return "Resource(status=" + S.f(this.f28234a) + ", resource=" + this.f28235b + ", isFirstResource=" + this.f28236c + ", dataSource=" + this.f28237d + ')';
    }
}
