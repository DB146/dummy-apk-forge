package r8;

import P4.G;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import r7.C1947c;

/* loaded from: classes.dex */
public final class y extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final o7.o f23902a;

    public y(o7.o oVar) {
        this.f23902a = oVar;
    }

    public final void a(z zVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = zVar.f23903a;
        g gVar = (g) this.f23902a.f22101b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.f23833a.execute(new G(gVar, intent, taskCompletionSource, 12));
        taskCompletionSource.getTask().addOnCompleteListener(new E2.d(0), new C1947c(zVar, 3));
    }
}
