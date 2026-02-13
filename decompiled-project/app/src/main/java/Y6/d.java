package Y6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import e8.InterfaceC1099b;
import j8.InterfaceC1387b;
import java.util.Collections;
import java.util.HashSet;
import l1.AbstractC1449a;
import p7.C1857a;
import p7.p;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1387b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12035c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f12033a = i7;
        this.f12034b = obj;
        this.f12035c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o8.a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T6.a, java.lang.Object] */
    @Override // j8.InterfaceC1387b
    public final Object get() {
        boolean z8;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f12033a) {
            case 0:
                i iVar = (i) this.f12034b;
                String g = iVar.g();
                Context context = (Context) this.f12035c;
                ?? obj = new Object();
                Context createDeviceProtectedStorageContext = AbstractC1449a.createDeviceProtectedStorageContext(context);
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + g, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z8 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    z8 = z10;
                }
                obj.f22124a = z8;
                return obj;
            default:
                p7.e eVar = (p7.e) this.f12034b;
                eVar.getClass();
                C1857a c1857a = (C1857a) this.f12035c;
                p7.c cVar = c1857a.f23123f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (p7.h hVar : c1857a.f23120c) {
                    int i7 = hVar.f23139c;
                    boolean z11 = i7 == 0;
                    int i10 = hVar.f23138b;
                    p pVar = hVar.f23137a;
                    if (z11) {
                        if (i10 == 2) {
                            hashSet4.add(pVar);
                        } else {
                            hashSet.add(pVar);
                        }
                    } else if (i7 == 2) {
                        hashSet3.add(pVar);
                    } else if (i10 == 2) {
                        hashSet5.add(pVar);
                    } else {
                        hashSet2.add(pVar);
                    }
                }
                if (!c1857a.g.isEmpty()) {
                    hashSet.add(p.a(InterfaceC1099b.class));
                }
                obj2.f9320a = Collections.unmodifiableSet(hashSet);
                obj2.f9321b = Collections.unmodifiableSet(hashSet2);
                obj2.f9322c = Collections.unmodifiableSet(hashSet3);
                obj2.f9323d = Collections.unmodifiableSet(hashSet4);
                obj2.f9324e = Collections.unmodifiableSet(hashSet5);
                obj2.f9325f = eVar;
                return cVar.g(obj2);
        }
    }
}
