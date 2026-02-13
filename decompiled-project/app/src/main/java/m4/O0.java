package m4;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20118a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20119b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20120c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20121d;

    public O0(Context context, int i7) {
        switch (i7) {
            case 1:
                this.f20120c = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                return;
            default:
                this.f20120c = (PowerManager) context.getApplicationContext().getSystemService("power");
                return;
        }
    }
}
