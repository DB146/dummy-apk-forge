package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.kt.apps.media.xemtv.beta.R;
import n1.b;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
