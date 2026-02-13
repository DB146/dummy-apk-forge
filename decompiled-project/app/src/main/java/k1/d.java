package k1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f18760a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f18761b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18762c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18763d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18764e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18765f = false;

    public d(Activity activity) {
        this.f18761b = activity;
        this.f18762c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f18761b == activity) {
            this.f18761b = null;
            this.f18764e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f18764e || this.f18765f || this.f18763d) {
            return;
        }
        Object obj = this.f18760a;
        try {
            Object obj2 = e.f18768c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f18762c) {
                e.g.postAtFrontOfQueue(new hc.i(4, e.f18767b.get(activity), obj2, false));
                this.f18765f = true;
                this.f18760a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f18761b == activity) {
            this.f18763d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
