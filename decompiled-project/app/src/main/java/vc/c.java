package vc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public static final URL f25450e;

    /* renamed from: a, reason: collision with root package name */
    public URL f25451a = f25450e;

    /* renamed from: b, reason: collision with root package name */
    public int f25452b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f25453c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f25454d = new LinkedHashMap();

    static {
        try {
            f25450e = new URL("http://undefined/");
        } catch (MalformedURLException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void a(String str, String str2) {
        i.C(str, "name");
        if (str2 == null) {
            str2 = "";
        }
        i.C(str, "name");
        List b2 = b(str);
        if (b2.isEmpty()) {
            b2 = new ArrayList();
            this.f25453c.put(str, b2);
        }
        b2.add(str2);
    }

    public final List b(String str) {
        i.D(str);
        for (Map.Entry entry : this.f25453c.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (List) entry.getValue();
            }
        }
        return Collections.emptyList();
    }

    public final boolean c(String str) {
        i.A("Content-Encoding");
        i.A(str);
        i.C("Content-Encoding", "name");
        Iterator it = b("Content-Encoding").iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void d(String str, String str2) {
        i.C(str, "name");
        e(str);
        a(str, str2);
    }

    public final void e(String str) {
        Map.Entry entry;
        i.C(str, "name");
        String c10 = wc.c.c(str);
        LinkedHashMap linkedHashMap = this.f25453c;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            } else {
                entry = (Map.Entry) it.next();
                if (wc.c.c((String) entry.getKey()).equals(c10)) {
                    break;
                }
            }
        }
        if (entry != null) {
            linkedHashMap.remove(entry.getKey());
        }
    }

    public final URL f() {
        URL url = this.f25451a;
        if (url != f25450e) {
            return url;
        }
        throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
    }
}
