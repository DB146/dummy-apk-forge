package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import c1.AbstractC0883a;

/* loaded from: classes.dex */
public final class k {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f17393a;

    /* renamed from: b, reason: collision with root package name */
    public int f17394b;

    /* renamed from: c, reason: collision with root package name */
    public int f17395c;

    /* renamed from: d, reason: collision with root package name */
    public float f17396d;

    /* renamed from: e, reason: collision with root package name */
    public float f17397e;

    /* renamed from: f, reason: collision with root package name */
    public float f17398f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public String f17399h;

    /* renamed from: i, reason: collision with root package name */
    public int f17400i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f17427f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            switch (j.get(index)) {
                case 1:
                    this.f17397e = obtainStyledAttributes.getFloat(index, this.f17397e);
                    break;
                case 2:
                    this.f17395c = obtainStyledAttributes.getInt(index, this.f17395c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0883a.f14128a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f17393a = n.f(obtainStyledAttributes, index, this.f17393a);
                    break;
                case 6:
                    this.f17394b = obtainStyledAttributes.getInteger(index, this.f17394b);
                    break;
                case 7:
                    this.f17396d = obtainStyledAttributes.getFloat(index, this.f17396d);
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 9:
                    this.f17398f = obtainStyledAttributes.getFloat(index, this.f17398f);
                    break;
                case 10:
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.f17400i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i10 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f17399h = string;
                        if (string.indexOf("/") > 0) {
                            this.f17400i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f17400i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
