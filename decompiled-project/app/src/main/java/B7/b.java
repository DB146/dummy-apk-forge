package B7;

import A0.B;
import A9.C0154x0;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import v7.i;
import y.S;
import y7.K0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f2201e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f2202f = 15;
    public static final z7.a g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final B f2203h = new B(1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f2204i = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2205a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final d f2206b;

    /* renamed from: c, reason: collision with root package name */
    public final D7.d f2207c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2208d;

    public b(d dVar, D7.d dVar2, i iVar) {
        this.f2206b = dVar;
        this.f2207c = dVar2;
        this.f2208d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f2201e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f2201e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.f2206b;
        arrayList.addAll(d.e(((File) dVar.f2215f).listFiles()));
        arrayList.addAll(d.e(((File) dVar.g).listFiles()));
        B b2 = f2203h;
        Collections.sort(arrayList, b2);
        List e2 = d.e(((File) dVar.f2214e).listFiles());
        Collections.sort(e2, b2);
        arrayList.addAll(e2);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(d.e(((File) this.f2206b.f2213d).list())).descendingSet();
    }

    public final void d(K0 k02, String str, boolean z8) {
        d dVar = this.f2206b;
        C0154x0 c0154x0 = this.f2207c.b().f3261a;
        g.getClass();
        try {
            f(dVar.b(str, S.b("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f2205a.getAndIncrement())), z8 ? "_" : "")), z7.a.f28333a.u(k02));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        a aVar = new a(1);
        dVar.getClass();
        File file = new File((File) dVar.f2213d, str);
        file.mkdirs();
        List<File> e10 = d.e(file.listFiles(aVar));
        Collections.sort(e10, new B(2));
        int size = e10.size();
        for (File file2 : e10) {
            if (size <= c0154x0.f1468a) {
                return;
            }
            d.d(file2);
            size--;
        }
    }
}
