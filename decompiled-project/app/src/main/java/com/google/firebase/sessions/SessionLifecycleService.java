package com.google.firebase.sessions;

import A8.h0;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f15883a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b, reason: collision with root package name */
    public h0 f15884b;

    /* renamed from: c, reason: collision with root package name */
    public Messenger f15885c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        Object parcelableExtra;
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            messenger = (Messenger) parcelableExtra;
        } else {
            messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        }
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            h0 h0Var = this.f15884b;
            if (h0Var != null) {
                h0Var.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.f15885c;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f15883a;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        l.d(looper, "handlerThread.looper");
        this.f15884b = new h0(looper);
        this.f15885c = new Messenger(this.f15884b);
        Log.d("SessionLifecycleService", "Service created on process " + Process.myPid());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f15883a.quit();
    }
}
