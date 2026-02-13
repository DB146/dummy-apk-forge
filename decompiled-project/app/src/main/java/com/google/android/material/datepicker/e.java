package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15304d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f15305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15306b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15307c;

    static {
        f15304d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar c10 = x.c(null);
        this.f15305a = c10;
        this.f15306b = c10.getMaximum(7);
        this.f15307c = c10.getFirstDayOfWeek();
    }

    public e(int i7) {
        Calendar c10 = x.c(null);
        this.f15305a = c10;
        this.f15306b = c10.getMaximum(7);
        this.f15307c = i7;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f15306b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        int i10 = this.f15306b;
        if (i7 >= i10) {
            return null;
        }
        int i11 = i7 + this.f15307c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i7 + this.f15307c;
        int i11 = this.f15306b;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f15305a;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f15304d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
