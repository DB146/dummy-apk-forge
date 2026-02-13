package a4;

import java.util.ArrayList;

/* renamed from: a4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762m extends AbstractC0772w {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12666a;

    public C0762m(ArrayList arrayList) {
        this.f12666a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0772w)) {
            return false;
        }
        return this.f12666a.equals(((C0762m) ((AbstractC0772w) obj)).f12666a);
    }

    public final int hashCode() {
        return this.f12666a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f12666a + "}";
    }
}
