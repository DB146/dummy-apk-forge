package Y5;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: Y5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642p extends AbstractC0659x0 {

    /* renamed from: c, reason: collision with root package name */
    public long f11872c;

    /* renamed from: d, reason: collision with root package name */
    public String f11873d;

    @Override // Y5.AbstractC0659x0
    public final boolean K() {
        Calendar calendar = Calendar.getInstance();
        this.f11872c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f11873d = A3.c.m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long N() {
        L();
        return this.f11872c;
    }

    public final String O() {
        L();
        return this.f11873d;
    }
}
