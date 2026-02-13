package W9;

import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f10886a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10887b;

    public g(e eVar, List list) {
        this.f10886a = eVar;
        this.f10887b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f10886a, gVar.f10886a) && l.a(this.f10887b, gVar.f10887b);
    }

    public final int hashCode() {
        return this.f10887b.hashCode() + (this.f10886a.hashCode() * 31);
    }

    public final String toString() {
        return "TVChannelFts4WithUrls(tvChannel=" + this.f10886a + ", urls=" + this.f10887b + ")";
    }
}
