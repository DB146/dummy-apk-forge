package v2;

import H2.C0288b;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import u.U;
import y.S;
import y7.u0;

@z("navigation")
/* loaded from: classes.dex */
public class t extends AbstractC2127A {

    /* renamed from: c, reason: collision with root package name */
    public final C2128B f25024c;

    public t(C2128B navigatorProvider) {
        kotlin.jvm.internal.l.e(navigatorProvider, "navigatorProvider");
        this.f25024c = navigatorProvider;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // v2.AbstractC2127A
    public final void d(List list, x xVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2133e c2133e = (C2133e) it.next();
            q qVar = c2133e.f24967b;
            kotlin.jvm.internal.l.c(qVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            r rVar = (r) qVar;
            ?? obj = new Object();
            obj.f19134a = c2133e.f24973v.a();
            B4.j jVar = rVar.f25021f;
            int i7 = jVar.f2089b;
            String str = (String) jVar.f2093f;
            if (i7 == 0 && str == null) {
                C0288b c0288b = rVar.f25017b;
                c0288b.getClass();
                String superName = String.valueOf(c0288b.f4638a);
                kotlin.jvm.internal.l.e(superName, "superName");
                if (((r) jVar.f2090c).f25017b.f4638a == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            q i10 = str != null ? jVar.i(str, false) : (q) ((U) jVar.f2091d).c(i7);
            if (i10 == null) {
                if (((String) jVar.f2092e) == null) {
                    String str2 = (String) jVar.f2093f;
                    if (str2 == null) {
                        str2 = String.valueOf(jVar.f2089b);
                    }
                    jVar.f2092e = str2;
                }
                String str3 = (String) jVar.f2092e;
                kotlin.jvm.internal.l.b(str3);
                throw new IllegalArgumentException(S.b("navigation destination ", str3, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                C0288b c0288b2 = i10.f25017b;
                if (!str.equals((String) c0288b2.f4642e)) {
                    p l10 = c0288b2.l(str);
                    Bundle bundle = l10 != null ? l10.f25011b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                        f4.putAll(bundle);
                        Bundle bundle2 = (Bundle) obj.f19134a;
                        if (bundle2 != null) {
                            f4.putAll(bundle2);
                        }
                        obj.f19134a = f4;
                    }
                }
                if (i10.o().isEmpty()) {
                    continue;
                } else {
                    ArrayList A10 = tc.b.A(i10.o(), new Ba.o((Object) obj, 22));
                    if (!A10.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + i10 + ". Missing required arguments [" + A10 + ']').toString());
                    }
                }
            }
            this.f25024c.b(i10.f25016a).d(u0.x(b().b(i10, i10.b((Bundle) obj.f19134a))), xVar);
        }
    }

    @Override // v2.AbstractC2127A
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public r a() {
        return new r(this);
    }
}
