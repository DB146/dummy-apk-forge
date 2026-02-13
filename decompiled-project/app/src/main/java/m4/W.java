package m4;

import android.net.Uri;
import ha.C1265a;

/* loaded from: classes.dex */
public final class W implements InterfaceC1569g {

    /* renamed from: c, reason: collision with root package name */
    public static final W f20184c = new W(new l2.X(1));

    /* renamed from: d, reason: collision with root package name */
    public static final String f20185d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f20186e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f20187f;

    /* renamed from: u, reason: collision with root package name */
    public static final C1265a f20188u;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20189a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20190b;

    static {
        int i7 = n5.D.f21141a;
        f20185d = Integer.toString(0, 36);
        f20186e = Integer.toString(1, 36);
        f20187f = Integer.toString(2, 36);
        f20188u = new C1265a(24);
    }

    public W(l2.X x2) {
        this.f20189a = (Uri) x2.f19194b;
        this.f20190b = (String) x2.f19195c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return n5.D.a(this.f20189a, w10.f20189a) && n5.D.a(this.f20190b, w10.f20190b);
    }

    public final int hashCode() {
        Uri uri = this.f20189a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f20190b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
