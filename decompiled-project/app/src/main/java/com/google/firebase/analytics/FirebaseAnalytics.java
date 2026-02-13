package com.google.firebase.analytics;

import Y5.T0;
import Y6.i;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import b7.C0846a;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k8.d;
import k8.e;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f15821b;

    /* renamed from: a, reason: collision with root package name */
    public final zzfb f15822a;

    public FirebaseAnalytics(zzfb zzfbVar) {
        G.g(zzfbVar);
        this.f15822a = zzfbVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f15821b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f15821b == null) {
                        f15821b = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } finally {
                }
            }
        }
        return f15821b;
    }

    @Keep
    public static T0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzfb zza = zzfb.zza(context, bundle);
        if (zza == null) {
            return null;
        }
        return new C0846a(zza);
    }

    public final void a(String str, Bundle bundle) {
        this.f15822a.zzh(str, bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f19035m;
            return (String) Tasks.await(((d) i.e().c(e.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f15822a.zzp(zzdf.zza(activity), str, str2);
    }
}
