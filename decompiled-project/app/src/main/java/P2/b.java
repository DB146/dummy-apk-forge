package P2;

import Db.q;
import I2.C0323l;
import I2.E;
import I2.L;
import I2.M;
import K2.y;

/* loaded from: classes.dex */
public final class b extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public L f7762a;

    /* renamed from: b, reason: collision with root package name */
    public int f7763b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f7766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ba.o f7767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z8, E e2, Hb.d dVar, Ba.o oVar) {
        super(2, dVar);
        this.f7765d = z8;
        this.f7766e = e2;
        this.f7767f = oVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        b bVar = new b(this.f7765d, this.f7766e, dVar, this.f7767f);
        bVar.f7764c = obj;
        return bVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((M) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[RETURN] */
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
        Object a9;
        Object obj2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f7763b;
        Ba.o oVar = this.f7767f;
        E e2 = this.f7766e;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            M m13 = (M) this.f7764c;
            if (!this.f7765d) {
                kotlin.jvm.internal.l.c(m13, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return oVar.invoke(((y) m13).c());
            }
            l10 = L.f5058b;
            this.f7764c = m13;
            this.f7762a = l10;
            this.f7763b = 1;
            Object a10 = m13.a(this);
            if (a10 == aVar) {
                return aVar;
            }
            m10 = m13;
            obj = a10;
        } else if (i7 == 1) {
            l10 = this.f7762a;
            m10 = (M) this.f7764c;
            com.bumptech.glide.c.c0(obj);
        } else if (i7 == 2) {
            l10 = this.f7762a;
            m12 = (M) this.f7764c;
            com.bumptech.glide.c.c0(obj);
            l11 = l10;
            m11 = m12;
            a aVar2 = new a(null, oVar);
            this.f7764c = m11;
            this.f7762a = null;
            this.f7763b = 3;
            obj = m11.d(l11, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            this.f7764c = obj;
            this.f7763b = 4;
            a9 = m11.a(this);
            if (a9 != aVar) {
            }
        } else {
            if (i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f7764c;
                com.bumptech.glide.c.c0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                C0323l i10 = e2.i();
                i10.f5170c.e(i10.f5173f, i10.g);
                return obj2;
            }
            m11 = (M) this.f7764c;
            com.bumptech.glide.c.c0(obj);
            this.f7764c = obj;
            this.f7763b = 4;
            a9 = m11.a(this);
            if (a9 != aVar) {
                return aVar;
            }
            obj2 = obj;
            obj = a9;
            if (!((Boolean) obj).booleanValue()) {
            }
        }
        if (((Boolean) obj).booleanValue()) {
            l11 = l10;
            m11 = m10;
            a aVar22 = new a(null, oVar);
            this.f7764c = m11;
            this.f7762a = null;
            this.f7763b = 3;
            obj = m11.d(l11, aVar22, this);
            if (obj == aVar) {
            }
            this.f7764c = obj;
            this.f7763b = 4;
            a9 = m11.a(this);
            if (a9 != aVar) {
            }
        } else {
            C0323l i11 = e2.i();
            this.f7764c = m10;
            this.f7762a = l10;
            this.f7763b = 2;
            if (i11.a(this) == aVar) {
                return aVar;
            }
            m12 = m10;
            l11 = l10;
            m11 = m12;
            a aVar222 = new a(null, oVar);
            this.f7764c = m11;
            this.f7762a = null;
            this.f7763b = 3;
            obj = m11.d(l11, aVar222, this);
            if (obj == aVar) {
            }
            this.f7764c = obj;
            this.f7763b = 4;
            a9 = m11.a(this);
            if (a9 != aVar) {
            }
        }
    }
}
