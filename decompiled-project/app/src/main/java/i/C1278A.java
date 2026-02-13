package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import o.C1748n;
import o.C1750o;
import o.C1769y;
import u.T;

/* renamed from: i.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1278A {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f17982b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17983c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17984d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f17985e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f17986f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final T f17987h = new T(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f17988a = new Object[2];

    public C1748n a(Context context, AttributeSet attributeSet) {
        return new C1748n(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C1750o c(Context context, AttributeSet attributeSet) {
        return new C1750o(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.checkboxStyle);
    }

    public C1769y d(Context context, AttributeSet attributeSet) {
        return new C1769y(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        T t5 = f17987h;
        Constructor constructor = (Constructor) t5.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f17982b);
            t5.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f17988a);
    }
}
