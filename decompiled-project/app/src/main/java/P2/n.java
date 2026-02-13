package P2;

import Eb.v;
import H2.C0297k;
import java.util.AbstractSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f7814a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7815b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f7816c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f7817d;

    public n(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        kotlin.jvm.internal.l.e(foreignKeys, "foreignKeys");
        this.f7814a = str;
        this.f7815b = map;
        this.f7816c = foreignKeys;
        this.f7817d = abstractSet;
    }

    public static final n a(V2.c cVar, String str) {
        return j.p(new L2.a(cVar), str);
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f7814a.equals(nVar.f7814a) && this.f7815b.equals(nVar.f7815b) && kotlin.jvm.internal.l.a(this.f7816c, nVar.f7816c)) {
                AbstractSet abstractSet2 = this.f7817d;
                if (abstractSet2 == null || (abstractSet = nVar.f7817d) == null) {
                    return true;
                }
                return abstractSet2.equals(abstractSet);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7816c.hashCode() + ((this.f7815b.hashCode() + (this.f7814a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f7814a);
        sb2.append("',\n            |    columns = {");
        sb2.append(j.f(Eb.o.n0(new C0297k(7), this.f7815b.values())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(j.f(this.f7816c));
        sb2.append("\n            |    indices = {");
        AbstractSet abstractSet = this.f7817d;
        sb2.append(j.f(abstractSet != null ? Eb.o.n0(new C0297k(8), abstractSet) : v.f3891a));
        sb2.append("\n            |}\n        ");
        return ac.h.R(sb2.toString());
    }
}
