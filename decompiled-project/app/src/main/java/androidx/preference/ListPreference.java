package androidx.preference;

import A2.a;
import U9.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.kt.apps.media.xemtv.beta.R;
import n1.b;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence[] f13567v;

    /* renamed from: w, reason: collision with root package name */
    public final String f13568w;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A2.b.f337d, i7, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f13567v = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (i.f9869b == null) {
                i.f9869b = new i(1);
            }
            this.f13575u = i.f9869b;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, A2.b.f339f, i7, 0);
        this.f13568w = b.d(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        a aVar = this.f13575u;
        if (aVar != null) {
            return aVar.j(this);
        }
        CharSequence a9 = super.a();
        String str = this.f13568w;
        if (str == null) {
            return a9;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a9)) {
            return a9;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }
}
