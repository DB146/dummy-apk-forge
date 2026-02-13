package k1;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f18775a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f18776b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18777c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18778d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18779e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f18780f;
    public final PendingIntent g;

    public k(String str, PendingIntent pendingIntent) {
        IconCompat b2 = IconCompat.b(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f18778d = true;
        this.f18776b = b2;
        if (b2.d() == 2) {
            this.f18779e = b2.c();
        }
        this.f18780f = q.b(str);
        this.g = pendingIntent;
        this.f18775a = bundle;
        this.f18777c = true;
        this.f18778d = true;
    }
}
