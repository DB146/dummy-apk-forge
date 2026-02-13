package E3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f3532e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3533a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f3534b;

    /* renamed from: c, reason: collision with root package name */
    public final D5.i f3535c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3536d;

    static {
        f3532e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public g(Context context) {
        this.f3536d = f3532e;
        this.f3533a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f3534b = activityManager;
        this.f3535c = new D5.i(context.getResources().getDisplayMetrics(), 8);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f3536d = 0.0f;
    }
}
