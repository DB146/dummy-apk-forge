package A3;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final U9.j f355e = new U9.j(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f356a;

    /* renamed from: b, reason: collision with root package name */
    public final j f357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f358c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f359d;

    public k(String str, Object obj, j jVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f358c = str;
        this.f356a = obj;
        this.f357b = jVar;
    }

    public static k a(Object obj, String str) {
        return new k(str, obj, f355e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f358c.equals(((k) obj).f358c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f358c.hashCode();
    }

    public final String toString() {
        return h3.o.p(new StringBuilder("Option{key='"), this.f358c, "'}");
    }
}
