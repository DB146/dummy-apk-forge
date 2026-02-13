package h8;

import java.util.ArrayList;

/* renamed from: h8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17867a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17868b;

    public C1261a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f17867a = str;
        this.f17868b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1261a)) {
            return false;
        }
        C1261a c1261a = (C1261a) obj;
        return this.f17867a.equals(c1261a.f17867a) && this.f17868b.equals(c1261a.f17868b);
    }

    public final int hashCode() {
        return ((this.f17867a.hashCode() ^ 1000003) * 1000003) ^ this.f17868b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f17867a + ", usedDates=" + this.f17868b + "}";
    }
}
