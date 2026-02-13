package androidx.preference;

import A2.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: v, reason: collision with root package name */
    public final int f13576v;

    /* renamed from: w, reason: collision with root package name */
    public final int f13577w;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f341i, R.attr.seekBarPreferenceStyle, 0);
        int i7 = obtainStyledAttributes.getInt(3, 0);
        int i10 = obtainStyledAttributes.getInt(1, 100);
        i10 = i10 < i7 ? i7 : i10;
        if (i10 != this.f13576v) {
            this.f13576v = i10;
        }
        int i11 = obtainStyledAttributes.getInt(4, 0);
        if (i11 != this.f13577w) {
            this.f13577w = Math.min(this.f13576v - i7, Math.abs(i11));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i7) {
        return Integer.valueOf(typedArray.getInt(i7, 0));
    }
}
