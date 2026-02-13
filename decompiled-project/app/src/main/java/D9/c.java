package D9;

import A9.d3;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f3296a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3297b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3298c;

    /* renamed from: d, reason: collision with root package name */
    public final d3 f3299d;

    /* renamed from: e, reason: collision with root package name */
    public int f3300e;

    public c(b bVar, b bVar2) {
        this.f3300e = 0;
        this.f3296a = bVar;
        this.f3297b = bVar2;
        this.f3298c = null;
        this.f3299d = null;
    }

    public c(b bVar, b bVar2, d3 d3Var) {
        this.f3300e = 0;
        if (d3Var == null) {
            throw new IllegalArgumentException();
        }
        this.f3296a = bVar;
        this.f3297b = bVar2;
        this.f3298c = null;
        this.f3299d = d3Var;
    }

    public c(b bVar, b bVar2, a aVar) {
        this.f3300e = 0;
        if (aVar == null) {
            throw new IllegalArgumentException();
        }
        this.f3296a = bVar;
        this.f3297b = bVar2;
        this.f3298c = aVar;
        this.f3299d = null;
    }

    public final String toString() {
        a aVar = this.f3298c;
        return "[" + this.f3296a.f3290a + " -> " + this.f3297b.f3290a + " <" + (aVar != null ? aVar.f3289a : this.f3299d != null ? "EntranceTransitionNotSupport" : "auto") + ">]";
    }
}
