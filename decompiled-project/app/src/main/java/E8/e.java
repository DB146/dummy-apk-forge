package E8;

import A8.A;
import A8.B;
import A8.C0038b;
import Db.q;
import android.os.Build;
import android.util.Log;
import bc.C0849a;
import bc.EnumC0851c;
import cc.F;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import mc.AbstractC1660e;
import mc.C1659d;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public final k8.e f3763a;

    /* renamed from: b, reason: collision with root package name */
    public final C0038b f3764b;

    /* renamed from: c, reason: collision with root package name */
    public final g f3765c;

    /* renamed from: d, reason: collision with root package name */
    public final C8.a f3766d;

    /* renamed from: e, reason: collision with root package name */
    public final C1659d f3767e;

    public e(Hb.i backgroundDispatcher, k8.e firebaseInstallationsApi, C0038b appInfo, g configsFetcher, C8.a lazySettingsCache) {
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.l.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.l.e(appInfo, "appInfo");
        kotlin.jvm.internal.l.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.l.e(lazySettingsCache, "lazySettingsCache");
        this.f3763a = firebaseInstallationsApi;
        this.f3764b = appInfo;
        this.f3765c = configsFetcher;
        this.f3766d = lazySettingsCache;
        this.f3767e = AbstractC1660e.a();
    }

    public static String f(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.l.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.l.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override // E8.o
    public final Boolean a() {
        h hVar = e().f3801b;
        if (hVar != null) {
            return hVar.f3775a;
        }
        kotlin.jvm.internal.l.j("sessionConfigs");
        throw null;
    }

    @Override // E8.o
    public final Double b() {
        h hVar = e().f3801b;
        if (hVar != null) {
            return hVar.f3776b;
        }
        kotlin.jvm.internal.l.j("sessionConfigs");
        throw null;
    }

    @Override // E8.o
    public final C0849a c() {
        h hVar = e().f3801b;
        if (hVar == null) {
            kotlin.jvm.internal.l.j("sessionConfigs");
            throw null;
        }
        Integer num = hVar.f3777c;
        if (num == null) {
            return null;
        }
        int i7 = C0849a.f13994d;
        return new C0849a(Tb.a.M(num.intValue(), EnumC0851c.f13999d));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00a9, B:28:0x00b5, B:31:0x00be, B:38:0x0085, B:40:0x008f, B:43:0x0098), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00a9, B:28:0x00b5, B:31:0x00be, B:38:0x0085, B:40:0x008f, B:43:0x0098), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00a9, B:28:0x00b5, B:31:0x00be, B:38:0x0085, B:40:0x008f, B:43:0x0098), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00a9, B:28:0x00b5, B:31:0x00be, B:38:0x0085, B:40:0x008f, B:43:0x0098), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r15v2, types: [Jb.i, E8.d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // E8.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Hb.d dVar) {
        b bVar;
        ?? r42;
        InterfaceC1656a interfaceC1656a;
        InterfaceC1656a interfaceC1656a2;
        e eVar;
        String str;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i7 = bVar.f3756e;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    bVar.f3756e = i7 - Integer.MIN_VALUE;
                    Object obj = bVar.f3754c;
                    Ib.a aVar = Ib.a.f5345a;
                    r42 = bVar.f3756e;
                    q qVar = q.f3365a;
                    if (r42 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        C1659d c1659d = this.f3767e;
                        if (!c1659d.c() && !e().b()) {
                            return qVar;
                        }
                        bVar.f3752a = this;
                        bVar.f3753b = c1659d;
                        bVar.f3756e = 1;
                        if (c1659d.n(bVar) == aVar) {
                            return aVar;
                        }
                        interfaceC1656a2 = c1659d;
                        eVar = this;
                    } else {
                        if (r42 != 1) {
                            if (r42 != 2) {
                                if (r42 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC1656a = (InterfaceC1656a) bVar.f3752a;
                                try {
                                    com.bumptech.glide.c.c0(obj);
                                    interfaceC1656a.l(null);
                                    return qVar;
                                } catch (Throwable th) {
                                    th = th;
                                    interfaceC1656a.l(null);
                                    throw th;
                                }
                            }
                            interfaceC1656a2 = bVar.f3753b;
                            eVar = (e) bVar.f3752a;
                            com.bumptech.glide.c.c0(obj);
                            str = ((B) obj).f534a;
                            if (!str.equals("")) {
                                Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                                interfaceC1656a2.l(null);
                                return qVar;
                            }
                            Db.j jVar = new Db.j("X-Crashlytics-Installation-ID", str);
                            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                            eVar.getClass();
                            Db.j jVar2 = new Db.j("X-Crashlytics-Device-Model", f(format));
                            String INCREMENTAL = Build.VERSION.INCREMENTAL;
                            kotlin.jvm.internal.l.d(INCREMENTAL, "INCREMENTAL");
                            Db.j jVar3 = new Db.j("X-Crashlytics-OS-Build-Version", f(INCREMENTAL));
                            String RELEASE = Build.VERSION.RELEASE;
                            kotlin.jvm.internal.l.d(RELEASE, "RELEASE");
                            Db.j jVar4 = new Db.j("X-Crashlytics-OS-Display-Version", f(RELEASE));
                            eVar.f3764b.getClass();
                            Map H10 = Eb.B.H(jVar, jVar2, jVar3, jVar4, new Db.j("X-Crashlytics-API-Client-Version", "2.1.2"));
                            Log.d("SessionConfigFetcher", "Fetching settings from server.");
                            g gVar = eVar.f3765c;
                            c cVar = new c(eVar, null);
                            ?? iVar = new Jb.i(2, null);
                            bVar.f3752a = interfaceC1656a2;
                            bVar.f3753b = null;
                            bVar.f3756e = 3;
                            gVar.getClass();
                            Object K10 = F.K(gVar.f3774b, new f(gVar, H10, cVar, iVar, null), bVar);
                            if (K10 != aVar) {
                                K10 = qVar;
                            }
                            if (K10 == aVar) {
                                return aVar;
                            }
                            interfaceC1656a = interfaceC1656a2;
                            interfaceC1656a.l(null);
                            return qVar;
                        }
                        interfaceC1656a2 = bVar.f3753b;
                        eVar = (e) bVar.f3752a;
                        com.bumptech.glide.c.c0(obj);
                    }
                    if (eVar.e().b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        interfaceC1656a2.l(null);
                        return qVar;
                    }
                    A a9 = B.f533c;
                    k8.e eVar2 = eVar.f3763a;
                    bVar.f3752a = eVar;
                    bVar.f3753b = interfaceC1656a2;
                    bVar.f3756e = 2;
                    obj = a9.a(eVar2, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    str = ((B) obj).f534a;
                    if (!str.equals("")) {
                    }
                }
            }
            if (r42 != 0) {
            }
            if (eVar.e().b()) {
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC1656a = r42;
        }
        bVar = new b(this, (Jb.c) dVar);
        Object obj2 = bVar.f3754c;
        Ib.a aVar2 = Ib.a.f5345a;
        r42 = bVar.f3756e;
        q qVar2 = q.f3365a;
    }

    public final n e() {
        Object obj = this.f3766d.get();
        kotlin.jvm.internal.l.d(obj, "lazySettingsCache.get()");
        return (n) obj;
    }
}
