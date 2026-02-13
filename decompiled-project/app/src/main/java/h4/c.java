package h4;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17728a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17729b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f17730c;

    public c(long j, long j10, Set set) {
        this.f17728a = j;
        this.f17729b = j10;
        this.f17730c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17728a == cVar.f17728a && this.f17729b == cVar.f17729b && this.f17730c.equals(cVar.f17730c);
    }

    public final int hashCode() {
        long j = this.f17728a;
        int i7 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f17729b;
        return ((i7 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f17730c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f17728a + ", maxAllowedDelay=" + this.f17729b + ", flags=" + this.f17730c + "}";
    }
}
