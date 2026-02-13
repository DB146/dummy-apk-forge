package r8;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import k5.C1425d;
import r7.C1947c;
import r7.C1948d;
import u.T;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f23838c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ServiceConnectionC1950A f23839d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f23840a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23841b;

    public h(Context context) {
        this.f23840a = context;
        this.f23841b = new E2.d(0);
    }

    public h(ExecutorService executorService) {
        this.f23841b = new T(0);
        this.f23840a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z8) {
        ServiceConnectionC1950A serviceConnectionC1950A;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f23838c) {
            try {
                if (f23839d == null) {
                    f23839d = new ServiceConnectionC1950A(context);
                }
                serviceConnectionC1950A = f23839d;
            } finally {
            }
        }
        if (!z8) {
            return serviceConnectionC1950A.b(intent).continueWith(new E2.d(0), new C1948d(2));
        }
        if (o.f().j(context)) {
            synchronized (x.f23900b) {
                try {
                    x.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        x.f23901c.a(x.f23899a);
                    }
                    serviceConnectionC1950A.b(intent).addOnCompleteListener(new C1947c(intent, 2));
                } finally {
                }
            }
        } else {
            serviceConnectionC1950A.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean f4 = M5.c.f();
        Context context = (Context) this.f23840a;
        boolean z8 = f4 && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z10 = (intent.getFlags() & 268435456) != 0;
        if (z8 && !z10) {
            return a(context, intent, z10);
        }
        E2.d dVar = (E2.d) this.f23841b;
        return Tasks.call(dVar, new L7.o(3, context, intent)).continueWithTask(dVar, new C1425d(context, intent, z10));
    }
}
