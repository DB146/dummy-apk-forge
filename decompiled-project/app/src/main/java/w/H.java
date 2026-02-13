package w;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name */
    public static final H f25509b = new H(new V((J) null, (C2194v) null, (N) null, (LinkedHashMap) null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final V f25510a;

    public H(V v10) {
        this.f25510a = v10;
    }

    public final H a(H h10) {
        V v10 = h10.f25510a;
        V v11 = this.f25510a;
        J j = v10.f25540a;
        if (j == null) {
            j = v11.f25540a;
        }
        C2194v c2194v = v10.f25541b;
        if (c2194v == null) {
            c2194v = v11.f25541b;
        }
        N n6 = v10.f25542c;
        if (n6 == null) {
            n6 = v11.f25542c;
        }
        Map map = v11.f25544e;
        kotlin.jvm.internal.l.e(map, "<this>");
        Map map2 = v10.f25544e;
        kotlin.jvm.internal.l.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new H(new V(j, c2194v, n6, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof H) && kotlin.jvm.internal.l.a(((H) obj).f25510a, this.f25510a);
    }

    public final int hashCode() {
        return this.f25510a.hashCode();
    }

    public final String toString() {
        if (equals(f25509b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        V v10 = this.f25510a;
        J j = v10.f25540a;
        h3.o.v(sb2, j != null ? j.toString() : null, ",\nSlide - ", null, ",\nShrink - ");
        C2194v c2194v = v10.f25541b;
        sb2.append(c2194v != null ? c2194v.toString() : null);
        sb2.append(",\nScale - ");
        N n6 = v10.f25542c;
        sb2.append(n6 != null ? n6.toString() : null);
        return sb2.toString();
    }
}
