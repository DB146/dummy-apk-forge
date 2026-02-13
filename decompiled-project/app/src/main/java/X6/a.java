package X6;

import U9.i;
import U9.j;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import y.S;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f10992c = Logger.getLogger(a.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f10993d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f10994e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f10995f;

    /* renamed from: a, reason: collision with root package name */
    public final b f10996a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10997b = f10993d;

    static {
        int i7 = 17;
        try {
            Class.forName("android.app.Application", false, null);
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                String str = strArr[i10];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f10992c.info(S.b("Provider ", str, " not available"));
                }
            }
            f10993d = arrayList;
        } catch (Exception unused) {
            f10993d = new ArrayList();
        }
        f10994e = new a(new i(i7));
        f10995f = new a(new j(i7));
    }

    public a(b bVar) {
        this.f10996a = bVar;
    }

    public final Object a(String str) {
        Iterator it = this.f10997b.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            b bVar = this.f10996a;
            if (!hasNext) {
                return bVar.b(str, null);
            }
            try {
                return bVar.b(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
