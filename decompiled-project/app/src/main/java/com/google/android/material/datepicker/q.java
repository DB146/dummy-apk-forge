package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class q extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15367d = x.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f15368e = (x.c(null).getMaximum(7) + x.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final p f15369a;

    /* renamed from: b, reason: collision with root package name */
    public c f15370b;

    /* renamed from: c, reason: collision with root package name */
    public final b f15371c;

    public q(p pVar, b bVar) {
        this.f15369a = pVar;
        this.f15371c = bVar;
        throw null;
    }

    public final int a() {
        int i7 = this.f15371c.f15298e;
        p pVar = this.f15369a;
        Calendar calendar = pVar.f15360a;
        int i10 = calendar.get(7);
        if (i7 <= 0) {
            i7 = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - i7;
        return i11 < 0 ? i11 + pVar.f15363d : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i7) {
        if (i7 < a() || i7 > c()) {
            return null;
        }
        int a9 = (i7 - a()) + 1;
        Calendar a10 = x.a(this.f15369a.f15360a);
        a10.set(5, a9);
        return Long.valueOf(a10.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f15369a.f15364e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f15368e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7 / this.f15369a.f15363d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f15370b == null) {
            this.f15370b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a9 = i7 - a();
        if (a9 >= 0) {
            p pVar = this.f15369a;
            if (a9 < pVar.f15364e) {
                textView.setTag(pVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a9 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i7) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                x.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i7) == null) {
            textView.getContext();
            x.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
