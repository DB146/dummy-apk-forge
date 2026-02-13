package Eb;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class t implements Zb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3889b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Rb.e eVar) {
        this.f3888a = 1;
        this.f3889b = (Jb.h) eVar;
    }

    public /* synthetic */ t(Object obj, int i7) {
        this.f3888a = i7;
        this.f3889b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Jb.h, Rb.e] */
    @Override // Zb.g
    public final Iterator iterator() {
        switch (this.f3888a) {
            case 0:
                return ((Iterable) this.f3889b).iterator();
            case 1:
                return O5.b.w((Jb.h) this.f3889b);
            case 2:
                return (Iterator) this.f3889b;
            default:
                return new ac.c((String) this.f3889b);
        }
    }
}
