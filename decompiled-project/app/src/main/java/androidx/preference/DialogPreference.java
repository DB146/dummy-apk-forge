package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.kt.apps.media.xemtv.beta.R;
import n1.b;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A2.b.f335b, i7, 0);
        b.d(obtainStyledAttributes, 9, 0);
        b.d(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        b.d(obtainStyledAttributes, 11, 3);
        b.d(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
