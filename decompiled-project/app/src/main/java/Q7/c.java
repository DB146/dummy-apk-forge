package Q7;

import T7.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f8674a;

    /* renamed from: b, reason: collision with root package name */
    public final m f8675b;

    /* renamed from: c, reason: collision with root package name */
    public final m f8676c;

    /* renamed from: d, reason: collision with root package name */
    public final T7.c f8677d;

    public c(int i7, m mVar, T7.c cVar, m mVar2) {
        this.f8674a = i7;
        this.f8675b = mVar;
        this.f8677d = cVar;
        this.f8676c = mVar2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Change: ");
        int i7 = this.f8674a;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "VALUE" : "CHILD_CHANGED" : "CHILD_MOVED" : "CHILD_ADDED" : "CHILD_REMOVED");
        sb2.append(" ");
        sb2.append(this.f8677d);
        return sb2.toString();
    }
}
