package E;

import C.F;
import C.InterfaceC0220e;
import C.InterfaceC0222g;
import Q.C0480b;
import Q.C0506o;
import y.C2305m;
import z.C2565l;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247b extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.m f3393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f3394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f3395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2565l f3396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3397f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2305m f3398u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Rb.c f3399v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3400w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3401x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0247b(c0.m mVar, A a9, F f4, Object obj, Object obj2, C2565l c2565l, boolean z8, C2305m c2305m, Rb.c cVar, int i7, int i10) {
        super(2);
        this.f3392a = i10;
        this.f3393b = mVar;
        this.f3394c = a9;
        this.f3395d = f4;
        this.f3400w = obj;
        this.f3401x = obj2;
        this.f3396e = c2565l;
        this.f3397f = z8;
        this.f3398u = c2305m;
        this.f3399v = cVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3392a) {
            case 0:
                ((Number) obj2).intValue();
                int u3 = C0480b.u(24577);
                c0.m mVar = this.f3393b;
                InterfaceC0222g interfaceC0222g = (InterfaceC0222g) this.f3400w;
                C2565l c2565l = this.f3396e;
                boolean z8 = this.f3397f;
                c2.q.b(mVar, this.f3394c, this.f3395d, interfaceC0222g, (c0.c) this.f3401x, c2565l, z8, this.f3398u, this.f3399v, (C0506o) obj, u3);
                return Db.q.f3365a;
            default:
                ((Number) obj2).intValue();
                int u10 = C0480b.u(24583);
                InterfaceC0220e interfaceC0220e = (InterfaceC0220e) this.f3400w;
                C2565l c2565l2 = this.f3396e;
                boolean z10 = this.f3397f;
                c2.q.c(this.f3393b, this.f3394c, this.f3395d, interfaceC0220e, (c0.d) this.f3401x, c2565l2, z10, this.f3398u, this.f3399v, (C0506o) obj, u10);
                return Db.q.f3365a;
        }
    }
}
