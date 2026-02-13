package B7;

import C3.n;
import D5.i;
import F3.e;
import I2.C0330t;
import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import ea.C1108c;
import h3.C1240b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;
import q3.p;
import v7.g;
import x7.h;
import y7.C2416a0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f2210a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2211b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2212c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2213d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2214e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2215f;
    public final Object g;

    public d(e eVar, e eVar2, e eVar3, e eVar4, n nVar, n nVar2) {
        this.g = X3.d.a(150, new i(this, 5));
        this.f2210a = eVar;
        this.f2211b = eVar2;
        this.f2212c = eVar3;
        this.f2213d = eVar4;
        this.f2214e = nVar;
        this.f2215f = nVar2;
    }

    public d(Context context) {
        String str;
        String str2 = ((C2416a0) s7.c.f24188b.e(context)).f27225a;
        this.f2210a = str2;
        File filesDir = context.getFilesDir();
        this.f2211b = filesDir;
        if (str2.isEmpty()) {
            str = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            sb2.append(str2.length() > 40 ? g.h(str2) : str2.replaceAll("[^a-zA-Z0-9.]", "_"));
            str = sb2.toString();
        }
        File file = new File(filesDir, str);
        c(file);
        this.f2212c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f2213d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f2214e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f2215f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.g = file5;
    }

    public d(Context context, C1240b c1240b, q3.i iVar, i3.d dVar, WorkDatabase workDatabase, p pVar, ArrayList arrayList) {
        l.e(context, "context");
        this.f2210a = c1240b;
        this.f2211b = iVar;
        this.f2212c = dVar;
        this.f2213d = workDatabase;
        this.f2214e = pVar;
        this.f2215f = arrayList;
        Context applicationContext = context.getApplicationContext();
        l.d(applicationContext, "context.applicationContext");
        this.g = applicationContext;
        new C1108c(3);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [U7.a, java.lang.Object] */
    public d(String str, d dVar, w7.d dVar2) {
        this.f2213d = new C0330t(this, false);
        this.f2214e = new C0330t(this, true);
        ?? obj = new Object();
        obj.f9819a = new ArrayList();
        obj.f9820b = 128;
        this.f2215f = obj;
        this.g = new AtomicMarkableReference(null, false);
        this.f2210a = str;
        this.f2211b = new h(dVar);
        this.f2212c = dVar2;
    }

    public static synchronized void c(File file) {
        synchronized (d.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.f2211b, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f2213d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void f(String str) {
        C0330t c0330t = (C0330t) this.f2214e;
        synchronized (c0330t) {
            try {
                if (((x7.e) ((AtomicMarkableReference) c0330t.f5200b).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c0330t.f5200b;
                    atomicMarkableReference.set((x7.e) atomicMarkableReference.getReference(), true);
                    k1.a aVar = new k1.a(c0330t, 14);
                    AtomicReference atomicReference = (AtomicReference) c0330t.f5201c;
                    while (!atomicReference.compareAndSet(null, aVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((w7.d) ((d) c0330t.f5202d).f2212c).f25820b.a(aVar);
                }
            } finally {
            }
        }
    }
}
