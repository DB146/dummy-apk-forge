package j2;

import a2.AbstractC0708a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import h3.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y1.K;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1371a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18569a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18570b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f18571c;

    /* renamed from: d, reason: collision with root package name */
    public float f18572d;

    /* renamed from: e, reason: collision with root package name */
    public float f18573e;

    /* renamed from: f, reason: collision with root package name */
    public int f18574f;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f18575u;

    /* renamed from: v, reason: collision with root package name */
    public int f18576v;

    /* renamed from: w, reason: collision with root package name */
    public int f18577w;

    public AbstractC1371a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.datePickerStyle);
        this.f18570b = new ArrayList();
        this.f18572d = 3.0f;
        this.f18573e = 1.0f;
        this.f18574f = 0;
        this.f18575u = new ArrayList();
        int[] iArr = AbstractC0708a.f12489h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.datePickerStyle, 0);
        K.m(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.datePickerStyle, 0);
        this.f18576v = obtainStyledAttributes.getResourceId(0, R.layout.lb_picker_item);
        this.f18577w = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        new DecelerateInterpolator(2.5f);
        this.f18569a = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, (ViewGroup) this, true)).findViewById(R.id.picker);
    }

    public final void a() {
        if (getColumnsCount() > 0) {
            throw o.i(0, this.f18570b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public float getActivatedVisibleItemCount() {
        return this.f18572d;
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.f18571c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.f18576v;
    }

    public final int getPickerItemTextViewId() {
        return this.f18577w;
    }

    public int getSelectedColumn() {
        return this.f18574f;
    }

    @Deprecated
    public final CharSequence getSeparator() {
        return (CharSequence) this.f18575u.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f18575u;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < 0) {
            return false;
        }
        ArrayList arrayList = this.f18570b;
        if (selectedColumn >= arrayList.size()) {
            return false;
        }
        throw o.i(selectedColumn, arrayList);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        ArrayList arrayList = this.f18570b;
        if (arrayList.size() > 0) {
            throw o.i(0, arrayList);
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z8) {
        if (z8 == isActivated()) {
            super.setActivated(z8);
            return;
        }
        super.setActivated(z8);
        boolean hasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z8 && hasFocus && isFocusable()) {
            requestFocus();
        }
        int columnsCount = getColumnsCount();
        ArrayList arrayList = this.f18570b;
        if (columnsCount > 0) {
            throw o.i(0, arrayList);
        }
        a();
        isActivated();
        if (getColumnsCount() > 0) {
            throw o.i(0, arrayList);
        }
        if (z8 && hasFocus && selectedColumn >= 0) {
            throw o.i(selectedColumn, arrayList);
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f4) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f18572d != f4) {
            this.f18572d = f4;
            if (isActivated()) {
                a();
            }
        }
    }

    public void setColumns(List<b> list) {
        ArrayList arrayList = this.f18575u;
        if (arrayList.size() == 0) {
            throw new IllegalStateException("Separators size is: " + arrayList.size() + ". At least one separator must be provided");
        }
        if (arrayList.size() == 1) {
            CharSequence charSequence = (CharSequence) arrayList.get(0);
            arrayList.clear();
            arrayList.add("");
            for (int i7 = 0; i7 < list.size() - 1; i7++) {
                arrayList.add(charSequence);
            }
            arrayList.add("");
        } else if (arrayList.size() != list.size() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " mustequal the size of columns: " + list.size() + " + 1");
        }
        this.f18570b.clear();
        ViewGroup viewGroup = this.f18569a;
        viewGroup.removeAllViews();
        ArrayList arrayList2 = new ArrayList(list);
        this.f18571c = arrayList2;
        if (this.f18574f > arrayList2.size() - 1) {
            this.f18574f = this.f18571c.size() - 1;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
            TextView textView = (TextView) from.inflate(R.layout.lb_picker_separator, viewGroup, false);
            textView.setText((CharSequence) arrayList.get(0));
            viewGroup.addView(textView);
        }
        if (columnsCount <= 0) {
            return;
        }
        from.inflate(R.layout.lb_picker_column, viewGroup, false).getClass();
        throw new ClassCastException();
    }

    public final void setPickerItemLayoutId(int i7) {
        this.f18576v = i7;
    }

    public final void setPickerItemTextViewId(int i7) {
        this.f18577w = i7;
    }

    public void setSelectedColumn(int i7) {
        int i10 = this.f18574f;
        ArrayList arrayList = this.f18570b;
        if (i10 != i7) {
            this.f18574f = i7;
            if (arrayList.size() > 0) {
                throw o.i(0, arrayList);
            }
        }
        if (arrayList.get(i7) != null) {
            throw new ClassCastException();
        }
        if (hasFocus()) {
            throw null;
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        ArrayList arrayList = this.f18575u;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public void setVisibleItemCount(float f4) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f18573e != f4) {
            this.f18573e = f4;
            if (isActivated()) {
                return;
            }
            a();
        }
    }
}
