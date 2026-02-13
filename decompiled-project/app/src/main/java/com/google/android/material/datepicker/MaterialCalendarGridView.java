package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import y1.K;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15291a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        x.c(null);
        if (n.w0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.kt.apps.media.xemtv.beta.R.id.cancel_button);
            setNextFocusRightId(com.kt.apps.media.xemtv.beta.R.id.confirm_button);
        }
        this.f15291a = n.w0(getContext(), com.kt.apps.media.xemtv.beta.R.attr.nestedScrollable);
        K.n(this, new C1.e(3));
    }

    public final q a() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((q) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        q qVar = (q) super.getAdapter();
        qVar.getClass();
        int max = Math.max(qVar.a(), getFirstVisiblePosition());
        int min = Math.min(qVar.c(), getLastVisiblePosition());
        qVar.getItem(max);
        qVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        if (!z8) {
            super.onFocusChanged(false, i7, rect);
            return;
        }
        if (i7 == 33) {
            setSelection(((q) super.getAdapter()).c());
        } else if (i7 == 130) {
            setSelection(((q) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i7, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((q) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i7) {
            return false;
        }
        setSelection(((q) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.f15291a) {
            super.onMeasure(i7, i10);
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof q)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i7) {
        if (i7 < ((q) super.getAdapter()).a()) {
            super.setSelection(((q) super.getAdapter()).a());
        } else {
            super.setSelection(i7);
        }
    }
}
