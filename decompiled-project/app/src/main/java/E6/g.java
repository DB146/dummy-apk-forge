package E6;

import F6.k;
import F6.o;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import q3.l;

/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3736b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f3739e = iVar;
        this.f3738d = str;
        this.f3737c = taskCompletionSource2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, g gVar) {
        super(taskCompletionSource);
        this.f3739e = oVar;
        this.f3737c = taskCompletionSource2;
        this.f3738d = gVar;
    }

    @Override // F6.k
    public final void a() {
        switch (this.f3736b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f3737c;
                i iVar = (i) this.f3739e;
                String str = (String) this.f3738d;
                try {
                    iVar.f3746a.f4174m.d(iVar.f3747b, i.a(iVar, str), new h(iVar, taskCompletionSource, str));
                    return;
                } catch (RemoteException e2) {
                    D9.a aVar = i.f3744e;
                    Object[] objArr = {str};
                    aVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", D9.a.d(aVar.f3289a, "requestUpdateInfo(%s)", objArr), e2);
                    }
                    taskCompletionSource.trySetException(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((o) this.f3739e).f4170f) {
                    try {
                        o oVar = (o) this.f3739e;
                        TaskCompletionSource taskCompletionSource2 = this.f3737c;
                        oVar.f4169e.add(taskCompletionSource2);
                        taskCompletionSource2.getTask().addOnCompleteListener(new l(7, oVar, taskCompletionSource2, false));
                        if (((o) this.f3739e).k.getAndIncrement() > 0) {
                            ((o) this.f3739e).f4166b.c("Already connected to the service.", new Object[0]);
                        }
                        o.b((o) this.f3739e, (g) this.f3738d);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
