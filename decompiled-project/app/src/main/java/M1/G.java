package M1;

/* loaded from: classes.dex */
public final class G extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public Object f6582a;

    /* renamed from: b, reason: collision with root package name */
    public int f6583b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f6584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Q q10, int i7, Hb.d dVar) {
        super(2, dVar);
        this.f6585d = q10;
        this.f6586e = i7;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        G g = new G(this.f6585d, this.f6586e, dVar);
        g.f6584c = ((Boolean) obj).booleanValue();
        return g;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) create(bool, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z8;
        Object obj2;
        int i7;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = this.f6583b;
        Q q10 = this.f6585d;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            z8 = this.f6584c;
            this.f6584c = z8;
            this.f6583b = 1;
            obj = q10.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f6582a;
                com.bumptech.glide.c.c0(obj);
                i7 = ((Number) obj).intValue();
                return new C0389d(obj2, obj2 != null ? obj2.hashCode() : 0, i7);
            }
            z8 = this.f6584c;
            com.bumptech.glide.c.c0(obj);
        }
        if (!z8) {
            obj2 = obj;
            i7 = this.f6586e;
            return new C0389d(obj2, obj2 != null ? obj2.hashCode() : 0, i7);
        }
        a0 g = q10.g();
        this.f6582a = obj;
        this.f6583b = 2;
        Integer a9 = g.a();
        if (a9 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a9;
        i7 = ((Number) obj).intValue();
        return new C0389d(obj2, obj2 != null ? obj2.hashCode() : 0, i7);
    }
}
