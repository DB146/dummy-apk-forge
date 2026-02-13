package A8;

import java.util.ArrayList;

/* renamed from: A8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037a {

    /* renamed from: a, reason: collision with root package name */
    public final String f615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f617c;

    /* renamed from: d, reason: collision with root package name */
    public final String f618d;

    /* renamed from: e, reason: collision with root package name */
    public final D f619e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f620f;

    public C0037a(String str, String versionName, String appBuildVersion, String str2, D d10, ArrayList arrayList) {
        kotlin.jvm.internal.l.e(versionName, "versionName");
        kotlin.jvm.internal.l.e(appBuildVersion, "appBuildVersion");
        this.f615a = str;
        this.f616b = versionName;
        this.f617c = appBuildVersion;
        this.f618d = str2;
        this.f619e = d10;
        this.f620f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0037a)) {
            return false;
        }
        C0037a c0037a = (C0037a) obj;
        return this.f615a.equals(c0037a.f615a) && kotlin.jvm.internal.l.a(this.f616b, c0037a.f616b) && kotlin.jvm.internal.l.a(this.f617c, c0037a.f617c) && this.f618d.equals(c0037a.f618d) && this.f619e.equals(c0037a.f619e) && this.f620f.equals(c0037a.f620f);
    }

    public final int hashCode() {
        return this.f620f.hashCode() + ((this.f619e.hashCode() + A3.c.d(A3.c.d(A3.c.d(this.f615a.hashCode() * 31, 31, this.f616b), 31, this.f617c), 31, this.f618d)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f615a + ", versionName=" + this.f616b + ", appBuildVersion=" + this.f617c + ", deviceManufacturer=" + this.f618d + ", currentProcessDetails=" + this.f619e + ", appProcessDetails=" + this.f620f + ')';
    }
}
