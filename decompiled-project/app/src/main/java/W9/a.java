package W9;

import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10853a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10854b;

    public a(String configSourceUrl, String name) {
        l.e(configSourceUrl, "configSourceUrl");
        l.e(name, "name");
        this.f10853a = configSourceUrl;
        this.f10854b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f10853a, aVar.f10853a) && l.a(this.f10854b, aVar.f10854b);
    }

    public final int hashCode() {
        return this.f10854b.hashCode() + (this.f10853a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtensionChannelCategory(configSourceUrl=");
        sb2.append(this.f10853a);
        sb2.append(", name=");
        return o.p(sb2, this.f10854b, ")");
    }
}
