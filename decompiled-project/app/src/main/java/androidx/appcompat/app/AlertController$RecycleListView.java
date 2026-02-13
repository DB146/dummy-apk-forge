package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.AbstractC1213a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f12882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12883b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17582t);
        this.f12883b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f12882a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
