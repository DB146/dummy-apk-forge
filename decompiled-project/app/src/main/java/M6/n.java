package M6;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f6806a;

    public n(List list) {
        this.f6806a = list;
    }

    @Override // M6.m
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f6806a;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((m) list.get(i7)).apply(obj)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f6806a.equals(((n) obj).f6806a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6806a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z8 = true;
        for (Object obj : this.f6806a) {
            if (!z8) {
                sb2.append(',');
            }
            sb2.append(obj);
            z8 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
