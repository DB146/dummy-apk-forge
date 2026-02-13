package X1;

import W1.C;
import android.util.Log;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10910a = c.f10909a;

    public static c a(C c10) {
        while (c10 != null) {
            if (c10.K()) {
                c10.E();
            }
            c10 = c10.f10268K;
        }
        return f10910a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f10902a.getClass().getName()), aVar);
        }
    }

    public static final void c(C fragment, String previousFragmentId) {
        l.e(fragment, "fragment");
        l.e(previousFragmentId, "previousFragmentId");
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }
}
