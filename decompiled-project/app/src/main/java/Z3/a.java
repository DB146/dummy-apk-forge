package Z3;

import Y3.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import y7.u0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f12137c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f12138d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f12139e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f12140f;

    /* renamed from: a, reason: collision with root package name */
    public final String f12141a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12142b;

    static {
        String z8 = u0.z("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f12137c = z8;
        String z10 = u0.z("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String z11 = u0.z("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f12138d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f12139e = new a(z8, null);
        f12140f = new a(z10, z11);
    }

    public a(String str, String str2) {
        this.f12141a = str;
        this.f12142b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
