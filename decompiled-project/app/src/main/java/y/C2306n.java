package y;

import android.content.Context;

/* renamed from: y.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26494a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.c f26495b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26496c;

    /* renamed from: d, reason: collision with root package name */
    public final C.F f26497d;

    public C2306n(Context context, V0.c cVar, long j, C.F f4) {
        this.f26494a = context;
        this.f26495b = cVar;
        this.f26496c = j;
        this.f26497d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2306n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C2306n c2306n = (C2306n) obj;
        return kotlin.jvm.internal.l.a(this.f26494a, c2306n.f26494a) && kotlin.jvm.internal.l.a(this.f26495b, c2306n.f26495b) && j0.n.c(this.f26496c, c2306n.f26496c) && kotlin.jvm.internal.l.a(this.f26497d, c2306n.f26497d);
    }

    public final int hashCode() {
        int hashCode = (this.f26495b.hashCode() + (this.f26494a.hashCode() * 31)) * 31;
        int i7 = j0.n.f18553h;
        return this.f26497d.hashCode() + h3.o.f(hashCode, 31, this.f26496c);
    }
}
