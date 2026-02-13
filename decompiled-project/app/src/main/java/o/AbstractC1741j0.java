package o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: o.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1741j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f21527a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f21528b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f21529c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f21530d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f21527a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f21528b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f21529c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f21530d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
