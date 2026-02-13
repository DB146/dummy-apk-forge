package r3;

import android.net.NetworkRequest;
import h3.z;

/* renamed from: r3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1921e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f23663b;

    /* renamed from: a, reason: collision with root package name */
    public final NetworkRequest f23664a;

    static {
        String g = z.g("NetworkRequestCompat");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"NetworkRequestCompat\")");
        f23663b = g;
    }

    public C1921e(NetworkRequest networkRequest) {
        this.f23664a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1921e) && kotlin.jvm.internal.l.a(this.f23664a, ((C1921e) obj).f23664a);
    }

    public final int hashCode() {
        NetworkRequest networkRequest = this.f23664a;
        if (networkRequest == null) {
            return 0;
        }
        return networkRequest.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f23664a + ')';
    }
}
