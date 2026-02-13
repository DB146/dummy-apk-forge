package i;

import android.content.res.Configuration;
import android.os.LocaleList;
import u1.C2094d;

/* loaded from: classes.dex */
public abstract class p {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static C2094d b(Configuration configuration) {
        return C2094d.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(C2094d c2094d) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2094d.f24825a.f24826a.toLanguageTags()));
    }

    public static void d(Configuration configuration, C2094d c2094d) {
        configuration.setLocales(LocaleList.forLanguageTags(c2094d.f24825a.f24826a.toLanguageTags()));
    }
}
