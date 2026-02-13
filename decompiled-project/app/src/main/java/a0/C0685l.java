package a0;

/* renamed from: a0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685l extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public long[] f12391b;

    /* renamed from: c, reason: collision with root package name */
    public int f12392c;

    /* renamed from: d, reason: collision with root package name */
    public int f12393d;

    /* renamed from: e, reason: collision with root package name */
    public int f12394e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12395f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0686m f12396u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0685l(C0686m c0686m, Hb.d dVar) {
        super(dVar);
        this.f12396u = c0686m;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C0685l c0685l = new C0685l(this.f12396u, dVar);
        c0685l.f12395f = obj;
        return c0685l;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0685l) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00cd -> B:7:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:20:0x009d). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Zb.h hVar;
        long[] jArr;
        int length;
        int i7;
        Zb.h hVar2;
        int i10;
        Zb.h hVar3;
        int i11;
        int i12;
        Ib.a aVar = Ib.a.f5345a;
        int i13 = this.f12394e;
        C0686m c0686m = this.f12396u;
        long j = c0686m.f12398a;
        long j10 = c0686m.f12400c;
        long j11 = c0686m.f12399b;
        if (i13 == 0) {
            com.bumptech.glide.c.c0(obj);
            hVar = (Zb.h) this.f12395f;
            jArr = c0686m.f12401d;
            if (jArr != null) {
                length = jArr.length;
                i7 = 0;
            }
            if (j11 != 0) {
                hVar2 = hVar;
                i10 = 0;
                if (i10 >= 64) {
                }
            }
            if (j != 0) {
            }
            return Db.q.f3365a;
        }
        if (i13 == 1) {
            length = this.f12393d;
            int i14 = this.f12392c;
            jArr = this.f12391b;
            hVar = (Zb.h) this.f12395f;
            com.bumptech.glide.c.c0(obj);
            i7 = i14 + 1;
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.f12392c;
                hVar3 = (Zb.h) this.f12395f;
                com.bumptech.glide.c.c0(obj);
                i12 = i15;
                i11 = 64;
                i12++;
                if (i12 < i11) {
                    if ((j & (1 << i12)) != 0) {
                        Long l10 = new Long(j10 + i12 + i11);
                        this.f12395f = hVar3;
                        this.f12391b = null;
                        this.f12392c = i12;
                        this.f12394e = 3;
                        hVar3.c(this, l10);
                        Ib.a aVar2 = Ib.a.f5345a;
                        return aVar;
                    }
                    i12++;
                    if (i12 < i11) {
                    }
                }
                return Db.q.f3365a;
            }
            i10 = this.f12392c;
            hVar2 = (Zb.h) this.f12395f;
            com.bumptech.glide.c.c0(obj);
            i10++;
            if (i10 >= 64) {
                hVar = hVar2;
                if (j != 0) {
                    hVar3 = hVar;
                    i11 = 64;
                    i12 = 0;
                    if (i12 < i11) {
                    }
                }
                return Db.q.f3365a;
            }
            if ((j11 & (1 << i10)) != 0) {
                Long l11 = new Long(j10 + i10);
                this.f12395f = hVar2;
                this.f12391b = null;
                this.f12392c = i10;
                this.f12394e = 2;
                hVar2.c(this, l11);
                Ib.a aVar3 = Ib.a.f5345a;
                return aVar;
            }
            i10++;
            if (i10 >= 64) {
            }
        }
        if (i7 < length) {
            Long l12 = new Long(jArr[i7]);
            this.f12395f = hVar;
            this.f12391b = jArr;
            this.f12392c = i7;
            this.f12393d = length;
            this.f12394e = 1;
            hVar.c(this, l12);
            return aVar;
        }
        if (j11 != 0) {
        }
        if (j != 0) {
        }
        return Db.q.f3365a;
    }
}
