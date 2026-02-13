package D6;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.C1521c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3258a = {R.attr.theme, com.kt.apps.media.xemtv.beta.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3259b = {com.kt.apps.media.xemtv.beta.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i7, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3259b, i7, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z8 = (context instanceof C1521c) && ((C1521c) context).f19621a == resourceId;
        if (resourceId == 0 || z8) {
            return context;
        }
        C1521c c1521c = new C1521c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3258a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c1521c.getTheme().applyStyle(resourceId2, true);
        }
        return c1521c;
    }
}
