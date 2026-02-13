package Zb;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12352a;

    /* renamed from: b, reason: collision with root package name */
    public final g f12353b;

    /* renamed from: c, reason: collision with root package name */
    public final Rb.c f12354c;

    public /* synthetic */ j(g gVar, Rb.c cVar, int i7) {
        this.f12352a = i7;
        this.f12353b = gVar;
        this.f12354c = cVar;
    }

    @Override // Zb.g
    public final Iterator iterator() {
        switch (this.f12352a) {
            case 0:
                return new e(this);
            default:
                return new k(this);
        }
    }
}
