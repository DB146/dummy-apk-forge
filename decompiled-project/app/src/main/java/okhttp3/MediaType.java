package okhttp3;

import A3.c;
import Eb.D;
import V.k;
import ac.d;
import ac.e;
import ac.g;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.l;
import r8.o;

/* loaded from: classes2.dex */
public final class MediaType {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f22350e = new Companion(0);

    /* renamed from: f, reason: collision with root package name */
    public static final e f22351f = new e("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final e g = new e(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f22352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22353b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22354c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f22355d;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static MediaType a(String str) {
            l.e(str, "<this>");
            o b2 = MediaType.f22351f.b(0, str);
            if (b2 == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
            }
            String str2 = (String) ((D) b2.e()).get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            l.d(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) ((D) b2.e()).get(2)).toLowerCase(locale);
            l.d(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int i7 = b2.h().f11026b;
            while (true) {
                int i10 = i7 + 1;
                if (i10 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                o b10 = MediaType.g.b(i10, str);
                if (b10 == null) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(i10);
                    l.d(substring, "substring(...)");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(c.l(sb2, str, '\"').toString());
                }
                k kVar = (k) b10.f23859d;
                d o10 = kVar.o(1);
                String str3 = o10 != null ? o10.f12831a : null;
                if (str3 == null) {
                    i7 = b10.h().f11026b;
                } else {
                    d o11 = kVar.o(2);
                    String str4 = o11 != null ? o11.f12831a : null;
                    if (str4 == null) {
                        d o12 = kVar.o(3);
                        l.b(o12);
                        str4 = o12.f12831a;
                    } else if (str4.length() > 0 && com.bumptech.glide.c.z(str4.charAt(0), '\'', false) && str4.length() > 0 && com.bumptech.glide.c.z(str4.charAt(g.c0(str4)), '\'', false) && str4.length() > 2) {
                        str4 = str4.substring(1, str4.length() - 1);
                        l.d(str4, "substring(...)");
                    }
                    arrayList.add(str3);
                    arrayList.add(str4);
                    i7 = b10.h().f11026b;
                }
            }
        }
    }

    public MediaType(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        l.e(mediaType, "mediaType");
        l.e(parameterNamesAndValues, "parameterNamesAndValues");
        this.f22352a = mediaType;
        this.f22353b = str;
        this.f22354c = str2;
        this.f22355d = parameterNamesAndValues;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && l.a(((MediaType) obj).f22352a, this.f22352a);
    }

    public final int hashCode() {
        return this.f22352a.hashCode();
    }

    public final String toString() {
        return this.f22352a;
    }
}
