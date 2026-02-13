package Jc;

import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @H8.b("total")
    private final int f5805a;

    /* renamed from: b, reason: collision with root package name */
    @H8.b("data")
    private final List<b> f5806b;

    public final List a() {
        return this.f5806b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5805a == cVar.f5805a && l.a(this.f5806b, cVar.f5806b);
    }

    public final int hashCode() {
        return this.f5806b.hashCode() + (Integer.hashCode(this.f5805a) * 31);
    }

    public final String toString() {
        return "BannerAdsResponse(total=" + this.f5805a + ", data=" + this.f5806b + ")";
    }
}
