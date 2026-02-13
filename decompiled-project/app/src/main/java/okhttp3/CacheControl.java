package okhttp3;

import A3.c;
import bc.C0849a;
import bc.EnumC0851c;
import com.google.android.gms.common.api.f;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class CacheControl {

    /* renamed from: n, reason: collision with root package name */
    public static final Companion f22250n = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22251a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22253c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22254d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22255e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22256f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22257h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22258i;
    public final boolean j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f22259l;

    /* renamed from: m, reason: collision with root package name */
    public String f22260m;

    /* loaded from: classes2.dex */
    public static final class Builder {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Builder();
        new Builder();
        int i7 = C0849a.f13994d;
        EnumC0851c enumC0851c = EnumC0851c.f13999d;
        long g = C0849a.g(Tb.a.M(f.API_PRIORITY_OTHER, enumC0851c), enumC0851c);
        if (g < 0) {
            throw new IllegalArgumentException(c.h("maxStale < 0: ", g).toString());
        }
    }

    public CacheControl(boolean z8, boolean z10, int i7, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f22251a = z8;
        this.f22252b = z10;
        this.f22253c = i7;
        this.f22254d = i10;
        this.f22255e = z11;
        this.f22256f = z12;
        this.g = z13;
        this.f22257h = i11;
        this.f22258i = i12;
        this.j = z14;
        this.k = z15;
        this.f22259l = z16;
        this.f22260m = str;
    }

    public final String toString() {
        String str = this.f22260m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f22251a) {
            sb2.append("no-cache, ");
        }
        if (this.f22252b) {
            sb2.append("no-store, ");
        }
        int i7 = this.f22253c;
        if (i7 != -1) {
            sb2.append("max-age=");
            sb2.append(i7);
            sb2.append(", ");
        }
        int i10 = this.f22254d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f22255e) {
            sb2.append("private, ");
        }
        if (this.f22256f) {
            sb2.append("public, ");
        }
        if (this.g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f22257h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f22258i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.k) {
            sb2.append("no-transform, ");
        }
        if (this.f22259l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        l.d(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String sb3 = sb2.toString();
        this.f22260m = sb3;
        return sb3;
    }
}
