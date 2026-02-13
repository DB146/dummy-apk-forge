package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c.C0865i;
import f.C1117a;
import f.C1121e;
import f.C1122f;
import f.C1123g;
import f.C1124h;
import f.C1125i;
import f.InterfaceC1118b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;
import l2.r;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14031a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14032b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14033c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14034d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f14035e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f14036f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0867k f14037h;

    public C0865i(AbstractActivityC0867k abstractActivityC0867k) {
        this.f14037h = abstractActivityC0867k;
    }

    public final boolean a(int i7, int i10, Intent intent) {
        String str = (String) this.f14031a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        C1121e c1121e = (C1121e) this.f14035e.get(str);
        if ((c1121e != null ? c1121e.f16909a : null) != null) {
            ArrayList arrayList = this.f14034d;
            if (arrayList.contains(str)) {
                c1121e.f16909a.h(c1121e.f16910b.L(i10, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f14036f.remove(str);
        this.g.putParcelable(str, new C1117a(i10, intent));
        return true;
    }

    public final void b(int i7, com.bumptech.glide.c cVar, Object obj) {
        Bundle bundle;
        AbstractActivityC0867k abstractActivityC0867k = this.f14037h;
        R7.a E10 = cVar.E(abstractActivityC0867k, obj);
        if (E10 != null) {
            new Handler(Looper.getMainLooper()).post(new F2.a(this, i7, E10, 1));
            return;
        }
        Intent p10 = cVar.p(abstractActivityC0867k, obj);
        if (p10.getExtras() != null) {
            Bundle extras = p10.getExtras();
            kotlin.jvm.internal.l.b(extras);
            if (extras.getClassLoader() == null) {
                p10.setExtrasClassLoader(abstractActivityC0867k.getClassLoader());
            }
        }
        if (p10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = p10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            p10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(p10.getAction())) {
            String[] stringArrayExtra = p10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            k1.c.a(abstractActivityC0867k, stringArrayExtra, i7);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(p10.getAction())) {
            abstractActivityC0867k.startActivityForResult(p10, i7, bundle);
            return;
        }
        C1125i c1125i = (C1125i) p10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.l.b(c1125i);
            abstractActivityC0867k.startIntentSenderForResult(c1125i.f16918a, i7, c1125i.f16919b, c1125i.f16920c, c1125i.f16921d, 0, bundle);
        } catch (IntentSender.SendIntentException e2) {
            new Handler(Looper.getMainLooper()).post(new F2.a(this, i7, e2, 2));
        }
    }

    public final C1124h c(String key, com.bumptech.glide.c cVar, InterfaceC1118b interfaceC1118b) {
        kotlin.jvm.internal.l.e(key, "key");
        e(key);
        this.f14035e.put(key, new C1121e(cVar, interfaceC1118b));
        LinkedHashMap linkedHashMap = this.f14036f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC1118b.h(obj);
        }
        Bundle bundle = this.g;
        C1117a c1117a = (C1117a) android.support.v4.media.session.b.p(key, bundle);
        if (c1117a != null) {
            bundle.remove(key);
            interfaceC1118b.h(cVar.L(c1117a.f16903a, c1117a.f16904b));
        }
        return new C1124h(this, key, cVar, 1);
    }

    public final C1124h d(final String key, InterfaceC1479x interfaceC1479x, final com.bumptech.glide.c cVar, final InterfaceC1118b interfaceC1118b) {
        kotlin.jvm.internal.l.e(key, "key");
        C1481z w10 = interfaceC1479x.w();
        if (w10.f19242d.compareTo(EnumC1474s.f19230d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC1479x + " is attempting to register while current state is " + w10.f19242d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f14033c;
        C1122f c1122f = (C1122f) linkedHashMap.get(key);
        if (c1122f == null) {
            c1122f = new C1122f(w10);
        }
        InterfaceC1477v interfaceC1477v = new InterfaceC1477v() { // from class: f.d
            @Override // l2.InterfaceC1477v
            public final void onStateChanged(InterfaceC1479x interfaceC1479x2, r rVar) {
                r rVar2 = r.ON_START;
                C0865i c0865i = C0865i.this;
                String str = key;
                if (rVar2 != rVar) {
                    if (r.ON_STOP == rVar) {
                        c0865i.f14035e.remove(str);
                        return;
                    } else {
                        if (r.ON_DESTROY == rVar) {
                            c0865i.f(str);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = c0865i.f14035e;
                InterfaceC1118b interfaceC1118b2 = interfaceC1118b;
                com.bumptech.glide.c cVar2 = cVar;
                linkedHashMap2.put(str, new C1121e(cVar2, interfaceC1118b2));
                LinkedHashMap linkedHashMap3 = c0865i.f14036f;
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    interfaceC1118b2.h(obj);
                }
                Bundle bundle = c0865i.g;
                C1117a c1117a = (C1117a) android.support.v4.media.session.b.p(str, bundle);
                if (c1117a != null) {
                    bundle.remove(str);
                    interfaceC1118b2.h(cVar2.L(c1117a.f16903a, c1117a.f16904b));
                }
            }
        };
        c1122f.f16911a.a(interfaceC1477v);
        c1122f.f16912b.add(interfaceC1477v);
        linkedHashMap.put(key, c1122f);
        return new C1124h(this, key, cVar, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f14032b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new Zb.a(new Ob.h(C1123g.f16913a, new Ba.i(7))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f14031a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        kotlin.jvm.internal.l.e(key, "key");
        if (!this.f14034d.contains(key) && (num = (Integer) this.f14032b.remove(key)) != null) {
            this.f14031a.remove(num);
        }
        this.f14035e.remove(key);
        LinkedHashMap linkedHashMap = this.f14036f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder n6 = X.c.n("Dropping pending result for request ", key, ": ");
            n6.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", n6.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C1117a) android.support.v4.media.session.b.p(key, bundle)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f14033c;
        C1122f c1122f = (C1122f) linkedHashMap2.get(key);
        if (c1122f != null) {
            ArrayList arrayList = c1122f.f16912b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c1122f.f16911a.f((InterfaceC1477v) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
