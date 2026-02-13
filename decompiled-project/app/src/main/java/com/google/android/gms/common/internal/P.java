package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class P implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15041a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f15042b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15043c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f15044d;

    /* renamed from: e, reason: collision with root package name */
    public final O f15045e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f15046f;
    public final /* synthetic */ S g;

    public P(S s3, O o10) {
        this.g = s3;
        this.f15045e = o10;
    }

    public static F5.b a(P p10, String str, Executor executor) {
        F5.b bVar;
        try {
            Intent a9 = p10.f15045e.a(p10.g.f15049e);
            p10.f15042b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(M5.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                S s3 = p10.g;
                boolean d10 = s3.g.d(s3.f15049e, str, a9, p10, 4225, executor);
                p10.f15043c = d10;
                if (d10) {
                    p10.g.f15050f.sendMessageDelayed(p10.g.f15050f.obtainMessage(1, p10.f15045e), p10.g.f15052i);
                    bVar = F5.b.f4086e;
                } else {
                    p10.f15042b = 2;
                    try {
                        S s10 = p10.g;
                        s10.g.c(s10.f15049e, p10);
                    } catch (IllegalArgumentException unused) {
                    }
                    bVar = new F5.b(16);
                }
                return bVar;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (H e2) {
            return e2.f15026a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f15048d) {
            try {
                this.g.f15050f.removeMessages(1, this.f15045e);
                this.f15044d = iBinder;
                this.f15046f = componentName;
                Iterator it = this.f15041a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f15042b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f15048d) {
            try {
                this.g.f15050f.removeMessages(1, this.f15045e);
                this.f15044d = null;
                this.f15046f = componentName;
                Iterator it = this.f15041a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f15042b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
