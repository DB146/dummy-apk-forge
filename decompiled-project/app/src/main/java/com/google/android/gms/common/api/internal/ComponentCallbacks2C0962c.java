package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0962c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C0962c f14977e = new ComponentCallbacks2C0962c();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14978a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f14979b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14980c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f14981d = false;

    public static void b(Application application) {
        ComponentCallbacks2C0962c componentCallbacks2C0962c = f14977e;
        synchronized (componentCallbacks2C0962c) {
            try {
                if (!componentCallbacks2C0962c.f14981d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0962c);
                    application.registerComponentCallbacks(componentCallbacks2C0962c);
                    componentCallbacks2C0962c.f14981d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC0961b interfaceC0961b) {
        synchronized (f14977e) {
            this.f14980c.add(interfaceC0961b);
        }
    }

    public final void c(boolean z8) {
        synchronized (f14977e) {
            try {
                Iterator it = this.f14980c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0961b) it.next()).a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f14979b;
        boolean compareAndSet = this.f14978a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f14979b;
        boolean compareAndSet = this.f14978a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f14978a.compareAndSet(false, true)) {
            this.f14979b.set(true);
            c(true);
        }
    }
}
