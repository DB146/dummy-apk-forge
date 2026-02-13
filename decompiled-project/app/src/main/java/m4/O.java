package m4;

import android.net.Uri;
import ha.C1265a;

/* loaded from: classes.dex */
public final class O implements InterfaceC1569g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f20115b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1265a f20116c;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20117a;

    static {
        int i7 = n5.D.f21141a;
        f20115b = Integer.toString(0, 36);
        f20116c = new C1265a(18);
    }

    public O(N n6) {
        this.f20117a = n6.f20112a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return this.f20117a.equals(((O) obj).f20117a) && n5.D.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20117a.hashCode() * 31;
    }
}
