package M1;

import java.util.List;

/* renamed from: M1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6663a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390e(List list, Hb.d dVar) {
        super(2, dVar);
        this.f6665c = list;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C0390e c0390e = new C0390e(this.f6665c, dVar);
        c0390e.f6664b = obj;
        return c0390e;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0390e) create((C0397l) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6663a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0397l c0397l = (C0397l) this.f6664b;
            this.f6663a = 1;
            if (vc.i.d(this.f6665c, c0397l, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
