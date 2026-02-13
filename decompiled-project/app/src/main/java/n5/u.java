package n5;

import H2.r0;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import ea.C1112g;
import i9.C1350b;
import i9.C1352d;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.C1586o0;

/* loaded from: classes.dex */
public final class u implements p9.k {

    /* renamed from: f, reason: collision with root package name */
    public static u f21220f;
    public static u g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21221a;

    /* renamed from: b, reason: collision with root package name */
    public int f21222b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21223c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21224d;

    /* renamed from: e, reason: collision with root package name */
    public Object f21225e;

    public u(int i7) {
        this.f21221a = i7;
        switch (i7) {
            case 4:
                this.f21222b = 0;
                this.f21225e = new Object();
                return;
            default:
                return;
        }
    }

    public u(r0 r0Var, C1350b c1350b) {
        this.f21221a = 2;
        this.f21223c = r0Var;
        int i7 = r0Var.f4793b;
        this.f21222b = i7;
        this.f21225e = c1350b;
        this.f21224d = new C1112g[i7 + 2];
    }

    public u(Context context) {
        this.f21221a = 0;
        this.f21223c = new Handler(Looper.getMainLooper());
        this.f21224d = new CopyOnWriteArrayList();
        this.f21225e = new Object();
        this.f21222b = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new F6.j(this, 4), intentFilter);
    }

    public u(String str, String str2, String str3, int i7) {
        this.f21221a = 1;
        this.f21222b = i7;
        this.f21223c = str;
        this.f21224d = str2;
        this.f21225e = str3;
    }

    public static void a(u uVar, int i7) {
        synchronized (uVar.f21225e) {
            try {
                if (uVar.f21222b == i7) {
                    return;
                }
                uVar.f21222b = i7;
                Iterator it = ((CopyOnWriteArrayList) uVar.f21224d).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    m5.r rVar = (m5.r) weakReference.get();
                    if (rVar != null) {
                        rVar.a(i7);
                    } else {
                        ((CopyOnWriteArrayList) uVar.f21224d).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized u f(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f21220f == null) {
                    f21220f = new u(context);
                }
                uVar = f21220f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public void b(C1112g c1112g) {
        if (c1112g != null) {
            C1352d c1352d = (C1352d) c1112g;
            r0[] r0VarArr = (r0[]) c1352d.f16841c;
            for (r0 r0Var : r0VarArr) {
                if (r0Var != null) {
                    r0Var.d();
                }
            }
            r0 r0Var2 = (r0) this.f21223c;
            c1352d.l(r0VarArr, r0Var2);
            C1350b c1350b = (C1350b) c1352d.f16840b;
            boolean z8 = c1352d.f18475d;
            P8.p pVar = z8 ? c1350b.f18465b : c1350b.f18467d;
            P8.p pVar2 = z8 ? c1350b.f18466c : c1350b.f18468e;
            int i7 = c1352d.i((int) pVar.f8250b);
            int i10 = c1352d.i((int) pVar2.f8250b);
            int i11 = -1;
            int i12 = 0;
            int i13 = 1;
            while (i7 < i10) {
                r0 r0Var3 = r0VarArr[i7];
                if (r0Var3 != null) {
                    int i14 = r0Var3.f4797f;
                    int i15 = i14 - i11;
                    if (i15 == 0) {
                        i12++;
                    } else {
                        if (i15 == 1) {
                            i13 = Math.max(i13, i12);
                            i11 = r0Var3.f4797f;
                        } else if (i15 < 0 || i14 >= r0Var2.f4797f || i15 > i7) {
                            r0VarArr[i7] = null;
                        } else {
                            if (i13 > 2) {
                                i15 *= i13 - 2;
                            }
                            boolean z10 = i15 >= i7;
                            for (int i16 = 1; i16 <= i15 && !z10; i16++) {
                                z10 = r0VarArr[i7 - i16] != null;
                            }
                            if (z10) {
                                r0VarArr[i7] = null;
                            } else {
                                i11 = r0Var3.f4797f;
                            }
                        }
                        i12 = 1;
                    }
                }
                i7++;
            }
        }
    }

    public void c() {
        synchronized (this.f21225e) {
            try {
                if (((Handler) this.f21223c) == null) {
                    if (this.f21222b <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f21224d = handlerThread;
                    handlerThread.start();
                    this.f21223c = new Handler(((HandlerThread) this.f21224d).getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Runnable runnable) {
        synchronized (this.f21225e) {
            c();
            ((Handler) this.f21223c).post(runnable);
        }
    }

    public String e(T4.u uVar, Uri uri, int i7) {
        int i10 = this.f21222b;
        if (i10 == 1) {
            String encodeToString = Base64.encodeToString((uVar.f9316b + ":" + uVar.f9317c).getBytes(W4.y.f10800u), 0);
            int i11 = D.f21141a;
            Locale locale = Locale.US;
            return X.c.t("Basic ", encodeToString);
        }
        if (i10 != 2) {
            throw new C1586o0(null, new UnsupportedOperationException(), false, 4);
        }
        String str = (String) this.f21224d;
        String str2 = (String) this.f21223c;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String h10 = W4.z.h(i7);
            String str3 = uVar.f9316b + ":" + str2 + ":" + uVar.f9317c;
            Charset charset = W4.y.f10800u;
            String Y2 = D.Y(messageDigest.digest((D.Y(messageDigest.digest(str3.getBytes(charset))) + ":" + str + ":" + D.Y(messageDigest.digest((h10 + ":" + uri).getBytes(charset)))).getBytes(charset)));
            String str4 = (String) this.f21225e;
            if (str4.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", uVar.f9316b, str2, str, uri, Y2);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", uVar.f9316b, str2, str, uri, Y2, str4);
        } catch (NoSuchAlgorithmException e2) {
            throw new C1586o0(null, e2, false, 4);
        }
    }

    public int g() {
        int i7;
        synchronized (this.f21225e) {
            i7 = this.f21222b;
        }
        return i7;
    }

    public String toString() {
        switch (this.f21221a) {
            case 2:
                C1112g[] c1112gArr = (C1112g[]) this.f21224d;
                C1112g c1112g = c1112gArr[0];
                int i7 = this.f21222b;
                if (c1112g == null) {
                    c1112g = c1112gArr[i7 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i10 = 0; i10 < ((r0[]) c1112g.f16841c).length; i10++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i10));
                        for (int i11 = 0; i11 < i7 + 2; i11++) {
                            C1112g c1112g2 = c1112gArr[i11];
                            if (c1112g2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                r0 r0Var = ((r0[]) c1112g2.f16841c)[i10];
                                if (r0Var == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(r0Var.f4797f), Integer.valueOf(r0Var.f4796e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } finally {
                    }
                }
                String formatter2 = formatter.toString();
                formatter.close();
                return formatter2;
            default:
                return super.toString();
        }
    }
}
