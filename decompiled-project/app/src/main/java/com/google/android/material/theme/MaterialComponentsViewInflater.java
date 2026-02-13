package com.google.android.material.theme;

import C6.s;
import D6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import c6.AbstractC0911a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.kt.apps.media.xemtv.beta.R;
import i.C1278A;
import l6.C1508c;
import o.C1748n;
import o.C1750o;
import o.C1769y;
import s6.o;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C1278A {
    @Override // i.C1278A
    public final C1748n a(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    @Override // i.C1278A
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // i.C1278A
    public final C1750o c(Context context, AttributeSet attributeSet) {
        return new C1508c(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u6.a, android.widget.CompoundButton, android.view.View, o.y] */
    @Override // i.C1278A
    public final C1769y d(Context context, AttributeSet attributeSet) {
        ?? c1769y = new C1769y(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c1769y.getContext();
        TypedArray g = o.g(context2, attributeSet, AbstractC0911a.f14416r, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (g.hasValue(0)) {
            c1769y.setButtonTintList(Tb.a.n(context2, g, 0));
        }
        c1769y.f24879f = g.getBoolean(1, false);
        g.recycle();
        return c1769y;
    }

    @Override // i.C1278A
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
