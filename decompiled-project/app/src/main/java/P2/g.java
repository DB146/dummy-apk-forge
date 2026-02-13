package P2;

import Db.q;
import I2.C0323l;
import I2.E;
import I2.L;
import I2.M;
import K2.y;

/* loaded from: classes.dex */
public final class g extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public L f7784a;

    /* renamed from: b, reason: collision with root package name */
    public int f7785b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7786c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E f7789f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Rb.c f7790u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Hb.d dVar, E e2, Rb.c cVar, boolean z8, boolean z10) {
        super(2, dVar);
        this.f7787d = z8;
        this.f7788e = z10;
        this.f7789f = e2;
        this.f7790u = cVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        g gVar = new g(dVar, this.f7789f, this.f7790u, this.f7787d, this.f7788e);
        gVar.f7786c = obj;
        return gVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((M) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[RETURN] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        L l10;
        M m10;
        L l11;
        M m11;
        M m12;
        Object obj2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f7785b;
        Rb.c cVar = this.f7790u;
        E e2 = this.f7789f;
        boolean z8 = this.f7788e;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            M m13 = (M) this.f7786c;
            if (!this.f7787d) {
                kotlin.jvm.internal.l.c(m13, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.invoke(((y) m13).c());
            }
            l10 = z8 ? L.f5057a : L.f5058b;
            if (z8) {
                L l12 = l10;
                m10 = m13;
                l11 = l12;
                f fVar = new f(cVar, null);
                this.f7786c = m10;
                this.f7784a = null;
                this.f7785b = 3;
                obj = m10.d(l11, fVar, this);
                if (obj == aVar) {
                }
                if (z8) {
                }
            } else {
                this.f7786c = m13;
                this.f7784a = l10;
                this.f7785b = 1;
                Object a9 = m13.a(this);
                if (a9 == aVar) {
                    return aVar;
                }
                m11 = m13;
                obj = a9;
            }
        } else if (i7 == 1) {
            l10 = this.f7784a;
            m11 = (M) this.f7786c;
            com.bumptech.glide.c.c0(obj);
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f7786c;
                    com.bumptech.glide.c.c0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        C0323l i10 = e2.i();
                        i10.f5170c.e(i10.f5173f, i10.g);
                    }
                    return obj2;
                }
                m10 = (M) this.f7786c;
                com.bumptech.glide.c.c0(obj);
                if (z8) {
                    return obj;
                }
                this.f7786c = obj;
                this.f7785b = 4;
                Object a10 = m10.a(this);
                if (a10 == aVar) {
                    return aVar;
                }
                obj2 = obj;
                obj = a10;
                if (!((Boolean) obj).booleanValue()) {
                }
                return obj2;
            }
            l10 = this.f7784a;
            m12 = (M) this.f7786c;
            com.bumptech.glide.c.c0(obj);
            l11 = l10;
            m10 = m12;
            f fVar2 = new f(cVar, null);
            this.f7786c = m10;
            this.f7784a = null;
            this.f7785b = 3;
            obj = m10.d(l11, fVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            if (z8) {
            }
        }
        if (((Boolean) obj).booleanValue()) {
            l11 = l10;
            m10 = m11;
            f fVar22 = new f(cVar, null);
            this.f7786c = m10;
            this.f7784a = null;
            this.f7785b = 3;
            obj = m10.d(l11, fVar22, this);
            if (obj == aVar) {
            }
            if (z8) {
            }
        } else {
            C0323l i11 = e2.i();
            this.f7786c = m11;
            this.f7784a = l10;
            this.f7785b = 2;
            if (i11.a(this) == aVar) {
                return aVar;
            }
            m12 = m11;
            l11 = l10;
            m10 = m12;
            f fVar222 = new f(cVar, null);
            this.f7786c = m10;
            this.f7784a = null;
            this.f7785b = 3;
            obj = m10.d(l11, fVar222, this);
            if (obj == aVar) {
            }
            if (z8) {
            }
        }
    }
}
