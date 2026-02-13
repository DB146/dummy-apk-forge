package com.google.android.material.internal;

import H1.b;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.datepicker.i;
import s6.C1991a;
import y1.K;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f15402u = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f15403d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15404e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15405f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.imageButtonStyle);
        this.f15404e = true;
        this.f15405f = true;
        K.n(this, new i(this, 4));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15403d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        return this.f15403d ? View.mergeDrawableStates(super.onCreateDrawableState(i7 + 1), f15402u) : super.onCreateDrawableState(i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1991a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1991a c1991a = (C1991a) parcelable;
        super.onRestoreInstanceState(c1991a.f4568a);
        setChecked(c1991a.f24099c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s6.a, android.os.Parcelable, H1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f24099c = this.f15403d;
        return bVar;
    }

    public void setCheckable(boolean z8) {
        if (this.f15404e != z8) {
            this.f15404e = z8;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (!this.f15404e || this.f15403d == z8) {
            return;
        }
        this.f15403d = z8;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z8) {
        this.f15405f = z8;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        if (this.f15405f) {
            super.setPressed(z8);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f15403d);
    }
}
