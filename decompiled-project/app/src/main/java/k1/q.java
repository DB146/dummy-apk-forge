package k1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18785a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f18789e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f18790f;
    public PendingIntent g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f18791h;

    /* renamed from: i, reason: collision with root package name */
    public int f18792i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public C9.h f18793l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f18795n;

    /* renamed from: q, reason: collision with root package name */
    public String f18798q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f18799r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f18800s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f18801t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18786b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18787c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18788d = new ArrayList();
    public boolean k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18794m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f18796o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f18797p = 0;

    public q(Context context, String str) {
        Notification notification = new Notification();
        this.f18800s = notification;
        this.f18785a = context;
        this.f18798q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.f18801t = new ArrayList();
        this.f18799r = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        r8.o oVar = new r8.o(this);
        q qVar = (q) oVar.f23859d;
        C9.h hVar = qVar.f18793l;
        if (hVar != null) {
            hVar.g(oVar);
        }
        int i7 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) oVar.f23858c;
        Notification build = i7 >= 26 ? builder.build() : builder.build();
        if (hVar != null) {
            qVar.f18793l.getClass();
        }
        if (hVar != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", hVar.i());
        }
        return build;
    }

    public final void c(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f18785a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f13276b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f18791h = iconCompat;
    }

    public final void d(C9.h hVar) {
        if (this.f18793l != hVar) {
            this.f18793l = hVar;
            if (((q) hVar.f3094a) != this) {
                hVar.f3094a = this;
                d(hVar);
            }
        }
    }
}
