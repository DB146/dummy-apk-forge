package E5;

import Y5.C0609e;
import Y5.C0632l1;
import Y5.C0646q0;
import Y5.C0648s;
import Y5.I;
import Y5.K1;
import Y5.O1;
import Y5.W;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f3692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3694e;

    public /* synthetic */ j(C0632l1 c0632l1, O1 o12, boolean z8, G5.a aVar, int i7) {
        this.f3690a = i7;
        this.f3692c = o12;
        this.f3691b = z8;
        this.f3693d = aVar;
        this.f3694e = c0632l1;
    }

    public j(C0632l1 c0632l1, O1 o12, boolean z8, C0609e c0609e) {
        this.f3690a = 3;
        this.f3692c = o12;
        this.f3691b = z8;
        this.f3693d = c0609e;
        Objects.requireNonNull(c0632l1);
        this.f3694e = c0632l1;
    }

    public /* synthetic */ j(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z8, BroadcastReceiver.PendingResult pendingResult) {
        this.f3690a = 0;
        this.f3692c = intent;
        this.f3693d = context;
        this.f3691b = z8;
        this.f3694e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i7;
        switch (this.f3690a) {
            case 0:
                Intent intent = (Intent) this.f3692c;
                Context context = (Context) this.f3693d;
                boolean z8 = this.f3691b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f3694e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i7 = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i10 = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f15861b;
                                    Executor executor2 = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor2 == null) {
                                        zze.zza();
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new N5.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor2 = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f15861b = new SoftReference(executor2);
                                    }
                                    executor = executor2;
                                } finally {
                                }
                            }
                            executor.execute(new C7.c(context, aVar, countDownLatch, 1, false));
                            try {
                                i10 = ((Integer) Tasks.await(new r8.h(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e2) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e10) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                            }
                        }
                        i7 = i10;
                    }
                    if (z8 && pendingResult != null) {
                        pendingResult.setResultCode(i7);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                C0632l1 c0632l1 = (C0632l1) this.f3694e;
                I i11 = c0632l1.f11815d;
                if (i11 == null) {
                    W w10 = ((C0646q0) c0632l1.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.a("Discarding data. Failed to set user property");
                    return;
                } else {
                    c0632l1.b0(i11, this.f3691b ? null : (K1) this.f3693d, (O1) this.f3692c);
                    c0632l1.W();
                    return;
                }
            case 2:
                C0632l1 c0632l12 = (C0632l1) this.f3694e;
                I i12 = c0632l12.f11815d;
                if (i12 == null) {
                    W w11 = ((C0646q0) c0632l12.f3094a).f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.a("Discarding data. Failed to send event to service");
                    return;
                } else {
                    c0632l12.b0(i12, this.f3691b ? null : (C0648s) this.f3693d, (O1) this.f3692c);
                    c0632l12.W();
                    return;
                }
            default:
                C0632l1 c0632l13 = (C0632l1) this.f3694e;
                I i13 = c0632l13.f11815d;
                if (i13 == null) {
                    W w12 = ((C0646q0) c0632l13.f3094a).f11912f;
                    C0646q0.l(w12);
                    w12.f11577f.a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    c0632l13.b0(i13, this.f3691b ? null : (C0609e) this.f3693d, (O1) this.f3692c);
                    c0632l13.W();
                    return;
                }
        }
    }
}
