package F;

import A0.G0;
import u.C2041D;
import w.C2181h;
import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3931a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3933c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(int i7, int i10, C2041D c2041d, A4.s sVar) {
        super(1);
        this.f3932b = i7;
        this.f3933c = i10;
        this.f3934d = c2041d;
        this.f3935e = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(AbstractC2323H[] abstractC2323HArr, C2181h c2181h, int i7, int i10) {
        super(1);
        this.f3934d = abstractC2323HArr;
        this.f3935e = c2181h;
        this.f3932b = i7;
        this.f3933c = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Object c0263g;
        switch (this.f3931a) {
            case 0:
                C0265i c0265i = (C0265i) obj;
                G0 g02 = c0265i.f3977c;
                int i7 = this.f3932b;
                int i10 = c0265i.f3975a;
                int max = Math.max(i7, i10);
                int min = Math.min(this.f3933c, (c0265i.f3976b + i10) - 1);
                if (max <= min) {
                    while (true) {
                        Rb.c cVar = (Rb.c) g02.f27b;
                        if (cVar == null || (c0263g = cVar.invoke(Integer.valueOf(max - i10))) == null) {
                            c0263g = new C0263g(max);
                        }
                        ((C2041D) this.f3934d).g(max, c0263g);
                        A4.s sVar = (A4.s) this.f3935e;
                        ((Object[]) sVar.f472c)[max - sVar.f470a] = c0263g;
                        if (max != min) {
                            max++;
                        }
                    }
                }
                return Db.q.f3365a;
            default:
                AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
                for (AbstractC2323H abstractC2323H : (AbstractC2323H[]) this.f3934d) {
                    if (abstractC2323H != null) {
                        long a9 = ((C2181h) this.f3935e).f25578a.f25591b.a((abstractC2323H.f26554a << 32) | (abstractC2323H.f26555b & 4294967295L), (this.f3932b << 32) | (this.f3933c & 4294967295L), V0.l.f9982a);
                        abstractC2322G.d(abstractC2323H, (int) (a9 >> 32), (int) (a9 & 4294967295L), 0.0f);
                    }
                }
                return Db.q.f3365a;
        }
    }
}
