package v7;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f25099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25101c;

    public b(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f25099a = str;
        this.f25100b = str2;
        this.f25101c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f25099a.equals(bVar.f25099a)) {
            String str = bVar.f25100b;
            String str2 = this.f25100b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = bVar.f25101c;
                String str4 = this.f25101c;
                if (str4 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str4.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f25099a.hashCode() ^ 1000003) * 1000003;
        String str = this.f25100b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f25101c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f25099a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f25100b);
        sb2.append(", firebaseAuthenticationToken=");
        return h3.o.p(sb2, this.f25101c, "}");
    }
}
