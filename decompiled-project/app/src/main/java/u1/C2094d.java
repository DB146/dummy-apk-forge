package u1;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2094d {

    /* renamed from: b, reason: collision with root package name */
    public static final C2094d f24824b = new C2094d(new C2095e(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final C2095e f24825a;

    public C2094d(C2095e c2095e) {
        this.f24825a = c2095e;
    }

    public static C2094d a(String str) {
        if (str == null || str.isEmpty()) {
            return f24824b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = split[i7];
            int i10 = AbstractC2093c.f24823a;
            localeArr[i7] = Locale.forLanguageTag(str2);
        }
        return new C2094d(new C2095e(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2094d) {
            if (this.f24825a.equals(((C2094d) obj).f24825a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f24825a.f24826a.hashCode();
    }

    public final String toString() {
        return this.f24825a.f24826a.toString();
    }
}
