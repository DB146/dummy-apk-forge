package z;

import B0.c1;
import cc.InterfaceC0937i0;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2557h extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27985a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J0 f27987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2561j f27988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2547c f27989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0937i0 f27990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2557h(J0 j02, C2561j c2561j, InterfaceC2547c interfaceC2547c, InterfaceC0937i0 interfaceC0937i0, Hb.d dVar) {
        super(2, dVar);
        this.f27987c = j02;
        this.f27988d = c2561j;
        this.f27989e = interfaceC2547c;
        this.f27990f = interfaceC0937i0;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2557h c2557h = new C2557h(this.f27987c, this.f27988d, this.f27989e, this.f27990f, dVar);
        c2557h.f27986b = obj;
        return c2557h;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2557h) create((t0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27985a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            t0 t0Var = (t0) this.f27986b;
            C2561j c2561j = this.f27988d;
            InterfaceC2547c interfaceC2547c = this.f27989e;
            float p02 = C2561j.p0(c2561j, interfaceC2547c);
            J0 j02 = this.f27987c;
            j02.f27892e = p02;
            C.D d10 = new C.D(c2561j, this.f27990f, t0Var, 9);
            c1 c1Var = new c1(c2561j, j02, interfaceC2547c, 7);
            this.f27985a = 1;
            if (j02.a(d10, c1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
