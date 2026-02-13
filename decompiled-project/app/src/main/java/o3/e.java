package o3;

import Aa.j;
import H2.C0288b;
import Y5.J0;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.l;
import v2.AbstractC2127A;
import v2.C2132d;
import v2.o;
import v2.q;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21671b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21672c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21673d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f21674e;

    public e(Context context, q3.i iVar) {
        this.f21670a = iVar;
        Context applicationContext = context.getApplicationContext();
        l.d(applicationContext, "context.applicationContext");
        this.f21671b = applicationContext;
        this.f21672c = new Object();
        this.f21674e = new LinkedHashSet();
    }

    public e(AbstractC2127A abstractC2127A, String str) {
        this.f21670a = abstractC2127A;
        this.f21671b = str;
        this.f21672c = new LinkedHashMap();
        this.f21673d = new ArrayList();
        this.f21674e = new LinkedHashMap();
    }

    public q a() {
        q b2 = b();
        b2.getClass();
        Iterator it = ((LinkedHashMap) this.f21672c).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String argumentName = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            l.e(argumentName, "argumentName");
            l.e(null, "argument");
            throw null;
        }
        Iterator it2 = ((ArrayList) this.f21673d).iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            C0288b c0288b = b2.f25017b;
            if (!hasNext) {
                Iterator it3 = ((LinkedHashMap) this.f21674e).entrySet().iterator();
                if (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    ((Number) entry2.getKey()).intValue();
                    if (entry2.getValue() != null) {
                        throw new ClassCastException();
                    }
                    l.e(null, "action");
                    throw null;
                }
                String str = (String) this.f21671b;
                if (str != null) {
                    c0288b.getClass();
                    if (ac.g.h0(str)) {
                        throw new IllegalArgumentException("Cannot have an empty route");
                    }
                    int i7 = q.f25015e;
                    String uriPattern = "android-app://androidx.navigation/".concat(str);
                    l.e(uriPattern, "uriPattern");
                    final o oVar = new o(uriPattern);
                    final int i10 = 1;
                    ArrayList A10 = tc.b.A((LinkedHashMap) c0288b.f4641d, new Rb.c() { // from class: y2.g
                        @Override // Rb.c
                        public final Object invoke(Object obj) {
                            String key = (String) obj;
                            switch (i10) {
                                case 0:
                                    l.e(key, "key");
                                    return Boolean.valueOf(!oVar.c().contains(key));
                                default:
                                    l.e(key, "key");
                                    return Boolean.valueOf(!oVar.c().contains(key));
                            }
                        }
                    });
                    if (!A10.isEmpty()) {
                        StringBuilder n6 = X.c.n("Cannot set route \"", str, "\" for destination ");
                        n6.append((q) c0288b.f4639b);
                        n6.append(". Following required arguments are missing: ");
                        n6.append(A10);
                        throw new IllegalArgumentException(n6.toString().toString());
                    }
                    c0288b.f4643f = android.support.v4.media.session.b.z(new C2132d(uriPattern, 5));
                    c0288b.f4638a = uriPattern.hashCode();
                    c0288b.f4642e = str;
                }
                return b2;
            }
            final o navDeepLink = (o) it2.next();
            l.e(navDeepLink, "navDeepLink");
            c0288b.getClass();
            final int i11 = 0;
            ArrayList A11 = tc.b.A((LinkedHashMap) c0288b.f4641d, new Rb.c() { // from class: y2.g
                @Override // Rb.c
                public final Object invoke(Object obj) {
                    String key = (String) obj;
                    switch (i11) {
                        case 0:
                            l.e(key, "key");
                            return Boolean.valueOf(!navDeepLink.c().contains(key));
                        default:
                            l.e(key, "key");
                            return Boolean.valueOf(!navDeepLink.c().contains(key));
                    }
                }
            });
            if (!A11.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.f25001a + " can't be used to open destination " + ((q) c0288b.f4639b) + ".\nFollowing required arguments are missing: " + A11).toString());
            }
            ((ArrayList) c0288b.f4640c).add(navDeepLink);
        }
    }

    public q b() {
        return ((AbstractC2127A) this.f21670a).a();
    }

    public abstract Object c();

    public void d(Object obj) {
        synchronized (this.f21672c) {
            Object obj2 = this.f21673d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f21673d = obj;
                ((J0) ((q3.i) this.f21670a).f23385d).execute(new j(24, Eb.o.s0((LinkedHashSet) this.f21674e), this));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
