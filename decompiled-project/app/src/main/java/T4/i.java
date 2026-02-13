package T4;

import n5.D;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f9280a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9281b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9282c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9283d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9284e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f9280a = str;
        this.f9281b = str2;
        this.f9282c = str3;
        this.f9283d = str4;
        this.f9284e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return D.a(this.f9280a, iVar.f9280a) && D.a(this.f9281b, iVar.f9281b) && D.a(this.f9282c, iVar.f9282c) && D.a(this.f9283d, iVar.f9283d) && D.a(this.f9284e, iVar.f9284e);
    }

    public final int hashCode() {
        String str = this.f9280a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9281b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9282c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9283d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9284e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
