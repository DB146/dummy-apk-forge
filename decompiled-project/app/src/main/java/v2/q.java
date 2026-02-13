package v2;

import H2.C0288b;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l2.X;
import u.U;
import u.V;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25015e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f25016a;

    /* renamed from: b, reason: collision with root package name */
    public final C0288b f25017b;

    /* renamed from: c, reason: collision with root package name */
    public r f25018c;

    /* renamed from: d, reason: collision with root package name */
    public final U f25019d;

    static {
        new LinkedHashMap();
    }

    public q(AbstractC2127A navigator) {
        kotlin.jvm.internal.l.e(navigator, "navigator");
        LinkedHashMap linkedHashMap = C2128B.f24961b;
        this.f25016a = O5.b.s(navigator.getClass());
        this.f25017b = new C0288b(this);
        this.f25019d = new U(0);
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f25017b.f4641d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        if (bundle != null) {
            f4.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                throw new ClassCastException();
            }
        }
        return f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z8;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        C0288b c0288b = this.f25017b;
        ArrayList arrayList = (ArrayList) c0288b.f4640c;
        q qVar = (q) obj;
        C0288b c0288b2 = qVar.f25017b;
        boolean a9 = kotlin.jvm.internal.l.a(arrayList, (ArrayList) c0288b2.f4640c);
        U u3 = this.f25019d;
        int f4 = u3.f();
        U u10 = qVar.f25019d;
        if (f4 == u10.f()) {
            Iterator it = ((Zb.a) Zb.i.M(new V(u3))).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!kotlin.jvm.internal.l.a(u3.c(intValue), u10.c(intValue))) {
                }
            }
            z8 = true;
            if (o().size() == qVar.o().size()) {
                Set<Map.Entry> entrySet = o().entrySet();
                kotlin.jvm.internal.l.e(entrySet, "<this>");
                for (Map.Entry entry : entrySet) {
                    if (qVar.o().containsKey(entry.getKey()) && kotlin.jvm.internal.l.a(qVar.o().get(entry.getKey()), entry.getValue())) {
                    }
                }
                z10 = true;
                return c0288b.f4638a != c0288b2.f4638a && kotlin.jvm.internal.l.a((String) c0288b.f4642e, (String) c0288b2.f4642e) && a9 && z8 && z10;
            }
            z10 = false;
            if (c0288b.f4638a != c0288b2.f4638a) {
            }
        }
        z8 = false;
        if (o().size() == qVar.o().size()) {
        }
        z10 = false;
        if (c0288b.f4638a != c0288b2.f4638a) {
        }
    }

    public int hashCode() {
        C0288b c0288b = this.f25017b;
        int i7 = c0288b.f4638a * 31;
        String str = (String) c0288b.f4642e;
        int hashCode = i7 + (str != null ? str.hashCode() : 0);
        Iterator it = ((ArrayList) c0288b.f4640c).iterator();
        while (it.hasNext()) {
            hashCode = (((o) it.next()).f25001a.hashCode() + (hashCode * 31)) * 961;
        }
        U u3 = this.f25019d;
        kotlin.jvm.internal.l.e(u3, "<this>");
        if (u3.f() > 0) {
            u3.g(0).getClass();
            throw new ClassCastException();
        }
        for (String str2 : o().keySet()) {
            int d10 = A3.c.d(hashCode * 31, 31, str2);
            Object obj = o().get(str2);
            hashCode = d10 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public final Map o() {
        return Eb.B.L((LinkedHashMap) this.f25017b.f4641d);
    }

    public p t(X x2) {
        boolean d10;
        ac.e eVar;
        r8.o c10;
        C0288b c0288b = this.f25017b;
        c0288b.getClass();
        ArrayList arrayList = (ArrayList) c0288b.f4640c;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        p pVar = null;
        while (it.hasNext()) {
            o oVar = (o) it.next();
            oVar.getClass();
            Db.o oVar2 = oVar.f25004d;
            ac.e eVar2 = (ac.e) oVar2.getValue();
            Uri uri = (Uri) x2.f19194b;
            if (eVar2 == null) {
                d10 = true;
            } else if (uri == null) {
                d10 = false;
            } else {
                ac.e eVar3 = (ac.e) oVar2.getValue();
                kotlin.jvm.internal.l.b(eVar3);
                d10 = eVar3.d(uri.toString());
            }
            if (d10) {
                LinkedHashMap arguments = (LinkedHashMap) c0288b.f4641d;
                Bundle d11 = uri != null ? oVar.d(uri, arguments) : null;
                int b2 = oVar.b(uri);
                String str = (String) x2.f19195c;
                boolean z8 = str != null && str.equals(null);
                if (d11 == null) {
                    if (z8) {
                        kotlin.jvm.internal.l.e(arguments, "arguments");
                        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                        if (uri != null && (eVar = (ac.e) oVar2.getValue()) != null && (c10 = eVar.c(uri.toString())) != null) {
                            oVar.e(c10, f4, arguments);
                            if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                                oVar.f(uri, f4, arguments);
                            }
                        }
                        if (tc.b.A(arguments, new m(1, f4)).isEmpty()) {
                        }
                    }
                }
                p pVar2 = new p((q) c0288b.f4639b, d11, oVar.f25009l, b2, z8);
                if (pVar == null || pVar2.compareTo(pVar) > 0) {
                    pVar = pVar2;
                }
            }
        }
        return pVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(0x");
        C0288b c0288b = this.f25017b;
        c0288b.getClass();
        sb2.append(Integer.toHexString(c0288b.f4638a));
        sb2.append(")");
        String str = (String) c0288b.f4642e;
        if (str != null && !ac.g.h0(str)) {
            sb2.append(" route=");
            sb2.append((String) c0288b.f4642e);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
