package r7;

import A0.C0018g0;
import A9.AbstractC0132r2;
import A9.C0109l2;
import A9.C0152w2;
import A9.H;
import A9.InterfaceC0149w;
import A9.N1;
import Aa.l;
import W1.C0558a;
import W1.U;
import W9.j;
import Y5.C0660y;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c7.InterfaceC0913b;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import ea.C1108c;
import i2.C1332t;
import ia.C1358d;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1390a;
import ma.C1651b;
import n5.D;
import o.Y0;
import r8.o;
import r8.x;
import r8.z;
import s4.C1987o;
import s4.InterfaceC1975c;
import t8.C2034c;
import tss.r.core.ads.ui.leanback.ShopeeProductDetailsActivity;
import v7.g;
import v7.m;
import v7.p;
import v7.r;
import v7.v;
import v8.C2149c;
import v8.C2152f;
import va.C2157a;
import va.C2159c;
import va.C2165i;
import w7.AbstractC2222a;
import wa.h;
import x8.InterfaceC2270a;
import xa.i;
import xa.n;
import xc.q;
import y.S;
import y6.C2399e;
import zc.u;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1947c implements p7.c, Continuation, OnCompleteListener, InterfaceC1386a, InterfaceC1975c, SuccessContinuation, InterfaceC1390a, H, N1, InterfaceC0149w, u, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23804b;

    public /* synthetic */ C1947c(Object obj, int i7) {
        this.f23803a = i7;
        this.f23804b = obj;
    }

    @Override // zc.u
    public void a(q qVar, int i7) {
        boolean z8 = qVar instanceof xc.e;
        StringBuilder sb2 = (StringBuilder) this.f23804b;
        if (z8) {
            sb2.append(((xc.e) qVar).Z());
        } else if (qVar instanceof xc.d) {
            sb2.append(((xc.d) qVar).Z());
        } else if (qVar instanceof xc.c) {
            sb2.append(((xc.c) qVar).Z());
        }
    }

    @Override // A9.InterfaceC0149w
    public void b(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        Object obj3 = this.f23804b;
        AbstractC0132r2 row = (AbstractC0132r2) obj2;
        switch (this.f23803a) {
            case 13:
                va.u uVar = (va.u) obj3;
                if (obj instanceof Jc.a) {
                    int i7 = ShopeeProductDetailsActivity.f24555R;
                    Y6.b.x(uVar.i0(), (Jc.a) obj);
                    return;
                } else {
                    if (obj instanceof ExtensionsChannel) {
                        Intent intent = new Intent(uVar.i0(), (Class<?>) PlaybackActivity.class);
                        intent.putExtra("extra:playback_type", (Parcelable) l.f1526d);
                        intent.putExtra("extra:item_to_play", (Parcelable) obj);
                        intent.putExtra("extra:extensions_id", (M9.d) uVar.f25358T0.getValue());
                        uVar.n0(intent);
                        return;
                    }
                    return;
                }
            case 14:
            case 15:
            default:
                int i10 = i.f26297r2;
                i iVar = (i) obj3;
                if (obj instanceof Jc.a) {
                    int i11 = ShopeeProductDetailsActivity.f24555R;
                    Y6.b.x(iVar.i0(), (Jc.a) obj);
                    return;
                } else {
                    if (obj instanceof C1651b) {
                        ((n) iVar.f26298n2.getValue()).b((C1651b) obj);
                        return;
                    }
                    return;
                }
            case 16:
                kotlin.jvm.internal.l.e(row, "row");
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    int ordinal = jVar.g.ordinal();
                    wa.c cVar = (wa.c) obj3;
                    if (ordinal == 0 || ordinal == 1) {
                        ((ta.c) cVar.f25832R0.getValue()).getLinkStreamById(jVar.f10894a);
                        return;
                    } else {
                        if (ordinal != 2) {
                            throw new Db.d(1);
                        }
                        ((h) cVar.f25831Q0.getValue()).c(jVar);
                        return;
                    }
                }
                return;
            case 17:
                xa.d dVar = (xa.d) obj3;
                if (obj instanceof Jc.a) {
                    int i12 = ShopeeProductDetailsActivity.f24555R;
                    Y6.b.x(dVar.i0(), (Jc.a) obj);
                    return;
                } else {
                    if (obj instanceof C1651b) {
                        dVar.G0().b((C1651b) obj);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // A9.H
    public View c(View view, int i7) {
        if (((C2165i) this.f23804b).B0().g) {
            return view;
        }
        return null;
    }

    @Override // s4.InterfaceC1975c
    public long e(long j) {
        return D.j((j * r0.f24072e) / 1000000, 0L, ((C1987o) this.f23804b).j - 1);
    }

    @Override // j8.InterfaceC1386a
    public void f(InterfaceC1387b interfaceC1387b) {
        switch (this.f23803a) {
            case 5:
                s7.a aVar = (s7.a) this.f23804b;
                aVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                aVar.f24185b.set((s7.a) interfaceC1387b.get());
                return;
            default:
                o oVar = ((u8.j) ((InterfaceC2270a) interfaceC1387b.get())).a().f24889i;
                Set set = (Set) oVar.f23860e;
                s7.b bVar = (s7.b) this.f23804b;
                set.add(bVar);
                Task b2 = ((C2149c) oVar.f23857b).b();
                b2.addOnSuccessListener((Executor) oVar.f23859d, new M9.e(oVar, b2, bVar, 17));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:1|(1:3)(1:180)|4|(1:6)|(1:8)(1:179)|9|(3:175|176|(52:178|25|(1:27)|28|(4:31|(3:33|34|35)(1:37)|36|29)|38|39|40|41|(1:43)(1:168)|44|45|(1:47)|48|49|(1:51)|52|(1:54)|(1:56)(1:166)|57|(2:58|(3:60|(2:62|63)(1:65)|64)(1:66))|67|(2:70|68)|71|72|(1:74)(1:165)|(1:76)(1:164)|77|(5:151|(1:153)|154|3fe|159)(1:81)|82|(22:86|(1:88)(2:147|(1:149))|(3:90|(1:92)|93)(2:143|(2:145|146))|94|95|96|97|98|99|100|101|102|103|(12:105|(2:107|(2:109|(1:111)))|113|114|115|116|(1:118)|119|120|121|(2:123|(1:125))|126)|131|132|(1:134)|135|120|121|(0)|126)|150|(0)(0)|94|95|96|97|98|99|100|101|102|103|(0)|131|132|(0)|135|120|121|(0)|126))(3:13|(3:171|172|(1:174))(4:17|(2:20|18)|21|22)|23)|24|25|(0)|28|(1:29)|38|39|40|41|(0)(0)|44|45|(0)|48|49|(0)|52|(0)|(0)(0)|57|(3:58|(0)(0)|64)|67|(1:68)|71|72|(0)(0)|(0)(0)|77|(1:79)|151|(0)|154|3fe|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(52:178|25|(1:27)|28|(4:31|(3:33|34|35)(1:37)|36|29)|38|39|40|41|(1:43)(1:168)|44|45|(1:47)|48|49|(1:51)|52|(1:54)|(1:56)(1:166)|57|(2:58|(3:60|(2:62|63)(1:65)|64)(1:66))|67|(2:70|68)|71|72|(1:74)(1:165)|(1:76)(1:164)|77|(5:151|(1:153)|154|3fe|159)(1:81)|82|(22:86|(1:88)(2:147|(1:149))|(3:90|(1:92)|93)(2:143|(2:145|146))|94|95|96|97|98|99|100|101|102|103|(12:105|(2:107|(2:109|(1:111)))|113|114|115|116|(1:118)|119|120|121|(2:123|(1:125))|126)|131|132|(1:134)|135|120|121|(0)|126)|150|(0)(0)|94|95|96|97|98|99|100|101|102|103|(0)|131|132|(0)|135|120|121|(0)|126) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x05be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x05bf, code lost:
    
        r2 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x05da, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x05db, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0645, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0646, code lost:
    
        r2 = "FirebaseCrashlytics";
        android.util.Log.e(r2, "Error retrieving app package info.", r0);
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0586 A[Catch: Exception -> 0x05be, TryCatch #1 {Exception -> 0x05be, blocks: (B:99:0x04fb, B:102:0x0556, B:103:0x055b, B:105:0x0586, B:107:0x0590, B:109:0x059e), top: B:98:0x04fb }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024f A[Catch: NameNotFoundException -> 0x0645, TryCatch #4 {NameNotFoundException -> 0x0645, blocks: (B:41:0x022d, B:43:0x0244, B:45:0x0256, B:48:0x025c, B:168:0x024f), top: B:40:0x022d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0244 A[Catch: NameNotFoundException -> 0x0645, TryCatch #4 {NameNotFoundException -> 0x0645, blocks: (B:41:0x022d, B:43:0x0244, B:45:0x0256, B:48:0x025c, B:168:0x024f), top: B:40:0x022d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x032a A[EDGE_INSN: B:66:0x032a->B:67:0x032a BREAK  A[LOOP:2: B:58:0x0307->B:64:0x0323], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033c A[LOOP:3: B:68:0x0336->B:70:0x033c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0456  */
    /* JADX WARN: Type inference failed for: r0v33, types: [D7.d, java.lang.Object] */
    @Override // p7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(T6.a aVar) {
        ExecutorService executorService;
        w7.d dVar;
        p pVar;
        int i7;
        Throwable th;
        Iterator it;
        String str;
        long currentTimeMillis;
        String num;
        String str2;
        int d10;
        String str3;
        String str4;
        String str5;
        String[] strArr;
        int i10;
        w7.d dVar2;
        Iterator it2;
        ?? obj;
        boolean equals;
        D7.b a9;
        G g;
        Task task;
        int i11;
        Task onSuccessTask;
        boolean z8;
        C0018g0 c0018g0;
        String str6;
        boolean exists;
        Resources resources;
        D7.b a10;
        long longVersionCode;
        int i12 = CrashlyticsRegistrar.f15856d;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f23804b;
        crashlyticsRegistrar.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        Y6.i iVar = (Y6.i) aVar.a(Y6.i.class);
        k8.e eVar = (k8.e) aVar.a(k8.e.class);
        p7.n f4 = aVar.f(s7.a.class);
        p7.n f10 = aVar.f(InterfaceC0913b.class);
        p7.n f11 = aVar.f(InterfaceC2270a.class);
        ExecutorService executorService2 = (ExecutorService) aVar.g(crashlyticsRegistrar.f15857a);
        ExecutorService executorService3 = (ExecutorService) aVar.g(crashlyticsRegistrar.f15858b);
        ExecutorService executorService4 = (ExecutorService) aVar.g(crashlyticsRegistrar.f15859c);
        iVar.b();
        Context context = iVar.f12041a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 19.4.4 for " + packageName, null);
        w7.d dVar3 = new w7.d(executorService2, executorService3);
        B7.d dVar4 = new B7.d(context);
        G g2 = new G(iVar);
        v vVar = new v(context, packageName, eVar, g2);
        s7.a aVar2 = new s7.a(f4);
        C1946b c1946b = new C1946b(f10);
        v7.i iVar2 = new v7.i(g2, dVar4);
        B8.c cVar = B8.c.f2227a;
        B8.d dVar5 = B8.d.f2229a;
        B8.c cVar2 = B8.c.f2227a;
        B8.a a11 = B8.c.a(dVar5);
        if (a11.f2217b != null) {
            Log.d("SessionsDependencies", "Subscriber " + dVar5 + " already registered.");
        } else {
            a11.f2217b = iVar2;
            Log.d("SessionsDependencies", "Subscriber " + dVar5 + " registered.");
            a11.f2216a.l(null);
        }
        p pVar2 = new p(iVar, vVar, aVar2, g2, new C1945a(c1946b), new C1945a(c1946b), dVar4, iVar2, new C1358d(f11, 17), dVar3);
        w7.d dVar6 = pVar2.f25161o;
        iVar.b();
        String str7 = iVar.f12043c.f12055b;
        int d11 = g.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (d11 == 0) {
            d11 = g.d(context, "com.crashlytics.android.build_id", "string");
        }
        String string = d11 != 0 ? context.getResources().getString(d11) : null;
        ArrayList arrayList = new ArrayList();
        int d12 = g.d(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int d13 = g.d(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int d14 = g.d(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (d12 == 0 || d13 == 0 || d14 == 0) {
            executorService = executorService4;
            dVar = dVar6;
            pVar = pVar2;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(d12), Integer.valueOf(d13), Integer.valueOf(d14));
            i7 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                th = null;
                Log.d("FirebaseCrashlytics", format, null);
                String t5 = X.c.t("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i7)) {
                    Log.d("FirebaseCrashlytics", t5, th);
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    v7.d dVar7 = (v7.d) it.next();
                    StringBuilder n6 = X.c.n("Build id for ", dVar7.f25102a, " on ");
                    n6.append(dVar7.f25103b);
                    n6.append(": ");
                    n6.append(dVar7.f25104c);
                    String sb2 = n6.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                }
                ha.g gVar = new ha.g(context);
                String packageName2 = context.getPackageName();
                String d15 = vVar.d();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                if (Build.VERSION.SDK_INT < 28) {
                    longVersionCode = packageInfo.getLongVersionCode();
                    num = Long.toString(longVersionCode);
                } else {
                    num = Integer.toString(packageInfo.versionCode);
                }
                String str8 = num;
                str2 = packageInfo.versionName;
                if (str2 == null) {
                    str2 = "0.0";
                }
                String str9 = str2;
                C0018g0 c0018g02 = new C0018g0(str7, string, arrayList, d15, packageName2, str8, str9, gVar);
                String t10 = X.c.t("Installer package name is: ", d15);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", t10, null);
                }
                C1332t c1332t = new C1332t(1);
                String d16 = vVar.d();
                C0660y c0660y = new C0660y(19);
                C2034c c2034c = new C2034c(c0660y, 7);
                D5.i iVar3 = new D5.i(dVar4);
                Locale locale = Locale.US;
                D7.a aVar3 = new D7.a(S.b("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str7, "/settings"), c1332t);
                String str10 = Build.MANUFACTURER;
                String str11 = v.f25178h;
                String i13 = X.c.i(str10.replaceAll(str11, ""), "/", Build.MODEL.replaceAll(str11, ""));
                String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str11, "");
                String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str11, "");
                d10 = g.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (d10 == 0) {
                    d10 = g.d(context, "com.crashlytics.android.build_id", "string");
                }
                if (d10 == 0) {
                    str5 = context.getResources().getString(d10);
                    str3 = str9;
                    str4 = str8;
                } else {
                    str3 = str9;
                    str4 = str8;
                    str5 = null;
                }
                strArr = new String[]{str5, str7, str3, str4};
                ArrayList arrayList2 = new ArrayList();
                i10 = 0;
                while (true) {
                    dVar2 = dVar3;
                    if (i10 < 4) {
                        break;
                    }
                    String str12 = strArr[i10];
                    String[] strArr2 = strArr;
                    if (str12 != null) {
                        arrayList2.add(str12.replace("-", "").toLowerCase(Locale.US));
                    }
                    i10++;
                    strArr = strArr2;
                    dVar3 = dVar2;
                }
                Collections.sort(arrayList2);
                StringBuilder sb3 = new StringBuilder();
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb3.append((String) it2.next());
                }
                String sb4 = sb3.toString();
                D7.f fVar = new D7.f(str7, i13, replaceAll, replaceAll2, vVar, sb4.length() <= 0 ? g.h(sb4) : null, str3, str4, h3.o.c(d16 == null ? 4 : 1));
                obj = new Object();
                AtomicReference atomicReference = new AtomicReference();
                obj.f3275h = atomicReference;
                obj.f3276i = new AtomicReference(new TaskCompletionSource());
                obj.f3269a = context;
                obj.f3270b = fVar;
                obj.f3272d = c0660y;
                obj.f3271c = c2034c;
                obj.f3273e = iVar3;
                obj.f3274f = aVar3;
                obj.g = g2;
                atomicReference.set(U9.j.m(c0660y));
                equals = ((Context) obj.f3269a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((D7.f) obj.f3270b).f3282f);
                AtomicReference atomicReference2 = (AtomicReference) obj.f3276i;
                AtomicReference atomicReference3 = (AtomicReference) obj.f3275h;
                if (equals || (a10 = obj.a(1)) == null) {
                    a9 = obj.a(3);
                    if (a9 != null) {
                        atomicReference3.set(a9);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a9);
                    }
                    g = (G) obj.g;
                    Task task2 = ((TaskCompletionSource) g.f14935f).getTask();
                    synchronized (g.f14932c) {
                        task = ((TaskCompletionSource) g.f14933d).getTask();
                    }
                    i11 = 0;
                    onSuccessTask = AbstractC2222a.a(task2, task).onSuccessTask(dVar2.f25819a, new q3.e(5, obj, dVar2, 0 == true ? 1 : 0));
                } else {
                    atomicReference3.set(a10);
                    ((TaskCompletionSource) atomicReference2.get()).trySetResult(a10);
                    onSuccessTask = Tasks.forResult(null);
                    i11 = 0;
                }
                onSuccessTask.addOnFailureListener(executorService, new C1948d(i11));
                p pVar3 = pVar;
                B7.d dVar8 = pVar3.f25157i;
                Context context2 = pVar3.f25150a;
                if (context2 != null && (resources = context2.getResources()) != null) {
                    int d17 = g.d(context2, "com.crashlytics.RequireBuildId", "bool");
                    if (d17 > 0) {
                        z8 = resources.getBoolean(d17);
                    } else {
                        int d18 = g.d(context2, "com.crashlytics.RequireBuildId", "string");
                        if (d18 > 0) {
                            z8 = Boolean.parseBoolean(context2.getString(d18));
                        }
                    }
                    if (z8) {
                        str6 = "FirebaseCrashlytics";
                        if (Log.isLoggable(str6, 2)) {
                            Log.v(str6, "Configured not to require a build ID.", null);
                        }
                        c0018g0 = c0018g02;
                    } else {
                        c0018g0 = c0018g02;
                        str6 = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty((String) c0018g0.f226c)) {
                            Log.e(str6, ".");
                            Log.e(str6, ".     |  | ");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".   \\ |  | /");
                            Log.e(str6, ".    \\    /");
                            Log.e(str6, ".     \\  /");
                            Log.e(str6, ".      \\/");
                            Log.e(str6, ".");
                            Log.e(str6, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str6, ".");
                            Log.e(str6, ".      /\\");
                            Log.e(str6, ".     /  \\");
                            Log.e(str6, ".    /    \\");
                            Log.e(str6, ".   / |  | \\");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    }
                    String str13 = new v7.e().f25107a;
                    int i14 = 16;
                    pVar3.f25155f = new C1108c(i14, "crash_marker", dVar8);
                    pVar3.f25154e = new C1108c(i14, "initialization_marker", dVar8);
                    w7.d dVar9 = dVar;
                    B7.d dVar10 = new B7.d(str13, dVar8, dVar9);
                    x7.f fVar2 = new x7.f(dVar8);
                    q3.c cVar3 = new q3.c(new E7.a[]{new C2399e(4)});
                    C1358d c1358d = pVar3.f25160n;
                    c1358d.getClass();
                    ((p7.n) c1358d.f18487b).a(new C1947c(new s7.b(dVar10), 6));
                    String str14 = str6;
                    pVar3.g = new v7.l(pVar3.f25150a, pVar3.f25156h, pVar3.f25151b, pVar3.f25157i, pVar3.f25155f, c0018g0, dVar10, fVar2, Y0.d(pVar3.f25150a, pVar3.f25156h, pVar3.f25157i, c0018g0, fVar2, dVar10, cVar3, obj, pVar3.f25152c, pVar3.f25158l, pVar3.f25161o), pVar3.f25159m, pVar3.k, pVar3.f25158l, pVar3.f25161o);
                    C1108c c1108c = pVar3.f25154e;
                    String str15 = (String) c1108c.f16831c;
                    B7.d dVar11 = (B7.d) c1108c.f16830b;
                    dVar11.getClass();
                    exists = new File((File) dVar11.f2212c, str15).exists();
                    Boolean.TRUE.equals((Boolean) dVar9.f25819a.f25815a.submit(new D7.c(pVar3, 4)).get(3L, TimeUnit.SECONDS));
                    v7.l lVar = pVar3.g;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    lVar.f25132e.f25819a.a(new p5.j(11, lVar, str13));
                    r rVar = new r(new o7.o(lVar, 9), obj, defaultUncaughtExceptionHandler, lVar.j);
                    lVar.f25138n = rVar;
                    Thread.setDefaultUncaughtExceptionHandler(rVar);
                    if (exists) {
                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                            if (activeNetworkInfo != null) {
                                if (activeNetworkInfo.isConnectedOrConnecting()) {
                                }
                            }
                        }
                        str = str14;
                        try {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            pVar3.b(obj);
                        } catch (Exception e2) {
                            e = e2;
                            Log.e(str, "Crashlytics was not started due to an exception during initialization", e);
                            pVar3.g = null;
                            C1949e c1949e = new C1949e(pVar3);
                            currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                            if (currentTimeMillis > 16) {
                            }
                            return c1949e;
                        }
                        C1949e c1949e2 = new C1949e(pVar3);
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                        if (currentTimeMillis > 16) {
                            String str16 = "Initializing Crashlytics blocked main for " + currentTimeMillis + " ms";
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, str16, null);
                            }
                        }
                        return c1949e2;
                    }
                    str = str14;
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Successfully configured exception handler.", null);
                    }
                    dVar9.f25819a.a(new m(pVar3, obj, 0));
                    C1949e c1949e22 = new C1949e(pVar3);
                    currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                    if (currentTimeMillis > 16) {
                    }
                    return c1949e22;
                }
                z8 = true;
                if (z8) {
                }
                String str132 = new v7.e().f25107a;
                int i142 = 16;
                pVar3.f25155f = new C1108c(i142, "crash_marker", dVar8);
                pVar3.f25154e = new C1108c(i142, "initialization_marker", dVar8);
                w7.d dVar92 = dVar;
                B7.d dVar102 = new B7.d(str132, dVar8, dVar92);
                x7.f fVar22 = new x7.f(dVar8);
                q3.c cVar32 = new q3.c(new E7.a[]{new C2399e(4)});
                C1358d c1358d2 = pVar3.f25160n;
                c1358d2.getClass();
                ((p7.n) c1358d2.f18487b).a(new C1947c(new s7.b(dVar102), 6));
                String str142 = str6;
                pVar3.g = new v7.l(pVar3.f25150a, pVar3.f25156h, pVar3.f25151b, pVar3.f25157i, pVar3.f25155f, c0018g0, dVar102, fVar22, Y0.d(pVar3.f25150a, pVar3.f25156h, pVar3.f25157i, c0018g0, fVar22, dVar102, cVar32, obj, pVar3.f25152c, pVar3.f25158l, pVar3.f25161o), pVar3.f25159m, pVar3.k, pVar3.f25158l, pVar3.f25161o);
                C1108c c1108c2 = pVar3.f25154e;
                String str152 = (String) c1108c2.f16831c;
                B7.d dVar112 = (B7.d) c1108c2.f16830b;
                dVar112.getClass();
                exists = new File((File) dVar112.f2212c, str152).exists();
                Boolean.TRUE.equals((Boolean) dVar92.f25819a.f25815a.submit(new D7.c(pVar3, 4)).get(3L, TimeUnit.SECONDS));
                v7.l lVar2 = pVar3.g;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                lVar2.f25132e.f25819a.a(new p5.j(11, lVar2, str132));
                r rVar2 = new r(new o7.o(lVar2, 9), obj, defaultUncaughtExceptionHandler2, lVar2.j);
                lVar2.f25138n = rVar2;
                Thread.setDefaultUncaughtExceptionHandler(rVar2);
                if (exists) {
                }
                str = str142;
                if (Log.isLoggable(str, 3)) {
                }
                dVar92.f25819a.a(new m(pVar3, obj, 0));
                C1949e c1949e222 = new C1949e(pVar3);
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                if (currentTimeMillis > 16) {
                }
                return c1949e222;
            }
        } else {
            String[] stringArray = context.getResources().getStringArray(d12);
            String[] stringArray2 = context.getResources().getStringArray(d13);
            String[] stringArray3 = context.getResources().getStringArray(d14);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i15 = 0;
                while (i15 < stringArray3.length) {
                    arrayList.add(new v7.d(stringArray[i15], stringArray2[i15], stringArray3[i15]));
                    i15++;
                    dVar6 = dVar6;
                    pVar2 = pVar2;
                    executorService4 = executorService4;
                }
                executorService = executorService4;
                dVar = dVar6;
                pVar = pVar2;
            } else {
                executorService = executorService4;
                dVar = dVar6;
                pVar = pVar2;
                String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", format2, null);
                }
            }
            i7 = 3;
        }
        th = null;
        String t52 = X.c.t("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i7)) {
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        ha.g gVar2 = new ha.g(context);
        String packageName22 = context.getPackageName();
        String d152 = vVar.d();
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(packageName22, 0);
        if (Build.VERSION.SDK_INT < 28) {
        }
        String str82 = num;
        str2 = packageInfo2.versionName;
        if (str2 == null) {
        }
        String str92 = str2;
        C0018g0 c0018g022 = new C0018g0(str7, string, arrayList, d152, packageName22, str82, str92, gVar2);
        String t102 = X.c.t("Installer package name is: ", d152);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        C1332t c1332t2 = new C1332t(1);
        String d162 = vVar.d();
        C0660y c0660y2 = new C0660y(19);
        C2034c c2034c2 = new C2034c(c0660y2, 7);
        D5.i iVar32 = new D5.i(dVar4);
        Locale locale2 = Locale.US;
        D7.a aVar32 = new D7.a(S.b("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str7, "/settings"), c1332t2);
        String str102 = Build.MANUFACTURER;
        String str112 = v.f25178h;
        String i132 = X.c.i(str102.replaceAll(str112, ""), "/", Build.MODEL.replaceAll(str112, ""));
        String replaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str112, "");
        String replaceAll22 = Build.VERSION.RELEASE.replaceAll(str112, "");
        d10 = g.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (d10 == 0) {
        }
        if (d10 == 0) {
        }
        strArr = new String[]{str5, str7, str3, str4};
        ArrayList arrayList22 = new ArrayList();
        i10 = 0;
        while (true) {
            dVar2 = dVar3;
            if (i10 < 4) {
            }
            i10++;
            strArr = strArr2;
            dVar3 = dVar2;
        }
        Collections.sort(arrayList22);
        StringBuilder sb32 = new StringBuilder();
        it2 = arrayList22.iterator();
        while (it2.hasNext()) {
        }
        String sb42 = sb32.toString();
        D7.f fVar3 = new D7.f(str7, i132, replaceAll3, replaceAll22, vVar, sb42.length() <= 0 ? g.h(sb42) : null, str3, str4, h3.o.c(d162 == null ? 4 : 1));
        obj = new Object();
        AtomicReference atomicReference4 = new AtomicReference();
        obj.f3275h = atomicReference4;
        obj.f3276i = new AtomicReference(new TaskCompletionSource());
        obj.f3269a = context;
        obj.f3270b = fVar3;
        obj.f3272d = c0660y2;
        obj.f3271c = c2034c2;
        obj.f3273e = iVar32;
        obj.f3274f = aVar32;
        obj.g = g2;
        atomicReference4.set(U9.j.m(c0660y2));
        equals = ((Context) obj.f3269a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((D7.f) obj.f3270b).f3282f);
        AtomicReference atomicReference22 = (AtomicReference) obj.f3276i;
        AtomicReference atomicReference32 = (AtomicReference) obj.f3275h;
        if (equals) {
        }
        a9 = obj.a(3);
        if (a9 != null) {
        }
        g = (G) obj.g;
        Task task22 = ((TaskCompletionSource) g.f14935f).getTask();
        synchronized (g.f14932c) {
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f23803a) {
            case 2:
                x.b((Intent) this.f23804b);
                return;
            case 3:
                ((z) this.f23804b).f23904b.trySetResult(null);
                return;
            case 4:
                ((ScheduledFuture) this.f23804b).cancel(false);
                return;
            default:
                kotlin.jvm.internal.l.e(task, "task");
                boolean isSuccessful = task.isSuccessful();
                App t5 = (App) this.f23804b;
                if (!isSuccessful) {
                    kotlin.jvm.internal.l.e(t5, "t");
                    if (task.getException() != null) {
                        return;
                    }
                    new Throwable("Fetching FCM registration token failed");
                    return;
                }
                String message = "FCM token: " + ((String) task.getResult());
                kotlin.jvm.internal.l.e(t5, "t");
                kotlin.jvm.internal.l.e(message, "message");
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f23803a) {
            case 20:
                ((Ba.o) this.f23804b).invoke(obj);
                return;
            case 21:
            default:
                ((Ba.o) this.f23804b).invoke(obj);
                return;
            case 22:
                ((Ba.o) this.f23804b).invoke(obj);
                return;
        }
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        C2159c c2159c = (C2159c) this.f23804b;
        c2159c.C0.a();
        ActivityUtilsKt.showSuccessDialog$default((Activity) c2159c.g0(), (Rb.a) new C2157a(c2159c, 0), "Xoá nguồn kênh thành công", (Integer) null, false, 12, (Object) null);
        ((h) c2159c.f25313I0.getValue()).e();
        U j = c2159c.g0().j();
        j.getClass();
        C0558a c0558a = new C0558a(j);
        c0558a.i(c2159c);
        c0558a.e(false);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((C2152f) this.f23804b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z8;
        switch (this.f23803a) {
            case 1:
                ((T6.a) this.f23804b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((Y0) this.f23804b).getClass();
                if (task.isSuccessful()) {
                    v7.a aVar = (v7.a) task.getResult();
                    s7.c cVar = s7.c.f24187a;
                    cVar.c("Crashlytics report successfully enqueued to DataTransport: " + aVar.f25097b);
                    File file = aVar.f25098c;
                    if (file.delete()) {
                        cVar.c("Deleted report file: " + file.getPath());
                    } else {
                        cVar.g("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z8 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case 9:
                ((CountDownLatch) this.f23804b).countDown();
                return null;
            case 14:
                return (Task) ((v7.j) this.f23804b).call();
            default:
                ((Runnable) this.f23804b).run();
                return Tasks.forResult(null);
        }
    }
}
