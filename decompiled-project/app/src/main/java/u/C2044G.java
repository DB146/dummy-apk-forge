package u;

/* renamed from: u.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2044G extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public W.c f24593b;

    /* renamed from: c, reason: collision with root package name */
    public C2045H f24594c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f24595d;

    /* renamed from: e, reason: collision with root package name */
    public int f24596e;

    /* renamed from: f, reason: collision with root package name */
    public int f24597f;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f24598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2045H f24599v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W.c f24600w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2044G(C2045H c2045h, W.c cVar, Hb.d dVar) {
        super(dVar);
        this.f24599v = c2045h;
        this.f24600w = cVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2044G c2044g = new C2044G(this.f24599v, this.f24600w, dVar);
        c2044g.f24598u = obj;
        return c2044g;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2044G) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Zb.h hVar;
        C2045H c2045h;
        long[] jArr;
        int i7;
        W.c cVar;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = this.f24597f;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            hVar = (Zb.h) this.f24598u;
            c2045h = this.f24599v;
            C2043F c2043f = c2045h.f24602b;
            jArr = c2043f.f24588c;
            i7 = c2043f.f24590e;
            cVar = this.f24600w;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f24596e;
            jArr = this.f24595d;
            c2045h = this.f24594c;
            cVar = this.f24593b;
            hVar = (Zb.h) this.f24598u;
            com.bumptech.glide.c.c0(obj);
        }
        if (i7 == Integer.MAX_VALUE) {
            return Db.q.f3365a;
        }
        int i11 = (int) ((jArr[i7] >> 31) & 2147483647L);
        cVar.f10249c = i7;
        Object obj2 = c2045h.f24602b.f24587b[i7];
        this.f24598u = hVar;
        this.f24593b = cVar;
        this.f24594c = c2045h;
        this.f24595d = jArr;
        this.f24596e = i11;
        this.f24597f = 1;
        hVar.c(this, obj2);
        return aVar;
    }
}
