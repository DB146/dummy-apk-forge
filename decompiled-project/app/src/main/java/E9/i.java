package E9;

import ac.n;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3822b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3823c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3824d;

    public i(String m3u8Link, String referer, String streamId, boolean z8) {
        l.e(m3u8Link, "m3u8Link");
        l.e(referer, "referer");
        l.e(streamId, "streamId");
        this.f3821a = m3u8Link;
        this.f3822b = referer;
        this.f3823c = streamId;
        this.f3824d = z8;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof i) && n.T(((i) obj).f3823c, this.f3823c, true)) {
            return true;
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        return A3.c.d(A3.c.d(this.f3821a.hashCode() * 31, 31, this.f3822b), 961, this.f3823c);
    }

    public final String toString() {
        return "LinkStream(m3u8Link=" + this.f3821a + ", referer=" + this.f3822b + ", streamId=" + this.f3823c + ", isHls=" + this.f3824d + ")";
    }
}
