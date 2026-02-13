package H7;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4906a;

    public e(int i7) {
        switch (i7) {
            case 1:
                this.f4906a = com.bumptech.glide.d.f(Looper.getMainLooper());
                return;
            default:
                this.f4906a = new Handler(Looper.getMainLooper());
                return;
        }
    }
}
