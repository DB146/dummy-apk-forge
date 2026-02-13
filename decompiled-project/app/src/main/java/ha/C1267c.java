package ha;

import kotlin.jvm.internal.l;

/* renamed from: ha.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1267c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final W9.c f17902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1267c(W9.c data) {
        super(0);
        l.e(data, "data");
        this.f17902b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1267c) && l.a(this.f17902b, ((C1267c) obj).f17902b);
    }

    public final int hashCode() {
        return this.f17902b.hashCode();
    }

    public final String toString() {
        return "History(data=" + this.f17902b + ")";
    }
}
