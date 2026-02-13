package Q2;

import W1.C;
import ab.j;
import android.os.Bundle;
import android.view.View;
import c.AbstractActivityC0867k;
import c.C0863g;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;
import l2.Q;
import l2.Y;
import l2.d0;
import l2.e0;
import l2.r;
import q3.s;
import y.S;

/* loaded from: classes.dex */
public final class b implements InterfaceC1477v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8619a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8620b;

    public b(e owner) {
        this.f8619a = 0;
        l.e(owner, "owner");
        this.f8620b = owner;
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.f8619a = i7;
        this.f8620b = obj;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, r rVar) {
        View view;
        switch (this.f8619a) {
            case 0:
                if (rVar != r.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC1479x.w().f(this);
                e eVar = (e) this.f8620b;
                Bundle o10 = eVar.b().o("androidx.savedstate.Restarter");
                if (o10 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = o10.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        l.b(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                l.b(newInstance);
                                if (!(eVar instanceof e0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                d0 s3 = ((e0) eVar).s();
                                s b2 = eVar.b();
                                s3.getClass();
                                LinkedHashMap linkedHashMap = s3.f19210a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    l.e(key, "key");
                                    Y y10 = (Y) linkedHashMap.get(key);
                                    if (y10 != null) {
                                        Q.a(y10, b2, eVar.w());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b2.E();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException(X.c.t("Failed to instantiate ", str), e2);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(S.b("Class ", str, " wasn't found"), e11);
                    }
                }
                return;
            case 1:
                if (rVar != r.ON_STOP || (view = ((C) this.f8620b).f10277U) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                if (rVar == r.ON_DESTROY) {
                    j jVar = (j) this.f8620b;
                    jVar.getClass();
                    jVar.f12813a = null;
                    jVar.f12814b = null;
                    return;
                }
                return;
            default:
                AbstractActivityC0867k abstractActivityC0867k = (AbstractActivityC0867k) this.f8620b;
                if (abstractActivityC0867k.f14051e == null) {
                    C0863g c0863g = (C0863g) abstractActivityC0867k.getLastNonConfigurationInstance();
                    if (c0863g != null) {
                        abstractActivityC0867k.f14051e = c0863g.f14026a;
                    }
                    if (abstractActivityC0867k.f14051e == null) {
                        abstractActivityC0867k.f14051e = new d0();
                    }
                }
                abstractActivityC0867k.f18773a.f(this);
                return;
        }
    }
}
