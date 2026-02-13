package com.google.android.play.core.integrity;

import J6.AbstractC0344a;
import J6.B;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final J6.d f15651a;

    /* renamed from: b, reason: collision with root package name */
    private final J6.y f15652b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15653c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f15654d;

    /* renamed from: e, reason: collision with root package name */
    private final at f15655e;

    /* renamed from: f, reason: collision with root package name */
    private final k f15656f;

    public bn(Context context, J6.y yVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15654d = taskCompletionSource;
        this.f15653c = context.getPackageName();
        this.f15652b = yVar;
        this.f15655e = atVar;
        this.f15656f = kVar;
        J6.d dVar = new J6.d(context, yVar, "ExpressIntegrityService", bo.f15657a, new B() { // from class: com.google.android.play.core.integrity.bd
            @Override // J6.B
            public final Object a(IBinder iBinder) {
                int i7 = J6.n.j;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return queryLocalInterface instanceof J6.o ? (J6.o) queryLocalInterface : new AbstractC0344a(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f15651a = dVar;
        dVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j, long j10, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f15653c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new J6.l(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q3.f.b(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f15653c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new J6.l(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q3.f.b(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f15654d.getTask().isSuccessful() && ((Integer) bnVar.f15654d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i7 = bundle.getInt("dialog.intent.type");
        this.f15652b.b("requestAndShowDialog(%s)", Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15651a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j, long j10, int i7) {
        this.f15652b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15651a.c(new bg(this, taskCompletionSource, 0, str, j, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i7) {
        this.f15652b.b("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15651a.c(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
