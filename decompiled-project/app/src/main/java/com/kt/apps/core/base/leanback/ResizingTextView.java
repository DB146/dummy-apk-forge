package com.kt.apps.core.base.leanback;

import a2.AbstractC0708a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import y7.u0;

/* loaded from: classes2.dex */
public class ResizingTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public int f15999a;

    /* renamed from: b, reason: collision with root package name */
    public int f16000b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16001c;

    /* renamed from: d, reason: collision with root package name */
    public int f16002d;

    /* renamed from: e, reason: collision with root package name */
    public int f16003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16004f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16005u;

    /* renamed from: v, reason: collision with root package name */
    public int f16006v;

    /* renamed from: w, reason: collision with root package name */
    public float f16007w;

    /* renamed from: x, reason: collision with root package name */
    public int f16008x;

    /* renamed from: y, reason: collision with root package name */
    public int f16009y;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.f16004f = false;
        this.f16005u = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0708a.j, R.attr.textViewStyle, 0);
        try {
            this.f15999a = obtainStyledAttributes.getInt(1, 1);
            this.f16000b = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.f16001c = obtainStyledAttributes.getBoolean(0, false);
            this.f16002d = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f16003e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(int i7, int i10) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i7, getPaddingEnd(), i10);
        } else {
            setPadding(getPaddingLeft(), i7, getPaddingRight(), i10);
        }
    }

    public boolean getMaintainLineSpacing() {
        return this.f16001c;
    }

    public int getResizedPaddingAdjustmentBottom() {
        return this.f16003e;
    }

    public int getResizedPaddingAdjustmentTop() {
        return this.f16002d;
    }

    public int getResizedTextSize() {
        return this.f16000b;
    }

    public int getTriggerConditions() {
        return this.f15999a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        boolean z8;
        int i11;
        boolean z10 = true;
        if (!this.f16005u) {
            this.f16006v = (int) getTextSize();
            this.f16007w = getLineSpacingExtra();
            this.f16008x = getPaddingTop();
            this.f16009y = getPaddingBottom();
            this.f16005u = true;
        }
        boolean z11 = false;
        setTextSize(0, this.f16006v);
        setLineSpacing(this.f16007w, getLineSpacingMultiplier());
        a(this.f16008x, this.f16009y);
        super.onMeasure(i7, i10);
        Layout layout = getLayout();
        if (layout != null && (this.f15999a & 1) > 0) {
            int lineCount = layout.getLineCount();
            int maxLines = getMaxLines();
            if (maxLines > 1 && lineCount == maxLines) {
                z8 = true;
                int textSize = (int) getTextSize();
                if (z8) {
                    if (this.f16000b != -1 && textSize != (i11 = this.f16006v)) {
                        setTextSize(0, i11);
                        z11 = true;
                    }
                    if (this.f16001c) {
                        float lineSpacingExtra = getLineSpacingExtra();
                        float f4 = this.f16007w;
                        if (lineSpacingExtra != f4) {
                            setLineSpacing(f4, getLineSpacingMultiplier());
                            z11 = true;
                        }
                    }
                    if (getPaddingTop() != this.f16008x || getPaddingBottom() != this.f16009y) {
                        a(this.f16008x, this.f16009y);
                    }
                    z10 = z11;
                } else {
                    int i12 = this.f16000b;
                    if (i12 != -1 && textSize != i12) {
                        setTextSize(0, i12);
                        z11 = true;
                    }
                    float f10 = (this.f16007w + this.f16006v) - this.f16000b;
                    if (this.f16001c && getLineSpacingExtra() != f10) {
                        setLineSpacing(f10, getLineSpacingMultiplier());
                        z11 = true;
                    }
                    int i13 = this.f16008x + this.f16002d;
                    int i14 = this.f16009y + this.f16003e;
                    if (getPaddingTop() != i13 || getPaddingBottom() != i14) {
                        a(i13, i14);
                    }
                    z10 = z11;
                }
                this.f16004f = z8;
                if (z10) {
                    return;
                }
                super.onMeasure(i7, i10);
                return;
            }
        }
        z8 = false;
        int textSize2 = (int) getTextSize();
        if (z8) {
        }
        this.f16004f = z8;
        if (z10) {
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u0.R(callback, this));
    }

    public void setMaintainLineSpacing(boolean z8) {
        if (this.f16001c != z8) {
            this.f16001c = z8;
            if (this.f16004f) {
                requestLayout();
            }
        }
    }

    public void setResizedPaddingAdjustmentBottom(int i7) {
        if (this.f16003e != i7) {
            this.f16003e = i7;
            if (this.f16004f) {
                requestLayout();
            }
        }
    }

    public void setResizedPaddingAdjustmentTop(int i7) {
        if (this.f16002d != i7) {
            this.f16002d = i7;
            if (this.f16004f) {
                requestLayout();
            }
        }
    }

    public void setResizedTextSize(int i7) {
        if (this.f16000b != i7) {
            this.f16000b = i7;
            if (this.f16004f) {
                requestLayout();
            }
        }
    }

    public void setTriggerConditions(int i7) {
        if (this.f15999a != i7) {
            this.f15999a = i7;
            requestLayout();
        }
    }
}
