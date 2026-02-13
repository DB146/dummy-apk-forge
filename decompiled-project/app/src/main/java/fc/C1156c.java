package fc;

import gc.AbstractC1212g;

/* renamed from: fc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1156c extends AbstractC1212g {

    /* renamed from: d, reason: collision with root package name */
    public final Jb.i f17133d;

    /* renamed from: e, reason: collision with root package name */
    public final Jb.i f17134e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1156c(Rb.e eVar, Hb.i iVar, int i7, int i10) {
        super(iVar, i7, i10);
        Jb.i iVar2 = (Jb.i) eVar;
        this.f17133d = iVar2;
        this.f17134e = iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v3, types: [Jb.i, Rb.e] */
    @Override // gc.AbstractC1212g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ec.r rVar, Hb.d dVar) {
        C1155b c1155b;
        int i7;
        if (dVar instanceof C1155b) {
            c1155b = (C1155b) dVar;
            int i10 = c1155b.f17130d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1155b.f17130d = i10 - Integer.MIN_VALUE;
                Object obj = c1155b.f17128b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c1155b.f17130d;
                Db.q qVar = Db.q.f3365a;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    c1155b.f17127a = rVar;
                    c1155b.f17130d = 1;
                    Object invoke = this.f17133d.invoke(rVar, c1155b);
                    if (invoke != aVar) {
                        invoke = qVar;
                    }
                    if (invoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = c1155b.f17127a;
                    com.bumptech.glide.c.c0(obj);
                }
                if (((ec.q) rVar).f16900d.w()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return qVar;
            }
        }
        c1155b = new C1155b(this, (Jb.c) dVar);
        Object obj2 = c1155b.f17128b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c1155b.f17130d;
        Db.q qVar2 = Db.q.f3365a;
        if (i7 != 0) {
        }
        if (((ec.q) rVar).f16900d.w()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // gc.AbstractC1212g
    public final AbstractC1212g e(Hb.i iVar, int i7, int i10) {
        return new C1156c(this.f17134e, iVar, i7, i10);
    }

    @Override // gc.AbstractC1212g
    public final String toString() {
        return "block[" + this.f17133d + "] -> " + super.toString();
    }
}
