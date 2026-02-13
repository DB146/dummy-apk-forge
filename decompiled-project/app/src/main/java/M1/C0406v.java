package M1;

import fc.C1168o;
import fc.C1173u;
import fc.InterfaceC1162i;

/* renamed from: M1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406v extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public C0389d f6721a;

    /* renamed from: b, reason: collision with root package name */
    public int f6722b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6723c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0406v(Q q10, Hb.d dVar) {
        super(2, dVar);
        this.f6724d = q10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C0406v c0406v = new C0406v(this.f6724d, dVar);
        c0406v.f6723c = obj;
        return c0406v;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0406v) create((InterfaceC1162i) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC1162i interfaceC1162i;
        b0 b0Var;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6722b;
        Db.q qVar = Db.q.f3365a;
        Q q10 = this.f6724d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            InterfaceC1162i interfaceC1162i2 = (InterfaceC1162i) this.f6723c;
            this.f6723c = interfaceC1162i2;
            this.f6722b = 1;
            Object K10 = cc.F.K(q10.f6623c.l(), new I(q10, null), this);
            if (K10 == aVar) {
                return aVar;
            }
            interfaceC1162i = interfaceC1162i2;
            obj = K10;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        com.bumptech.glide.c.c0(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = this.f6721a;
                interfaceC1162i = (InterfaceC1162i) this.f6723c;
                com.bumptech.glide.c.c0(obj);
                C1168o c1168o = new C1168o(new C0405u(new C1173u(new A8.K(5, new A8.K(2, new C0400o(q10, null), (fc.b0) q10.f6627h.f3256b), new Jb.i(2, null)), new C0402q(b0Var, null), 0), 0), new r(q10, (Hb.d) null));
                this.f6723c = null;
                this.f6721a = null;
                this.f6722b = 3;
                if (!(interfaceC1162i instanceof fc.d0)) {
                    throw ((fc.d0) interfaceC1162i).f17139a;
                }
                Object a9 = c1168o.a(interfaceC1162i, this);
                if (a9 != aVar) {
                    a9 = qVar;
                }
                return a9 == aVar ? aVar : qVar;
            }
            InterfaceC1162i interfaceC1162i3 = (InterfaceC1162i) this.f6723c;
            com.bumptech.glide.c.c0(obj);
            interfaceC1162i = interfaceC1162i3;
        }
        b0Var = (b0) obj;
        if (b0Var instanceof C0389d) {
            Object obj2 = ((C0389d) b0Var).f6660b;
            this.f6723c = interfaceC1162i;
            this.f6721a = (C0389d) b0Var;
            this.f6722b = 2;
            if (interfaceC1162i.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (b0Var instanceof c0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (b0Var instanceof U) {
                throw ((U) b0Var).f6635b;
            }
            if (b0Var instanceof S) {
                return qVar;
            }
        }
        C1168o c1168o2 = new C1168o(new C0405u(new C1173u(new A8.K(5, new A8.K(2, new C0400o(q10, null), (fc.b0) q10.f6627h.f3256b), new Jb.i(2, null)), new C0402q(b0Var, null), 0), 0), new r(q10, (Hb.d) null));
        this.f6723c = null;
        this.f6721a = null;
        this.f6722b = 3;
        if (!(interfaceC1162i instanceof fc.d0)) {
        }
    }
}
