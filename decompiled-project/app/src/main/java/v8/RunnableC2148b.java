package v8;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import o4.C1798l;
import org.json.JSONObject;

/* renamed from: v8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2148b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1798l f25197c;

    public RunnableC2148b(C1798l c1798l, int i7, long j) {
        this.f25197c = c1798l;
        this.f25195a = i7;
        this.f25196b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C1798l c1798l = this.f25197c;
        int i7 = this.f25195a;
        final long j = this.f25196b;
        synchronized (c1798l) {
            final int i10 = i7 - 1;
            final Task d10 = ((C2153g) c1798l.f21858d).d(3 - i10);
            final Task b2 = ((C2149c) c1798l.f21859e).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{d10, b2}).continueWithTask((ScheduledExecutorService) c1798l.g, new Continuation() { // from class: v8.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    JSONObject jSONObject;
                    C1798l c1798l2 = C1798l.this;
                    Task task2 = d10;
                    Task task3 = b2;
                    long j10 = j;
                    int i11 = i10;
                    c1798l2.getClass();
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new Y6.k("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new Y6.k("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    C2152f c2152f = (C2152f) task2.getResult();
                    C2151e c2151e = (C2151e) task3.getResult();
                    C2151e c2151e2 = c2152f.f25217b;
                    if (!(c2151e2 != null ? Boolean.valueOf(c2151e2.f25215f >= j10) : Boolean.valueOf(c2152f.f25216a == 1)).booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        c1798l2.e(i11, j10);
                        return Tasks.forResult(null);
                    }
                    if (c2152f.f25217b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (c2151e == null) {
                        c2151e = C2151e.c().a();
                    }
                    C2151e c2151e3 = c2152f.f25217b;
                    C2151e a9 = C2151e.a(new JSONObject(c2151e3.f25210a.toString()));
                    HashMap b10 = c2151e.b();
                    HashMap b11 = c2151e3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = c2151e.f25211b;
                    Iterator<String> keys = jSONObject2.keys();
                    while (true) {
                        boolean hasNext = keys.hasNext();
                        jSONObject = a9.f25211b;
                        if (!hasNext) {
                            break;
                        }
                        String next = keys.next();
                        JSONObject jSONObject3 = c2151e3.f25211b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            JSONObject jSONObject4 = c2151e.f25214e;
                            boolean has = jSONObject4.has(next);
                            JSONObject jSONObject5 = c2151e3.f25214e;
                            if ((has && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (b10.containsKey(next) != b11.containsKey(next)) {
                                hashSet.add(next);
                            } else if (b10.containsKey(next) && b11.containsKey(next) && !((Map) b10.get(next)).equals(b11.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        } else {
                            hashSet.add(next);
                        }
                    }
                    Iterator<String> keys2 = jSONObject.keys();
                    while (keys2.hasNext()) {
                        hashSet.add(keys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    new u8.a(hashSet);
                    synchronized (c1798l2) {
                        for (ka.b bVar : (LinkedHashSet) c1798l2.f21856b) {
                            switch (bVar.f19061a) {
                                case 0:
                                    ((ka.c) bVar.f19062b).b();
                                    break;
                            }
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
