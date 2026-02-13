package v7;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f25176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25177b;

    public u(String str, String str2) {
        this.f25176a = str;
        this.f25177b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.l.a(this.f25176a, uVar.f25176a) && kotlin.jvm.internal.l.a(this.f25177b, uVar.f25177b);
    }

    public final int hashCode() {
        String str = this.f25176a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25177b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f25176a);
        sb2.append(", authToken=");
        return A3.c.l(sb2, this.f25177b, ')');
    }
}
