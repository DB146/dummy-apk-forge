package w3;

import I2.C0330t;
import L7.q;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o7.o;

/* renamed from: w3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2210c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f25761a;

    /* renamed from: b, reason: collision with root package name */
    public final File f25762b;

    /* renamed from: c, reason: collision with root package name */
    public final File f25763c;

    /* renamed from: d, reason: collision with root package name */
    public final File f25764d;

    /* renamed from: f, reason: collision with root package name */
    public final long f25766f;

    /* renamed from: w, reason: collision with root package name */
    public BufferedWriter f25769w;

    /* renamed from: y, reason: collision with root package name */
    public int f25771y;

    /* renamed from: v, reason: collision with root package name */
    public long f25768v = 0;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f25770x = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: z, reason: collision with root package name */
    public long f25772z = 0;

    /* renamed from: A, reason: collision with root package name */
    public final ThreadPoolExecutor f25759A = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());

    /* renamed from: B, reason: collision with root package name */
    public final q f25760B = new q(this, 5);

    /* renamed from: e, reason: collision with root package name */
    public final int f25765e = 1;

    /* renamed from: u, reason: collision with root package name */
    public final int f25767u = 1;

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public C2210c(File file, long j) {
        this.f25761a = file;
        this.f25762b = new File(file, "journal");
        this.f25763c = new File(file, "journal.tmp");
        this.f25764d = new File(file, "journal.bkp");
        this.f25766f = j;
    }

    public static void F(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void P(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C2210c V(File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                a0(file2, file3, false);
            }
        }
        C2210c c2210c = new C2210c(file, j);
        if (c2210c.f25762b.exists()) {
            try {
                c2210c.X();
                c2210c.W();
                return c2210c;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                c2210c.close();
                AbstractC2213f.a(c2210c.f25761a);
            }
        }
        file.mkdirs();
        C2210c c2210c2 = new C2210c(file, j);
        c2210c2.Z();
        return c2210c2;
    }

    public static void a0(File file, File file2, boolean z8) {
        if (z8) {
            F(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void l(C2210c c2210c, C0330t c0330t, boolean z8) {
        synchronized (c2210c) {
            C2209b c2209b = (C2209b) c0330t.f5200b;
            if (c2209b.f25758f != c0330t) {
                throw new IllegalStateException();
            }
            if (z8 && !c2209b.f25757e) {
                for (int i7 = 0; i7 < c2210c.f25767u; i7++) {
                    if (!((boolean[]) c0330t.f5202d)[i7]) {
                        c0330t.b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i7);
                    }
                    if (!c2209b.f25756d[i7].exists()) {
                        c0330t.b();
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < c2210c.f25767u; i10++) {
                File file = c2209b.f25756d[i10];
                if (!z8) {
                    F(file);
                } else if (file.exists()) {
                    File file2 = c2209b.f25755c[i10];
                    file.renameTo(file2);
                    long j = c2209b.f25754b[i10];
                    long length = file2.length();
                    c2209b.f25754b[i10] = length;
                    c2210c.f25768v = (c2210c.f25768v - j) + length;
                }
            }
            c2210c.f25771y++;
            c2209b.f25758f = null;
            if (c2209b.f25757e || z8) {
                c2209b.f25757e = true;
                c2210c.f25769w.append((CharSequence) "CLEAN");
                c2210c.f25769w.append(' ');
                c2210c.f25769w.append((CharSequence) c2209b.f25753a);
                c2210c.f25769w.append((CharSequence) c2209b.a());
                c2210c.f25769w.append('\n');
                if (z8) {
                    c2210c.f25772z++;
                }
            } else {
                c2210c.f25770x.remove(c2209b.f25753a);
                c2210c.f25769w.append((CharSequence) "REMOVE");
                c2210c.f25769w.append(' ');
                c2210c.f25769w.append((CharSequence) c2209b.f25753a);
                c2210c.f25769w.append('\n');
            }
            P(c2210c.f25769w);
            if (c2210c.f25768v > c2210c.f25766f || c2210c.U()) {
                c2210c.f25759A.submit(c2210c.f25760B);
            }
        }
    }

    public static void n(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final C0330t K(String str) {
        synchronized (this) {
            try {
                if (this.f25769w == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C2209b c2209b = (C2209b) this.f25770x.get(str);
                if (c2209b == null) {
                    c2209b = new C2209b(this, str);
                    this.f25770x.put(str, c2209b);
                } else if (c2209b.f25758f != null) {
                    return null;
                }
                C0330t c0330t = new C0330t(this, c2209b);
                c2209b.f25758f = c0330t;
                this.f25769w.append((CharSequence) "DIRTY");
                this.f25769w.append(' ');
                this.f25769w.append((CharSequence) str);
                this.f25769w.append('\n');
                P(this.f25769w);
                return c0330t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized o T(String str) {
        if (this.f25769w == null) {
            throw new IllegalStateException("cache is closed");
        }
        C2209b c2209b = (C2209b) this.f25770x.get(str);
        if (c2209b == null) {
            return null;
        }
        if (!c2209b.f25757e) {
            return null;
        }
        for (File file : c2209b.f25755c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f25771y++;
        this.f25769w.append((CharSequence) "READ");
        this.f25769w.append(' ');
        this.f25769w.append((CharSequence) str);
        this.f25769w.append('\n');
        if (U()) {
            this.f25759A.submit(this.f25760B);
        }
        return new o(c2209b.f25755c, 11);
    }

    public final boolean U() {
        int i7 = this.f25771y;
        return i7 >= 2000 && i7 >= this.f25770x.size();
    }

    public final void W() {
        F(this.f25763c);
        Iterator it = this.f25770x.values().iterator();
        while (it.hasNext()) {
            C2209b c2209b = (C2209b) it.next();
            C0330t c0330t = c2209b.f25758f;
            int i7 = this.f25767u;
            int i10 = 0;
            if (c0330t == null) {
                while (i10 < i7) {
                    this.f25768v += c2209b.f25754b[i10];
                    i10++;
                }
            } else {
                c2209b.f25758f = null;
                while (i10 < i7) {
                    F(c2209b.f25755c[i10]);
                    F(c2209b.f25756d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void X() {
        File file = this.f25762b;
        C2212e c2212e = new C2212e(new FileInputStream(file), AbstractC2213f.f25779a);
        try {
            String l10 = c2212e.l();
            String l11 = c2212e.l();
            String l12 = c2212e.l();
            String l13 = c2212e.l();
            String l14 = c2212e.l();
            if (!"libcore.io.DiskLruCache".equals(l10) || !"1".equals(l11) || !Integer.toString(this.f25765e).equals(l12) || !Integer.toString(this.f25767u).equals(l13) || !"".equals(l14)) {
                throw new IOException("unexpected journal header: [" + l10 + ", " + l11 + ", " + l13 + ", " + l14 + "]");
            }
            int i7 = 0;
            while (true) {
                try {
                    Y(c2212e.l());
                    i7++;
                } catch (EOFException unused) {
                    this.f25771y = i7 - this.f25770x.size();
                    if (c2212e.f25778e == -1) {
                        Z();
                    } else {
                        this.f25769w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC2213f.f25779a));
                    }
                    try {
                        c2212e.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c2212e.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void Y(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i7 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i7);
        LinkedHashMap linkedHashMap = this.f25770x;
        if (indexOf2 == -1) {
            substring = str.substring(i7);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i7, indexOf2);
        }
        C2209b c2209b = (C2209b) linkedHashMap.get(substring);
        if (c2209b == null) {
            c2209b = new C2209b(this, substring);
            linkedHashMap.put(substring, c2209b);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c2209b.f25758f = new C0330t(this, c2209b);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        c2209b.f25757e = true;
        c2209b.f25758f = null;
        if (split.length != c2209b.g.f25767u) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                c2209b.f25754b[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    public final synchronized void Z() {
        try {
            BufferedWriter bufferedWriter = this.f25769w;
            if (bufferedWriter != null) {
                n(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25763c), AbstractC2213f.f25779a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f25765e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f25767u));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C2209b c2209b : this.f25770x.values()) {
                    if (c2209b.f25758f != null) {
                        bufferedWriter2.write("DIRTY " + c2209b.f25753a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c2209b.f25753a + c2209b.a() + '\n');
                    }
                }
                n(bufferedWriter2);
                if (this.f25762b.exists()) {
                    a0(this.f25762b, this.f25764d, true);
                }
                a0(this.f25763c, this.f25762b, false);
                this.f25764d.delete();
                this.f25769w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25762b, true), AbstractC2213f.f25779a));
            } catch (Throwable th) {
                n(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b0() {
        while (this.f25768v > this.f25766f) {
            String str = (String) ((Map.Entry) this.f25770x.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f25769w == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C2209b c2209b = (C2209b) this.f25770x.get(str);
                    if (c2209b != null && c2209b.f25758f == null) {
                        for (int i7 = 0; i7 < this.f25767u; i7++) {
                            File file = c2209b.f25755c[i7];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f25768v;
                            long[] jArr = c2209b.f25754b;
                            this.f25768v = j - jArr[i7];
                            jArr[i7] = 0;
                        }
                        this.f25771y++;
                        this.f25769w.append((CharSequence) "REMOVE");
                        this.f25769w.append(' ');
                        this.f25769w.append((CharSequence) str);
                        this.f25769w.append('\n');
                        this.f25770x.remove(str);
                        if (U()) {
                            this.f25759A.submit(this.f25760B);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f25769w == null) {
                return;
            }
            Iterator it = new ArrayList(this.f25770x.values()).iterator();
            while (it.hasNext()) {
                C0330t c0330t = ((C2209b) it.next()).f25758f;
                if (c0330t != null) {
                    c0330t.b();
                }
            }
            b0();
            n(this.f25769w);
            this.f25769w = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
