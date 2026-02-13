package W9;

import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final e f10888a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10889b;

    public h(e eVar, List list) {
        this.f10888a = eVar;
        this.f10889b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f10888a, hVar.f10888a) && l.a(this.f10889b, hVar.f10889b);
    }

    public final int hashCode() {
        return this.f10889b.hashCode() + (this.f10888a.hashCode() * 31);
    }

    public final String toString() {
        return "TVChannelWithUrls(tvChannel=" + this.f10888a + ", urls=" + this.f10889b + ")";
    }
}
