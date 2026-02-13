package W4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.C1586o0;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    public static final B f10626c = new B(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f10627d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f10628a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10629b;

    public B(long j, long j10) {
        this.f10628a = j;
        this.f10629b = j10;
    }

    public static B a(String str) {
        long parseFloat;
        Matcher matcher = f10627d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = z.f10807a;
        if (!matches) {
            throw C1586o0.b(str, null);
        }
        String group = matcher.group(1);
        if (group == null) {
            throw C1586o0.b(str, null);
        }
        int i7 = n5.D.f21141a;
        long parseFloat2 = group.equals("now") ? 0L : Float.parseFloat(group) * 1000.0f;
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = Float.parseFloat(group2) * 1000.0f;
                if (parseFloat < parseFloat2) {
                    throw C1586o0.b(str, null);
                }
            } catch (NumberFormatException e2) {
                throw C1586o0.b(group2, e2);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new B(parseFloat2, parseFloat);
    }
}
