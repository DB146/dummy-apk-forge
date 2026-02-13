package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f15695b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15696c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15698e;

    /* renamed from: a, reason: collision with root package name */
    private final J6.y f15694a = new J6.y("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f15697d = new Object();

    public y(String str, long j) {
        this.f15695b = str;
        this.f15696c = j;
    }

    public final Task a(Activity activity, int i7) {
        synchronized (this.f15697d) {
            try {
                if (this.f15698e) {
                    return Tasks.forResult(0);
                }
                this.f15698e = true;
                J6.y yVar = this.f15694a;
                Object[] objArr = {Integer.valueOf(i7)};
                yVar.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", J6.y.c(yVar.f5562a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i7);
                bundle.putString("package.name", this.f15695b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f15696c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
