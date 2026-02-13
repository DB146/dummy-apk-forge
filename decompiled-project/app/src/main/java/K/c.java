package K;

import j0.n;
import y.S;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f5828a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5829b;

    public c(long j, long j10) {
        this.f5828a = j;
        this.f5829b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.c(this.f5828a, cVar.f5828a) && n.c(this.f5829b, cVar.f5829b);
    }

    public final int hashCode() {
        int i7 = n.f18553h;
        return Long.hashCode(this.f5829b) + (Long.hashCode(this.f5828a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        S.d(this.f5828a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) n.i(this.f5829b));
        sb2.append(')');
        return sb2.toString();
    }
}
