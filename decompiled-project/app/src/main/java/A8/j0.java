package A8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class j0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f691a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f692b;

    /* renamed from: c, reason: collision with root package name */
    public static q3.i f693c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
        q3.i iVar = f693c;
        if (iVar != null) {
            iVar.L(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Db.q qVar;
        kotlin.jvm.internal.l.e(activity, "activity");
        q3.i iVar = f693c;
        if (iVar != null) {
            iVar.L(1);
            qVar = Db.q.f3365a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            f692b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.l.e(activity, "activity");
        kotlin.jvm.internal.l.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }
}
