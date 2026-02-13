package z;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2530B extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.v f27826a;

    /* renamed from: b, reason: collision with root package name */
    public int f27827b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f27829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f27830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2530B(kotlin.jvm.internal.v vVar, p0 p0Var, Hb.d dVar) {
        super(2, dVar);
        this.f27829d = vVar;
        this.f27830e = p0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2530B c2530b = new C2530B(this.f27829d, this.f27830e, dVar);
        c2530b.f27828c = obj;
        return c2530b;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2530B) create((Rb.c) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Rb.c cVar;
        Object obj2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27827b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            cVar = (Rb.c) this.f27828c;
            r1 = this.f27829d;
            obj2 = r1.f19134a;
            if (obj2 instanceof C2571s) {
            }
            return Db.q.f3365a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.jvm.internal.v vVar = this.f27826a;
        cVar = (Rb.c) this.f27828c;
        com.bumptech.glide.c.c0(obj);
        AbstractC2572t abstractC2572t = (AbstractC2572t) obj;
        vVar.f19134a = abstractC2572t;
        vVar = this.f27829d;
        obj2 = vVar.f19134a;
        if (!(obj2 instanceof C2571s) || (obj2 instanceof C2569p)) {
            return Db.q.f3365a;
        }
        abstractC2572t = null;
        C2570q c2570q = obj2 instanceof C2570q ? (C2570q) obj2 : null;
        if (c2570q != null) {
            cVar.invoke(c2570q);
        }
        ec.d dVar = this.f27830e.f28053I;
        if (dVar != null) {
            this.f27828c = cVar;
            this.f27826a = vVar;
            this.f27827b = 1;
            obj = dVar.c(this);
            if (obj == aVar) {
                return aVar;
            }
            AbstractC2572t abstractC2572t2 = (AbstractC2572t) obj;
        }
        vVar.f19134a = abstractC2572t2;
        vVar = this.f27829d;
        obj2 = vVar.f19134a;
        if (obj2 instanceof C2571s) {
        }
        return Db.q.f3365a;
    }
}
