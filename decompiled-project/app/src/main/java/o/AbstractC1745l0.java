package o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: o.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1745l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f21537a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f21537a = field;
    }
}
