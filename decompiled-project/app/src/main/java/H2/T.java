package H2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class T extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public i0 f4615a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4616b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4617c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4618d;

    public T(int i7, int i10) {
        super(i7, i10);
        this.f4616b = new Rect();
        this.f4617c = true;
        this.f4618d = false;
    }

    public T(T t5) {
        super((ViewGroup.LayoutParams) t5);
        this.f4616b = new Rect();
        this.f4617c = true;
        this.f4618d = false;
    }

    public T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4616b = new Rect();
        this.f4617c = true;
        this.f4618d = false;
    }

    public T(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4616b = new Rect();
        this.f4617c = true;
        this.f4618d = false;
    }

    public T(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4616b = new Rect();
        this.f4617c = true;
        this.f4618d = false;
    }
}
