package h3;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class t extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17712a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Jb.i f17714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1.i f17715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Rb.e eVar, a1.i iVar, Hb.d dVar) {
        super(2, dVar);
        this.f17714c = (Jb.i) eVar;
        this.f17715d = iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        t tVar = new t(this.f17714c, this.f17715d, dVar);
        tVar.f17713b = obj;
        return tVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17712a;
        a1.i iVar = this.f17715d;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                cc.E e2 = (cc.E) this.f17713b;
                ?? r12 = this.f17714c;
                this.f17712a = 1;
                obj = r12.invoke(e2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
            iVar.a(obj);
        } catch (CancellationException unused) {
            iVar.f12474d = true;
            a1.l lVar = iVar.f12472b;
            if (lVar != null && lVar.f12477b.cancel(true)) {
                iVar.f12471a = null;
                iVar.f12472b = null;
                iVar.f12473c = null;
            }
        } catch (Throwable th) {
            iVar.b(th);
        }
        return Db.q.f3365a;
    }
}
