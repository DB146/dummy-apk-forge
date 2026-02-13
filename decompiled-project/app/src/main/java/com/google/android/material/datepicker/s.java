package com.google.android.material.datepicker;

import H2.i0;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import y1.C2375x;
import y1.K;

/* loaded from: classes.dex */
public final class s extends i0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f15374u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f15375v;

    public s(LinearLayout linearLayout, boolean z8) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f15374u = textView;
        WeakHashMap weakHashMap = K.f26642a;
        new C2375x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).e(textView, Boolean.TRUE);
        this.f15375v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z8) {
            return;
        }
        textView.setVisibility(8);
    }
}
