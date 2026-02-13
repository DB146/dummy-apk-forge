package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes.dex */
final class as extends J6.w {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f15606a;

    /* renamed from: b, reason: collision with root package name */
    final J6.d f15607b;

    /* renamed from: c, reason: collision with root package name */
    private final J6.y f15608c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15609d;

    /* renamed from: e, reason: collision with root package name */
    private final k f15610e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f15611f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, J6.d dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f15608c = new J6.y("RequestDialogCallbackImpl");
        this.f15609d = context.getPackageName();
        this.f15610e = kVar;
        this.f15606a = taskCompletionSource;
        this.f15611f = activity;
        this.f15607b = dVar;
    }

    @Override // J6.x
    public final void b(Bundle bundle) {
        this.f15607b.d(this.f15606a);
        this.f15608c.b("onRequestDialog(%s)", this.f15609d);
        com.google.android.gms.common.api.j a9 = this.f15610e.a(bundle);
        if (a9 != null) {
            this.f15606a.trySetException(a9);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            J6.y yVar = this.f15608c;
            Object[] objArr = {this.f15609d};
            yVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", J6.y.c(yVar.f5562a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f15606a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f15611f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f15607b.a()));
        J6.y yVar2 = this.f15608c;
        Object[] objArr2 = new Object[0];
        yVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", J6.y.c(yVar2.f5562a, "Starting dialog intent...", objArr2));
        }
        this.f15611f.startActivityForResult(intent, 0);
    }
}
