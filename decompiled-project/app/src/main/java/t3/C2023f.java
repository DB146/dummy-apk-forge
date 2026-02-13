package t3;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import h3.y;

/* renamed from: t3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023f extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public ConstraintTrackingWorker f24459a;

    /* renamed from: b, reason: collision with root package name */
    public y f24460b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f24462d;

    /* renamed from: e, reason: collision with root package name */
    public int f24463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2023f(ConstraintTrackingWorker constraintTrackingWorker, Jb.c cVar) {
        super(cVar);
        this.f24462d = constraintTrackingWorker;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24461c = obj;
        this.f24463e |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.f24462d, this);
    }
}
