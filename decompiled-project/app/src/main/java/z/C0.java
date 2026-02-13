package z;

import cc.InterfaceC0937i0;
import u0.C2080j;
import u0.EnumC2076f;
import y.C2309q;

/* loaded from: classes.dex */
public final class C0 extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public cc.D0 f27838b;

    /* renamed from: c, reason: collision with root package name */
    public int f27839c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc.E f27841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2309q f27842f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u0.w f27843u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y f27844v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(cc.E e2, C2309q c2309q, u0.w wVar, Y y10, Hb.d dVar) {
        super(dVar);
        this.f27841e = e2;
        this.f27842f = c2309q;
        this.f27843u = wVar;
        this.f27844v = y10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        u0.w wVar = this.f27843u;
        Y y10 = this.f27844v;
        C0 c02 = new C0(this.f27841e, this.f27842f, wVar, y10, dVar);
        c02.f27840d = obj;
        return c02;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((u0.v) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cc.D0 B10;
        Object a9;
        u0.v vVar;
        InterfaceC0937i0 interfaceC0937i0;
        C2080j c2080j;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27839c;
        Y y10 = this.f27844v;
        cc.E e2 = this.f27841e;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            u0.v vVar2 = (u0.v) this.f27840d;
            C2532D c2532d = G0.f27869a;
            B10 = cc.F.B(e2, null, 4, new B0(y10, null), 1);
            this.f27840d = vVar2;
            this.f27838b = B10;
            this.f27839c = 1;
            a9 = G0.a(vVar2, (r3 & 1) != 0, EnumC2076f.f24758b, this);
            if (a9 == aVar) {
                return aVar;
            }
            vVar = vVar2;
            obj = a9;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0937i0 = (InterfaceC0937i0) this.f27840d;
                com.bumptech.glide.c.c0(obj);
                c2080j = (C2080j) obj;
                if (c2080j != null) {
                    G0.c(e2, interfaceC0937i0, new z0(y10, null));
                } else {
                    c2080j.a();
                    G0.c(e2, interfaceC0937i0, new A0(y10, null));
                    y.r rVar = (y.r) this.f27843u.f24808b;
                    if (rVar.f26513G) {
                        rVar.f26514H.invoke();
                    }
                }
                return Db.q.f3365a;
            }
            B10 = this.f27838b;
            vVar = (u0.v) this.f27840d;
            com.bumptech.glide.c.c0(obj);
        }
        C2080j c2080j2 = (C2080j) obj;
        c2080j2.a();
        C2532D c2532d2 = G0.f27869a;
        C2309q c2309q = this.f27842f;
        if (c2309q != c2532d2) {
            G0.c(e2, B10, new y0(c2309q, y10, c2080j2, null));
        }
        this.f27840d = B10;
        this.f27838b = null;
        this.f27839c = 2;
        obj = G0.d(vVar, EnumC2076f.f24758b, this);
        if (obj == aVar) {
            return aVar;
        }
        interfaceC0937i0 = B10;
        c2080j = (C2080j) obj;
        if (c2080j != null) {
        }
        return Db.q.f3365a;
    }
}
