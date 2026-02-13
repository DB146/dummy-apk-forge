package u;

/* loaded from: classes.dex */
public final class W extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24644b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f24645c;

    /* renamed from: d, reason: collision with root package name */
    public int f24646d;

    /* renamed from: e, reason: collision with root package name */
    public int f24647e;

    /* renamed from: f, reason: collision with root package name */
    public int f24648f;

    /* renamed from: u, reason: collision with root package name */
    public int f24649u;

    /* renamed from: v, reason: collision with root package name */
    public long f24650v;

    /* renamed from: w, reason: collision with root package name */
    public int f24651w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24652x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ X f24653y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x2, Hb.d dVar) {
        super(dVar);
        this.f24653y = x2;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        W w10 = new W(this.f24653y, dVar);
        w10.f24652x = obj;
        return w10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x008c). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Zb.h hVar;
        Object[] objArr;
        long[] jArr;
        int length;
        int i7;
        long j;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = this.f24651w;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            hVar = (Zb.h) this.f24652x;
            C2046I c2046i = (C2046I) this.f24653y.f24655b;
            objArr = c2046i.f24605c;
            jArr = c2046i.f24603a;
            length = jArr.length - 2;
            if (length >= 0) {
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
        int i11 = this.f24649u;
        int i12 = this.f24648f;
        long j10 = this.f24650v;
        i7 = this.f24647e;
        int i13 = this.f24646d;
        long[] jArr2 = this.f24645c;
        Object[] objArr2 = this.f24644b;
        Zb.h hVar2 = (Zb.h) this.f24652x;
        com.bumptech.glide.c.c0(obj);
        j10 >>= 8;
        i11++;
        if (i11 < i12) {
            if (i12 == 8) {
                length = i13;
                jArr = jArr2;
                objArr = objArr2;
                hVar = hVar2;
                if (i7 != length) {
                    i7++;
                    j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        hVar2 = hVar;
                        i11 = 0;
                        jArr2 = jArr;
                        i13 = length;
                        i12 = 8 - ((~(i7 - length)) >>> 31);
                        objArr2 = objArr;
                        j10 = j;
                        if (i11 < i12) {
                            if ((255 & j10) < 128) {
                                Object obj2 = objArr2[(i7 << 3) + i11];
                                this.f24652x = hVar2;
                                this.f24644b = objArr2;
                                this.f24645c = jArr2;
                                this.f24646d = i13;
                                this.f24647e = i7;
                                this.f24650v = j10;
                                this.f24648f = i12;
                                this.f24649u = i11;
                                this.f24651w = 1;
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
