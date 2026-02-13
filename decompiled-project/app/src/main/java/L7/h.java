package L7;

import android.os.Trace;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h3.C1235A;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import k8.C1433a;
import l2.H;
import r7.C1947c;
import v8.C2152f;
import v8.C2153g;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements OnCompleteListener, a1.j, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6349e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f6345a = obj;
        this.f6346b = obj2;
        this.f6347c = obj3;
        this.f6348d = obj4;
        this.f6349e = obj5;
    }

    @Override // a1.j
    public Object a(final a1.i iVar) {
        final Rb.a aVar = (Rb.a) this.f6348d;
        final H h10 = (H) this.f6349e;
        final C1235A c1235a = (C1235A) this.f6346b;
        final String str = (String) this.f6347c;
        ((Executor) this.f6345a).execute(new Runnable() { // from class: h3.F
            @Override // java.lang.Runnable
            public final void run() {
                String label = str;
                Rb.a aVar2 = aVar;
                l2.H h11 = h10;
                a1.i iVar2 = iVar;
                C1235A.this.getClass();
                boolean w10 = vc.i.w();
                if (w10) {
                    try {
                        kotlin.jvm.internal.l.e(label, "label");
                        Trace.beginSection(vc.i.I(label));
                    } finally {
                        if (w10) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    aVar2.invoke();
                    E e2 = C1235A.f17651b;
                    h11.l(e2);
                    iVar2.a(e2);
                } catch (Throwable th) {
                    h11.l(new C1238D(th));
                    iVar2.b(th);
                }
            }
        });
        return Db.q.f3365a;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        List list;
        i iVar = (i) this.f6345a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6346b;
        if (taskCompletionSource.getTask().isComplete()) {
            return;
        }
        if (!task.isSuccessful()) {
            G7.a aVar = (G7.a) this.f6347c;
            if (!aVar.f4353a.f9350a.isEmpty()) {
                taskCompletionSource.setResult(aVar);
                return;
            }
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            taskCompletionSource.setException(exception);
            return;
        }
        T7.s a9 = android.support.v4.media.session.b.a(task.getResult(), T7.k.f9348e);
        G7.d dVar = (G7.d) this.f6348d;
        Q7.f a10 = dVar.a();
        j jVar = (j) iVar.f6354e;
        jVar.e(a10, true);
        boolean d10 = a10.f8686b.d();
        C0385e c0385e = a10.f8685a;
        if (d10) {
            list = ((z) jVar.f6364m).e(c0385e, a9);
        } else {
            z zVar = (z) jVar.f6364m;
            list = (List) zVar.g.c(new p(zVar, zVar.i(a10), c0385e, a9, 1));
        }
        ((j) this.f6349e).f(list);
        taskCompletionSource.setResult(new G7.a(new G7.d(dVar.f4359a, dVar.f4360b), new T7.m(a9, dVar.a().f8686b.f8684e)));
        jVar.e(a10, false);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Date date = (Date) this.f6348d;
        HashMap hashMap = (HashMap) this.f6349e;
        C2153g c2153g = (C2153g) this.f6345a;
        c2153g.getClass();
        Task task2 = (Task) this.f6346b;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new Y6.k("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        Task task3 = (Task) this.f6347c;
        if (!task3.isSuccessful()) {
            return Tasks.forException(new Y6.k("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            C2152f b2 = c2153g.b((String) task2.getResult(), ((C1433a) task3.getResult()).f19028a, date, hashMap);
            return b2.f25216a != 0 ? Tasks.forResult(b2) : c2153g.f25224e.d(b2.f25217b).onSuccessTask(c2153g.f25222c, new C1947c(b2, 10));
        } catch (u8.e e2) {
            return Tasks.forException(e2);
        }
    }
}
