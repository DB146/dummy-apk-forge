package Zb;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f12345a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12346b;

    /* renamed from: c, reason: collision with root package name */
    public final Rb.c f12347c;

    public f(g gVar, boolean z8, Rb.c cVar) {
        this.f12345a = gVar;
        this.f12346b = z8;
        this.f12347c = cVar;
    }

    @Override // Zb.g
    public final Iterator iterator() {
        return new e(this);
    }
}
