package u8;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ea.C1112g;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import r8.o;
import v8.C2149c;
import v8.C2151e;
import v8.l;
import w8.RunnableC2224a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements SuccessContinuation, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f24881a;

    public /* synthetic */ b(c cVar) {
        this.f24881a = cVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        c cVar = this.f24881a;
        Task b2 = cVar.f24884c.b();
        Task b10 = cVar.f24885d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{b2, b10}).continueWithTask(cVar.f24883b, new M9.e(cVar, b2, b10, 14));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z8;
        c cVar = this.f24881a;
        cVar.getClass();
        if (task.isSuccessful()) {
            C2149c c2149c = cVar.f24884c;
            synchronized (c2149c) {
                c2149c.f25202c = Tasks.forResult(null);
            }
            l lVar = c2149c.f25201b;
            synchronized (lVar) {
                lVar.f25259a.deleteFile(lVar.f25260b);
            }
            C2151e c2151e = (C2151e) task.getResult();
            if (c2151e != null) {
                JSONArray jSONArray = c2151e.f25213d;
                Z6.c cVar2 = cVar.f24882a;
                if (cVar2 != null) {
                    try {
                        cVar2.c(c.i(jSONArray));
                    } catch (Z6.a e2) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                    } catch (JSONException e10) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                    }
                }
                o oVar = cVar.f24889i;
                try {
                    y8.d g = ((C1112g) oVar.f23858c).g(c2151e);
                    Iterator it = ((Set) oVar.f23860e).iterator();
                    while (it.hasNext()) {
                        ((Executor) oVar.f23859d).execute(new RunnableC2224a((s7.b) it.next(), g, 0));
                    }
                } catch (e e11) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
