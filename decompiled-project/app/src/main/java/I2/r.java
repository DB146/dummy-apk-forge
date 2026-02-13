package I2;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class r extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f5194a;

    public r(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f5194a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        InterfaceC0317f callback = (InterfaceC0317f) iInterface;
        kotlin.jvm.internal.l.e(callback, "callback");
        kotlin.jvm.internal.l.e(cookie, "cookie");
        this.f5194a.f13720b.remove((Integer) cookie);
    }
}
