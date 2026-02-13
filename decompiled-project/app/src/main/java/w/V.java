package w;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final J f25540a;

    /* renamed from: b, reason: collision with root package name */
    public final C2194v f25541b;

    /* renamed from: c, reason: collision with root package name */
    public final N f25542c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25543d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f25544e;

    public /* synthetic */ V(J j, C2194v c2194v, N n6, LinkedHashMap linkedHashMap, int i7) {
        this((i7 & 1) != 0 ? null : j, (i7 & 4) != 0 ? null : c2194v, (i7 & 8) != 0 ? null : n6, (i7 & 16) == 0, (i7 & 32) != 0 ? Eb.w.f3892a : linkedHashMap);
    }

    public V(J j, C2194v c2194v, N n6, boolean z8, Map map) {
        this.f25540a = j;
        this.f25541b = c2194v;
        this.f25542c = n6;
        this.f25543d = z8;
        this.f25544e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return kotlin.jvm.internal.l.a(this.f25540a, v10.f25540a) && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(this.f25541b, v10.f25541b) && kotlin.jvm.internal.l.a(this.f25542c, v10.f25542c) && this.f25543d == v10.f25543d && kotlin.jvm.internal.l.a(this.f25544e, v10.f25544e);
    }

    public final int hashCode() {
        J j = this.f25540a;
        int hashCode = (j == null ? 0 : j.hashCode()) * 961;
        C2194v c2194v = this.f25541b;
        int hashCode2 = (hashCode + (c2194v == null ? 0 : c2194v.hashCode())) * 31;
        N n6 = this.f25542c;
        return this.f25544e.hashCode() + h3.o.g(this.f25543d, (hashCode2 + (n6 != null ? n6.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f25540a + ", slide=null, changeSize=" + this.f25541b + ", scale=" + this.f25542c + ", hold=" + this.f25543d + ", effectsMap=" + this.f25544e + ')';
    }
}
