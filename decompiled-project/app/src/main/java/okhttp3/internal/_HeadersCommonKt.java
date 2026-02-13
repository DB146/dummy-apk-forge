package okhttp3.internal;

import ac.g;
import com.bumptech.glide.c;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class _HeadersCommonKt {
    public static final void a(Headers.Builder builder, String name, String value) {
        l.e(builder, "<this>");
        l.e(name, "name");
        l.e(value, "value");
        ArrayList arrayList = builder.f22334a;
        arrayList.add(name);
        arrayList.add(g.v0(value).toString());
    }

    public static final void b(String name) {
        l.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = name.charAt(i7);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                c.g(16);
                String num = Integer.toString(charAt, 16);
                l.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb2.append(num);
                sb2.append(" at ");
                sb2.append(i7);
                sb2.append(" in header name: ");
                sb2.append(name);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final void c(String value, String name) {
        l.e(value, "value");
        l.e(name, "name");
        int length = value.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = value.charAt(i7);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                c.g(16);
                String num = Integer.toString(charAt, 16);
                l.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb2.append(num);
                sb2.append(" at ");
                sb2.append(i7);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(_UtilCommonKt.i(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
