package okhttp3.internal.http2;

import Y5.C0658x;
import kotlin.jvm.internal.l;
import rc.C1967k;

/* loaded from: classes2.dex */
public final class Header {

    /* renamed from: d, reason: collision with root package name */
    public static final C1967k f22731d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1967k f22732e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1967k f22733f;
    public static final C1967k g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1967k f22734h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1967k f22735i;

    /* renamed from: a, reason: collision with root package name */
    public final C1967k f22736a;

    /* renamed from: b, reason: collision with root package name */
    public final C1967k f22737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22738c;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
        C1967k c1967k = C1967k.f23967d;
        f22731d = C0658x.c(":");
        f22732e = C0658x.c(":status");
        f22733f = C0658x.c(":method");
        g = C0658x.c(":path");
        f22734h = C0658x.c(":scheme");
        f22735i = C0658x.c(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(C0658x.c(str), C0658x.c(str2));
        C1967k c1967k = C1967k.f23967d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C1967k name, String value) {
        this(name, C0658x.c(value));
        l.e(name, "name");
        l.e(value, "value");
        C1967k c1967k = C1967k.f23967d;
    }

    public Header(C1967k name, C1967k value) {
        l.e(name, "name");
        l.e(value, "value");
        this.f22736a = name;
        this.f22737b = value;
        this.f22738c = value.f() + name.f() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return l.a(this.f22736a, header.f22736a) && l.a(this.f22737b, header.f22737b);
    }

    public final int hashCode() {
        return this.f22737b.hashCode() + (this.f22736a.hashCode() * 31);
    }

    public final String toString() {
        return this.f22736a.E() + ": " + this.f22737b.E();
    }
}
