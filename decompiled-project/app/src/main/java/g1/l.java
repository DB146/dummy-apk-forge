package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f17401a;

    /* renamed from: b, reason: collision with root package name */
    public int f17402b;

    /* renamed from: c, reason: collision with root package name */
    public float f17403c;

    /* renamed from: d, reason: collision with root package name */
    public float f17404d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 1) {
                this.f17403c = obtainStyledAttributes.getFloat(index, this.f17403c);
            } else if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f17401a);
                this.f17401a = i10;
                this.f17401a = n.f17416d[i10];
            } else if (index == 4) {
                this.f17402b = obtainStyledAttributes.getInt(index, this.f17402b);
            } else if (index == 3) {
                this.f17404d = obtainStyledAttributes.getFloat(index, this.f17404d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
