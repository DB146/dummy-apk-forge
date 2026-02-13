package com.google.android.material.snackbar;

import Tb.a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f15439a;

    /* renamed from: b, reason: collision with root package name */
    public Button f15440b;

    /* renamed from: c, reason: collision with root package name */
    public int f15441c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.E(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1053a.f16532b);
    }

    public final boolean a(int i7, int i10, int i11) {
        boolean z8;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f15439a.getPaddingTop() == i10 && this.f15439a.getPaddingBottom() == i11) {
            return z8;
        }
        TextView textView = this.f15439a;
        WeakHashMap weakHashMap = K.f26642a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f15440b;
    }

    public TextView getMessageView() {
        return this.f15439a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15439a = (TextView) findViewById(R.id.snackbar_text);
        this.f15440b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f15439a.getLayout();
        boolean z8 = layout != null && layout.getLineCount() > 1;
        if (!z8 || this.f15441c <= 0 || this.f15440b.getMeasuredWidth() <= this.f15441c) {
            if (!z8) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i7, i10);
    }

    public void setMaxInlineActionWidth(int i7) {
        this.f15441c = i7;
    }
}
