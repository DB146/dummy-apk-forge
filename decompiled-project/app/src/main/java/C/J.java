package C;

import a0.InterfaceC0695v;
import u.C2041D;
import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2355a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Q.C c10, Y.g gVar, C2041D c2041d, int i7) {
        super(1);
        this.f2357c = c10;
        this.f2358d = gVar;
        this.f2359e = c2041d;
        this.f2356b = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC2323H[] abstractC2323HArr, K k, int i7, int[] iArr) {
        super(1);
        this.f2357c = abstractC2323HArr;
        this.f2358d = k;
        this.f2356b = i7;
        this.f2359e = iArr;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f2355a) {
            case 0:
                AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
                AbstractC2323H[] abstractC2323HArr = (AbstractC2323H[]) this.f2357c;
                int length = abstractC2323HArr.length;
                int i7 = 0;
                int i10 = 0;
                while (i7 < length) {
                    AbstractC2323H abstractC2323H = abstractC2323HArr[i7];
                    kotlin.jvm.internal.l.b(abstractC2323H);
                    boolean z8 = abstractC2323H.d() instanceof H;
                    ((K) this.f2358d).getClass();
                    abstractC2322G.d(abstractC2323H, ((int[]) this.f2359e)[i10], Math.round((1 - 1.0f) * (((this.f2356b - abstractC2323H.f26555b) - 0) / 2.0f)), 0.0f);
                    i7++;
                    i10++;
                }
                return Db.q.f3365a;
            default:
                if (obj == ((Q.C) this.f2357c)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof InterfaceC0695v) {
                    int i11 = ((Y.g) this.f2358d).f11046a - this.f2356b;
                    C2041D c2041d = (C2041D) this.f2359e;
                    int d10 = c2041d.d(obj);
                    c2041d.g(Math.min(i11, d10 >= 0 ? c2041d.f24580c[d10] : com.google.android.gms.common.api.f.API_PRIORITY_OTHER), obj);
                }
                return Db.q.f3365a;
        }
    }
}
