package P2;

import java.util.Locale;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f7799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7800b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7801c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7802d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7803e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7804f;
    public final int g;

    public k(int i7, int i10, String name, String type, String str, boolean z8) {
        kotlin.jvm.internal.l.e(name, "name");
        kotlin.jvm.internal.l.e(type, "type");
        this.f7799a = name;
        this.f7800b = type;
        this.f7801c = z8;
        this.f7802d = i7;
        this.f7803e = str;
        this.f7804f = i10;
        String upperCase = type.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(upperCase, "toUpperCase(...)");
        this.g = ac.g.b0(upperCase, "INT") ? 3 : (ac.g.b0(upperCase, "CHAR") || ac.g.b0(upperCase, "CLOB") || ac.g.b0(upperCase, "TEXT")) ? 2 : ac.g.b0(upperCase, "BLOB") ? 5 : (ac.g.b0(upperCase, "REAL") || ac.g.b0(upperCase, "FLOA") || ac.g.b0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if ((this.f7802d > 0) == (kVar.f7802d > 0) && kotlin.jvm.internal.l.a(this.f7799a, kVar.f7799a) && this.f7801c == kVar.f7801c) {
                int i7 = kVar.f7804f;
                String str = kVar.f7803e;
                int i10 = this.f7804f;
                String str2 = this.f7803e;
                if ((i10 != 1 || i7 != 2 || str2 == null || j.c(str2, str)) && ((i10 != 2 || i7 != 1 || str == null || j.c(str, str2)) && ((i10 == 0 || i10 != i7 || (str2 == null ? str == null : j.c(str2, str))) && this.g == kVar.g))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f7799a.hashCode() * 31) + this.g) * 31) + (this.f7801c ? 1231 : 1237)) * 31) + this.f7802d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f7799a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f7800b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f7801c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f7802d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f7803e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return ac.h.P(ac.h.R(sb2.toString()));
    }
}
