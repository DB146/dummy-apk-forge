package t3;

import Db.q;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import cc.E;
import h3.y;
import q3.p;

/* renamed from: t3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2024g extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f24464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f24465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f24466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O3.c f24467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f24468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2024g(ConstraintTrackingWorker constraintTrackingWorker, y yVar, O3.c cVar, p pVar, Hb.d dVar) {
        super(2, dVar);
        this.f24465b = constraintTrackingWorker;
        this.f24466c = yVar;
        this.f24467d = cVar;
        this.f24468e = pVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2024g(this.f24465b, this.f24466c, this.f24467d, this.f24468e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2024g) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f24464a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f24464a = 1;
            obj = ConstraintTrackingWorker.d(this.f24465b, this.f24466c, this.f24467d, this.f24468e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return obj;
    }
}
