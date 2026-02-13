package P2;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f7795a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractSet f7796b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f7797c;

    public i(String str, AbstractSet columns, Set set) {
        kotlin.jvm.internal.l.e(columns, "columns");
        this.f7795a = str;
        this.f7796b = columns;
        this.f7797c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (kotlin.jvm.internal.l.a(this.f7795a, iVar.f7795a) && kotlin.jvm.internal.l.a(this.f7796b, iVar.f7796b)) {
                return kotlin.jvm.internal.l.a(this.f7797c, iVar.f7797c);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7797c.hashCode() + ((this.f7796b.hashCode() + (this.f7795a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return ac.h.R("\n            |FtsTableInfo {\n            |   name = '" + this.f7795a + "',\n            |   columns = {" + j.f(Eb.o.m0(this.f7796b)) + "\n            |   options = {" + j.f(Eb.o.m0(this.f7797c)) + "\n            |}\n        ");
    }
}
