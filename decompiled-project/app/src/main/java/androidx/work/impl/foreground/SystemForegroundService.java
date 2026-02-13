package androidx.work.impl.foreground;

import I2.K;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import h3.C1235A;
import h3.z;
import hc.i;
import i3.p;
import java.util.UUID;
import kotlin.jvm.internal.l;
import l2.AbstractServiceC1450A;
import p3.C1847a;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC1450A {

    /* renamed from: e, reason: collision with root package name */
    public static final String f13757e = z.g("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public boolean f13758b;

    /* renamed from: c, reason: collision with root package name */
    public C1847a f13759c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f13760d;

    public final void c() {
        this.f13760d = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1847a c1847a = new C1847a(getApplicationContext());
        this.f13759c = c1847a;
        if (c1847a.f23044w != null) {
            z.e().c(C1847a.f23035x, "A callback already exists.");
        } else {
            c1847a.f23044w = this;
        }
    }

    @Override // l2.AbstractServiceC1450A, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // l2.AbstractServiceC1450A, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f13759c.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        super.onStartCommand(intent, i7, i10);
        boolean z8 = this.f13758b;
        String str = f13757e;
        if (z8) {
            z.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f13759c.d();
            c();
            this.f13758b = false;
        }
        if (intent == null) {
            return 3;
        }
        C1847a c1847a = this.f13759c;
        c1847a.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C1847a.f23035x;
        if (equals) {
            z.e().f(str2, "Started foreground service " + intent);
            c1847a.f23037b.r(new i(7, c1847a, intent.getStringExtra("KEY_WORKSPEC_ID")));
            c1847a.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c1847a.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            z.e().f(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = c1847a.f23044w;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f13758b = true;
            z.e().a(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        z.e().f(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID id = UUID.fromString(stringExtra);
        p pVar = c1847a.f23036a;
        pVar.getClass();
        l.e(id, "id");
        C1235A c1235a = pVar.f18379c.f17677m;
        K k = (K) pVar.f18381e.f23382a;
        l.d(k, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        vc.i.z(c1235a, "CancelWorkById", k, new A0.K(14, pVar, id));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i7) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f13759c.f(2048);
    }

    public final void onTimeout(int i7, int i10) {
        this.f13759c.f(i10);
    }
}
