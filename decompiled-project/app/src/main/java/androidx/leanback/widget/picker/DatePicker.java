package androidx.leanback.widget.picker;

import Tb.a;
import a2.AbstractC0708a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import e3.RunnableC1077b;
import ea.C1108c;
import h3.o;
import j2.AbstractC1371a;
import j2.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import y1.K;

/* loaded from: classes.dex */
public class DatePicker extends AbstractC1371a {

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f13544K = {5, 2, 1};

    /* renamed from: A, reason: collision with root package name */
    public b f13545A;

    /* renamed from: B, reason: collision with root package name */
    public int f13546B;

    /* renamed from: C, reason: collision with root package name */
    public int f13547C;

    /* renamed from: D, reason: collision with root package name */
    public int f13548D;

    /* renamed from: E, reason: collision with root package name */
    public final SimpleDateFormat f13549E;

    /* renamed from: F, reason: collision with root package name */
    public final C1108c f13550F;

    /* renamed from: G, reason: collision with root package name */
    public final Calendar f13551G;

    /* renamed from: H, reason: collision with root package name */
    public final Calendar f13552H;

    /* renamed from: I, reason: collision with root package name */
    public final Calendar f13553I;

    /* renamed from: J, reason: collision with root package name */
    public final Calendar f13554J;

    /* renamed from: x, reason: collision with root package name */
    public String f13555x;

    /* renamed from: y, reason: collision with root package name */
    public b f13556y;

