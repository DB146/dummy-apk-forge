package Hb;

import E5.o;
import Eb.B;
import a.AbstractC0672a;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import v2.AbstractC2127A;
import v2.C2133e;
import v2.C2134f;
import v2.u;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4915a;

    public /* synthetic */ b(int i7) {
        this.f4915a = i7;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        Bundle bundle;
        switch (this.f4915a) {
            case 0:
                String acc = (String) obj;
                g element = (g) obj2;
                l.e(acc, "acc");
                l.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 1:
                i acc2 = (i) obj;
                g element2 = (g) obj2;
                l.e(acc2, "acc");
                l.e(element2, "element");
                i minusKey = acc2.minusKey(element2.getKey());
                j jVar = j.f4919a;
                if (minusKey == jVar) {
                    return element2;
                }
                e eVar = e.f4918a;
                f fVar = (f) minusKey.get(eVar);
                if (fVar == null) {
                    cVar = new c(element2, minusKey);
                } else {
                    i minusKey2 = minusKey.minusKey(eVar);
                    if (minusKey2 == jVar) {
                        return new c(fVar, element2);
                    }
                    cVar = new c(fVar, new c(element2, minusKey2));
                }
                return cVar;
            default:
                u uVar = (u) obj2;
                y2.f fVar2 = uVar.f25026b;
                fVar2.getClass();
                ArrayList arrayList = new ArrayList();
                Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                for (Map.Entry entry : B.L(fVar2.f26780s.f24962a).entrySet()) {
                    ((AbstractC2127A) entry.getValue()).getClass();
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                    AbstractC0672a.p(f4, "android-support-nav:controller:navigatorState:names", arrayList);
                    AbstractC0672a.n(bundle, "android-support-nav:controller:navigatorState", f4);
                }
                Eb.l lVar = fVar2.f26770f;
                if (!lVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = lVar.iterator();
                    while (it.hasNext()) {
                        C2133e entry2 = (C2133e) it.next();
                        l.e(entry2, "entry");
                        int i7 = entry2.f24967b.f25017b.f4638a;
                        y2.c cVar2 = entry2.f24973v;
                        Bundle a9 = cVar2.a();
                        Bundle f10 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                        cVar2.f26754h.x(f10);
                        Bundle f11 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                        AbstractC0672a.o("nav-entry-state:id", entry2.f24971f, f11);
                        f11.putInt("nav-entry-state:destination-id", i7);
                        if (a9 == null) {
                            a9 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                        }
                        AbstractC0672a.n(f11, "nav-entry-state:args", a9);
                        AbstractC0672a.n(f11, "nav-entry-state:saved-state", f10);
                        arrayList2.add(f11);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                LinkedHashMap linkedHashMap = fVar2.f26773l;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry3.getKey()).intValue();
                        String str = (String) entry3.getValue();
                        int i11 = i10 + 1;
                        iArr[i10] = intValue;
                        if (str == null) {
                            str = "";
                        }
                        arrayList3.add(str);
                        i10 = i11;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    AbstractC0672a.p(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                LinkedHashMap linkedHashMap2 = fVar2.f26774m;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        String str2 = (String) entry4.getKey();
                        Eb.l lVar2 = (Eb.l) entry4.getValue();
                        arrayList4.add(str2);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = lVar2.iterator();
                        while (it2.hasNext()) {
                            o oVar = ((C2134f) it2.next()).f24974a;
                            oVar.getClass();
                            Bundle f12 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                            AbstractC0672a.o("nav-entry-state:id", (String) oVar.f3713b, f12);
                            f12.putInt("nav-entry-state:destination-id", oVar.f3712a);
                            Bundle bundle2 = (Bundle) oVar.f3714c;
                            if (bundle2 == null) {
                                bundle2 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                            }
                            AbstractC0672a.n(f12, "nav-entry-state:args", bundle2);
                            AbstractC0672a.n(f12, "nav-entry-state:saved-state", (Bundle) oVar.f3715d);
                            arrayList5.add(f12);
                        }
                        String key = "android-support-nav:controller:backStackStates:" + str2;
                        l.e(key, "key");
                        bundle.putParcelableArrayList(key, arrayList5);
                    }
                    AbstractC0672a.p(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (uVar.f25029e) {
                    if (bundle == null) {
                        bundle = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", uVar.f25029e);
                }
                return bundle;
        }
    }
}
