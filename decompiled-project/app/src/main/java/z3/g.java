package z3;

import android.graphics.drawable.Drawable;
import h3.o;
import kotlin.jvm.internal.l;
import y.S;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f28232a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f28233b;

    public g(int i7, Drawable drawable) {
        o.t(i7, "status");
        this.f28232a = i7;
        this.f28233b = drawable;
        int b2 = P.c.b(i7);
        if (b2 == 0 || b2 == 1) {
            return;
        }
        if (b2 == 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (b2 != 3) {
            throw new Db.d(1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f28232a == gVar.f28232a && l.a(this.f28233b, gVar.f28233b);
    }

    public final int hashCode() {
        int b2 = P.c.b(this.f28232a) * 31;
        Drawable drawable = this.f28233b;
        return b2 + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "Placeholder(status=" + S.f(this.f28232a) + ", placeholder=" + this.f28233b + ')';
    }
}
