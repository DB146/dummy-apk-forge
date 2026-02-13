package k1;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class n extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f18781b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f18782c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18783d;

    @Override // C9.h
    public final void g(r8.o oVar) {
        Bitmap a9;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) oVar.f23858c).setBigContentTitle(null);
        IconCompat iconCompat = this.f18781b;
        Context context = (Context) oVar.f23857b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                m.a(bigContentTitle, iconCompat.g(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f18781b;
                int i7 = iconCompat2.f13275a;
                if (i7 == -1) {
                    Object obj = iconCompat2.f13276b;
                    a9 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i7 == 1) {
                    a9 = (Bitmap) iconCompat2.f13276b;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a9 = IconCompat.a((Bitmap) iconCompat2.f13276b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a9);
            }
        }
        if (this.f18783d) {
            IconCompat iconCompat3 = this.f18782c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                l.a(bigContentTitle, iconCompat3.g(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            m.c(bigContentTitle, false);
            m.b(bigContentTitle, null);
        }
    }

    @Override // C9.h
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
