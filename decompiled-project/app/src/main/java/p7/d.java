package p7;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import i1.C1290a;
import j8.InterfaceC1387b;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import q7.ScheduledExecutorServiceC1901e;
import q7.ThreadFactoryC1897a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1387b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23124a;

    public /* synthetic */ d(int i7) {
        this.f23124a = i7;
    }

    @Override // j8.InterfaceC1387b
    public final Object get() {
        switch (this.f23124a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                l lVar = ExecutorsRegistrar.f15852a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i7 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i7 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new ScheduledExecutorServiceC1901e(Executors.newFixedThreadPool(4, new ThreadFactoryC1897a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f15855d.get());
            case 3:
                l lVar2 = ExecutorsRegistrar.f15852a;
                return new ScheduledExecutorServiceC1901e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC1897a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f15855d.get());
            case 4:
                l lVar3 = ExecutorsRegistrar.f15852a;
                return new ScheduledExecutorServiceC1901e(Executors.newCachedThreadPool(new ThreadFactoryC1897a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f15855d.get());
            case 5:
                l lVar4 = ExecutorsRegistrar.f15852a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1897a("Firebase Scheduler", 0, null));
            case 6:
                C1290a c1290a = FirebaseMessaging.k;
                return null;
            default:
                Random random = u8.j.j;
                return null;
        }
    }
}
