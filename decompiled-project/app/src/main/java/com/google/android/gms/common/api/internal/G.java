package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC0988d;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class G implements InterfaceC0988d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14930a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14931b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14932c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14933d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14934e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14935f;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G(Y6.i iVar) {
        Boolean bool;
        Boolean bool2;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f14932c = new Object();
        this.f14933d = new TaskCompletionSource();
        this.f14930a = false;
        this.f14935f = new TaskCompletionSource();
        iVar.b();
        Context context = iVar.f12041a;
        this.f14931b = iVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f14930a = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e2);
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                bool2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                if (bool2 != null) {
                    this.f14930a = false;
                    bool = null;
                } else {
                    this.f14930a = true;
                    bool = Boolean.valueOf(Boolean.TRUE.equals(bool2));
                }
            }
            bool2 = null;
            if (bool2 != null) {
            }
        }
        this.f14934e = bool;
        synchronized (this.f14932c) {
            try {
                if (b()) {
                    ((TaskCompletionSource) this.f14933d).trySetResult(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public G(C0967h c0967h, com.google.android.gms.common.api.g gVar, C0960a c0960a) {
        this.f14935f = c0967h;
        this.f14933d = null;
        this.f14934e = null;
        this.f14930a = false;
        this.f14931b = gVar;
        this.f14932c = c0960a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0988d
    public void a(F5.b bVar) {
        ((C0967h) this.f14935f).f14987B.post(new Y(1, this, bVar));
    }

    public synchronized boolean b() {
        boolean z8;
        Boolean bool = (Boolean) this.f14934e;
        if (bool != null) {
            z8 = bool.booleanValue();
        } else {
            try {
                z8 = ((Y6.i) this.f14931b).k();
            } catch (IllegalStateException unused) {
                z8 = false;
            }
        }
        c(z8);
        return z8;
    }

    public void c(boolean z8) {
        String n6 = h3.o.n("Crashlytics automatic data collection ", z8 ? "ENABLED" : "DISABLED", " by ", ((Boolean) this.f14934e) == null ? "global Firebase setting" : this.f14930a ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", n6, null);
        }
    }

    public void d(F5.b bVar) {
        E e2 = (E) ((C0967h) this.f14935f).f14998x.get((C0960a) this.f14932c);
        if (e2 != null) {
            e2.o(bVar);
        }
    }
}
