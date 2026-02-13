package W1;

import a3.C0735l;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f10463a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10464b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, W1.i0] */
    static {
        k0 k0Var = null;
        try {
            k0Var = (k0) C0735l.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10464b = k0Var;
    }

    public static final void a(int i7, ArrayList views) {
        kotlin.jvm.internal.l.e(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i7);
        }
    }
}
