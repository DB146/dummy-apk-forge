package E6;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final D9.a f3725a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f3726b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3727c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f3728d;

    /* renamed from: e, reason: collision with root package name */
    public F6.j f3729e;

    public c(Context context) {
        D9.a aVar = new D9.a("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f3728d = new HashSet();
        this.f3729e = null;
        this.f3725a = aVar;
        this.f3726b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f3727c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        F6.j jVar;
        HashSet hashSet = this.f3728d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.f3727c;
        if (!isEmpty && this.f3729e == null) {
            F6.j jVar2 = new F6.j(this, 0);
            this.f3729e = jVar2;
            int i7 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f3726b;
            if (i7 >= 33) {
                context.registerReceiver(jVar2, intentFilter, 2);
            } else {
                context.registerReceiver(jVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (jVar = this.f3729e) == null) {
            return;
        }
        context.unregisterReceiver(jVar);
        this.f3729e = null;
    }
}
