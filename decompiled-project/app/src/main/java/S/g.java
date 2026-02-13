package S;

import Db.q;
import u.C2047J;

/* loaded from: classes.dex */
public final class g extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8962b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f8963c;

    /* renamed from: d, reason: collision with root package name */
    public int f8964d;

    /* renamed from: e, reason: collision with root package name */
    public int f8965e;

    /* renamed from: f, reason: collision with root package name */
    public int f8966f;

    /* renamed from: u, reason: collision with root package name */
    public int f8967u;

    /* renamed from: v, reason: collision with root package name */
    public long f8968v;

    /* renamed from: w, reason: collision with root package name */
    public int f8969w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8970x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f8971y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Hb.d dVar) {
        super(dVar);
        this.f8971y = hVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        g gVar = new g(this.f8971y, dVar);
        gVar.f8970x = obj;
        return gVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x008a). Please report as a decompilation issue!!! */
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
        int i10 = this.f8969w;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            hVar = (Zb.h) this.f8970x;
            C2047J c2047j = this.f8971y.f8972a;
            objArr = c2047j.f24610b;
            jArr = c2047j.f24609a;
            length = jArr.length - 2;
            if (length >= 0) {
                i7 = 0;
                j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i7 != length) {
                }
            }
            return q.f3365a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i11 = this.f8967u;
        int i12 = this.f8966f;
        long j10 = this.f8968v;
        i7 = this.f8965e;
        int i13 = this.f8964d;
        long[] jArr2 = this.f8963c;
        Object[] objArr2 = this.f8962b;
        Zb.h hVar2 = (Zb.h) this.f8970x;
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
                                this.f8970x = hVar2;
                                this.f8962b = objArr2;
                                this.f8963c = jArr2;
                                this.f8964d = i13;
                                this.f8965e = i7;
                                this.f8968v = j10;
                                this.f8966f = i12;
                                this.f8967u = i11;
                                this.f8969w = 1;
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
            return q.f3365a;
        }
    }
}
