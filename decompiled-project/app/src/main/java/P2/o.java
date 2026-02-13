package P2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f7818a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7819b;

    public o(String name, String str) {
        kotlin.jvm.internal.l.e(name, "name");
        this.f7818a = name;
        this.f7819b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (kotlin.jvm.internal.l.a(this.f7818a, oVar.f7818a)) {
                String str = oVar.f7819b;
                String str2 = this.f7819b;
                if (str2 != null ? kotlin.jvm.internal.l.a(str2, str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7818a.hashCode() * 31;
        String str = this.f7819b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ac.h.R("\n            |ViewInfo {\n            |   name = '" + this.f7818a + "',\n            |   sql = '" + this.f7819b + "'\n            |}\n        ");
    }
}
