package Z9;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f12326a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12327b;

    public y(String str, ArrayList arrayList) {
        this.f12326a = str;
        this.f12327b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f12326a.equals(yVar.f12326a) && kotlin.jvm.internal.l.a(this.f12327b, yVar.f12327b);
    }

    public final int hashCode() {
        int hashCode = this.f12326a.hashCode() * 31;
        ArrayList arrayList = this.f12327b;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public final String toString() {
        return "SctvPathConfig(path=" + this.f12326a + ", replacePathOrQueryKeys=" + this.f12327b + ")";
    }
}
