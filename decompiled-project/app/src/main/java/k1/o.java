package k1;

import android.app.Notification;

/* loaded from: classes.dex */
public final class o extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18784b;

    @Override // C9.h
    public final void g(r8.o oVar) {
        new Notification.BigTextStyle((Notification.Builder) oVar.f23858c).setBigContentTitle(null).bigText(this.f18784b);
    }

    @Override // C9.h
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
