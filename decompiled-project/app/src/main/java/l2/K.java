package l2;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import l2.M;

/* loaded from: classes.dex */
public abstract class K {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, r event) {
        C1481z w10;
        kotlin.jvm.internal.l.e(event, "event");
        if (!(activity instanceof InterfaceC1479x) || (w10 = ((InterfaceC1479x) activity).w()) == null) {
            return;
        }
        w10.d(event);
    }

    public static void b(k1.h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            M.a.Companion.getClass();
            hVar.registerActivityLifecycleCallbacks(new M.a());
        }
        FragmentManager fragmentManager = hVar.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new M(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
