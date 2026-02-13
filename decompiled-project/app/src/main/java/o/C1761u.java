package o;

import P4.C0463k;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import h.AbstractC1213a;

/* renamed from: o.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21605a;

    /* renamed from: b, reason: collision with root package name */
    public final C0463k f21606b;

    public C1761u(TextView textView) {
        this.f21605a = textView;
        this.f21606b = new C0463k(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((Z9.x) this.f21606b.f8074b).p(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f21605a.getContext().obtainStyledAttributes(attributeSet, AbstractC1213a.f17573i, i7, 0);
        try {
            boolean z8 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z8);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z8) {
        ((Z9.x) this.f21606b.f8074b).P(z8);
    }

    public final void d(boolean z8) {
        ((Z9.x) this.f21606b.f8074b).Q(z8);
    }
}
