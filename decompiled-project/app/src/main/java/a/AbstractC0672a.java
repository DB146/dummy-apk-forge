package a;

import A0.n0;
import Aa.w;
import B0.X;
import H0.n;
import H0.q;
import H0.t;
import N0.e;
import T2.c;
import a3.AbstractC0713E;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.graphics.Path;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.C0856D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import g3.AbstractC1184c;
import g3.AbstractC1193l;
import g3.C1183b;
import g3.InterfaceC1187f;
import j0.C1368f;
import j0.z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import k1.g;
import kotlin.jvm.internal.l;
import p0.d;
import p0.h;
import p0.i;
import p0.j;
import p0.k;
import u.C2046I;
import y0.AbstractC2328M;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0672a {

    /* renamed from: a, reason: collision with root package name */
    public static d f12358a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12359b = true;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12360c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12361d = 0;

    public static long a(AtomicLong atomicLong, long j) {
        long j10;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, b(j10, j)));
        return j10;
    }

    public static long b(long j, long j10) {
        long j11 = j + j10;
        if (j11 < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    public static void c(Throwable th, Throwable exception) {
        l.e(th, "<this>");
        l.e(exception, "exception");
        if (th != exception) {
            Integer num = Mb.a.f6934a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = Lb.a.f6443a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static int e(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                if (noteProxyOpNoThrow == 0) {
                    noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, g.a(context)) : 1;
                }
            } else {
                noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (noteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final e f(Context context) {
        h8.e eVar = new h8.e(9);
        context.getApplicationContext();
        return new e(eVar, new N0.a(Build.VERSION.SDK_INT >= 31 ? N0.l.f7144a.a(context) : 0));
    }

    public static byte[] g(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            byte b2 = (byte) ((bArr[i7] << 1) & 254);
            bArr2[i7] = b2;
            if (i7 < 15) {
                bArr2[i7] = (byte) (((byte) ((bArr[i7 + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final void h(T2.a aVar, String sql) {
        l.e(aVar, "<this>");
        l.e(sql, "sql");
        c R10 = aVar.R(sql);
        try {
            R10.J();
            Tb.a.g(R10, null);
        } finally {
        }
    }

    public static final u8.c i() {
        u8.c e2 = u8.c.e();
        l.d(e2, "getInstance()");
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(final Context context) {
        final boolean z8;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (b.s(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z8 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                Tasks.forResult(null);
                return;
            }
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            new Runnable() { // from class: r8.m
                @Override // java.lang.Runnable
                public final void run() {
                    String notificationDelegate;
                    Context context2 = context;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    try {
                        if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                            SharedPreferences.Editor edit = android.support.v4.media.session.b.s(context2).edit();
                            edit.putBoolean("proxy_notification_initialized", true);
                            edit.apply();
                            NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (z8) {
                                notificationManager.setNotificationDelegate("com.google.android.gms");
                            } else {
                                notificationDelegate = notificationManager.getNotificationDelegate();
                                if ("com.google.android.gms".equals(notificationDelegate)) {
                                    notificationManager.setNotificationDelegate(null);
                                }
                            }
                        } else {
                            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        }
                    } finally {
                        taskCompletionSource2.trySetResult(null);
                    }
                }
            }.run();
            taskCompletionSource.getTask();
            return;
        }
        z8 = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean k() {
        C1183b c1183b = AbstractC1193l.f17443a;
        Set<InterfaceC1187f> unmodifiableSet = Collections.unmodifiableSet(AbstractC1184c.f17434c);
        HashSet hashSet = new HashSet();
        for (InterfaceC1187f interfaceC1187f : unmodifiableSet) {
            if (((AbstractC1184c) interfaceC1187f).f17435a.equals("WEB_MESSAGE_LISTENER")) {
                hashSet.add(interfaceC1187f);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature WEB_MESSAGE_LISTENER");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC1184c abstractC1184c = (AbstractC1184c) ((InterfaceC1187f) it.next());
            if (abstractC1184c.a() || abstractC1184c.b()) {
                return true;
            }
        }
        return false;
    }

    public static w l(Aa.l lVar, TVChannelLinkStream tVChannelLinkStream) {
        w wVar = new w();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra:playback_type", lVar);
        bundle.putParcelable("extra:tv_channel", tVChannelLinkStream);
        wVar.l0(bundle);
        return wVar;
    }

    public static void m(AtomicLong atomicLong, long j) {
        long j10;
        long j11;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            j11 = j10 - j;
            if (j11 < 0) {
                com.bumptech.glide.d.t(new IllegalStateException(A3.c.h("More produced than requested: ", j11)));
                j11 = 0;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
    }

    public static final void n(Bundle bundle, String key, Bundle value) {
        l.e(key, "key");
        l.e(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void o(String key, String value, Bundle bundle) {
        l.e(key, "key");
        l.e(value, "value");
        bundle.putString(key, value);
    }

    public static final void p(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static void r(ViewGroup viewGroup, boolean z8) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0713E.b(viewGroup, z8);
        } else if (f12359b) {
            try {
                AbstractC0713E.b(viewGroup, z8);
            } catch (NoSuchMethodError unused) {
                f12359b = false;
            }
        }
    }

    public static final void s(int i7, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i7);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }

    public static final void t(List list, z zVar) {
        C1368f c1368f = (C1368f) zVar;
        int i7 = c1368f.f18539a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        Path path = c1368f.f18539a;
        path.rewind();
        c1368f.c(i7);
        if (!list.isEmpty()) {
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            p0.l lVar = (p0.l) list.get(i10);
            if (lVar instanceof p0.g) {
                path.close();
            } else if (lVar instanceof i) {
                ((i) lVar).getClass();
                path.moveTo(18.3f, 5.71f);
            } else if (lVar instanceof k) {
                k kVar = (k) lVar;
                kVar.getClass();
                path.rLineTo(4.89f, kVar.f23012a);
            } else if (lVar instanceof h) {
                h hVar = (h) lVar;
                path.lineTo(hVar.f23004a, hVar.f23005b);
            } else if (lVar instanceof j) {
                j jVar = (j) lVar;
                path.rCubicTo(jVar.f23006a, jVar.f23007b, jVar.f23008c, jVar.f23009d, jVar.f23010e, jVar.f23011f);
            }
        }
    }

    public static final long u(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final String v(float f4) {
        if (Float.isNaN(f4)) {
            return "NaN";
        }
        if (Float.isInfinite(f4)) {
            return f4 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f10 = f4 * pow;
        int i7 = (int) f10;
        if (f10 - i7 >= 0.5f) {
            i7++;
        }
        float f11 = i7 / pow;
        return max > 0 ? String.valueOf(f11) : String.valueOf((int) f11);
    }

    public static final void x(n nVar, int i7, G0.k kVar) {
        n nVar2;
        S.e eVar = new S.e(new n[16]);
        List g = nVar.g(false, false);
        while (true) {
            eVar.d(eVar.f8961c, g);
            while (true) {
                int i10 = eVar.f8961c;
                if (i10 == 0) {
                    return;
                }
                nVar2 = (n) eVar.l(i10 - 1);
                if (!X.i(nVar2)) {
                    t tVar = q.f4546i;
                    H0.i iVar = nVar2.f4505d;
                    C2046I c2046i = iVar.f4494a;
                    if (c2046i.c(tVar)) {
                        continue;
                    } else {
                        n0 c10 = nVar2.c();
                        if (c10 == null) {
                            throw X.c.c("Expected semantics node to have a coordinator.");
                        }
                        i0.c e2 = AbstractC2328M.e(c10);
                        int round = Math.round(e2.f18174a);
                        int round2 = Math.round(e2.f18175b);
                        int round3 = Math.round(e2.f18176c);
                        int round4 = Math.round(e2.f18177d);
                        V0.j jVar = new V0.j(round, round2, round3, round4);
                        if (round < round3 && round2 < round4) {
                            Object g2 = iVar.f4494a.g(H0.h.f4475e);
                            if (g2 == null) {
                                g2 = null;
                            }
                            Rb.e eVar2 = (Rb.e) g2;
                            Object g10 = c2046i.g(q.f4555t);
                            H0.g gVar = (H0.g) (g10 != null ? g10 : null);
                            if (eVar2 != null && gVar != null && ((Number) gVar.f4469b.invoke()).floatValue() > 0.0f) {
                                int i11 = i7 + 1;
                                kVar.invoke(new G0.l(nVar2, i11, jVar, c10));
                                x(nVar2, i11, kVar);
                            }
                        }
                    }
                }
            }
            g = nVar2.g(false, false);
        }
    }

    public void d(Window window) {
    }

    public abstract void q(C0856D c0856d, C0856D c0856d2, Window window, View view, boolean z8, boolean z10);

    public abstract void w(Object obj, Object obj2);
}
