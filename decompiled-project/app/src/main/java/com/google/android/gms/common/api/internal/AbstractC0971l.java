package com.google.android.gms.common.api.internal;

import W1.C0558a;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0971l {
    protected final InterfaceC0972m mLifecycleFragment;

    public AbstractC0971l(InterfaceC0972m interfaceC0972m) {
        this.mLifecycleFragment = interfaceC0972m;
    }

    public static InterfaceC0972m getFragment(Activity activity) {
        return getFragment(new C0970k(activity));
    }

    public static InterfaceC0972m getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static InterfaceC0972m getFragment(C0970k c0970k) {
        a0 a0Var;
        b0 b0Var;
        Activity activity = c0970k.f15001a;
        if (!(activity instanceof W1.G)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = a0.f14973b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (a0Var = (a0) weakReference.get()) == null) {
                try {
                    a0Var = (a0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (a0Var == null || a0Var.isRemoving()) {
                        a0Var = new a0();
                        activity.getFragmentManager().beginTransaction().add(a0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(a0Var));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            return a0Var;
        }
        W1.G g = (W1.G) activity;
        WeakHashMap weakHashMap2 = b0.f14975n0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(g);
        if (weakReference2 == null || (b0Var = (b0) weakReference2.get()) == null) {
            try {
                b0Var = (b0) g.j().E("SLifecycleFragmentImpl");
                if (b0Var == null || b0Var.f10258A) {
                    b0Var = new b0();
                    W1.U j = g.j();
                    j.getClass();
                    C0558a c0558a = new C0558a(j);
                    c0558a.g(0, b0Var, "SLifecycleFragmentImpl", 1);
                    c0558a.e(true);
                }
                weakHashMap2.put(g, new WeakReference(b0Var));
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
            }
        }
        return b0Var;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity t5 = this.mLifecycleFragment.t();
        com.google.android.gms.common.internal.G.g(t5);
        return t5;
    }

    public void onActivityResult(int i7, int i10, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public abstract void onStop();
}
