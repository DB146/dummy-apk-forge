package h7;

import P4.Y;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* renamed from: h7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1258d implements Continuation, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17835b;

    public /* synthetic */ C1258d(Object obj, boolean z8) {
        this.f17835b = obj;
        this.f17834a = z8;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = android.support.v4.media.session.b.s((Context) this.f17835b).edit();
        edit.putBoolean("proxy_retention", this.f17834a);
        edit.apply();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C1256b c1256b;
        boolean z8 = this.f17834a;
        C1259e c1259e = (C1259e) this.f17835b;
        if (!z8 && (c1256b = c1259e.f17845m) != null) {
            long j = c1256b.f17830b + c1256b.f17831c;
            c1259e.k.getClass();
            if (j - System.currentTimeMillis() > 300000) {
                return Tasks.forResult(C1257c.a(c1259e.f17845m));
            }
        }
        if (c1259e.f17844l == null) {
            return Tasks.forResult(new C1257c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new Y6.k("No AppCheckProvider installed.")));
        }
        Task task2 = c1259e.f17846n;
        if (task2 == null || task2.isComplete() || c1259e.f17846n.isCanceled()) {
            c1259e.f17846n = c1259e.a();
        }
        return c1259e.f17846n.continueWithTask(c1259e.f17842h, new Y(29));
    }
}
