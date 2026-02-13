package w;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: b, reason: collision with root package name */
    public static final I f25511b;

    /* renamed from: c, reason: collision with root package name */
    public static final I f25512c;

    /* renamed from: a, reason: collision with root package name */
    public final V f25513a;

    static {
        N n6 = null;
        LinkedHashMap linkedHashMap = null;
        J j = null;
        C2194v c2194v = null;
        f25511b = new I(new V(j, c2194v, n6, linkedHashMap, 63));
        f25512c = new I(new V(j, c2194v, n6, linkedHashMap, 47));
    }

    public I(V v10) {
        this.f25513a = v10;
    }

    public final I a(I i7) {
        V v10 = i7.f25513a;
        V v11 = this.f25513a;
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
        boolean z8 = v10.f25543d || v11.f25543d;
        Map map = v11.f25544e;
        kotlin.jvm.internal.l.e(map, "<this>");
        Map map2 = v10.f25544e;
        kotlin.jvm.internal.l.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new I(new V(j, c2194v, n6, z8, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof I) && kotlin.jvm.internal.l.a(((I) obj).f25513a, this.f25513a);
    }

    public final int hashCode() {
        return this.f25513a.hashCode();
    }

    public final String toString() {
        if (equals(f25511b)) {
            return "ExitTransition.None";
        }
        if (equals(f25512c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        V v10 = this.f25513a;
        J j = v10.f25540a;
        h3.o.v(sb2, j != null ? j.toString() : null, ",\nSlide - ", null, ",\nShrink - ");
        C2194v c2194v = v10.f25541b;
        sb2.append(c2194v != null ? c2194v.toString() : null);
        sb2.append(",\nScale - ");
        N n6 = v10.f25542c;
        sb2.append(n6 != null ? n6.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(v10.f25543d);
        return sb2.toString();
    }
}
