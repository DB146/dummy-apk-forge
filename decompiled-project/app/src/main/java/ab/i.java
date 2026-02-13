package ab;

import android.app.Application;
import com.kt.apps.core.service.CloudMessagingService;
import oa.C1831f;

/* loaded from: classes2.dex */
public final class i implements cb.b {

    /* renamed from: a, reason: collision with root package name */
    public final CloudMessagingService f12811a;

    /* renamed from: b, reason: collision with root package name */
    public C1831f f12812b;

    public i(CloudMessagingService cloudMessagingService) {
        this.f12811a = cloudMessagingService;
    }

    @Override // cb.b
    public final Object e() {
        if (this.f12812b == null) {
            Application application = this.f12811a.getApplication();
            com.bumptech.glide.c.h(application instanceof cb.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.f12812b = new C1831f(((oa.j) ((h) c2.i.p(h.class, application))).g);
        }
        return this.f12812b;
    }
}
