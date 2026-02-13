package C5;

import F5.e;
import android.content.Context;
import com.google.android.gms.common.api.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public static int f2906a = 1;

    public final synchronized int c() {
        int i7;
        try {
            i7 = f2906a;
            if (i7 == 1) {
                Context applicationContext = getApplicationContext();
                e eVar = e.f4098d;
                int d10 = eVar.d(applicationContext, 12451000);
                if (d10 == 0) {
                    i7 = 4;
                    f2906a = 4;
                } else if (eVar.b(d10, applicationContext, null) != null || Q5.d.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    f2906a = 2;
                } else {
                    i7 = 3;
                    f2906a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }
}
