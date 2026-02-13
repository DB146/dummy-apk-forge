package vc;

import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f implements uc.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f25472b = Charset.forName("ISO-8859-1");

    /* renamed from: a, reason: collision with root package name */
    public d f25473a;

    public final f a(Map map) {
        i.E(map, "cookies");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            d dVar = this.f25473a;
            dVar.getClass();
            i.C(str, "name");
            i.E(str2, "value");
            dVar.f25454d.put(str, str2);
        }
        return this;
    }

    public final e b() {
        return e.g(this.f25473a, null);
    }
}
