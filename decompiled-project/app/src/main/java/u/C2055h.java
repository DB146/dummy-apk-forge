package u;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2055h extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public C2056i f24677b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f24678c;

    /* renamed from: d, reason: collision with root package name */
    public int f24679d;

    /* renamed from: e, reason: collision with root package name */
    public int f24680e;

    /* renamed from: f, reason: collision with root package name */
    public int f24681f;

    /* renamed from: u, reason: collision with root package name */
    public int f24682u;

    /* renamed from: v, reason: collision with root package name */
    public long f24683v;

    /* renamed from: w, reason: collision with root package name */
    public int f24684w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24685x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C2056i f24686y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2055h(C2056i c2056i, Hb.d dVar) {
        super(dVar);
        this.f24686y = c2056i;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2055h c2055h = new C2055h(this.f24686y, dVar);
        c2055h.f24685x = obj;
        return c2055h;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2055h) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0099). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Zb.h hVar;
        C2056i c2056i;
        long[] jArr;
        int length;
        int i7;
        long j;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = this.f24684w;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            hVar = (Zb.h) this.f24685x;
            c2056i = this.f24686y;
            jArr = c2056i.f24688b.f24603a;
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
        int i11 = this.f24682u;
        int i12 = this.f24681f;
        long j10 = this.f24683v;
        i7 = this.f24680e;
        int i13 = this.f24679d;
        long[] jArr2 = this.f24678c;
        C2056i c2056i2 = this.f24677b;
        Zb.h hVar2 = (Zb.h) this.f24685x;
        com.bumptech.glide.c.c0(obj);
        j10 >>= 8;
        i11++;
        if (i11 < i12) {
            if (i12 == 8) {
                length = i13;
                jArr = jArr2;
                c2056i = c2056i2;
                hVar = hVar2;
                if (i7 != length) {
                    i7++;
                    j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        hVar2 = hVar;
                        i11 = 0;
                        c2056i2 = c2056i;
                        i12 = 8 - ((~(i7 - length)) >>> 31);
                        jArr2 = jArr;
                        i13 = length;
                        j10 = j;
                        if (i11 < i12) {
                            if ((255 & j10) < 128) {
                                int i14 = (i7 << 3) + i11;
                                C2046I c2046i = c2056i2.f24688b;
                                V.a aVar2 = new V.a(1, c2046i.f24604b[i14], c2046i.f24605c[i14]);
                                this.f24685x = hVar2;
                                this.f24677b = c2056i2;
                                this.f24678c = jArr2;
                                this.f24679d = i13;
                                this.f24680e = i7;
                                this.f24683v = j10;
                                this.f24681f = i12;
                                this.f24682u = i11;
                                this.f24684w = 1;
                                hVar2.c(this, aVar2);
                                Ib.a aVar3 = Ib.a.f5345a;
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
