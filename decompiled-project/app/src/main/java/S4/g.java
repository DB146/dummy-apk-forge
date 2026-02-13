package S4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.C1586o0;
import m5.C1618o;
import m5.L;

/* loaded from: classes.dex */
public final class g implements L {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f9093a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // m5.L
    public final Object g(Uri uri, C1618o c1618o) {
        String readLine = new BufferedReader(new InputStreamReader(c1618o, M6.e.f6799c)).readLine();
        try {
            Matcher matcher = f9093a.matcher(readLine);
            if (!matcher.matches()) {
                throw C1586o0.b("Couldn't parse timestamp: " + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e2) {
            throw C1586o0.b(null, e2);
        }
    }
}
