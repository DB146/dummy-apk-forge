package c2;

import A0.T;
import C.F;
import C.H;
import C.InterfaceC0220e;
import C.InterfaceC0222g;
import E.A;
import E.C0247b;
import E.D;
import I2.AbstractC0315d;
import I2.B;
import I2.C0336z;
import I2.K;
import Q.C0480b;
import Q.C0498k;
import Q.C0501l0;
import Q.C0505n0;
import Q.C0506o;
import W1.C;
import Y5.J0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.datastore.preferences.protobuf.C0804g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1111f;
import h3.C1235A;
import h3.C1240b;
import h3.C1247i;
import h3.ThreadFactoryC1241c;
import i2.AbstractC1300H;
import i2.AbstractC1309Q;
import i2.C1324l;
import i2.C1335w;
import i3.C1343b;
import ia.C1358d;
import j3.C1374c;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipException;
import l2.InterfaceC1470n;
import l2.d0;
import l2.e0;
import l3.C1484c;
import m2.AbstractC1546a;
import m4.q0;
import m5.C1599C;
import o2.C1779a;
import o3.C1781a;
import p2.AbstractC1846a;
import p7.C1857a;
import ra.C1953a;
import s0.AbstractC1969a;
import v2.C2133e;
import w2.C2204a;
import y.C2305m;
import y.W;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;
import y7.u0;
import z.AbstractC2556g0;
import z.C2565l;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static Thread f14203c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f14205b;

    public /* synthetic */ q(int i7, C c10) {
        this.f14204a = i7;
        this.f14205b = c10;
    }

    public static void A(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.t()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(G.l(status));
        }
    }

    public static final long a(int i7) {
        long j = (i7 << 32) | (0 & 4294967295L);
        int i10 = AbstractC1969a.f24019n;
        return j;
    }

    public static final void b(c0.m mVar, A a9, F f4, InterfaceC0222g interfaceC0222g, c0.c cVar, C2565l c2565l, boolean z8, C2305m c2305m, Rb.c cVar2, C0506o c0506o, int i7) {
        A a10;
        F f10;
        c0.c cVar3;
        C2565l c2565l2;
        boolean z10;
        C2305m c2305m2;
        int i10;
        A a11;
        boolean z11;
        c0.c cVar4;
        F f11;
        C2565l d10;
        C2305m a12;
        c0506o.U(53695811);
        int i11 = i7 | (c0506o.g(mVar) ? 4 : 2) | 46861712 | (c0506o.i(cVar2) ? 536870912 : 268435456);
        if (c0506o.K(i11 & 1, (306783379 & i11) != 306783378)) {
            c0506o.P();
            if ((i7 & 1) == 0 || c0506o.w()) {
                A a13 = D.a(c0506o);
                float f12 = 0;
                F f13 = new F(f12, f12, f12, f12);
                i10 = i11 & (-238551153);
                a11 = a13;
                z11 = true;
                cVar4 = c0.b.f14100z;
                f11 = f13;
                d10 = AbstractC2556g0.d(c0506o);
                a12 = W.a(c0506o);
            } else {
                c0506o.N();
                i10 = i11 & (-238551153);
                a11 = a9;
                f11 = f4;
                cVar4 = cVar;
                d10 = c2565l;
                z11 = z8;
                a12 = c2305m;
            }
            c0506o.q();
            i.b(mVar, a11, f11, true, d10, z11, a12, cVar4, interfaceC0222g, null, null, cVar2, c0506o, (i10 & 14) | 806907264, 6 | ((i10 >> 18) & 7168), 6400);
            a10 = a11;
            f10 = f11;
            cVar3 = cVar4;
            c2565l2 = d10;
            z10 = z11;
            c2305m2 = a12;
        } else {
            c0506o.N();
            a10 = a9;
            f10 = f4;
            cVar3 = cVar;
            c2565l2 = c2565l;
            z10 = z8;
            c2305m2 = c2305m;
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0247b(mVar, a10, f10, interfaceC0222g, cVar3, c2565l2, z10, c2305m2, cVar2, i7, 0);
        }
    }

    public static final void c(c0.m mVar, A a9, F f4, InterfaceC0220e interfaceC0220e, c0.d dVar, C2565l c2565l, boolean z8, C2305m c2305m, Rb.c cVar, C0506o c0506o, int i7) {
        A a10;
        F f10;
        c0.d dVar2;
        C2565l c2565l2;
        boolean z10;
        C2305m c2305m2;
        int i10;
        A a11;
        boolean z11;
        c0.d dVar3;
        F f11;
        C2565l d10;
        C2305m a12;
        c0506o.U(-1884325601);
        int i11 = i7 | 46861712 | (c0506o.i(cVar) ? 536870912 : 268435456);
        if (c0506o.K(i11 & 1, (306783379 & i11) != 306783378)) {
            c0506o.P();
            if ((i7 & 1) == 0 || c0506o.w()) {
                A a13 = D.a(c0506o);
                float f12 = 0;
                F f13 = new F(f12, f12, f12, f12);
                i10 = i11 & (-238551153);
                a11 = a13;
                z11 = true;
                dVar3 = c0.b.f14098x;
                f11 = f13;
                d10 = AbstractC2556g0.d(c0506o);
                a12 = W.a(c0506o);
            } else {
                c0506o.N();
                i10 = i11 & (-238551153);
                a11 = a9;
                f11 = f4;
                dVar3 = dVar;
                d10 = c2565l;
                z11 = z8;
                a12 = c2305m;
            }
            c0506o.q();
            i.b(mVar, a11, f11, false, d10, z11, a12, null, null, dVar3, interfaceC0220e, cVar, c0506o, 1600902, 432 | ((i10 >> 18) & 7168), 1792);
            a10 = a11;
            f10 = f11;
            dVar2 = dVar3;
            c2565l2 = d10;
            z10 = z11;
            c2305m2 = a12;
        } else {
            c0506o.N();
            a10 = a9;
            f10 = f4;
            dVar2 = dVar;
            c2565l2 = c2565l;
            z10 = z8;
            c2305m2 = c2305m;
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0247b(mVar, a10, f10, interfaceC0220e, dVar2, c2565l2, z10, c2305m2, cVar, i7, 1);
        }
    }

    public static final void d(C2133e c2133e, Z.g gVar, Y.e eVar, C0506o c0506o, int i7) {
        c0506o.U(233973821);
        if ((((c0506o.i(c2133e) ? 4 : 2) | i7 | (c0506o.i(gVar) ? 32 : 16)) & 147) == 146 && c0506o.x()) {
            c0506o.N();
        } else {
            C0480b.b(new C0501l0[]{AbstractC1846a.f23034a.a(c2133e), AbstractC1546a.f19776a.a(c2133e), R2.a.f8834a.a(c2133e)}, Y.f.d(1808964477, new w2.n(1, gVar, eVar), c0506o), c0506o, 56);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new w2.s(c2133e, gVar, eVar, i7);
        }
    }

    public static final void e(Z.g gVar, Y.e eVar, C0506o c0506o, int i7) {
        c0506o.U(832919318);
        int i10 = (c0506o.i(gVar) ? 4 : 2) | i7 | (c0506o.i(eVar) ? 32 : 16);
        if ((i10 & 19) == 18 && c0506o.x()) {
            c0506o.N();
        } else {
            Object H10 = c0506o.H();
            if (H10 == C0498k.f8409a) {
                H10 = new Ba.i(18);
                c0506o.d0(H10);
            }
            Rb.c cVar = (Rb.c) H10;
            e0 a9 = AbstractC1846a.a(c0506o);
            if (a9 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            kotlin.jvm.internal.e a10 = kotlin.jvm.internal.w.a(C2204a.class);
            C1247i c1247i = new C1247i(1);
            c1247i.a(kotlin.jvm.internal.w.a(C2204a.class), cVar);
            Za.d b2 = c1247i.b();
            o2.c extras = a9 instanceof InterfaceC1470n ? ((InterfaceC1470n) a9).o() : C1779a.f21662b;
            d0 store = a9.s();
            kotlin.jvm.internal.l.e(store, "store");
            kotlin.jvm.internal.l.e(extras, "extras");
            q3.n nVar = new q3.n(store, b2, extras);
            String b10 = a10.b();
            if (b10 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C2204a c2204a = (C2204a) nVar.l(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10));
            c2204a.f25675c = new C1358d(gVar);
            gVar.d(c2204a.f25674b, eVar, c0506o, ((i10 << 6) & 896) | (i10 & 112));
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new w2.l(gVar, eVar, i7, 1);
        }
    }

    public static final ExecutorService f(boolean z8) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1241c(z8));
        kotlin.jvm.internal.l.d(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [q3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [A9.O0, java.lang.Object] */
    public static final i3.p g(Context context, C1240b c1240b) {
        B d10;
        kotlin.jvm.internal.l.e(context, "context");
        ExecutorService executorService = c1240b.f17670c;
        ?? obj = new Object();
        obj.f23384c = new Handler(Looper.getMainLooper());
        obj.f23385d = new J0(obj, 3);
        K k = new K(executorService);
        obj.f23382a = k;
        obj.f23383b = cc.F.o(k);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext, "context.applicationContext");
        K k7 = (K) obj.f23382a;
        kotlin.jvm.internal.l.d(k7, "workTaskExecutor.serialTaskExecutor");
        boolean z8 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        C1235A clock = c1240b.f17671d;
        kotlin.jvm.internal.l.e(clock, "clock");
        if (z8) {
            d10 = new B(applicationContext, WorkDatabase.class, null);
            d10.f5014i = true;
        } else {
            d10 = AbstractC0315d.d(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            d10.f5013h = new Q9.a(applicationContext, 17);
        }
        d10.f5012f = k7;
        d10.f5010d.add(new C0336z(clock));
        d10.a(C1343b.f18332h);
        d10.a(new i3.e(applicationContext, 2, 3));
        d10.a(C1343b.f18333i);
        d10.a(C1343b.j);
        d10.a(new i3.e(applicationContext, 5, 6));
        d10.a(C1343b.k);
        d10.a(C1343b.f18334l);
        d10.a(C1343b.f18335m);
        d10.a(new i3.e(applicationContext));
        d10.a(new i3.e(applicationContext, 10, 11));
        d10.a(C1343b.f18329d);
        d10.a(C1343b.f18330e);
        d10.a(C1343b.f18331f);
        d10.a(C1343b.g);
        d10.a(new i3.e(applicationContext, 21, 22));
        d10.f5019p = false;
        d10.f5020q = true;
        WorkDatabase workDatabase = (WorkDatabase) d10.b();
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext2, "context.applicationContext");
        Context applicationContext3 = applicationContext2.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext3, "context.applicationContext");
        C1781a c1781a = new C1781a(applicationContext3, obj, 0);
        Context applicationContext4 = applicationContext2.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext4, "context.applicationContext");
        C1781a c1781a2 = new C1781a(applicationContext4, obj, 1);
        Context applicationContext5 = applicationContext2.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext5, "context.applicationContext");
        String str = o3.h.f21677a;
        o3.g gVar = new o3.g(applicationContext5, obj);
        Context applicationContext6 = applicationContext2.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext6, "context.applicationContext");
        C1781a c1781a3 = new C1781a(applicationContext6, obj, 2);
        ?? obj2 = new Object();
        obj2.f922a = applicationContext2;
        obj2.f923b = c1781a;
        obj2.f924c = c1781a2;
        obj2.f925d = gVar;
        obj2.f926e = c1781a3;
        i3.d dVar = new i3.d(context.getApplicationContext(), c1240b, obj, workDatabase);
        int i7 = i3.q.f18385a;
        String str2 = i3.h.f18356a;
        C1484c c1484c = new C1484c(context, workDatabase, c1240b);
        r3.g.a(context, SystemJobService.class, true);
        h3.z.e().a(i3.h.f18356a, "Created SystemJobScheduler and enabled SystemJobService");
        return new i3.p(context.getApplicationContext(), c1240b, obj, workDatabase, u0.y(c1484c, new C1374c(context, c1240b, obj2, dVar, new C1111f(dVar, (q3.i) obj), obj)), dVar, obj2);
    }

    public static void h(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i7 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (p7.f fVar : (Set) it2.next()) {
                        for (p7.h hVar : fVar.f23132a.f23120c) {
                            if (hVar.f23139c == 0) {
                                Set<p7.f> set = (Set) hashMap.get(new p7.g(hVar.f23137a, hVar.f23138b == 2));
                                if (set != null) {
                                    for (p7.f fVar2 : set) {
                                        fVar.f23133b.add(fVar2);
                                        fVar2.f23134c.add(fVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    p7.f fVar3 = (p7.f) it4.next();
                    if (fVar3.f23134c.isEmpty()) {
                        hashSet2.add(fVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    p7.f fVar4 = (p7.f) hashSet2.iterator().next();
                    hashSet2.remove(fVar4);
                    i7++;
                    Iterator it5 = fVar4.f23133b.iterator();
                    while (it5.hasNext()) {
                        p7.f fVar5 = (p7.f) it5.next();
                        fVar5.f23134c.remove(fVar4);
                        if (fVar5.f23134c.isEmpty()) {
                            hashSet2.add(fVar5);
                        }
                    }
                }
                if (i7 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    p7.f fVar6 = (p7.f) it6.next();
                    if (!fVar6.f23134c.isEmpty() && !fVar6.f23133b.isEmpty()) {
                        arrayList2.add(fVar6.f23132a);
                    }
                }
                throw new Db.d("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 12);
            }
            C1857a c1857a = (C1857a) it.next();
            p7.f fVar7 = new p7.f(c1857a);
            for (p7.p pVar : c1857a.f23119b) {
                boolean z8 = c1857a.f23122e == 0;
                p7.g gVar = new p7.g(pVar, !z8);
                if (!hashMap.containsKey(gVar)) {
                    hashMap.put(gVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(gVar);
                if (!set2.isEmpty() && z8) {
                    throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                }
                set2.add(fVar7);
            }
        }
    }

    public static final boolean i(int i7, int i10) {
        return i7 == i10;
    }

    public static String j(C0804g c0804g) {
        StringBuilder sb2 = new StringBuilder(c0804g.size());
        for (int i7 = 0; i7 < c0804g.size(); i7++) {
            byte b2 = c0804g.b(i7);
            if (b2 == 34) {
                sb2.append("\\\"");
            } else if (b2 == 39) {
                sb2.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b2 >>> 6) & 3) + 48));
                            sb2.append((char) (((b2 >>> 3) & 7) + 48));
                            sb2.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b2);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [h7.g, java.lang.Object] */
    public static h7.g k(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j10 = length - 65558;
        long j11 = j10 >= 0 ? j10 : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                ?? obj = new Object();
                obj.f17853b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                obj.f17852a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return obj;
            }
            j--;
        } while (j >= j11);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static final int l(int i7, int i10, int i11) {
        if (i11 > 0) {
            if (i7 >= i10) {
                return i10;
            }
            int i12 = i10 % i11;
            if (i12 < 0) {
                i12 += i11;
            }
            int i13 = i7 % i11;
            if (i13 < 0) {
                i13 += i11;
            }
            int i14 = (i12 - i13) % i11;
            if (i14 < 0) {
                i14 += i11;
            }
            return i10 - i14;
        }
        if (i11 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i7 <= i10) {
            return i10;
        }
        int i15 = -i11;
        int i16 = i7 % i15;
        if (i16 < 0) {
            i16 += i15;
        }
        int i17 = i10 % i15;
        if (i17 < 0) {
            i17 += i15;
        }
        int i18 = (i16 - i17) % i15;
        if (i18 < 0) {
            i18 += i15;
        }
        return i10 + i18;
    }

    public static int m(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean n(Context context) {
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final void o(O9.a aVar, String configUrl, String configName, Db.j... jVarArr) {
        kotlin.jvm.internal.l.e(aVar, "<this>");
        kotlin.jvm.internal.l.e(configUrl, "configUrl");
        kotlin.jvm.internal.l.e(configName, "configName");
        O3.c cVar = new O3.c(3);
        cVar.a(new Db.j("iptv_url", configUrl));
        cVar.a(new Db.j("iptv_name", configName));
        cVar.b(jVarArr);
        ArrayList arrayList = cVar.f7466a;
        ((C1953a) aVar).a("AddIPTV", com.bumptech.glide.c.f((Db.j[]) arrayList.toArray(new Db.j[arrayList.size()])));
    }

    public static final void p(O9.a aVar, String str, q0 error, String channel, Db.j... extras) {
        int i7;
        kotlin.jvm.internal.l.e(error, "error");
        kotlin.jvm.internal.l.e(channel, "channel");
        kotlin.jvm.internal.l.e(extras, "extras");
        O3.c cVar = new O3.c(5);
        cVar.a(new Db.j("playbackException", error.getMessage()));
        cVar.a(new Db.j("errorCode", Integer.valueOf(error.f20477a)));
        if (error.getCause() instanceof C1599C) {
            Throwable cause = error.getCause();
            kotlin.jvm.internal.l.c(cause, "null cannot be cast to non-null type com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException");
            i7 = ((C1599C) cause).f20535d;
        } else {
            i7 = 0;
        }
        cVar.a(new Db.j("httpErrorCode", Integer.valueOf(i7)));
        cVar.a(new Db.j("channel", channel));
        cVar.b(extras);
        ArrayList arrayList = cVar.f7466a;
        ((C1953a) aVar).a(str, com.bumptech.glide.c.f((Db.j[]) arrayList.toArray(new Db.j[arrayList.size()])));
    }

    public static final void q(O9.a aVar, q0 error, String str, Db.j... jVarArr) {
        kotlin.jvm.internal.l.e(error, "error");
        p(aVar, "PlaybackRetryGetStreamLink", error, str, (Db.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
    }

    public static final void r(O9.a aVar, q0 error, String str, Db.j... jVarArr) {
        kotlin.jvm.internal.l.e(error, "error");
        p(aVar, "PlaybackRetryPlayVideo", error, str, (Db.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
    }

    public static final void s(O9.a aVar, q0 error, String channel, Db.j... jVarArr) {
        kotlin.jvm.internal.l.e(error, "error");
        kotlin.jvm.internal.l.e(channel, "channel");
        p(aVar, "PlaybackShowError", error, channel, (Db.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
    }

    public static final void t(O9.a aVar, String channelName, Db.j... jVarArr) {
        kotlin.jvm.internal.l.e(aVar, "<this>");
        kotlin.jvm.internal.l.e(channelName, "channelName");
        O3.c cVar = new O3.c(2);
        cVar.a(new Db.j("channel", channelName));
        cVar.b(jVarArr);
        ArrayList arrayList = cVar.f7466a;
        ((C1953a) aVar).a("Streaming", com.bumptech.glide.c.f((Db.j[]) arrayList.toArray(new Db.j[arrayList.size()])));
    }

    public static InterfaceC2317B u(C.G g, int i7, int i10, int i11, int i12, int i13, T t5, List list, AbstractC2323H[] abstractC2323HArr, int i14) {
        int i15;
        int i16;
        int i17;
        long j;
        int i18;
        List list2 = list;
        int i19 = i14;
        long j10 = i13;
        int[] iArr = new int[i19];
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        float f4 = 0.0f;
        int i24 = 0;
        while (true) {
            if (i20 >= i19) {
                break;
            }
            y0.z zVar = (y0.z) list2.get(i20);
            Object d10 = zVar.d();
            H h10 = d10 instanceof H ? (H) d10 : null;
            float f10 = h10 != null ? h10.f2352a : 0.0f;
            if (f10 > 0.0f) {
                f4 += f10;
                i21++;
                j = j10;
            } else {
                int i25 = i11 - i22;
                AbstractC2323H abstractC2323H = abstractC2323HArr[i20];
                if (abstractC2323H == null) {
                    if (i11 == Integer.MAX_VALUE) {
                        j = j10;
                        i18 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    } else if (i25 < 0) {
                        j = j10;
                        i18 = 0;
                    } else {
                        i18 = i25;
                        j = j10;
                    }
                    abstractC2323H = zVar.b(g.b(0, i18, i12, false));
                } else {
                    j = j10;
                }
                int d11 = g.d(abstractC2323H);
                int f11 = g.f(abstractC2323H);
                iArr[i20] = d11;
                int i26 = i25 - d11;
                if (i26 < 0) {
                    i26 = 0;
                }
                i23 = Math.min(i13, i26);
                i22 += d11 + i23;
                i24 = Math.max(i24, f11);
                abstractC2323HArr[i20] = abstractC2323H;
            }
            i20++;
            list2 = list;
            i19 = i14;
            j10 = j;
        }
        long j11 = j10;
        int i27 = i24;
        if (i21 == 0) {
            i22 -= i23;
            i15 = 0;
        } else {
            long j12 = j11 * (i21 - 1);
            long j13 = ((i11 != Integer.MAX_VALUE ? i11 : i7) - i22) - j12;
            if (j13 < 0) {
                j13 = 0;
            }
            float f12 = ((float) j13) / f4;
            int i28 = i14;
            int i29 = 0;
            while (i29 < i28) {
                Object d12 = ((y0.z) list.get(i29)).d();
                j13 -= Math.round(((d12 instanceof H ? (H) d12 : null) != null ? r15.f2352a : 0.0f) * f12);
                i29++;
                j12 = j12;
            }
            List list3 = list;
            long j14 = j12;
            int i30 = 0;
            int i31 = 0;
            while (i30 < i28) {
                if (abstractC2323HArr[i30] == null) {
                    y0.z zVar2 = (y0.z) list3.get(i30);
                    Object d13 = zVar2.d();
                    H h11 = d13 instanceof H ? (H) d13 : null;
                    float f13 = h11 != null ? h11.f2352a : 0.0f;
                    if (f13 <= 0.0f) {
                        D.a.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j13);
                    i16 = i30;
                    int i32 = i31;
                    j13 -= signum;
                    int max = Math.max(0, Math.round(f13 * f12) + signum);
                    if ((h11 != null ? h11.f2353b : true) && max != Integer.MAX_VALUE) {
                        i17 = max;
                        AbstractC2323H b2 = zVar2.b(g.b(i17, max, i12, true));
                        int d14 = g.d(b2);
                        int f14 = g.f(b2);
                        iArr[i16] = d14;
                        i31 = i32 + d14;
                        int max2 = Math.max(i27, f14);
                        abstractC2323HArr[i16] = b2;
                        i27 = max2;
                    }
                    i17 = 0;
                    AbstractC2323H b22 = zVar2.b(g.b(i17, max, i12, true));
                    int d142 = g.d(b22);
                    int f142 = g.f(b22);
                    iArr[i16] = d142;
                    i31 = i32 + d142;
                    int max22 = Math.max(i27, f142);
                    abstractC2323HArr[i16] = b22;
                    i27 = max22;
                } else {
                    i16 = i30;
                }
                i30 = i16 + 1;
                list3 = list;
                i28 = i14;
            }
            i15 = (int) (i31 + j14);
            int i33 = i11 - i22;
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 > i33) {
                i15 = i33;
            }
        }
        int i34 = i15 + i22;
        if (i34 < 0) {
            i34 = 0;
        }
        int max3 = Math.max(i34, i7);
        int max4 = Math.max(i27, Math.max(i10, 0));
        int[] iArr2 = new int[i14];
        g.a(max3, iArr, iArr2, t5);
        return g.e(abstractC2323HArr, t5, iArr2, max3, max4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static V8.b y(V8.b bVar, int i7, int i10, V8.h hVar) {
        if (i7 <= 0 || i10 <= 0) {
            throw P8.j.a();
        }
        V8.b bVar2 = new V8.b(i7, i10);
        int i11 = i7 * 2;
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i10; i12++) {
            float f4 = i12 + 0.5f;
            for (int i13 = 0; i13 < i11; i13 += 2) {
                fArr[i13] = (i13 / 2) + 0.5f;
                fArr[i13 + 1] = f4;
            }
            int i14 = i11 - 1;
            for (int i15 = 0; i15 < i14; i15 += 2) {
                float f10 = fArr[i15];
                int i16 = i15 + 1;
                float f11 = fArr[i16];
                float f12 = (hVar.f10227f * f11) + (hVar.f10224c * f10) + hVar.f10229i;
                fArr[i15] = (((hVar.f10225d * f11) + (hVar.f10222a * f10)) + hVar.g) / f12;
                fArr[i16] = (((hVar.f10226e * f11) + (hVar.f10223b * f10)) + hVar.f10228h) / f12;
            }
            int i17 = bVar.f10194a;
            int i18 = bVar.f10195b;
            boolean z8 = true;
            for (int i19 = 0; i19 < i14 && z8; i19 += 2) {
                int i20 = (int) fArr[i19];
                int i21 = i19 + 1;
                int i22 = (int) fArr[i21];
                if (i20 < -1 || i20 > i17 || i22 < -1 || i22 > i18) {
                    throw P8.j.a();
                }
                if (i20 == -1) {
                    fArr[i19] = 0.0f;
                } else if (i20 == i17) {
                    fArr[i19] = i17 - 1;
                } else {
                    z8 = false;
                    if (i22 != -1) {
                        fArr[i21] = 0.0f;
                    } else if (i22 == i18) {
                        fArr[i21] = i18 - 1;
                    }
                    z8 = true;
                }
                z8 = true;
                if (i22 != -1) {
                }
                z8 = true;
            }
            boolean z10 = true;
            for (int i23 = i11 - 2; i23 >= 0 && z10; i23 -= 2) {
                int i24 = (int) fArr[i23];
                int i25 = i23 + 1;
                int i26 = (int) fArr[i25];
                if (i24 < -1 || i24 > i17 || i26 < -1 || i26 > i18) {
                    throw P8.j.a();
                }
                if (i24 == -1) {
                    fArr[i23] = 0.0f;
                } else if (i24 == i17) {
                    fArr[i23] = i17 - 1;
                } else {
                    z10 = false;
                    if (i26 != -1) {
                        fArr[i25] = 0.0f;
                    } else if (i26 == i18) {
                        fArr[i25] = i18 - 1;
                    }
                    z10 = true;
                }
                z10 = true;
                if (i26 != -1) {
                }
                z10 = true;
            }
            for (int i27 = 0; i27 < i11; i27 += 2) {
                try {
                    if (bVar.b((int) fArr[i27], (int) fArr[i27 + 1])) {
                        bVar2.h(i27 / 2, i12);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw P8.j.a();
                }
            }
        }
        return bVar2;
    }

    public static void z(Window window, boolean z8) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            D0.e.h(window, z8);
        } else {
            if (i7 >= 30) {
                D0.e.g(window, z8);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z8 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public final void v(C1335w c1335w) {
        switch (this.f14204a) {
            case 0:
                if (((t) this.f14205b).f14232z0) {
                    return;
                }
                ((View) c1335w.f18307v.f3094a).setAlpha(0.0f);
                return;
            default:
                w wVar = (w) this.f14205b;
                boolean z8 = wVar.f14251r0;
                AbstractC1300H abstractC1300H = c1335w.f18306u;
                AbstractC1309Q abstractC1309Q = (AbstractC1309Q) abstractC1300H;
                abstractC1309Q.getClass();
                C9.h hVar = c1335w.f18307v;
                C1324l j = AbstractC1309Q.j(hVar);
                j.f18277f = z8;
                abstractC1309Q.n(j, z8);
                AbstractC1309Q abstractC1309Q2 = (AbstractC1309Q) abstractC1300H;
                abstractC1309Q2.getClass();
                C1324l j10 = AbstractC1309Q.j(hVar);
                abstractC1309Q2.r(j10, wVar.f14253t0);
                j10.getClass();
                abstractC1309Q2.i(j10);
                q qVar = wVar.f14256w0;
                if (qVar != null) {
                    qVar.v(c1335w);
                    return;
                }
                return;
        }
    }

    public final void w(C1335w c1335w) {
        switch (this.f14204a) {
            case 0:
                C9.h hVar = c1335w.f18307v;
                return;
            default:
                w wVar = (w) this.f14205b;
                ((AbstractC1309Q) c1335w.f18306u).getClass();
                AbstractC1309Q.j(c1335w.f18307v);
                wVar.f14252s0 = true;
                c1335w.f18309x = new v(c1335w);
                w.p0(c1335w, false, true);
                q qVar = wVar.f14256w0;
                if (qVar != null) {
                    qVar.w(c1335w);
                    return;
                }
                return;
        }
    }

    public final void x(C1335w c1335w) {
        switch (this.f14204a) {
            case 0:
                C9.h hVar = c1335w.f18307v;
                ((View) hVar.f3094a).setAlpha(1.0f);
                ((View) hVar.f3094a).setTranslationY(0.0f);
                ((View) hVar.f3094a).setAlpha(1.0f);
                return;
            default:
                w wVar = (w) this.f14205b;
                ((AbstractC1309Q) c1335w.f18306u).getClass();
                AbstractC1309Q.j(c1335w.f18307v).getClass();
                q qVar = wVar.f14256w0;
                if (qVar != null) {
                    qVar.x(c1335w);
                    return;
                }
                return;
        }
    }
}
