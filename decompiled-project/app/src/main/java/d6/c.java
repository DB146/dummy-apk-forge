package d6;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f16537a;

    /* renamed from: b, reason: collision with root package name */
    public long f16538b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f16539c;

    /* renamed from: d, reason: collision with root package name */
    public int f16540d;

    /* renamed from: e, reason: collision with root package name */
    public int f16541e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f16539c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1053a.f16532b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16537a == cVar.f16537a && this.f16538b == cVar.f16538b && this.f16540d == cVar.f16540d && this.f16541e == cVar.f16541e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16537a;
        long j10 = this.f16538b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f16540d) * 31) + this.f16541e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f16537a);
        sb2.append(" duration: ");
        sb2.append(this.f16538b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f16540d);
        sb2.append(" repeatMode: ");
        return A3.c.k(sb2, this.f16541e, "}\n");
    }
}
