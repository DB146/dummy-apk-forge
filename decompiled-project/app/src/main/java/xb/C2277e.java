package xb;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: xb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2277e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f26323a;

    public C2277e(Throwable th) {
        this.f26323a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2277e) {
            return Objects.equals(this.f26323a, ((C2277e) obj).f26323a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26323a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f26323a + "]";
    }
}
