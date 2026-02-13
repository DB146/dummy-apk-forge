package u;

/* loaded from: classes.dex */
public final class K extends Jb.h implements Rb.e {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ W.c f24614A;

    /* renamed from: b, reason: collision with root package name */
    public W.c f24615b;

    /* renamed from: c, reason: collision with root package name */
    public L f24616c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f24617d;

    /* renamed from: e, reason: collision with root package name */
    public int f24618e;

    /* renamed from: f, reason: collision with root package name */
    public int f24619f;

    /* renamed from: u, reason: collision with root package name */
    public int f24620u;

    /* renamed from: v, reason: collision with root package name */
    public int f24621v;

    /* renamed from: w, reason: collision with root package name */
    public long f24622w;

    /* renamed from: x, reason: collision with root package name */
    public int f24623x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f24624y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ L f24625z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l10, W.c cVar, Hb.d dVar) {
        super(dVar);
        this.f24625z = l10;
        this.f24614A = cVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        K k = new K(this.f24625z, this.f24614A, dVar);
        k.f24624y = obj;
        return k;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:6:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0070 -> B:5:0x0097). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Zb.h hVar;
        L l10;
        long[] jArr;
        int length;
        W.c cVar;
        int i7;
        long j;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = this.f24623x;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            hVar = (Zb.h) this.f24624y;
            l10 = this.f24625z;
            jArr = l10.f24627b.f24609a;
            length = jArr.length - 2;
            if (length >= 0) {
                cVar = this.f24614A;
                i7 = 0;
                j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i7 != length) {
                }
            }
            return Db.q.f3365a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i11 = this.f24621v;
        int i12 = this.f24620u;
        long j10 = this.f24622w;
        int i13 = this.f24619f;
        int i14 = this.f24618e;
        long[] jArr2 = this.f24617d;
        L l11 = this.f24616c;
        W.c cVar2 = this.f24615b;
        Zb.h hVar2 = (Zb.h) this.f24624y;
        com.bumptech.glide.c.c0(obj);
        j10 >>= 8;
        i11++;
        if (i11 < i12) {
            if (i12 == 8) {
                length = i14;
                jArr = jArr2;
                l10 = l11;
                hVar = hVar2;
                i7 = i13;
                cVar = cVar2;
                if (i7 != length) {
                    i7++;
                    j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        hVar2 = hVar;
                        i11 = 0;
                        l11 = l10;
                        jArr2 = jArr;
                        i12 = 8 - ((~(i7 - length)) >>> 31);
                        cVar2 = cVar;
                        i13 = i7;
                        i14 = length;
                        j10 = j;
                        if (i11 < i12) {
                            if ((255 & j10) < 128) {
                                int i15 = (i13 << 3) + i11;
                                cVar2.f10249c = i15;
                                Object obj2 = l11.f24627b.f24610b[i15];
                                this.f24624y = hVar2;
                                this.f24615b = cVar2;
                                this.f24616c = l11;
                                this.f24617d = jArr2;
                                this.f24618e = i14;
                                this.f24619f = i13;
                                this.f24622w = j10;
                                this.f24620u = i12;
                                this.f24621v = i11;
                                this.f24623x = 1;
                                hVar2.c(this, obj2);
                                Ib.a aVar2 = Ib.a.f5345a;
                                return aVar;
                            }
                            j10 >>= 8;
                            i11++;
                            if (i11 < i12) {
                            }
                        }
                    }
                    if (i7 != length) {
                    }
                }
            }
            return Db.q.f3365a;
        }
    }
}
