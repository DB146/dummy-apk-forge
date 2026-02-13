package oa;

import M9.t;
import Y5.C0660y;
import Z9.B;
import Z9.C0669f;
import Z9.C0670g;
import Z9.D;
import Z9.E;
import Z9.F;
import Z9.H;
import Z9.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import ca.C0918a;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.blurry.BlurFactor;
import da.C1065c;
import db.InterfaceC1070c;
import e7.AbstractC1097a;
import h3.o;
import hb.InterfaceC1270c;
import i2.C1332t;
import okhttp3.OkHttpClient;
import ra.C1953a;
import y6.C2399e;

/* loaded from: classes2.dex */
public final class i implements InterfaceC1070c {

    /* renamed from: a, reason: collision with root package name */
    public final j f22156a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22157b;

    public i(j jVar, int i7) {
        this.f22156a = jVar;
        this.f22157b = i7;
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [Pa.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, hb.a] */
    /* JADX WARN: Type inference failed for: r7v6, types: [Pa.d, java.lang.Object] */
    @Override // Cb.a
    public final Object get() {
        G7.f a9;
        switch (this.f22157b) {
            case 0:
                return new C1832g(this, 0);
            case 1:
                return new R9.b((SharedPreferences) this.f22156a.f22176i.get());
            case 2:
                j jVar = this.f22156a;
                C1332t c1332t = jVar.f22169a;
                Context context = jVar.f22170b.f3734b;
                vc.i.g(context);
                String sharedPreferencesName = (String) this.f22156a.f22175h.get();
                kotlin.jvm.internal.l.e(sharedPreferencesName, "sharedPreferencesName");
                SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
                kotlin.jvm.internal.l.d(sharedPreferences, "getSharedPreferences(...)");
                return sharedPreferences;
            case 3:
                C1332t c1332t2 = this.f22156a.f22169a;
                return "XemTV";
            case 4:
                return new t(K9.c.a(this.f22156a.f22171c), (R9.a) this.f22156a.j.get(), (RoomDataBase) this.f22156a.k.get(), (M9.k) this.f22156a.f22178m.get(), (u8.c) this.f22156a.f22177l.get());
            case 5:
                j jVar2 = this.f22156a;
                C1332t c1332t3 = jVar2.f22169a;
                Context context2 = jVar2.f22170b.f3734b;
                vc.i.g(context2);
                return RoomDataBase.f16124l.g(context2);
            case 6:
                OkHttpClient a10 = K9.c.a(this.f22156a.f22171c);
                R9.a aVar = (R9.a) this.f22156a.j.get();
                RoomDataBase roomDataBase = (RoomDataBase) this.f22156a.k.get();
                u8.c cVar = (u8.c) this.f22156a.f22177l.get();
                K9.b bVar = this.f22156a.f22171c;
                return new M9.k(a10, aVar, roomDataBase, cVar, new Object());
            case 7:
                h8.e eVar = this.f22156a.f22172d;
                u8.c e2 = u8.c.e();
                kotlin.jvm.internal.l.d(e2, "getInstance(...)");
                return e2;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new Object();
            case 9:
                return new C1832g(this, 1);
            case 10:
                return new C1832g(this, 2);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new C1832g(this, 3);
            case 12:
                return new C1065c(this.f22156a.c(), (RoomDataBase) this.f22156a.k.get(), ((Long) this.f22156a.f22190y.get()).longValue());
            case 13:
                return new D((u8.c) this.f22156a.f22177l.get(), K9.c.a(this.f22156a.f22171c));
            case 14:
                Context context3 = this.f22156a.f22170b.f3734b;
                vc.i.g(context3);
                return new F(context3, (RoomDataBase) this.f22156a.k.get(), (C0918a) this.f22156a.f22185t.get(), K9.c.a(this.f22156a.f22171c));
            case 15:
                return new C0918a((SharedPreferences) this.f22156a.f22176i.get());
            case 16:
                return new B(K9.c.a(this.f22156a.f22171c), (G7.f) this.f22156a.f22187v.get(), (C0918a) this.f22156a.f22185t.get(), (RoomDataBase) this.f22156a.k.get(), (u8.c) this.f22156a.f22177l.get());
            case 17:
                h8.e eVar2 = this.f22156a.f22172d;
                Y6.i e10 = Y6.i.e();
                e10.b();
                String str = e10.f12043c.f12056c;
                if (str == null) {
                    e10.b();
                    if (e10.f12043c.g == null) {
                        throw new RuntimeException("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
                    }
                    StringBuilder sb2 = new StringBuilder("https://");
                    e10.b();
                    str = o.p(sb2, e10.f12043c.g, "-default-rtdb.firebaseio.com");
                }
                synchronized (G7.f.class) {
                    if (TextUtils.isEmpty(str)) {
                        throw new RuntimeException("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
                    }
                    G7.g gVar = (G7.g) e10.c(G7.g.class);
                    G.h(gVar, "Firebase Database component is not present.");
                    O7.h d10 = O7.k.d(str);
                    if (!d10.f7498b.isEmpty()) {
                        throw new RuntimeException("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + d10.f7498b.toString());
                    }
                    a9 = gVar.a(d10.f7497a);
                }
                return a9;
            case 18:
                B b2 = (B) this.f22156a.f22188w.get();
                D d11 = (D) this.f22156a.f22184s.get();
                C0670g c0670g = new C0670g(K9.c.a(this.f22156a.f22171c));
                F f4 = (F) this.f22156a.f22186u.get();
                j jVar3 = this.f22156a;
                H h10 = new H(K9.c.a(jVar3.f22171c), (C0918a) jVar3.f22185t.get(), (RoomDataBase) jVar3.k.get());
                j jVar4 = this.f22156a;
                E e11 = new E(K9.c.a(jVar4.f22171c), (C0918a) jVar4.f22185t.get());
                C0669f a11 = this.f22156a.a();
                j jVar5 = this.f22156a;
                Z9.t tVar = new Z9.t(K9.c.a(jVar5.f22171c), (C0918a) jVar5.f22185t.get());
                Z9.j jVar6 = new Z9.j((t) this.f22156a.f22179n.get(), new G8.m());
                u8.c cVar2 = (u8.c) this.f22156a.f22177l.get();
                j jVar7 = this.f22156a;
                InterfaceC1070c interfaceC1070c = jVar7.f22185t;
                RoomDataBase roomDataBase2 = (RoomDataBase) jVar7.k.get();
                Context context4 = this.f22156a.f22170b.f3734b;
                vc.i.g(context4);
                return new s(b2, d11, c0670g, f4, h10, e11, a11, tVar, jVar6, cVar2, interfaceC1070c, roomDataBase2, context4);
            case 19:
                C0660y c0660y = this.f22156a.f22173e;
                return 20L;
            case 20:
                return new C1953a((FirebaseAnalytics) this.f22156a.f22159B.get());
            case 21:
                h8.e eVar3 = this.f22156a.f22172d;
                return AbstractC1097a.a();
            case 22:
                j jVar8 = this.f22156a;
                C1332t c1332t4 = jVar8.f22174f;
                ?? obj = new Object();
                Context context5 = jVar8.f22170b.f3734b;
                vc.i.g(context5);
                La.d dVar = new La.d(new Ra.c(obj, new Ra.b(context5)));
                j jVar9 = this.f22156a;
                C1332t c1332t5 = jVar9.f22174f;
                ?? obj2 = new Object();
                Context context6 = jVar9.f22170b.f3734b;
                vc.i.g(context6);
                return new La.g(dVar, obj2, context6, (SharedPreferences) this.f22156a.f22176i.get(), this.f22156a.b());
            case 23:
                Context context7 = this.f22156a.f22170b.f3734b;
                vc.i.g(context7);
                E9.e _audioFocusManager = (E9.e) this.f22156a.f22162E.get();
                P9.c historyManager = (P9.c) this.f22156a.f22164G.get();
                kotlin.jvm.internal.l.e(_audioFocusManager, "_audioFocusManager");
                kotlin.jvm.internal.l.e(historyManager, "historyManager");
                return new E9.c(context7, _audioFocusManager, historyManager);
            case 24:
                Context context8 = this.f22156a.f22170b.f3734b;
                vc.i.g(context8);
                return new E9.e(context8);
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new P9.c((RoomDataBase) this.f22156a.k.get(), (InterfaceC1270c) this.f22156a.f22163F.get());
            case 26:
                C1332t c1332t6 = this.f22156a.f22169a;
                return new Object();
            case 27:
                Context context9 = this.f22156a.f22170b.f3734b;
                vc.i.g(context9);
                return new E9.g(context9, (E9.e) this.f22156a.f22162E.get(), (P9.c) this.f22156a.f22164G.get());
            case 28:
                Context context10 = this.f22156a.f22170b.f3734b;
                vc.i.g(context10);
                return new Kc.d(context10);
            case 29:
                return new Mc.a();
            case 30:
                Context context11 = this.f22156a.f22170b.f3734b;
                vc.i.g(context11);
                C2399e c2399e = new C2399e(2);
                Kc.b bVar2 = Kc.d.f6225e;
                if (Kc.d.f6226f == null) {
                    synchronized (bVar2) {
                        if (Kc.d.f6226f == null) {
                            Kc.d.f6226f = new Kc.d(context11);
                        }
                    }
                }
                return c2399e;
            case 31:
                return new P9.b((RoomDataBase) this.f22156a.k.get());
            default:
                throw new AssertionError(this.f22157b);
        }
    }
}
