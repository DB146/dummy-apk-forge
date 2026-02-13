package cc;

import java.util.concurrent.ScheduledFuture;

/* renamed from: cc.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0938j extends AbstractC0940k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14544a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14545b;

    public /* synthetic */ C0938j(Object obj, int i7) {
        this.f14544a = i7;
        this.f14545b = obj;
    }

    @Override // cc.AbstractC0940k
    public final void b(Throwable th) {
        switch (this.f14544a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f14545b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((S) this.f14545b).b();
                return;
            default:
                ((Rb.c) this.f14545b).invoke(th);
                return;
        }
    }

    @Override // Rb.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f14544a) {
            case 0:
                b((Throwable) obj);
                return Db.q.f3365a;
            case 1:
                b((Throwable) obj);
                return Db.q.f3365a;
            default:
                b((Throwable) obj);
                return Db.q.f3365a;
        }
    }

    public final String toString() {
        switch (this.f14544a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f14545b) + ']';
            case 1:
                return "DisposeOnCancel[" + ((S) this.f14545b) + ']';
            default:
                return "InvokeOnCancel[" + ((Rb.c) this.f14545b).getClass().getSimpleName() + '@' + F.q(this) + ']';
        }
    }
}
