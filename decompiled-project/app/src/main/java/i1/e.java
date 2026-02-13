package i1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h1.AbstractC1232a;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1291b f18189a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18190b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18191c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18192d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18193e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18194f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public int f18195h;

    /* renamed from: i, reason: collision with root package name */
    public int f18196i;
    public int j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public View f18197l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18198m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18199n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f18200o;

    public e() {
        super(-2, -2);
        this.f18190b = false;
        this.f18191c = 0;
        this.f18192d = 0;
        this.f18193e = -1;
        this.f18194f = -1;
        this.g = 0;
        this.f18195h = 0;
        this.f18200o = new Rect();
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1291b abstractC1291b;
        this.f18190b = false;
        this.f18191c = 0;
        this.f18192d = 0;
        this.f18193e = -1;
        this.f18194f = -1;
        this.g = 0;
        this.f18195h = 0;
        this.f18200o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1232a.f17638b);
        this.f18191c = obtainStyledAttributes.getInteger(0, 0);
        this.f18194f = obtainStyledAttributes.getResourceId(1, -1);
        this.f18192d = obtainStyledAttributes.getInteger(2, 0);
        this.f18193e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.f18195h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f18190b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f13235H;
            if (TextUtils.isEmpty(string)) {
                abstractC1291b = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f13235H;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f13237J;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f13236I);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1291b = (AbstractC1291b) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException(X.c.t("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.f18189a = abstractC1291b;
        }
        obtainStyledAttributes.recycle();
        AbstractC1291b abstractC1291b2 = this.f18189a;
        if (abstractC1291b2 != null) {
            abstractC1291b2.g(this);
        }
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f18190b = false;
        this.f18191c = 0;
        this.f18192d = 0;
        this.f18193e = -1;
        this.f18194f = -1;
        this.g = 0;
        this.f18195h = 0;
        this.f18200o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f18190b = false;
        this.f18191c = 0;
        this.f18192d = 0;
        this.f18193e = -1;
        this.f18194f = -1;
        this.g = 0;
        this.f18195h = 0;
        this.f18200o = new Rect();
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f18190b = false;
        this.f18191c = 0;
        this.f18192d = 0;
        this.f18193e = -1;
        this.f18194f = -1;
        this.g = 0;
        this.f18195h = 0;
        this.f18200o = new Rect();
    }

    public final boolean a(int i7) {
        if (i7 == 0) {
            return this.f18198m;
        }
        if (i7 != 1) {
            return false;
        }
        return this.f18199n;
    }
}
