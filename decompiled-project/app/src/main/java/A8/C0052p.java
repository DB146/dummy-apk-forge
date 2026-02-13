package A8;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* renamed from: A8.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052p {

    /* renamed from: a, reason: collision with root package name */
    public final Y6.i f709a;

    /* renamed from: b, reason: collision with root package name */
    public final E8.j f710b;

    public C0052p(Y6.i firebaseApp, E8.j settings, Hb.i backgroundDispatcher, i0 lifecycleServiceBinder) {
        kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.l.e(settings, "settings");
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.l.e(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f709a = firebaseApp;
        this.f710b = settings;
        Log.d(FirebaseSessionsRegistrar.TAG, "Initializing Firebase Sessions SDK.");
        firebaseApp.b();
        Context applicationContext = firebaseApp.f12041a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(j0.f691a);
            cc.F.B(cc.F.b(backgroundDispatcher), null, 0, new C0051o(this, backgroundDispatcher, lifecycleServiceBinder, null), 3);
        } else {
            Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
