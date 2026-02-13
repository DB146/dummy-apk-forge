package j5;

import java.util.regex.Pattern;
import m4.C1586o0;
import n5.D;
import n5.v;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f18646a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(v vVar) {
        vVar.getClass();
        String i7 = vVar.i(M6.e.f6799c);
        return i7 != null && i7.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i7 = D.f21141a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j10 = j * 1000;
        if (split.length == 2) {
            j10 += Long.parseLong(split[1]);
        }
        return j10 * 1000;
    }

    public static void d(v vVar) {
        int i7 = vVar.f21230b;
        if (a(vVar)) {
            return;
        }
        vVar.G(i7);
        throw C1586o0.a("Expected WEBVTT. Got " + vVar.i(M6.e.f6799c), null);
    }
}
