package r8;

import A9.O0;
import F.Q;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u.C2052e;
import u.T;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: i, reason: collision with root package name */
    public static final long f23881i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23882a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f23883b;

    /* renamed from: c, reason: collision with root package name */
    public final T6.a f23884c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f23885d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f23887f;

    /* renamed from: h, reason: collision with root package name */
    public final s f23888h;

    /* renamed from: e, reason: collision with root package name */
    public final C2052e f23886e = new T(0);
    public boolean g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [u.T, u.e] */
    public u(FirebaseMessaging firebaseMessaging, Q q10, s sVar, T6.a aVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f23885d = firebaseMessaging;
        this.f23883b = q10;
        this.f23888h = sVar;
        this.f23884c = aVar;
        this.f23882a = context;
        this.f23887f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e11) {
            e = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) {
        String a9 = this.f23885d.a();
        T6.a aVar = this.f23884c;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(aVar.m(aVar.w(a9, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a9 = this.f23885d.a();
        T6.a aVar = this.f23884c;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(aVar.m(aVar.w(a9, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z8) {
        this.g = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0094 A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:8:0x002a, B:17:0x0059, B:19:0x0061, B:65:0x0076, B:67:0x0081, B:68:0x0094, B:70:0x009f, B:71:0x0039, B:74:0x0046), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        r a9;
        char c10;
        s sVar;
        while (true) {
            synchronized (this) {
                try {
                    a9 = this.f23888h.a();
                    if (a9 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a9.f23871b;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c10 = 1;
                        String str2 = a9.f23870a;
                        if (c10 != 0) {
                            b(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        } else if (c10 == 1) {
                            c(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + a9 + ".");
                        }
                        sVar = this.f23888h;
                        synchronized (sVar) {
                            O0 o02 = sVar.f23874a;
                            String str3 = a9.f23872c;
                            synchronized (((ArrayDeque) o02.f925d)) {
                                if (((ArrayDeque) o02.f925d).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) o02.f926e).execute(new k1.a(o02, 10));
                                }
                            }
                        }
                        synchronized (this.f23886e) {
                            try {
                                String str4 = a9.f23872c;
                                if (this.f23886e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f23886e.get(str4);
                                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                                    if (taskCompletionSource != null) {
                                        taskCompletionSource.setResult(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f23886e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c10 = 65535;
                    String str22 = a9.f23870a;
                    if (c10 != 0) {
                    }
                    sVar = this.f23888h;
                    synchronized (sVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        c10 = 0;
                        String str222 = a9.f23870a;
                        if (c10 != 0) {
                        }
                        sVar = this.f23888h;
                        synchronized (sVar) {
                        }
                    }
                    c10 = 65535;
                    String str2222 = a9.f23870a;
                    if (c10 != 0) {
                    }
                    sVar = this.f23888h;
                    synchronized (sVar) {
                    }
                }
            } catch (IOException e2) {
                if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e2.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e2.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e2.getMessage() != null) {
                        throw e2;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j10) {
        long min = Math.min(Math.max(30L, 2 * j10), f23881i);
        this.f23887f.schedule(new w(this, this.f23882a, this.f23883b, min), j10, TimeUnit.SECONDS);
        d(true);
    }
}
