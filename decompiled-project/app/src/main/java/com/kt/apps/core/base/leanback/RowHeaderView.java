package com.kt.apps.core.base.leanback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.l;
import y7.u0;

/* loaded from: classes2.dex */
public final class RowHeaderView extends TextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.rowHeaderStyle);
        l.e(context, "context");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u0.R(callback, this));
    }
}
