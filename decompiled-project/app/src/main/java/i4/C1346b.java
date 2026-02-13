package i4;

import b4.C0837h;
import b4.C0838i;

/* renamed from: i4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346b {

    /* renamed from: a, reason: collision with root package name */
    public final long f18406a;

    /* renamed from: b, reason: collision with root package name */
    public final C0838i f18407b;

    /* renamed from: c, reason: collision with root package name */
    public final C0837h f18408c;

    public C1346b(long j, C0838i c0838i, C0837h c0837h) {
        this.f18406a = j;
        this.f18407b = c0838i;
        this.f18408c = c0837h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1346b)) {
            return false;
        }
        C1346b c1346b = (C1346b) obj;
        return this.f18406a == c1346b.f18406a && this.f18407b.equals(c1346b.f18407b) && this.f18408c.equals(c1346b.f18408c);
    }

    public final int hashCode() {
        long j = this.f18406a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f18407b.hashCode()) * 1000003) ^ this.f18408c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f18406a + ", transportContext=" + this.f18407b + ", event=" + this.f18408c + "}";
    }
}
