package E5;

import A0.G0;
import B0.C;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import u.T;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f3671h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f3672i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f3674b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.h f3675c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3676d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f3678f;
    public g g;

    /* renamed from: a, reason: collision with root package name */
    public final T f3673a = new T(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f3677e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f3674b = context;
        this.f3675c = new A4.h(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3676d = scheduledThreadPoolExecutor;
    }

    public final Task a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i7 = f3671h;
            f3671h = i7 + 1;
            num = Integer.toString(i7);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f3673a) {
            this.f3673a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f3675c.w() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f3674b;
        synchronized (b.class) {
            try {
                if (f3672i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f3672i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f3672i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f3677e);
        if (this.f3678f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f3678f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.f3685a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(h.f3687c, new G0(this, num, this.f3676d.schedule(new C(taskCompletionSource, 4), 30L, TimeUnit.SECONDS), 13));
            return taskCompletionSource.getTask();
        }
        if (this.f3675c.w() == 2) {
            this.f3674b.sendBroadcast(intent);
        } else {
            this.f3674b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(h.f3687c, new G0(this, num, this.f3676d.schedule(new C(taskCompletionSource, 4), 30L, TimeUnit.SECONDS), 13));
        return taskCompletionSource.getTask();
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f3673a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3673a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
