package N9;

import K4.l;
import X.c;
import ac.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import com.kt.apps.core.utils.StringUtilsKt;
import h3.o;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new l(22);

    /* renamed from: a, reason: collision with root package name */
    public String f7389a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7390b;

    /* renamed from: c, reason: collision with root package name */
    public String f7391c;

    /* renamed from: d, reason: collision with root package name */
    public String f7392d;

    /* renamed from: e, reason: collision with root package name */
    public String f7393e;

    /* renamed from: f, reason: collision with root package name */
    public String f7394f;

    /* renamed from: u, reason: collision with root package name */
    public String f7395u;

    /* renamed from: v, reason: collision with root package name */
    public String f7396v;

    /* renamed from: w, reason: collision with root package name */
    public transient Long f7397w;

    /* renamed from: x, reason: collision with root package name */
    public transient Long f7398x;

    public /* synthetic */ a(int i7, String str, String str2) {
        this((i7 & 1) != 0 ? "" : str, "", "", "", "", (i7 & 32) != 0 ? "" : str2, "", "");
    }

    public a(String channel, String channelNumber, String start, String stop, String title, String description, String extensionsConfigId, String extensionEpgUrl) {
        kotlin.jvm.internal.l.e(channel, "channel");
        kotlin.jvm.internal.l.e(channelNumber, "channelNumber");
        kotlin.jvm.internal.l.e(start, "start");
        kotlin.jvm.internal.l.e(stop, "stop");
        kotlin.jvm.internal.l.e(title, "title");
        kotlin.jvm.internal.l.e(description, "description");
        kotlin.jvm.internal.l.e(extensionsConfigId, "extensionsConfigId");
        kotlin.jvm.internal.l.e(extensionEpgUrl, "extensionEpgUrl");
        this.f7389a = channel;
        this.f7390b = channelNumber;
        this.f7391c = start;
        this.f7392d = stop;
        this.f7393e = title;
        this.f7394f = description;
        this.f7395u = extensionsConfigId;
        this.f7396v = extensionEpgUrl;
    }

    public final long a() {
        Long valueOf;
        if (this.f7398x == null) {
            if (kotlin.jvm.internal.l.a(g.v0(this.f7392d).toString(), "+0700")) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(10, 23);
                calendar.set(12, 59);
                valueOf = Long.valueOf(calendar.getTimeInMillis());
            } else {
                String str = this.f7392d;
                kotlin.jvm.internal.l.e(str, "<this>");
                String str2 = g.b0(str, "+0700") ? StringUtilsKt.DATE_TIME_FORMAT_0700 : StringUtilsKt.DATE_TIME_FORMAT;
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.l.d(locale, "getDefault(...)");
                Date date = StringUtilsKt.toDate(str, str2, locale, false);
                valueOf = Long.valueOf(date != null ? date.getTime() : System.currentTimeMillis());
            }
            this.f7398x = valueOf;
        }
        Long l10 = this.f7398x;
        kotlin.jvm.internal.l.b(l10);
        return l10.longValue();
    }

    public final String b() {
        String obj;
        String input = this.f7394f;
        for (String str : (String[]) b.f7399u.getValue()) {
            String pattern = str + " này có thời lượng (là |)\\d+ ((giờ \\d+ phút)|phút|giờ|)(\\.|)";
            kotlin.jvm.internal.l.e(pattern, "pattern");
            Pattern compile = Pattern.compile(pattern);
            kotlin.jvm.internal.l.d(compile, "compile(...)");
            kotlin.jvm.internal.l.e(input, "input");
            input = compile.matcher(input).replaceAll("");
            kotlin.jvm.internal.l.d(input, "replaceAll(...)");
        }
        if (g.h0(input)) {
            input = null;
        }
        return (input == null || (obj = g.v0(input).toString()) == null) ? "" : obj;
    }

    public final boolean c() {
        long time;
        long time2;
        long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis();
        boolean b02 = g.b0(this.f7391c, "+0700");
        String str = StringUtilsKt.DATE_TIME_FORMAT;
        String str2 = b02 ? StringUtilsKt.DATE_TIME_FORMAT_0700 : StringUtilsKt.DATE_TIME_FORMAT;
        if (kotlin.jvm.internal.l.a(g.v0(this.f7391c).toString(), "+0700")) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(10, 0);
            calendar.set(12, 0);
            time = calendar.getTimeInMillis();
        } else {
            String str3 = this.f7391c;
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.l.d(locale, "getDefault(...)");
            Date date = StringUtilsKt.toDate(str3, str2, locale, false);
            if (date == null) {
                return false;
            }
            time = date.getTime();
        }
        if (g.b0(this.f7392d, "+0700")) {
            str = StringUtilsKt.DATE_TIME_FORMAT_0700;
        }
        if (kotlin.jvm.internal.l.a(g.v0(this.f7392d).toString(), "+0700")) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, 1);
            calendar2.set(10, 0);
            calendar2.set(12, 0);
            time2 = calendar2.getTimeInMillis();
        } else {
            String str4 = this.f7392d;
            Locale locale2 = Locale.getDefault();
            kotlin.jvm.internal.l.d(locale2, "getDefault(...)");
            Date date2 = StringUtilsKt.toDate(str4, str, locale2, false);
            if (date2 == null) {
                return false;
            }
            time2 = date2.getTime();
        }
        return (DateUtils.isToday(time) || DateUtils.isToday(time2)) && time <= timeInMillis && timeInMillis <= time2;
    }

    public final long d() {
        Long valueOf;
        if (this.f7397w == null) {
            if (kotlin.jvm.internal.l.a(g.v0(this.f7391c).toString(), "+0700")) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(10, 0);
                calendar.set(12, 0);
                valueOf = Long.valueOf(calendar.getTimeInMillis());
            } else {
                String str = this.f7391c;
                kotlin.jvm.internal.l.e(str, "<this>");
                String str2 = g.b0(str, "+0700") ? StringUtilsKt.DATE_TIME_FORMAT_0700 : StringUtilsKt.DATE_TIME_FORMAT;
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.l.d(locale, "getDefault(...)");
                Date date = StringUtilsKt.toDate(str, str2, locale, false);
                valueOf = Long.valueOf(date != null ? date.getTime() : System.currentTimeMillis());
            }
            this.f7397w = valueOf;
        }
        Long l10 = this.f7397w;
        kotlin.jvm.internal.l.b(l10);
        return l10.longValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f7389a;
        String str2 = this.f7391c;
        String str3 = this.f7392d;
        String str4 = this.f7393e;
        String str5 = this.f7394f;
        StringBuilder n6 = c.n("{channel: ", str, ",\nchannelNumber: ");
        o.v(n6, this.f7390b, ",\nstart: ", str2, ",\nstop: ");
        o.v(n6, str3, ",\ntitle: ", str4, ",\ndescription: ");
        return o.p(n6, str5, ",\n}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(this.f7389a);
        dest.writeString(this.f7390b);
        dest.writeString(this.f7391c);
        dest.writeString(this.f7392d);
        dest.writeString(this.f7393e);
        dest.writeString(this.f7394f);
        dest.writeString(this.f7395u);
        dest.writeString(this.f7396v);
    }
}
