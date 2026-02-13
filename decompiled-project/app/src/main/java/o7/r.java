package o7;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0962c;
import com.google.android.gms.common.api.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f22105a;

    /* renamed from: b, reason: collision with root package name */
    public final C1818h f22106b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f22107c;

    /* JADX WARN: Type inference failed for: r1v0, types: [o7.h, java.lang.Object] */
    public r(Y6.i iVar) {
        iVar.b();
        Context context = iVar.f12041a;
        ?? obj = new Object();
        C1818h.f22088f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        obj.f22092d = new zze(handlerThread.getLooper());
        iVar.b();
        obj.f22093e = new hc.i(obj, iVar.f12042b);
        obj.f22091c = 300000L;
        this.f22107c = false;
        this.f22105a = 0;
        this.f22106b = obj;
        ComponentCallbacks2C0962c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0962c.f14977e.a(new D(this, 1));
    }
}
