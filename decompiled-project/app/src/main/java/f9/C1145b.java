package f9;

import java.util.ArrayList;

/* renamed from: f9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1145b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17020b;

    public C1145b(int i7, ArrayList arrayList) {
        this.f17019a = new ArrayList(arrayList);
        this.f17020b = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1145b) {
            return this.f17019a.equals(((C1145b) obj).f17019a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17019a.hashCode();
    }

    public final String toString() {
        return "{ " + this.f17019a + " }";
    }
}
