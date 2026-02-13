package l2;

import Y5.C0658x;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class U implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f19183a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f19184b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f19185c;

    /* renamed from: d, reason: collision with root package name */
    public final C1481z f19186d;

    /* renamed from: e, reason: collision with root package name */
    public final q3.s f19187e;

    public U() {
        this.f19184b = new Z(null);
    }

    public U(Application application, Q2.e eVar, Bundle bundle) {
        Z z8;
        this.f19187e = eVar.b();
        this.f19186d = eVar.w();
        this.f19185c = bundle;
        this.f19183a = application;
        if (application != null) {
            if (Z.f19197c == null) {
                Z.f19197c = new Z(application);
            }
            z8 = Z.f19197c;
            kotlin.jvm.internal.l.b(z8);
        } else {
            z8 = new Z(null);
        }
        this.f19184b = z8;
    }

    @Override // l2.a0
    public final Y a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // l2.a0
    public final Y b(Class cls, o2.d dVar) {
        C0658x c0658x = c0.f19205b;
        LinkedHashMap linkedHashMap = dVar.f21663a;
        String str = (String) linkedHashMap.get(c0658x);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(Q.f19174a) == null || linkedHashMap.get(Q.f19175b) == null) {
            if (this.f19186d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(Z.f19198d);
        boolean isAssignableFrom = AbstractC1457a.class.isAssignableFrom(cls);
        Constructor a9 = (!isAssignableFrom || application == null) ? V.a(V.f19189b, cls) : V.a(V.f19188a, cls);
        return a9 == null ? this.f19184b.b(cls, dVar) : (!isAssignableFrom || application == null) ? V.b(cls, a9, Q.b(dVar)) : V.b(cls, a9, application, Q.b(dVar));
    }

    @Override // l2.a0
    public final Y c(kotlin.jvm.internal.e eVar, o2.d dVar) {
        return b(c2.i.q(eVar), dVar);
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, l2.b0] */
    public final Y d(Class cls, String str) {
        N n6;
        C1481z c1481z = this.f19186d;
        if (c1481z == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC1457a.class.isAssignableFrom(cls);
        Application application = this.f19183a;
        Constructor a9 = (!isAssignableFrom || application == null) ? V.a(V.f19189b, cls) : V.a(V.f19188a, cls);
        if (a9 == null) {
            if (application != null) {
                return this.f19184b.a(cls);
            }
            if (b0.f19202a == null) {
                b0.f19202a = new Object();
            }
            kotlin.jvm.internal.l.b(b0.f19202a);
            return E6.b.h(cls);
        }
        q3.s sVar = this.f19187e;
        kotlin.jvm.internal.l.b(sVar);
        Bundle o10 = sVar.o(str);
        if (o10 == null) {
            o10 = this.f19185c;
        }
        if (o10 == null) {
            n6 = new N();
        } else {
            ClassLoader classLoader = N.class.getClassLoader();
            kotlin.jvm.internal.l.b(classLoader);
            o10.setClassLoader(classLoader);
            Fb.f fVar = new Fb.f(o10.size());
            for (String str2 : o10.keySet()) {
                kotlin.jvm.internal.l.b(str2);
                fVar.put(str2, o10.get(str2));
            }
            n6 = new N(fVar.b());
        }
        O o11 = new O(str, n6);
        o11.l(c1481z, sVar);
        EnumC1474s enumC1474s = c1481z.f19242d;
        if (enumC1474s == EnumC1474s.f19228b || enumC1474s.compareTo(EnumC1474s.f19230d) >= 0) {
            sVar.E();
        } else {
            c1481z.a(new C1464h(c1481z, sVar));
        }
        Y b2 = (!isAssignableFrom || application == null) ? V.b(cls, a9, n6) : V.b(cls, a9, application, n6);
        b2.addCloseable("androidx.lifecycle.savedstate.vm.tag", o11);
        return b2;
    }
}
