package B6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c6.AbstractC0911a;

/* loaded from: classes.dex */
public final class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2113a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f2114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2115c;

    public b(Context context) {
        super(context, null);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AbstractC0911a.f14396C);
        this.f2113a = obtainStyledAttributes.getText(2);
        this.f2114b = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : Q5.e.x(context, resourceId);
        this.f2115c = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
