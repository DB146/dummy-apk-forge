package I2;

import fc.InterfaceC1162i;
import t8.C2034c;

/* loaded from: classes.dex */
public final class S extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5076a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f5078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f5079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f5080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(c0 c0Var, int[] iArr, String[] strArr, Hb.d dVar) {
        super(2, dVar);
        this.f5078c = c0Var;
        this.f5079d = iArr;
        this.f5080e = strArr;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        S s3 = new S(this.f5078c, this.f5079d, this.f5080e, dVar);
        s3.f5077b = obj;
        return s3;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((S) create((InterfaceC1162i) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
        return Ib.a.f5345a;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String[], java.io.Serializable] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1162i interfaceC1162i;
        InterfaceC1162i interfaceC1162i2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5076a;
        int[] iArr = this.f5079d;
        c0 c0Var = this.f5078c;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                InterfaceC1162i interfaceC1162i3 = (InterfaceC1162i) this.f5077b;
                if (!c0Var.f5157h.n(iArr)) {
                    interfaceC1162i = interfaceC1162i3;
                    ?? obj2 = new Object();
                    C2034c c2034c = c0Var.f5158i;
                    Q q10 = new Q(obj2, interfaceC1162i, this.f5080e, iArr, 0);
                    this.f5077b = null;
                    this.f5076a = 3;
                    c2034c.a(q10, this);
                    return aVar;
                }
                E e2 = c0Var.f5151a;
                this.f5077b = interfaceC1162i3;
                this.f5076a = 1;
                Hb.i j = P2.j.j(e2, false, this);
                if (j == aVar) {
                    return aVar;
                }
                interfaceC1162i2 = interfaceC1162i3;
                obj = j;
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.c.c0(obj);
                        throw new Db.d(0);
                    }
                    interfaceC1162i2 = (InterfaceC1162i) this.f5077b;
                    com.bumptech.glide.c.c0(obj);
                    interfaceC1162i = interfaceC1162i2;
                    ?? obj22 = new Object();
                    C2034c c2034c2 = c0Var.f5158i;
                    Q q102 = new Q(obj22, interfaceC1162i, this.f5080e, iArr, 0);
                    this.f5077b = null;
                    this.f5076a = 3;
                    c2034c2.a(q102, this);
                    return aVar;
                }
                interfaceC1162i2 = (InterfaceC1162i) this.f5077b;
                com.bumptech.glide.c.c0(obj);
            }
            O o10 = new O(c0Var, null);
            this.f5077b = interfaceC1162i2;
            this.f5076a = 2;
            if (cc.F.K((Hb.i) obj, o10, this) == aVar) {
                return aVar;
            }
            interfaceC1162i = interfaceC1162i2;
            ?? obj222 = new Object();
            C2034c c2034c22 = c0Var.f5158i;
            Q q1022 = new Q(obj222, interfaceC1162i, this.f5080e, iArr, 0);
            this.f5077b = null;
            this.f5076a = 3;
            c2034c22.a(q1022, this);
            return aVar;
        } catch (Throwable th) {
            c0Var.f5157h.o(iArr);
            throw th;
        }
    }
}
