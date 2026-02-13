package com.google.android.material.datepicker;

import a6.C0779c;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new C0779c(21);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f15360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15361b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15363d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15364e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15365f;

    /* renamed from: u, reason: collision with root package name */
    public String f15366u;

    public p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a9 = x.a(calendar);
        this.f15360a = a9;
        this.f15361b = a9.get(2);
        this.f15362c = a9.get(1);
        this.f15363d = a9.getMaximum(7);
        this.f15364e = a9.getActualMaximum(5);
        this.f15365f = a9.getTimeInMillis();
    }

    public static p a(int i7, int i10) {
        Calendar c10 = x.c(null);
        c10.set(1, i7);
        c10.set(2, i10);
        return new p(c10);
    }

    public static p b(long j) {
        Calendar c10 = x.c(null);
        c10.setTimeInMillis(j);
        return new p(c10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f15360a.compareTo(((p) obj).f15360a);
    }

    public final String d() {
        if (this.f15366u == null) {
            long timeInMillis = this.f15360a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = x.f15380a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f15366u = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f15366u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f15361b == pVar.f15361b && this.f15362c == pVar.f15362c;
    }

    public final int f(p pVar) {
        if (!(this.f15360a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (pVar.f15361b - this.f15361b) + ((pVar.f15362c - this.f15362c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15361b), Integer.valueOf(this.f15362c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f15362c);
        parcel.writeInt(this.f15361b);
    }
}
