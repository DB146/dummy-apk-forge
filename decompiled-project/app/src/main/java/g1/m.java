package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f17405n;

    /* renamed from: a, reason: collision with root package name */
    public float f17406a;

    /* renamed from: b, reason: collision with root package name */
    public float f17407b;

    /* renamed from: c, reason: collision with root package name */
    public float f17408c;

    /* renamed from: d, reason: collision with root package name */
    public float f17409d;

    /* renamed from: e, reason: collision with root package name */
    public float f17410e;

    /* renamed from: f, reason: collision with root package name */
    public float f17411f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public int f17412h;

    /* renamed from: i, reason: collision with root package name */
    public float f17413i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17414l;

    /* renamed from: m, reason: collision with root package name */
    public float f17415m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17405n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f17429i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            switch (f17405n.get(index)) {
                case 1:
                    this.f17406a = obtainStyledAttributes.getFloat(index, this.f17406a);
                    break;
                case 2:
                    this.f17407b = obtainStyledAttributes.getFloat(index, this.f17407b);
                    break;
                case 3:
                    this.f17408c = obtainStyledAttributes.getFloat(index, this.f17408c);
                    break;
                case 4:
                    this.f17409d = obtainStyledAttributes.getFloat(index, this.f17409d);
                    break;
                case 5:
                    this.f17410e = obtainStyledAttributes.getFloat(index, this.f17410e);
                    break;
                case 6:
                    this.f17411f = obtainStyledAttributes.getDimension(index, this.f17411f);
                    break;
                case 7:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    this.f17413i = obtainStyledAttributes.getDimension(index, this.f17413i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    this.f17414l = true;
                    this.f17415m = obtainStyledAttributes.getDimension(index, this.f17415m);
                    break;
                case 12:
                    this.f17412h = n.f(obtainStyledAttributes, index, this.f17412h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
