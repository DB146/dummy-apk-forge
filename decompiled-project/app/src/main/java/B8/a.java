package B8;

import kotlin.jvm.internal.l;
import mc.C1659d;
import v7.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1659d f2216a;

    /* renamed from: b, reason: collision with root package name */
    public i f2217b = null;

    public a(C1659d c1659d) {
        this.f2216a = c1659d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2216a.equals(aVar.f2216a) && l.a(this.f2217b, aVar.f2217b);
    }

    public final int hashCode() {
        int hashCode = this.f2216a.hashCode() * 31;
        i iVar = this.f2217b;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f2216a + ", subscriber=" + this.f2217b + ')';
    }
}
