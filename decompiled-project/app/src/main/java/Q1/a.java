package Q1;

import Eb.n;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class a extends m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8602a = new m(1);

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        l.e(entry, "entry");
        Object value = entry.getValue();
        return A3.c.m(new StringBuilder("  "), ((g) entry.getKey()).f8612a, " = ", value instanceof byte[] ? n.c0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
