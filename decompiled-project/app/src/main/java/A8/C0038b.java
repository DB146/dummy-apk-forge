package A8;

/* renamed from: A8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038b {

    /* renamed from: a, reason: collision with root package name */
    public final String f627a;

    /* renamed from: b, reason: collision with root package name */
    public final String f628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f629c;

    /* renamed from: d, reason: collision with root package name */
    public final C0037a f630d;

    public C0038b(String appId, String str, String str2, C0037a c0037a) {
        kotlin.jvm.internal.l.e(appId, "appId");
        this.f627a = appId;
        this.f628b = str;
        this.f629c = str2;
        this.f630d = c0037a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0038b)) {
            return false;
        }
        C0038b c0038b = (C0038b) obj;
        return kotlin.jvm.internal.l.a(this.f627a, c0038b.f627a) && this.f628b.equals(c0038b.f628b) && this.f629c.equals(c0038b.f629c) && this.f630d.equals(c0038b.f630d);
    }

    public final int hashCode() {
        return this.f630d.hashCode() + ((C.LOG_ENVIRONMENT_PROD.hashCode() + A3.c.d((((this.f628b.hashCode() + (this.f627a.hashCode() * 31)) * 31) + 47595001) * 31, 31, this.f629c)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f627a + ", deviceModel=" + this.f628b + ", sessionSdkVersion=2.1.2, osVersion=" + this.f629c + ", logEnvironment=" + C.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f630d + ')';
    }
}
