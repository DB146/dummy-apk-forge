package T4;

import n5.D;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f9269a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9271c;

    public f(String str, String str2, String str3) {
        this.f9269a = str;
        this.f9270b = str2;
        this.f9271c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return D.a(this.f9269a, fVar.f9269a) && D.a(this.f9270b, fVar.f9270b) && D.a(this.f9271c, fVar.f9271c);
    }

    public final int hashCode() {
        int hashCode = this.f9269a.hashCode() * 31;
        String str = this.f9270b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9271c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
