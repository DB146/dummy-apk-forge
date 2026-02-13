package P2;

import Db.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f7810a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7811b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7812c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7813d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public m(String name, boolean z8, List columns, List orders) {
        kotlin.jvm.internal.l.e(name, "name");
        kotlin.jvm.internal.l.e(columns, "columns");
        kotlin.jvm.internal.l.e(orders, "orders");
        this.f7810a = name;
        this.f7811b = z8;
        this.f7812c = columns;
        this.f7813d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                orders.add("ASC");
            }
        }
        this.f7813d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f7811b == mVar.f7811b && kotlin.jvm.internal.l.a(this.f7812c, mVar.f7812c) && kotlin.jvm.internal.l.a(this.f7813d, mVar.f7813d)) {
                String str = this.f7810a;
                boolean Y2 = ac.n.Y(str, "index_", false);
                String str2 = mVar.f7810a;
                return Y2 ? ac.n.Y(str2, "index_", false) : str.equals(str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7810a;
        return this.f7813d.hashCode() + ((this.f7812c.hashCode() + ((((ac.n.Y(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f7811b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb2.append(this.f7810a);
        sb2.append("',\n            |   unique = '");
        sb2.append(this.f7811b);
        sb2.append("',\n            |   columns = {");
        ac.h.P(Eb.o.d0(this.f7812c, ",", null, null, null, 62));
        ac.h.P("},");
        q qVar = q.f3365a;
        sb2.append(qVar);
        sb2.append("\n            |   orders = {");
        ac.h.P(Eb.o.d0(this.f7813d, ",", null, null, null, 62));
        ac.h.P(" }");
        sb2.append(qVar);
        sb2.append("\n            |}\n        ");
        return ac.h.P(ac.h.R(sb2.toString()));
    }
}
