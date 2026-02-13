package P2;

import Db.q;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f7805a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7806b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7807c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7808d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7809e;

    public l(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        kotlin.jvm.internal.l.e(referenceTable, "referenceTable");
        kotlin.jvm.internal.l.e(onDelete, "onDelete");
        kotlin.jvm.internal.l.e(onUpdate, "onUpdate");
        kotlin.jvm.internal.l.e(columnNames, "columnNames");
        kotlin.jvm.internal.l.e(referenceColumnNames, "referenceColumnNames");
        this.f7805a = referenceTable;
        this.f7806b = onDelete;
        this.f7807c = onUpdate;
        this.f7808d = columnNames;
        this.f7809e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (kotlin.jvm.internal.l.a(this.f7805a, lVar.f7805a) && kotlin.jvm.internal.l.a(this.f7806b, lVar.f7806b) && kotlin.jvm.internal.l.a(this.f7807c, lVar.f7807c) && kotlin.jvm.internal.l.a(this.f7808d, lVar.f7808d)) {
                return kotlin.jvm.internal.l.a(this.f7809e, lVar.f7809e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7809e.hashCode() + ((this.f7808d.hashCode() + A3.c.d(A3.c.d(this.f7805a.hashCode() * 31, 31, this.f7806b), 31, this.f7807c)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(this.f7805a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(this.f7806b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(this.f7807c);
        sb2.append("',\n            |   columnNames = {");
        ac.h.P(Eb.o.d0(Eb.o.m0(this.f7808d), ",", null, null, null, 62));
        ac.h.P("},");
        q qVar = q.f3365a;
        sb2.append(qVar);
        sb2.append("\n            |   referenceColumnNames = {");
        ac.h.P(Eb.o.d0(Eb.o.m0(this.f7809e), ",", null, null, null, 62));
        ac.h.P(" }");
        sb2.append(qVar);
        sb2.append("\n            |}\n        ");
        return ac.h.P(ac.h.R(sb2.toString()));
    }
}
