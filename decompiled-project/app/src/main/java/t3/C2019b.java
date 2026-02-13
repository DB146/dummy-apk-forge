package t3;

import Db.q;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import cc.E;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2019b extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f24442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f24443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2019b(ConstraintTrackingWorker constraintTrackingWorker, Hb.d dVar) {
        super(2, dVar);
        this.f24443b = constraintTrackingWorker;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2019b(this.f24443b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2019b) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f24442a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f24442a = 1;
            obj = ConstraintTrackingWorker.e(this.f24443b, this);
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
