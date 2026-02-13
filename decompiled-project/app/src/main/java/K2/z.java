package K2;

import cc.C0953t;
import cc.E;
import cc.InterfaceC0952s;

/* loaded from: classes.dex */
public final class z extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6108a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0953t f6110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb.i f6111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(C0953t c0953t, Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f6110c = c0953t;
        this.f6111d = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        z zVar = new z(this.f6110c, this.f6111d, dVar);
        zVar.f6109b = obj;
        return zVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /* JADX WARN: Type inference failed for: r3v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0952s interfaceC0952s;
        Throwable a9;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6108a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            E e2 = (E) this.f6109b;
            C0953t c0953t = this.f6110c;
            ?? r32 = this.f6111d;
            try {
                this.f6109b = c0953t;
                this.f6108a = 1;
                obj = r32.invoke(e2, this);
                if (obj == aVar) {
                    return aVar;
                }
                interfaceC0952s = c0953t;
            } catch (Throwable th) {
                th = th;
                interfaceC0952s = c0953t;
                obj = com.bumptech.glide.c.n(th);
                a9 = Db.m.a(obj);
                C0953t c0953t2 = (C0953t) interfaceC0952s;
                if (a9 == null) {
                }
                return Db.q.f3365a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0952s = (InterfaceC0952s) this.f6109b;
            try {
                com.bumptech.glide.c.c0(obj);
            } catch (Throwable th2) {
                th = th2;
                obj = com.bumptech.glide.c.n(th);
                a9 = Db.m.a(obj);
                C0953t c0953t22 = (C0953t) interfaceC0952s;
                if (a9 == null) {
                }
                return Db.q.f3365a;
            }
        }
        a9 = Db.m.a(obj);
        C0953t c0953t222 = (C0953t) interfaceC0952s;
        if (a9 == null) {
            c0953t222.J(obj);
        } else {
            c0953t222.W(a9);
        }
        return Db.q.f3365a;
    }
}
