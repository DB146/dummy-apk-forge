package s7;

import android.util.Log;
import h4.h;
import java.util.concurrent.atomic.AtomicReference;
import p7.n;
import r7.C1947c;
import y7.C2438l0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final c f24183c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final n f24184a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f24185b = new AtomicReference(null);

    public a(n nVar) {
        this.f24184a = nVar;
        nVar.a(new C1947c(this, 5));
    }

    public final c a(String str) {
        a aVar = (a) this.f24185b.get();
        return aVar == null ? f24183c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f24185b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f24185b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j, C2438l0 c2438l0) {
        String t5 = X.c.t("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", t5, null);
        }
        this.f24184a.a(new h(str, j, c2438l0));
    }
}
