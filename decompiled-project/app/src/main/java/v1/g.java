package v1;

import C3.ThreadFactoryC0236b;
import C4.C0244f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q1.AbstractC1878d;
import u.C2066t;
import u.T;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C2066t f24949a = new C2066t(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f24950b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24951c;

    /* renamed from: d, reason: collision with root package name */
    public static final T f24952d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0236b(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f24950b = threadPoolExecutor;
        f24951c = new Object();
        f24952d = new T(0);
    }

    public static String a(int i7, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((c) list.get(i10)).f24939e);
            sb2.append("-");
            sb2.append(i7);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f b(String str, Context context, List list, int i7) {
        Typeface typeface;
        int i10;
        Typeface k;
        Trace.beginSection(vc.i.I("getFontSync"));
        C2066t c2066t = f24949a;
        try {
            typeface = (Typeface) c2066t.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new f(typeface);
        }
        C0244f a9 = b.a(context, list);
        int i11 = a9.f2728a;
        List list2 = a9.f2729b;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = -2;
                if (i10 == 0) {
                    return new f(i10);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    h[] hVarArr = (h[]) list2.get(0);
                    vc.i iVar = AbstractC1878d.f23347a;
                    Trace.beginSection(vc.i.I("TypefaceCompat.createFromFontInfo"));
                    k = AbstractC1878d.f23347a.k(context, hVarArr, i7);
                    Trace.endSection();
                    if (k != null) {
                        return new f(-3);
                    }
                    c2066t.put(str, k);
                    return new f(k);
                }
                vc.i iVar2 = AbstractC1878d.f23347a;
                Trace.beginSection(vc.i.I("TypefaceCompat.createFromFontInfoWithFallback"));
                k = AbstractC1878d.f23347a.l(context, list2, i7);
                Trace.endSection();
                if (k != null) {
                }
            }
            i10 = -3;
            if (i10 == 0) {
            }
        } else {
            h[] hVarArr2 = (h[]) list2.get(0);
            if (hVarArr2 != null && hVarArr2.length != 0) {
                int length = hVarArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i10 = 0;
                        break;
                    }
                    int i13 = hVarArr2[i12].f24957e;
                    if (i13 == 0) {
                        i12++;
                    } else if (i13 >= 0) {
                        i10 = i13;
                    }
                }
                if (i10 == 0) {
                }
            }
            i10 = 1;
            if (i10 == 0) {
            }
        }
    }
}
