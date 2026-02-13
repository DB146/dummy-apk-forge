package M9;

import android.text.format.DateUtils;
import com.kt.apps.core.utils.StringUtilsKt;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import jb.InterfaceC1395f;

/* loaded from: classes2.dex */
public final class i implements InterfaceC1395f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6870a;

    /* renamed from: b, reason: collision with root package name */
    public long f6871b;

    public i(long j, boolean z8) {
        this.f6870a = z8;
        this.f6871b = j;
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        long time;
        long time2;
        N9.a it = (N9.a) obj;
        kotlin.jvm.internal.l.e(it, "it");
        boolean z8 = true;
        if (this.f6870a) {
            boolean b02 = ac.g.b0(it.f7391c, "+0700");
            String str = StringUtilsKt.DATE_TIME_FORMAT;
            String str2 = b02 ? StringUtilsKt.DATE_TIME_FORMAT_0700 : StringUtilsKt.DATE_TIME_FORMAT;
            if (kotlin.jvm.internal.l.a(ac.g.v0(it.f7391c).toString(), "+0700")) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(10, 0);
                calendar.set(12, 0);
                time = calendar.getTimeInMillis();
            } else {
                String str3 = it.f7391c;
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.l.d(locale, "getDefault(...)");
                Date date = StringUtilsKt.toDate(str3, str2, locale, false);
                if (date == null) {
                    return false;
                }
                time = date.getTime();
            }
            if (ac.g.b0(it.f7392d, "+0700")) {
                str = StringUtilsKt.DATE_TIME_FORMAT_0700;
            }
            if (kotlin.jvm.internal.l.a(ac.g.v0(it.f7392d).toString(), "+0700")) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(5, 1);
                calendar2.set(10, 0);
                calendar2.set(12, 0);
                time2 = calendar2.getTimeInMillis();
            } else {
                String str4 = it.f7392d;
                Locale locale2 = Locale.getDefault();
                kotlin.jvm.internal.l.d(locale2, "getDefault(...)");
                Date date2 = StringUtilsKt.toDate(str4, str, locale2, false);
                if (date2 == null) {
                    return false;
                }
                time2 = date2.getTime();
            }
            if (!DateUtils.isToday(time) && !DateUtils.isToday(time2)) {
                return false;
            }
            long j = this.f6871b;
            if (time > j || j > time2) {
                z8 = false;
            }
        }
        return z8;
    }
}
