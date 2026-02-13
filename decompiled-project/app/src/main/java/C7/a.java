package C7;

import A4.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final z7.a f3038b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final String f3039c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d, reason: collision with root package name */
    public static final String f3040d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e, reason: collision with root package name */
    public static final p f3041e = new p(13);

    /* renamed from: a, reason: collision with root package name */
    public final d f3042a;

    public a(d dVar) {
        this.f3042a = dVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb2.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb2.append(str2.charAt(i7));
            }
        }
        return sb2.toString();
    }
}
