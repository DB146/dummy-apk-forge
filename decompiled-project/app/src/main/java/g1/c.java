package g1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f17230a;

    /* renamed from: b, reason: collision with root package name */
    public int f17231b;

    /* renamed from: c, reason: collision with root package name */
    public Context f17232c;

    /* renamed from: d, reason: collision with root package name */
    public d1.i f17233d;

    /* renamed from: e, reason: collision with root package name */
    public String f17234e;

    /* renamed from: f, reason: collision with root package name */
    public String f17235f;

    /* renamed from: u, reason: collision with root package name */
    public HashMap f17236u;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        Context context;
        int i7;
        HashMap hashMap;
        if (str == null || str.length() == 0 || (context = this.f17232c) == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.f13219A) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.f13219A.get(trim);
            if (obj instanceof Integer) {
                i7 = ((Integer) obj).intValue();
                if (i7 == 0 && constraintLayout != null) {
                    i7 = f(constraintLayout, trim);
                }
                if (i7 == 0) {
                    try {
                        i7 = p.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i7 == 0) {
                    i7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i7 == 0) {
                    this.f17236u.put(Integer.valueOf(i7), trim);
                    b(i7);
                    return;
                } else {
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    return;
                }
            }
        }
        i7 = 0;
        if (i7 == 0) {
            i7 = f(constraintLayout, trim);
        }
        if (i7 == 0) {
        }
        if (i7 == 0) {
        }
        if (i7 == 0) {
        }
    }

    public final void b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i10 = this.f17231b + 1;
        int[] iArr = this.f17230a;
        if (i10 > iArr.length) {
            this.f17230a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f17230a;
        int i11 = this.f17231b;
        iArr2[i11] = i7;
        this.f17231b = i11 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f17232c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).f17261Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f17231b; i7++) {
            View view = (View) constraintLayout.f13222a.get(this.f17230a[i7]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || (resources = this.f17232c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f17423b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f17234e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f17235f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f17230a, this.f17231b);
    }

    public abstract void h(d1.d dVar, boolean z8);

    public final void i() {
        if (this.f17233d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f17291p0 = this.f17233d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f17234e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f17235f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f17234e = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f17231b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                a(str.substring(i7));
                return;
            } else {
                a(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f17235f = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f17231b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                c(str.substring(i7));
                return;
            } else {
                c(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f17234e = null;
        this.f17231b = 0;
        for (int i7 : iArr) {
            b(i7);
        }
    }

    @Override // android.view.View
    public final void setTag(int i7, Object obj) {
        super.setTag(i7, obj);
        if (obj == null && this.f17234e == null) {
            b(i7);
        }
    }
}
