package M1;

/* loaded from: classes.dex */
public final class K extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6597a;

    /* renamed from: b, reason: collision with root package name */
    public int f6598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Hb.i f6600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Jb.i f6601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(Q q10, Hb.i iVar, Rb.e eVar, Hb.d dVar) {
        super(1, dVar);
        this.f6599c = q10;
        this.f6600d = iVar;
        this.f6601e = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new K(this.f6599c, this.f6600d, this.f6601e, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((K) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Type inference failed for: r6v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0389d c0389d;
        Object obj2;
        Object obj3;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6598b;
        Q q10 = this.f6599c;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6598b = 1;
            obj = Q.f(q10, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f6597a;
                    com.bumptech.glide.c.c0(obj);
                    return obj3;
                }
                c0389d = (C0389d) this.f6597a;
                com.bumptech.glide.c.c0(obj);
                obj2 = c0389d.f6660b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0389d.f6661c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.l.a(c0389d.f6660b, obj)) {
                    return obj;
                }
                this.f6597a = obj;
                this.f6598b = 3;
                if (q10.j(obj, true, this) == aVar) {
                    return aVar;
                }
                obj3 = obj;
                return obj3;
            }
            com.bumptech.glide.c.c0(obj);
        }
        c0389d = (C0389d) obj;
        J j = new J(this.f6601e, c0389d, null);
        this.f6597a = c0389d;
        this.f6598b = 2;
        obj = cc.F.K(this.f6600d, j, this);
        if (obj == aVar) {
            return aVar;
        }
        obj2 = c0389d.f6660b;
        if ((obj2 == null ? obj2.hashCode() : 0) == c0389d.f6661c) {
        }
    }
}
