package A6;

import android.os.Handler;
import android.os.Looper;
import lc.InterfaceC1518b;

/* loaded from: classes.dex */
public final class f implements InterfaceC1518b {

    /* renamed from: b, reason: collision with root package name */
    public static f f529b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f530a;

    public f() {
        this.f530a = new Object();
        new Handler(Looper.getMainLooper(), new e(this, 0));
    }

    public f(Object obj) {
        this.f530a = obj;
    }
}
