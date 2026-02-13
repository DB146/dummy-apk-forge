package com.google.android.play.core.integrity;

import J6.AbstractC0344a;
import J6.B;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final J6.d f15588a;

    /* renamed from: b, reason: collision with root package name */
    private final J6.y f15589b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15590c;

    /* renamed from: d, reason: collision with root package name */
    private final at f15591d;

    /* renamed from: e, reason: collision with root package name */
    private final k f15592e;

    public aj(Context context, J6.y yVar, at atVar, k kVar) {
        this.f15590c = context.getPackageName();
        this.f15589b = yVar;
        this.f15591d = atVar;
        this.f15592e = kVar;
        J6.y yVar2 = J6.f.f5555a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (J6.f.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f15588a = new J6.d(context, yVar, "IntegrityService", ak.f15593a, new B() { // from class: com.google.android.play.core.integrity.ae
                        @Override // J6.B
                        public final Object a(IBinder iBinder) {
                            int i7 = J6.s.j;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            return queryLocalInterface instanceof J6.t ? (J6.t) queryLocalInterface : new AbstractC0344a(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        yVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", J6.y.c(yVar.f5562a, "Phonesky is not installed.", objArr));
        }
        this.f15588a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f15590c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new J6.l(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q3.f.b(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f15588a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i7 = bundle.getInt("dialog.intent.type");
        this.f15589b.b("requestAndShowDialog(%s, %s)", this.f15590c, Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15588a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f15588a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f15589b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f15588a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e2) {
            return Tasks.forException(new IntegrityServiceException(-13, e2));
        }
    }
}
