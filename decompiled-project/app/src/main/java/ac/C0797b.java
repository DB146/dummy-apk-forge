package ac;

import h3.H;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ac.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0797b implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public int f12821a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f12822b;

    /* renamed from: c, reason: collision with root package name */
    public int f12823c;

    /* renamed from: d, reason: collision with root package name */
    public Xb.g f12824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ob.h f12825e;

    public C0797b(Ob.h hVar) {
        this.f12825e = hVar;
        hVar.getClass();
        int k = H.k(0, 0, ((CharSequence) hVar.f7553b).length());
        this.f12822b = k;
        this.f12823c = k;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Xb.e, Xb.g] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Xb.e, Xb.g] */
    public final void a() {
        int i7 = this.f12823c;
        if (i7 < 0) {
            this.f12821a = 0;
            this.f12824d = null;
            return;
        }
        Ob.h hVar = this.f12825e;
        hVar.getClass();
        CharSequence charSequence = (CharSequence) hVar.f7553b;
        if (i7 > charSequence.length()) {
            this.f12824d = new Xb.e(this.f12822b, g.c0(charSequence), 1);
            this.f12823c = -1;
        } else {
            Db.j jVar = (Db.j) ((Rb.e) hVar.f7554c).invoke(charSequence, Integer.valueOf(this.f12823c));
            if (jVar == null) {
                this.f12824d = new Xb.e(this.f12822b, g.c0(charSequence), 1);
                this.f12823c = -1;
            } else {
                int intValue = ((Number) jVar.f3354a).intValue();
                int intValue2 = ((Number) jVar.f3355b).intValue();
                this.f12824d = H.I(this.f12822b, intValue);
                int i10 = intValue + intValue2;
                this.f12822b = i10;
                this.f12823c = i10 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f12821a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12821a == -1) {
            a();
        }
        return this.f12821a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12821a == -1) {
            a();
        }
        if (this.f12821a == 0) {
            throw new NoSuchElementException();
        }
        Xb.g gVar = this.f12824d;
        kotlin.jvm.internal.l.c(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f12824d = null;
        this.f12821a = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
