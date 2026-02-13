package s4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.D;

/* renamed from: s4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f24077c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f24078a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f24079b = -1;

    public final boolean a(String str) {
        Matcher matcher = f24077c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i7 = D.f21141a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f24078a = parseInt;
            this.f24079b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(F4.c cVar) {
        int i7 = 0;
        while (true) {
            F4.b[] bVarArr = cVar.f4071a;
            if (i7 >= bVarArr.length) {
                return;
            }
            F4.b bVar = bVarArr[i7];
            if (bVar instanceof K4.e) {
                K4.e eVar = (K4.e) bVar;
                if ("iTunSMPB".equals(eVar.f6130c) && a(eVar.f6131d)) {
                    return;
                }
            } else if (bVar instanceof K4.k) {
                K4.k kVar = (K4.k) bVar;
                if ("com.apple.iTunes".equals(kVar.f6142b) && "iTunSMPB".equals(kVar.f6143c) && a(kVar.f6144d)) {
                    return;
                }
            } else {
                continue;
            }
            i7++;
        }
    }
}
