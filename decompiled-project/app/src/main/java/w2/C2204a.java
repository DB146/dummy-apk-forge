package w2;

import A9.O0;
import fc.J;
import fc.b0;
import ia.C1358d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import l2.H;
import l2.N;
import l2.Y;
import n2.AbstractC1695a;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204a extends Y {

    /* renamed from: a, reason: collision with root package name */
    public final String f25673a = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: b, reason: collision with root package name */
    public final String f25674b;

    /* renamed from: c, reason: collision with root package name */
    public C1358d f25675c;

    public C2204a(N n6) {
        Object obj;
        n6.getClass();
        O0 o02 = n6.f19170b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) o02.f922a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) o02.f925d;
        try {
            J j = (J) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (j == null || (obj = ((b0) j).getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) o02.f924c).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String key = this.f25673a;
            kotlin.jvm.internal.l.e(key, "key");
            if (str != null) {
                ArrayList arrayList = AbstractC1695a.f21058a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(str)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + str.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = AbstractC1695a.f21058a;
            Object obj2 = n6.f19169a.get(key);
            H h10 = obj2 instanceof H ? (H) obj2 : null;
            if (h10 != null) {
                h10.k(str);
            }
            o02.A(str, key);
        }
        this.f25674b = str;
    }

    @Override // l2.Y
    public final void onCleared() {
        C1358d c1358d = this.f25675c;
        if (c1358d == null) {
            kotlin.jvm.internal.l.j("saveableStateHolderRef");
            throw null;
        }
        Z.c cVar = (Z.c) ((WeakReference) c1358d.f18487b).get();
        if (cVar != null) {
            cVar.f(this.f25674b);
        }
        C1358d c1358d2 = this.f25675c;
        if (c1358d2 != null) {
            ((WeakReference) c1358d2.f18487b).clear();
        } else {
            kotlin.jvm.internal.l.j("saveableStateHolderRef");
            throw null;
        }
    }
}
