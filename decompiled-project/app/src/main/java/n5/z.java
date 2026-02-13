package n5;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f21237b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21238a;

    public z(Handler handler) {
        this.f21238a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y b() {
        y obj;
        ArrayList arrayList = f21237b;
        synchronized (arrayList) {
            try {
                obj = arrayList.isEmpty() ? new Object() : (y) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final y a(int i7, Object obj) {
        y b2 = b();
        b2.f21236a = this.f21238a.obtainMessage(i7, obj);
        return b2;
    }

    public final boolean c(Runnable runnable) {
        return this.f21238a.post(runnable);
    }

    public final boolean d(int i7) {
        return this.f21238a.sendEmptyMessage(i7);
    }
}
