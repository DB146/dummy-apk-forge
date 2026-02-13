package v7;

import A0.C0018g0;
import A9.C0154x0;
import A9.M2;
import I2.C0330t;
import P4.F;
import Y5.C0658x;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ea.C1108c;
import ea.C1112g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import o.Y0;
import r7.C1945a;
import w7.AbstractC2222a;
import y7.C2409A;
import y7.C2410B;
import y7.C2412D;
import y7.C2413E;
import y7.C2416a0;
import y7.C2436k0;
import y7.C2438l0;
import y7.C2440m0;
import y7.C2442n0;
import y7.C2444o0;
import y7.I;
import y7.J;
import y7.K;
import y7.O0;
import y7.P;
import y7.Q;
import y7.S;
import y7.V;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: r, reason: collision with root package name */
    public static final B7.a f25126r = new B7.a(3);

    /* renamed from: s, reason: collision with root package name */
    public static final Charset f25127s = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f25128a;

    /* renamed from: b, reason: collision with root package name */
    public final G f25129b;

    /* renamed from: c, reason: collision with root package name */
    public final C1108c f25130c;

    /* renamed from: d, reason: collision with root package name */
    public final B7.d f25131d;

    /* renamed from: e, reason: collision with root package name */
    public final w7.d f25132e;

    /* renamed from: f, reason: collision with root package name */
    public final v f25133f;
    public final B7.d g;

    /* renamed from: h, reason: collision with root package name */
    public final C0018g0 f25134h;

    /* renamed from: i, reason: collision with root package name */
    public final x7.f f25135i;
    public final s7.a j;
    public final C1945a k;

    /* renamed from: l, reason: collision with root package name */
    public final i f25136l;

    /* renamed from: m, reason: collision with root package name */
    public final Y0 f25137m;

    /* renamed from: n, reason: collision with root package name */
    public r f25138n;

    /* renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f25139o = new TaskCompletionSource();

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f25140p = new TaskCompletionSource();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f25141q = new TaskCompletionSource();

    public l(Context context, v vVar, G g, B7.d dVar, C1108c c1108c, C0018g0 c0018g0, B7.d dVar2, x7.f fVar, Y0 y02, s7.a aVar, C1945a c1945a, i iVar, w7.d dVar3) {
        new AtomicBoolean(false);
        this.f25128a = context;
        this.f25133f = vVar;
        this.f25129b = g;
        this.g = dVar;
        this.f25130c = c1108c;
        this.f25134h = c0018g0;
        this.f25131d = dVar2;
        this.f25135i = fVar;
        this.j = aVar;
        this.k = c1945a;
        this.f25136l = iVar;
        this.f25137m = y02;
        this.f25132e = dVar3;
    }

    public static Task a(l lVar) {
        Task call;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : B7.d.e(((File) lVar.g.f2212c).listFiles(f25126r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new k(lVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0759 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04c0 A[LOOP:2: B:73:0x04c0->B:79:0x04dd, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04f7  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r11v55, types: [y7.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [y7.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14, types: [y7.C, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z8, D7.d dVar, boolean z10) {
        ArrayList arrayList;
        Y0 y02;
        boolean z11;
        String str;
        boolean z12;
        String str2;
        B7.d dVar2;
        NavigableSet<String> c10;
        int size;
        String substring;
        String e2;
        boolean z13;
        String[] list;
        List historicalProcessExitReasons;
        List emptyList;
        Iterator it;
        ApplicationExitInfo applicationExitInfo;
        String applicationExitInfo2;
        String str3;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        List list2;
        String str4;
        InputStream traceInputStream;
        long timestamp2;
        int reason2;
        FileInputStream fileInputStream;
        w7.d.a();
        Y0 y03 = this.f25137m;
        ArrayList arrayList2 = new ArrayList(((B7.b) y03.f21464b).c());
        if (arrayList2.size() <= z8) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str5 = (String) arrayList2.get(z8 == true ? 1 : 0);
        Closeable closeable = null;
        if (z10 && dVar.b().f3262b.f2541b) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                historicalProcessExitReasons = ((ActivityManager) this.f25128a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    B7.d dVar3 = this.g;
                    x7.f fVar = new x7.f(dVar3);
                    fVar.f26254b = x7.f.f26252c;
                    if (str5 != null) {
                        fVar.f26254b = new x7.m(dVar3.b(str5, "userlog"));
                    }
                    x7.h hVar = new x7.h(dVar3);
                    B7.d dVar4 = new B7.d(str5, dVar3, this.f25132e);
                    ((x7.e) ((AtomicMarkableReference) ((C0330t) dVar4.f2213d).f5200b).getReference()).c(hVar.c(str5, false));
                    ((x7.e) ((AtomicMarkableReference) ((C0330t) dVar4.f2214e).f5200b).getReference()).c(hVar.c(str5, true));
                    ((AtomicMarkableReference) dVar4.g).set(hVar.d(str5), false);
                    File b2 = dVar3.b(str5, "rollouts-state");
                    if (b2.exists()) {
                        try {
                            if (b2.length() != 0) {
                                try {
                                    fileInputStream = new FileInputStream(b2);
                                    try {
                                        emptyList = x7.h.b(g.i(fileInputStream));
                                        String str6 = "Loaded rollouts state:\n" + emptyList + "\nfor session " + str5;
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", str6, null);
                                        }
                                        g.b(fileInputStream, "Failed to close rollouts state file.");
                                    } catch (Exception e10) {
                                        e = e10;
                                        Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                        x7.h.f(b2);
                                        g.b(fileInputStream, "Failed to close rollouts state file.");
                                        emptyList = Collections.emptyList();
                                        ((U7.a) dVar4.f2215f).d(emptyList);
                                        B7.b bVar = (B7.b) y03.f21464b;
                                        long lastModified = bVar.f2206b.b(str5, "start-time").lastModified();
                                        it = historicalProcessExitReasons.iterator();
                                        while (it.hasNext()) {
                                        }
                                        applicationExitInfo = null;
                                        if (applicationExitInfo == null) {
                                        }
                                        if (z10) {
                                        }
                                        str = null;
                                        if (z8 != 0) {
                                        }
                                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                                        B7.b bVar2 = (B7.b) y02.f21464b;
                                        dVar2 = bVar2.f2206b;
                                        dVar2.a(".com.google.firebase.crashlytics");
                                        dVar2.a(".com.google.firebase.crashlytics-ndk");
                                        if (!((String) dVar2.f2210a).isEmpty()) {
                                        }
                                        c10 = bVar2.c();
                                        if (str2 != null) {
                                        }
                                        if (c10.size() > 8) {
                                        }
                                        loop3: while (r8.hasNext()) {
                                        }
                                        C0154x0 c0154x0 = bVar2.f2207c.b().f3261a;
                                        ArrayList b10 = bVar2.b();
                                        size = b10.size();
                                        if (size <= 4) {
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    fileInputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = null;
                                    g.b(closeable, "Failed to close rollouts state file.");
                                    throw th;
                                }
                                ((U7.a) dVar4.f2215f).d(emptyList);
                                B7.b bVar3 = (B7.b) y03.f21464b;
                                long lastModified2 = bVar3.f2206b.b(str5, "start-time").lastModified();
                                it = historicalProcessExitReasons.iterator();
                                while (it.hasNext()) {
                                    applicationExitInfo = M2.e(it.next());
                                    timestamp2 = applicationExitInfo.getTimestamp();
                                    if (timestamp2 < lastModified2) {
                                        break;
                                    }
                                    reason2 = applicationExitInfo.getReason();
                                    if (reason2 == 6) {
                                        break;
                                    }
                                }
                                applicationExitInfo = null;
                                if (applicationExitInfo == null) {
                                    String t5 = X.c.t("No relevant ApplicationExitInfo occurred during session: ", str5);
                                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                        Log.v("FirebaseCrashlytics", t5, null);
                                    }
                                    arrayList = arrayList2;
                                    y02 = y03;
                                    z11 = true;
                                } else {
                                    try {
                                        traceInputStream = applicationExitInfo.getTraceInputStream();
                                    } catch (IOException e12) {
                                        StringBuilder sb2 = new StringBuilder("Could not get input trace in application exit info: ");
                                        applicationExitInfo2 = applicationExitInfo.toString();
                                        sb2.append(applicationExitInfo2);
                                        sb2.append(" Error: ");
                                        sb2.append(e12);
                                        Log.w("FirebaseCrashlytics", sb2.toString(), null);
                                    }
                                    if (traceInputStream != null) {
                                        str3 = Y0.c(traceInputStream);
                                        ?? obj = new Object();
                                        importance = applicationExitInfo.getImportance();
                                        obj.f27103d = importance;
                                        obj.j = (byte) (obj.j | 4);
                                        processName = applicationExitInfo.getProcessName();
                                        if (processName != null) {
                                            throw new NullPointerException("Null processName");
                                        }
                                        obj.f27101b = processName;
                                        reason = applicationExitInfo.getReason();
                                        obj.f27102c = reason;
                                        obj.j = (byte) (obj.j | 2);
                                        timestamp = applicationExitInfo.getTimestamp();
                                        obj.g = timestamp;
                                        obj.j = (byte) (obj.j | 32);
                                        pid = applicationExitInfo.getPid();
                                        obj.f27100a = pid;
                                        obj.j = (byte) (obj.j | 1);
                                        pss = applicationExitInfo.getPss();
                                        obj.f27104e = pss;
                                        obj.j = (byte) (obj.j | 8);
                                        rss = applicationExitInfo.getRss();
                                        obj.f27105f = rss;
                                        obj.j = (byte) (obj.j | 16);
                                        obj.f27106h = str3;
                                        C2412D a9 = obj.a();
                                        q qVar = (q) y03.f21463a;
                                        int i10 = qVar.f25163a.getResources().getConfiguration().orientation;
                                        ?? obj2 = new Object();
                                        obj2.f27167b = "anr";
                                        long j = a9.g;
                                        obj2.f27166a = j;
                                        obj2.g = (byte) (obj2.g | 1);
                                        if (qVar.f25167e.b().f3262b.f2542c) {
                                            C0018g0 c0018g0 = qVar.f25165c;
                                            y02 = y03;
                                            if (((ArrayList) c0018g0.f227d).size() > 0) {
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it2 = ((ArrayList) c0018g0.f227d).iterator();
                                                while (it2.hasNext()) {
                                                    Iterator it3 = it2;
                                                    d dVar5 = (d) it2.next();
                                                    ArrayList arrayList4 = arrayList2;
                                                    String str7 = dVar5.f25102a;
                                                    if (str7 == null) {
                                                        throw new NullPointerException("Null libraryName");
                                                    }
                                                    String str8 = dVar5.f25103b;
                                                    if (str8 == null) {
                                                        throw new NullPointerException("Null arch");
                                                    }
                                                    String str9 = dVar5.f25104c;
                                                    if (str9 == null) {
                                                        throw new NullPointerException("Null buildId");
                                                    }
                                                    arrayList3.add(new C2413E(str8, str7, str9));
                                                    it2 = it3;
                                                    arrayList2 = arrayList4;
                                                }
                                                arrayList = arrayList2;
                                                list2 = Collections.unmodifiableList(arrayList3);
                                                ?? obj3 = new Object();
                                                obj3.f27103d = a9.f27111d;
                                                byte b11 = (byte) (obj3.j | 4);
                                                obj3.j = b11;
                                                str4 = a9.f27109b;
                                                if (str4 != null) {
                                                    throw new NullPointerException("Null processName");
                                                }
                                                obj3.f27101b = str4;
                                                obj3.f27102c = a9.f27110c;
                                                obj3.g = j;
                                                obj3.f27100a = a9.f27108a;
                                                obj3.f27104e = a9.f27112e;
                                                obj3.f27105f = a9.f27113f;
                                                obj3.j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 32)) | 1)) | 8)) | 16);
                                                obj3.f27106h = a9.f27114h;
                                                obj3.f27107i = list2;
                                                C2412D a10 = obj3.a();
                                                Boolean valueOf = Boolean.valueOf(a10.f27111d != 100);
                                                s7.c cVar = s7.c.f24188b;
                                                String processName2 = a10.f27109b;
                                                kotlin.jvm.internal.l.e(processName2, "processName");
                                                C2416a0 a11 = s7.c.a(cVar, processName2, a10.f27108a, a10.f27111d, 8);
                                                byte b12 = (byte) 1;
                                                V e13 = q.e();
                                                List a12 = qVar.a();
                                                if (a12 == null) {
                                                    throw new NullPointerException("Null binaries");
                                                }
                                                S s3 = new S(null, null, a10, e13, a12);
                                                if (b12 != 1) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    if (b12 == 0) {
                                                        sb3.append(" uiOrientation");
                                                    }
                                                    throw new IllegalStateException(h3.o.o("Missing required properties:", sb3));
                                                }
                                                obj2.f27168c = new Q(s3, null, null, valueOf, a11, null, i10);
                                                obj2.f27169d = qVar.b(i10);
                                                P a13 = obj2.a();
                                                String t10 = X.c.t("Persisting anr for session ", str5);
                                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                    Log.d("FirebaseCrashlytics", t10, null);
                                                }
                                                z11 = true;
                                                bVar3.d(Y0.b(Y0.a(a13, fVar, dVar4, Collections.emptyMap()), dVar4), str5, true);
                                            } else {
                                                arrayList = arrayList2;
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            y02 = y03;
                                        }
                                        list2 = null;
                                        ?? obj32 = new Object();
                                        obj32.f27103d = a9.f27111d;
                                        byte b112 = (byte) (obj32.j | 4);
                                        obj32.j = b112;
                                        str4 = a9.f27109b;
                                        if (str4 != null) {
                                        }
                                    }
                                    str3 = null;
                                    ?? obj4 = new Object();
                                    importance = applicationExitInfo.getImportance();
                                    obj4.f27103d = importance;
                                    obj4.j = (byte) (obj4.j | 4);
                                    processName = applicationExitInfo.getProcessName();
                                    if (processName != null) {
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    x7.h.g(b2, "The file has a length of zero for session: " + str5);
                    emptyList = Collections.emptyList();
                    ((U7.a) dVar4.f2215f).d(emptyList);
                    B7.b bVar32 = (B7.b) y03.f21464b;
                    long lastModified22 = bVar32.f2206b.b(str5, "start-time").lastModified();
                    it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                    }
                    applicationExitInfo = null;
                    if (applicationExitInfo == null) {
                    }
                } else {
                    arrayList = arrayList2;
                    y02 = y03;
                    z11 = true;
                    String t11 = X.c.t("No ApplicationExitInfo available. Session: ", str5);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", t11, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                y02 = y03;
                z11 = true;
                String l10 = h3.o.l(i7, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", l10, null);
                }
            }
        } else {
            arrayList = arrayList2;
            y02 = y03;
            z11 = true;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z10) {
            s7.a aVar = this.j;
            if (aVar.c(str5)) {
                String t12 = X.c.t("Finalizing native report for session ", str5);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", t12, null);
                }
                aVar.a(str5).getClass();
                str = null;
                Log.w("FirebaseCrashlytics", "No minidump data found for session " + str5, null);
                Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str5, null);
                Log.w("FirebaseCrashlytics", "No native core present", null);
                if (z8 != 0) {
                    z12 = false;
                    str2 = (String) arrayList.get(0);
                } else {
                    z12 = false;
                    this.f25136l.a(str);
                    str2 = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                B7.b bVar22 = (B7.b) y02.f21464b;
                dVar2 = bVar22.f2206b;
                dVar2.a(".com.google.firebase.crashlytics");
                dVar2.a(".com.google.firebase.crashlytics-ndk");
                if (!((String) dVar2.f2210a).isEmpty()) {
                    dVar2.a(".com.google.firebase.crashlytics.files.v1");
                    final String str10 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
                    File file = (File) dVar2.f2211b;
                    if (file.exists() && (list = file.list(new FilenameFilter() { // from class: B7.c
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file2, String str11) {
                            return str11.startsWith(str10);
                        }
                    })) != null) {
                        int length = list.length;
                        for (?? r10 = z12; r10 < length; r10++) {
                            dVar2.a(list[r10]);
                        }
                    }
                }
                c10 = bVar22.c();
                if (str2 != null) {
                    c10.remove(str2);
                }
                if (c10.size() > 8) {
                    while (c10.size() > 8) {
                        String str11 = (String) c10.last();
                        String t13 = X.c.t("Removing session over cap: ", str11);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", t13, null);
                        }
                        B7.d.d(new File((File) dVar2.f2213d, str11));
                        c10.remove(str11);
                    }
                }
                loop3: for (String str12 : c10) {
                    String t14 = X.c.t("Finalizing report for session ", str12);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", t14, null);
                    }
                    B7.a aVar2 = B7.b.f2204i;
                    File file2 = new File((File) dVar2.f2213d, str12);
                    file2.mkdirs();
                    List e14 = B7.d.e(file2.listFiles(aVar2));
                    if (e14.isEmpty()) {
                        String b13 = y.S.b("Session ", str12, " has no events.");
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", b13, null);
                        }
                    } else {
                        Collections.sort(e14);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = e14.iterator();
                        boolean z14 = z12;
                        while (true) {
                            boolean hasNext = it4.hasNext();
                            z7.a aVar3 = B7.b.g;
                            if (hasNext) {
                                File file3 = (File) it4.next();
                                try {
                                    e2 = B7.b.e(file3);
                                    aVar3.getClass();
                                } catch (IOException e15) {
                                    Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e15);
                                }
                                try {
                                    JsonReader jsonReader = new JsonReader(new StringReader(e2));
                                    try {
                                        P e16 = z7.a.e(jsonReader);
                                        jsonReader.close();
                                        arrayList5.add(e16);
                                        if (!z14) {
                                            String name = file3.getName();
                                            if (!name.startsWith("event") || !name.endsWith("_")) {
                                                z13 = false;
                                                z14 = z13;
                                            }
                                        }
                                        z13 = z11;
                                        z14 = z13;
                                    } finally {
                                        break loop3;
                                    }
                                } catch (IllegalStateException e17) {
                                    throw new IOException(e17);
                                }
                            } else if (arrayList5.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str12, null);
                            } else {
                                String d10 = new x7.h(dVar2).d(str12);
                                h hVar2 = bVar22.f2208d.f25118b;
                                synchronized (hVar2) {
                                    if (Objects.equals(hVar2.f25115b, str12)) {
                                        substring = hVar2.f25116c;
                                    } else {
                                        B7.d dVar6 = hVar2.f25114a;
                                        B7.a aVar4 = h.f25112d;
                                        File file4 = new File((File) dVar6.f2213d, str12);
                                        file4.mkdirs();
                                        List e18 = B7.d.e(file4.listFiles(aVar4));
                                        if (e18.isEmpty()) {
                                            Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                            substring = null;
                                        } else {
                                            substring = ((File) Collections.min(e18, h.f25113e)).getName().substring(4);
                                        }
                                    }
                                }
                                File b14 = dVar2.b(str12, "report");
                                try {
                                    String e19 = B7.b.e(b14);
                                    aVar3.getClass();
                                    C2410B i11 = z7.a.i(e19);
                                    C2409A a14 = i11.a();
                                    J j10 = i11.k;
                                    if (j10 != null) {
                                        try {
                                            I a15 = j10.a();
                                            a15.f27129e = Long.valueOf(currentTimeMillis2);
                                            a15.f27130f = z14;
                                            try {
                                                a15.f27134m = (byte) (a15.f27134m | 2);
                                                if (d10 != null) {
                                                    a15.f27131h = new C2436k0(d10);
                                                }
                                                a14.j = a15.a();
                                            } catch (IOException e20) {
                                                e = e20;
                                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b14, e);
                                                B7.d.d(new File((File) dVar2.f2213d, str12));
                                                z12 = false;
                                                z11 = true;
                                            }
                                        } catch (IOException e21) {
                                            e = e21;
                                        }
                                    }
                                    C2410B a16 = a14.a();
                                    C2409A a17 = a16.a();
                                    a17.g = substring;
                                    J j11 = a16.k;
                                    if (j11 != null) {
                                        I a18 = j11.a();
                                        a18.f27127c = substring;
                                        a17.j = a18.a();
                                    }
                                    C2410B a19 = a17.a();
                                    J j12 = a19.k;
                                    if (j12 == null) {
                                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                        break;
                                    }
                                    C2409A a20 = a19.a();
                                    I a21 = j12.a();
                                    a21.k = arrayList5;
                                    a20.j = a21.a();
                                    C2410B a22 = a20.a();
                                    J j13 = a22.k;
                                    if (j13 != null) {
                                        String str13 = "appQualitySessionId: " + substring;
                                        try {
                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                try {
                                                    Log.d("FirebaseCrashlytics", str13, null);
                                                } catch (IOException e22) {
                                                    e = e22;
                                                }
                                            }
                                            B7.b.f(z14 ? new File((File) dVar2.f2215f, j13.f27136b) : new File((File) dVar2.f2214e, j13.f27136b), z7.a.f28333a.u(a22));
                                        } catch (IOException e23) {
                                            e = e23;
                                            Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b14, e);
                                            B7.d.d(new File((File) dVar2.f2213d, str12));
                                            z12 = false;
                                            z11 = true;
                                        }
                                    }
                                    e = e22;
                                } catch (IOException e24) {
                                    e = e24;
                                }
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b14, e);
                            }
                        }
                    }
                    B7.d.d(new File((File) dVar2.f2213d, str12));
                    z12 = false;
                    z11 = true;
                }
                C0154x0 c0154x02 = bVar22.f2207c.b().f3261a;
                ArrayList b102 = bVar22.b();
                size = b102.size();
                if (size <= 4) {
                    return;
                }
                Iterator it5 = b102.subList(4, size).iterator();
                while (it5.hasNext()) {
                    ((File) it5.next()).delete();
                }
                return;
            }
        }
        str = null;
        if (z8 != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() / 1000;
        B7.b bVar222 = (B7.b) y02.f21464b;
        dVar2 = bVar222.f2206b;
        dVar2.a(".com.google.firebase.crashlytics");
        dVar2.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) dVar2.f2210a).isEmpty()) {
        }
        c10 = bVar222.c();
        if (str2 != null) {
        }
        if (c10.size() > 8) {
        }
        loop3: while (r8.hasNext()) {
        }
        C0154x0 c0154x022 = bVar222.f2207c.b().f3261a;
        ArrayList b1022 = bVar222.b();
        size = b1022.size();
        if (size <= 4) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [y7.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, y7.M] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, y7.I] */
    /* JADX WARN: Type inference failed for: r4v11, types: [y7.A, java.lang.Object] */
    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i7;
        Integer num;
        Map unmodifiableMap;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String t5 = X.c.t("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", t5, null);
        }
        Locale locale = Locale.US;
        v vVar = this.f25133f;
        C0018g0 c0018g0 = this.f25134h;
        C2440m0 c2440m0 = new C2440m0(vVar.f25181c, (String) c0018g0.g, (String) c0018g0.f230h, vVar.c().f25099a, h3.o.c(((String) c0018g0.f228e) != null ? 4 : 1), (ha.g) c0018g0.f231i);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C2444o0 c2444o0 = new C2444o0(str5, str6, g.g());
        Context context = this.f25128a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f25108a;
        String str7 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str7);
        f fVar2 = f.f25108a;
        if (!isEmpty) {
            f fVar3 = (f) f.f25109b.get(str7.toLowerCase(locale));
            if (fVar3 != null) {
                fVar2 = fVar3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = fVar2.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a9 = g.a(context);
        boolean f4 = g.f();
        int c10 = g.c();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new C2438l0(c2440m0, c2444o0, new C2442n0(ordinal, str8, availableProcessors, a9, blockCount, f4, c10, str9, str10)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str10;
            str4 = str9;
            i7 = 4;
        } else {
            B7.d dVar = this.f25131d;
            synchronized (((String) dVar.f2210a)) {
                dVar.f2210a = str;
                x7.e eVar = (x7.e) ((AtomicMarkableReference) ((C0330t) dVar.f2213d).f5200b).getReference();
                synchronized (eVar) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.f26249a));
                }
                str2 = str6;
                str3 = str10;
                str4 = str9;
                i7 = 4;
                ((w7.d) dVar.f2212c).f25820b.a(new F(dVar, str, unmodifiableMap, ((U7.a) dVar.f2215f).c(), 3));
            }
        }
        x7.f fVar4 = this.f25135i;
        ((x7.d) fVar4.f26254b).a();
        fVar4.f26254b = x7.f.f26252c;
        if (str != null) {
            fVar4.f26254b = new x7.m(((B7.d) fVar4.f26253a).b(str, "userlog"));
        }
        this.f25136l.a(str);
        Y0 y02 = this.f25137m;
        q qVar = (q) y02.f21463a;
        Charset charset = O0.f27172a;
        ?? obj = new Object();
        obj.f27081a = "19.4.4";
        C0018g0 c0018g02 = qVar.f25165c;
        String str11 = (String) c0018g02.f225b;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        obj.f27082b = str11;
        v vVar2 = qVar.f25164b;
        String str12 = vVar2.c().f25099a;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        obj.f27084d = str12;
        obj.f27085e = vVar2.c().f25100b;
        obj.f27086f = vVar2.c().f25101c;
        String str13 = (String) c0018g02.g;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        obj.f27087h = str13;
        String str14 = (String) c0018g02.f230h;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        obj.f27088i = str14;
        obj.f27083c = i7;
        obj.f27090m = (byte) (obj.f27090m | 1);
        ?? obj2 = new Object();
        obj2.f27130f = false;
        byte b2 = (byte) (obj2.f27134m | 2);
        obj2.f27128d = currentTimeMillis;
        obj2.f27134m = (byte) (b2 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        obj2.f27126b = str;
        String str15 = q.g;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        obj2.f27125a = str15;
        String str16 = vVar2.f25181c;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = vVar2.c().f25099a;
        ha.g gVar = (ha.g) c0018g02.f231i;
        if (((C1108c) gVar.f17916c) == null) {
            gVar.f17916c = new C1108c(gVar);
        }
        C1108c c1108c = (C1108c) gVar.f17916c;
        String str18 = (String) c1108c.f16831c;
        if (c1108c == null) {
            gVar.f17916c = new C1108c(gVar);
        }
        obj2.g = new K(str16, str13, str14, str17, str18, (String) ((C1108c) gVar.f17916c).f16830b);
        ?? obj3 = new Object();
        obj3.f27297a = 3;
        obj3.f27301e = (byte) (obj3.f27301e | 1);
        obj3.f27298b = str5;
        obj3.f27299c = str2;
        obj3.f27300d = g.g();
        obj3.f27301e = (byte) (obj3.f27301e | 2);
        obj2.f27132i = obj3.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i10 = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) q.f25162f.get(str7.toLowerCase(locale))) != null) {
            i10 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a10 = g.a(qVar.f25163a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean f10 = g.f();
        int c11 = g.c();
        ?? obj4 = new Object();
        obj4.f27150a = i10;
        byte b10 = (byte) (obj4.j | 1);
        obj4.f27151b = str8;
        obj4.f27152c = availableProcessors2;
        obj4.f27153d = a10;
        obj4.f27154e = blockCount2;
        obj4.f27155f = f10;
        obj4.g = c11;
        obj4.j = (byte) (((byte) (((byte) (((byte) (((byte) (2 | b10)) | 4)) | 8)) | 16)) | 32);
        obj4.f27156h = str4;
        obj4.f27157i = str3;
        obj2.j = obj4.a();
        obj2.f27133l = 3;
        obj2.f27134m = (byte) (obj2.f27134m | 4);
        obj.j = obj2.a();
        C2410B a11 = obj.a();
        B7.d dVar2 = ((B7.b) y02.f21464b).f2206b;
        J j = a11.k;
        if (j == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str19 = j.f27136b;
        try {
            B7.b.g.getClass();
            B7.b.f(dVar2.b(str19, "report"), z7.a.f28333a.u(a11));
            File b11 = dVar2.b(str19, "start-time");
            long j10 = j.f27138d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b11), B7.b.f2201e);
            try {
                outputStreamWriter.write("");
                b11.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e2) {
            String t10 = X.c.t("Could not persist report for session ", str19);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", t10, e2);
            }
        }
    }

    public final boolean d(D7.d dVar) {
        w7.d.a();
        r rVar = this.f25138n;
        if (rVar != null && rVar.f25172e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, dVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e2) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    public final String e() {
        NavigableSet c10 = ((B7.b) this.f25137m.f21464b).c();
        if (c10.isEmpty()) {
            return null;
        }
        return (String) c10.first();
    }

    public final String f() {
        InputStream resourceAsStream;
        Context context = this.f25128a;
        int d10 = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = d10 == 0 ? null : context.getResources().getString(d10);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f25127s), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        try {
            String f4 = f();
            if (f4 != null) {
                try {
                    this.f25131d.f(f4);
                } catch (IllegalArgumentException e2) {
                    Context context = this.f25128a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e2;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final void h(Task task) {
        Task task2;
        Task a9;
        B7.d dVar = ((B7.b) this.f25137m.f21464b).f2206b;
        boolean isEmpty = B7.d.e(((File) dVar.f2214e).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.f25139o;
        if (isEmpty && B7.d.e(((File) dVar.f2215f).listFiles()).isEmpty() && B7.d.e(((File) dVar.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        s7.c cVar = s7.c.f24187a;
        cVar.f("Crash reports are available to be sent.");
        G g = this.f25129b;
        if (g.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            a9 = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar.c("Automatic data collection is disabled.");
            cVar.f("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (g.f14932c) {
                task2 = ((TaskCompletionSource) g.f14933d).getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new C0658x(19));
            cVar.c("Waiting for send/deleteUnsentReports to be called.");
            a9 = AbstractC2222a.a(onSuccessTask, this.f25140p.getTask());
        }
        a9.onSuccessTask(this.f25132e.f25819a, new C1112g(15, this, task, false));
    }
}
