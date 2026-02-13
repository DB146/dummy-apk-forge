package J7;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5607a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5608b;

    public q(ArrayList arrayList, HashMap hashMap) {
        this.f5607a = arrayList;
        this.f5608b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f5607a.equals(qVar.f5607a)) {
            return this.f5608b.equals(qVar.f5608b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5608b.hashCode() + (this.f5607a.hashCode() * 31);
    }

    public final String toString() {
        return tc.b.E(this.f5607a) + " (params: " + this.f5608b + ")";
    }
}
