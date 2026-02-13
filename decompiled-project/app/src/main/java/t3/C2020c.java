package t3;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2020c extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f24445b;

    /* renamed from: c, reason: collision with root package name */
    public int f24446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2020c(ConstraintTrackingWorker constraintTrackingWorker, Jb.c cVar) {
        super(cVar);
        this.f24445b = constraintTrackingWorker;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24444a = obj;
        this.f24446c |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.d(this.f24445b, null, null, null, this);
    }
}
