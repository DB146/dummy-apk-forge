package J7;

import L7.C;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import t8.C2034c;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f5564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5566c;

    public /* synthetic */ b(r rVar, boolean z8, boolean z10) {
        this.f5564a = rVar;
        this.f5565b = z8;
        this.f5566c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f5564a;
        m mVar = rVar.f5622h;
        tc.b.z(mVar == m.f5590a, "Not in disconnected state: %s", mVar);
        rVar.f5622h = m.f5591b;
        long j = rVar.f5611B + 1;
        rVar.f5611B = j;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Q7.h hVar = rVar.f5637y;
        hVar.p("Trying to fetch auth token", null, new Object[0]);
        C2034c c2034c = new C2034c(taskCompletionSource, 20);
        F8.a aVar = rVar.f5634v;
        ((C) aVar.f4176b).d(this.f5565b, new q3.l(13, (O7.b) aVar.f4177c, c2034c, false));
        Task task = taskCompletionSource.getTask();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        hVar.p("Trying to fetch app check token", null, new Object[0]);
        D5.i iVar = new D5.i(taskCompletionSource2, 19);
        F8.a aVar2 = rVar.f5635w;
        ((C) aVar2.f4176b).d(this.f5566c, new q3.l(13, (O7.b) aVar2.f4177c, iVar, false));
        Task task2 = taskCompletionSource2.getTask();
        Task<Void> whenAll = Tasks.whenAll((Task<?>[]) new Task[]{task, task2});
        d dVar = new d(rVar, j, task, task2);
        O7.b bVar = rVar.f5636x;
        whenAll.addOnSuccessListener(bVar, dVar).addOnFailureListener(bVar, new e(rVar, j));
    }
}