    /* renamed from: z, reason: collision with root package name */
    public b f13557z;

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13549E = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        Locale locale = Locale.getDefault();
        getContext().getResources();
        this.f13550F = new C1108c(locale);
        this.f13554J = a.m(this.f13554J, locale);
        this.f13551G = a.m(this.f13551G, (Locale) this.f13550F.f16831c);
        this.f13552H = a.m(this.f13552H, (Locale) this.f13550F.f16831c);
        this.f13553I = a.m(this.f13553I, (Locale) this.f13550F.f16831c);
        b bVar = this.f13556y;
        if (bVar != null) {
            Object obj = this.f13550F.f16830b;
            int i7 = this.f13546B;
            this.f18571c.set(i7, bVar);
            throw o.i(i7, this.f18570b);
        }
        int[] iArr = AbstractC0708a.f12488f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        K.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            String string2 = obtainStyledAttributes.getString(1);
            String string3 = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            this.f13554J.clear();
            if (TextUtils.isEmpty(string)) {
                this.f13554J.set(1900, 0, 1);
            } else if (!b(string, this.f13554J)) {
                this.f13554J.set(1900, 0, 1);
            }
            this.f13551G.setTimeInMillis(this.f13554J.getTimeInMillis());
            this.f13554J.clear();
            if (TextUtils.isEmpty(string2)) {
                this.f13554J.set(2100, 0, 1);
            } else if (!b(string2, this.f13554J)) {
                this.f13554J.set(2100, 0, 1);
            }
            this.f13552H.setTimeInMillis(this.f13554J.getTimeInMillis());
            setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(DateFormat.getDateFormatOrder(context)) : string3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean b(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f13549E.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    public long getDate() {
        return this.f13553I.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.f13555x;
    }

    public long getMaxDate() {
        return this.f13552H.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f13551G.getTimeInMillis();
    }

    public void setDate(long j) {
        this.f13554J.setTimeInMillis(j);
        int i7 = this.f13554J.get(1);
        int i10 = this.f13554J.get(2);
        int i11 = this.f13554J.get(5);
        if (this.f13553I.get(1) == i7 && this.f13553I.get(2) == i11 && this.f13553I.get(5) == i10) {
            return;
        }
        this.f13553I.set(i7, i10, i11);
        if (this.f13553I.before(this.f13551G)) {
            this.f13553I.setTimeInMillis(this.f13551G.getTimeInMillis());
        } else if (this.f13553I.after(this.f13552H)) {
            this.f13553I.setTimeInMillis(this.f13552H.getTimeInMillis());
        }
        post(new RunnableC1077b(this, 5));
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, j2.b] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, j2.b] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, j2.b] */
    public void setDatePickerFormat(String str) {
        int i7 = 6;
        C1108c c1108c = this.f13550F;
        String str2 = TextUtils.isEmpty(str) ? new String(DateFormat.getDateFormatOrder(getContext())) : str;
        if (TextUtils.equals(this.f13555x, str2)) {
            return;
        }
        this.f13555x = str2;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern((Locale) c1108c.f16831c, str2);
        if (TextUtils.isEmpty(bestDateTimePattern)) {
            bestDateTimePattern = "MM/dd/yyyy";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        int i10 = 0;
        boolean z8 = false;
        char c10 = 0;
        while (i10 < bestDateTimePattern.length()) {
            char charAt = bestDateTimePattern.charAt(i10);
            if (charAt != ' ') {
                if (charAt != '\'') {
                    if (!z8) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= i7) {
                                sb2.append(charAt);
                                break;
                            } else if (charAt != cArr[i11]) {
                                i11++;
                                i7 = 6;
                            } else if (charAt != c10) {
                                arrayList.add(sb2.toString());
                                sb2.setLength(0);
                            }
                        }
                    } else {
                        sb2.append(charAt);
                    }
                    c10 = charAt;
                } else if (z8) {
                    z8 = false;
                } else {
                    sb2.setLength(0);
                    z8 = true;
                }
            }
            i10++;
            i7 = 6;
        }
        arrayList.add(sb2.toString());
        if (arrayList.size() != str2.length() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + str2.length() + " + 1");
        }
        setSeparators(arrayList);
        this.f13557z = null;
        this.f13556y = null;
        this.f13545A = null;
        this.f13546B = -1;
        this.f13547C = -1;
        this.f13548D = -1;
        String upperCase = str2.toUpperCase((Locale) c1108c.f16831c);
        ArrayList arrayList2 = new ArrayList(3);
        for (int i12 = 0; i12 < upperCase.length(); i12++) {
            char charAt2 = upperCase.charAt(i12);
            if (charAt2 == 'D') {
                if (this.f13557z != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                ?? obj = new Object();
                this.f13557z = obj;
                arrayList2.add(obj);
                this.f13557z.getClass();
                this.f13547C = i12;
            } else if (charAt2 != 'M') {
                if (charAt2 != 'Y') {
                    throw new IllegalArgumentException("datePicker format error");
                }
                if (this.f13545A != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                ?? obj2 = new Object();
                this.f13545A = obj2;
                arrayList2.add(obj2);
                this.f13548D = i12;
                this.f13545A.getClass();
            } else {
                if (this.f13556y != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                ?? obj3 = new Object();
                this.f13556y = obj3;
                arrayList2.add(obj3);
                b bVar = this.f13556y;
                Object obj4 = c1108c.f16830b;
                bVar.getClass();
                this.f13546B = i12;
            }
        }
        setColumns(arrayList2);
        post(new RunnableC1077b(this, 5));
    }

    public void setMaxDate(long j) {
        this.f13554J.setTimeInMillis(j);
        if (this.f13554J.get(1) != this.f13552H.get(1) || this.f13554J.get(6) == this.f13552H.get(6)) {
            this.f13552H.setTimeInMillis(j);
            if (this.f13553I.after(this.f13552H)) {
                this.f13553I.setTimeInMillis(this.f13552H.getTimeInMillis());
            }
            post(new RunnableC1077b(this, 5));
        }
    }

    public void setMinDate(long j) {
        this.f13554J.setTimeInMillis(j);
        if (this.f13554J.get(1) != this.f13551G.get(1) || this.f13554J.get(6) == this.f13551G.get(6)) {
            this.f13551G.setTimeInMillis(j);
            if (this.f13553I.before(this.f13551G)) {
                this.f13553I.setTimeInMillis(this.f13551G.getTimeInMillis());
            }
            post(new RunnableC1077b(this, 5));
        }
    }
}
