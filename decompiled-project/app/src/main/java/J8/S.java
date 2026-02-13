package J8;

import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class S extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.h0(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Locale locale = (Locale) obj;
        bVar.e0(locale == null ? null : locale.toString());
    }
}
