package T1;

import Z9.x;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class e extends x {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f9208c;

    /* renamed from: d, reason: collision with root package name */
    public final c f9209d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9210e = true;

    public e(TextView textView) {
        this.f9208c = textView;
        this.f9209d = new c(textView);
    }

    @Override // Z9.x
    public final boolean A() {
        return this.f9210e;
    }

    @Override // Z9.x
    public final void P(boolean z8) {
        if (z8) {
            TextView textView = this.f9208c;
            textView.setTransformationMethod(Z(textView.getTransformationMethod()));
        }
    }

    @Override // Z9.x
    public final void Q(boolean z8) {
        this.f9210e = z8;
        TextView textView = this.f9208c;
        textView.setTransformationMethod(Z(textView.getTransformationMethod()));
        textView.setFilters(p(textView.getFilters()));
    }

    @Override // Z9.x
    public final TransformationMethod Z(TransformationMethod transformationMethod) {
        return this.f9210e ? ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod) : transformationMethod instanceof h ? ((h) transformationMethod).f9214a : transformationMethod;
    }

    @Override // Z9.x
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.f9210e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof c) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            c cVar = this.f9209d;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = cVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == cVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }
}
