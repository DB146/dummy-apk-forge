package o;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: o.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1733f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f21491a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f21492b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f21493c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f21494d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f21495e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f21496f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z8;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
        } catch (ClassNotFoundException unused) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused2) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused3) {
            method = null;
            field = null;
        }
        try {
            field = cls.getField("left");
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField("right");
                    try {
                        field4 = cls.getField("bottom");
                        z8 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field4 = null;
                        z8 = false;
                        if (z8) {
                        }
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused6) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z8 = false;
                if (z8) {
                }
            } catch (NoSuchFieldException unused7) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z8 = false;
                if (z8) {
                }
            } catch (NoSuchMethodException unused8) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z8 = false;
                if (z8) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z8 = false;
            if (z8) {
            }
        } catch (NoSuchFieldException unused10) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z8 = false;
            if (z8) {
            }
        } catch (NoSuchMethodException unused11) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z8 = false;
            if (z8) {
            }
        }
        if (z8) {
            f21492b = null;
            f21493c = null;
            f21494d = null;
            f21495e = null;
            f21496f = null;
            f21491a = false;
            return;
        }
        f21492b = method;
        f21493c = field;
        f21494d = field2;
        f21495e = field3;
        f21496f = field4;
        f21491a = true;
    }
}
