package h3;

import java.util.Arrays;
import java.util.Map;

/* renamed from: h3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248j extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1248j f17697a = new kotlin.jvm.internal.m(1);

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        kotlin.jvm.internal.l.e(entry, "<name for destructuring parameter 0>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder n6 = A3.c.n(str, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            kotlin.jvm.internal.l.d(value, "toString(this)");
        }
        n6.append(value);
        return n6.toString();
    }
}
