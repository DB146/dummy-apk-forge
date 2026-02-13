package o;

import A0.C0018g0;
import I2.C0330t;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.kt.apps.media.xemtv.beta.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import o.Y0;
import r7.C1947c;
import y7.C2409A;
import y7.C2410B;
import y7.C2414F;
import y7.C2416a0;
import y7.C2422d0;
import y7.C2428g0;
import y7.C2430h0;

/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21463a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21464b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21465c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21466d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f21467e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21468f;
    public final Object g;

    public Y0(A7.a aVar, F8.a aVar2, F8.a aVar3, O7.b bVar, String str, String str2, String str3) {
        this.f21466d = aVar;
        this.f21464b = aVar2;
        this.f21465c = aVar3;
        this.f21463a = bVar;
        this.f21467e = str;
        this.f21468f = str2;
        this.g = str3;
    }

    public Y0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f21466d = layoutParams;
        this.f21467e = new Rect();
        this.f21468f = new int[2];
        this.g = new int[2];
        this.f21463a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f21464b = inflate;
        this.f21465c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(Y0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public Y0(v7.q qVar, B7.b bVar, C7.a aVar, x7.f fVar, B7.d dVar, v7.v vVar, w7.d dVar2) {
        this.f21463a = qVar;
        this.f21464b = bVar;
        this.f21465c = aVar;
        this.f21466d = fVar;
        this.f21467e = dVar;
        this.f21468f = vVar;
        this.g = dVar2;
    }

    public static y7.P a(y7.P p10, x7.f fVar, B7.d dVar, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        y7.O a9 = p10.a();
        String c10 = ((x7.d) fVar.f26254b).c();
        if (c10 != null) {
            a9.f27170e = new C2422d0(c10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        C0330t c0330t = (C0330t) dVar.f2213d;
        if (isEmpty) {
            x7.e eVar = (x7.e) ((AtomicMarkableReference) c0330t.f5200b).getReference();
            synchronized (eVar) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(eVar.f26249a));
            }
        } else {
            x7.e eVar2 = (x7.e) ((AtomicMarkableReference) c0330t.f5200b).getReference();
            synchronized (eVar2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.f26249a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String a10 = x7.e.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a10)) {
                    hashMap.put(a10, x7.e.a(1024, (String) entry.getValue()));
                } else {
                    i7++;
                }
            }
            if (i7 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i7 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List e2 = e(unmodifiableMap2);
        x7.e eVar3 = (x7.e) ((AtomicMarkableReference) ((C0330t) dVar.f2214e).f5200b).getReference();
        synchronized (eVar3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(eVar3.f26249a));
        }
        List e10 = e(unmodifiableMap3);
        if (!e2.isEmpty() || !e10.isEmpty()) {
            y7.Q q10 = p10.f27175c;
            a9.f27168c = new y7.Q(q10.f27179a, e2, e10, q10.f27182d, q10.f27183e, q10.f27184f, q10.g);
        }
        return a9.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [y7.e0, java.lang.Object] */
    public static y7.K0 b(y7.P p10, B7.d dVar) {
        List c10 = ((U7.a) dVar.f2215f).c();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c10.size(); i7++) {
            x7.n nVar = (x7.n) c10.get(i7);
            nVar.getClass();
            ?? obj = new Object();
            x7.b bVar = (x7.b) nVar;
            String str = bVar.f26244e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f26241b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            obj.f27266a = new C2428g0(str2, str);
            String str3 = bVar.f26242c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            obj.f27267b = str3;
            String str4 = bVar.f26243d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            obj.f27268c = str4;
            obj.f27269d = bVar.f26245f;
            obj.f27270e = (byte) (obj.f27270e | 1);
            arrayList.add(obj.a());
        }
        if (arrayList.isEmpty()) {
            return p10;
        }
        y7.O a9 = p10.a();
        a9.f27171f = new C2430h0(arrayList);
        return a9.a();
    }

    public static String c(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Y0 d(Context context, v7.v vVar, B7.d dVar, C0018g0 c0018g0, x7.f fVar, B7.d dVar2, q3.c cVar, D7.d dVar3, ha.g gVar, v7.i iVar, w7.d dVar4) {
        v7.q qVar = new v7.q(context, vVar, c0018g0, cVar, dVar3);
        B7.b bVar = new B7.b(dVar, dVar3, iVar);
        z7.a aVar = C7.a.f3038b;
        b4.p.b(context);
        return new Y0(qVar, bVar, new C7.a(new C7.d(b4.p.a().c(new Z3.a(C7.a.f3039c, C7.a.f3040d)).a("FIREBASE_CRASHLYTICS_REPORT", new Y3.c("json"), C7.a.f3041e), dVar3.b(), gVar)), fVar, dVar2, vVar, dVar4);
    }

    public static List e(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C2414F(str, str2));
        }
        Collections.sort(arrayList, new A0.B(25));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [y7.O, java.lang.Object] */
    public void f(Throwable th, Thread thread, String str, final x7.c cVar, boolean z8) {
        q3.c cVar2;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        q3.c cVar3;
        final boolean equals = str.equals("crash");
        v7.q qVar = (v7.q) this.f21463a;
        Context context = qVar.f25163a;
        int i7 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        q3.n nVar = null;
        while (true) {
            boolean isEmpty = stack.isEmpty();
            cVar2 = qVar.f25166d;
            if (isEmpty) {
                break;
            }
            Throwable th3 = (Throwable) stack.pop();
            nVar = new q3.n(2, th3.getLocalizedMessage(), th3.getClass().getName(), cVar2.f(th3.getStackTrace()), nVar);
        }
        ?? obj = new Object();
        obj.f27167b = str;
        obj.f27166a = cVar.f26247b;
        obj.g = (byte) (obj.g | 1);
        y7.D0 e2 = s7.c.f24188b.e(context);
        int i10 = ((C2416a0) e2).f27227c;
        Boolean valueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList d10 = s7.c.d(context);
        byte b2 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) nVar.f23398d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b10 = (byte) 1;
        List d11 = v7.q.d(stackTraceElementArr, 4);
        if (d11 == null) {
            throw new NullPointerException("Null frames");
        }
        if (b10 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b10 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
        }
        arrayList.add(new y7.W(name, 4, d11));
        if (z8) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    cVar3 = cVar2;
                } else {
                    StackTraceElement[] f4 = cVar2.f(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d12 = v7.q.d(f4, 0);
                    if (d12 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b10 != 1) {
                        StringBuilder sb3 = new StringBuilder();
                        if (b10 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(h3.o.o("Missing required properties:", sb3));
                    }
                    cVar3 = cVar2;
                    arrayList.add(new y7.W(name2, 0, d12));
                }
                it2 = it;
                cVar2 = cVar3;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        y7.U c10 = v7.q.c(nVar, 0);
        y7.V e10 = v7.q.e();
        List a9 = qVar.a();
        if (a9 == null) {
            throw new NullPointerException("Null binaries");
        }
        y7.S s3 = new y7.S(unmodifiableList, c10, null, e10, a9);
        if (b2 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b2 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(h3.o.o("Missing required properties:", sb4));
        }
        obj.f27168c = new y7.Q(s3, null, null, valueOf, e2, d10, i7);
        obj.f27169d = qVar.b(i7);
        y7.P a10 = obj.a();
        x7.f fVar = (x7.f) this.f21466d;
        B7.d dVar = (B7.d) this.f21467e;
        final y7.K0 b11 = b(a(a10, fVar, dVar, cVar.f26248c), dVar);
        if (z8) {
            ((B7.b) this.f21464b).d(b11, cVar.f26246a, equals);
        } else {
            ((w7.d) this.g).f25820b.a(new Runnable() { // from class: v7.x
                @Override // java.lang.Runnable
                public final void run() {
                    Y0 y02 = Y0.this;
                    y02.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    ((B7.b) y02.f21464b).d(b11, cVar.f26246a, equals);
                }
            });
        }
    }

    public Task g(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        ArrayList b2 = ((B7.b) this.f21464b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                z7.a aVar = B7.b.g;
                String e2 = B7.b.e(file);
                aVar.getClass();
                arrayList.add(new v7.a(z7.a.i(e2), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            v7.a aVar2 = (v7.a) it2.next();
            if (str == null || str.equals(aVar2.f25097b)) {
                C7.a aVar3 = (C7.a) this.f21465c;
                C2410B c2410b = aVar2.f25096a;
                boolean z8 = true;
                if (c2410b.f27095f == null || c2410b.g == null) {
                    v7.u b10 = ((v7.v) this.f21468f).b(true);
                    C2409A a9 = aVar2.f25096a.a();
                    a9.f27085e = b10.f25176a;
                    C2409A a10 = a9.a().a();
                    a10.f27086f = b10.f25177b;
                    aVar2 = new v7.a(a10.a(), aVar2.f25097b, aVar2.f25098c);
                }
                boolean z10 = str != null;
                C7.d dVar = aVar3.f3042a;
                synchronized (dVar.f3056f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) dVar.f3058i.f17915b).getAndIncrement();
                            if (dVar.f3056f.size() >= dVar.f3055e) {
                                z8 = false;
                            }
                            if (z8) {
                                s7.c cVar = s7.c.f24187a;
                                cVar.c("Enqueueing report: " + aVar2.f25097b);
                                cVar.c("Queue size: " + dVar.f3056f.size());
                                dVar.g.execute(new C7.c(dVar, aVar2, taskCompletionSource, 0));
                                cVar.c("Closing task for report: " + aVar2.f25097b);
                                taskCompletionSource.trySetResult(aVar2);
                            } else {
                                dVar.a();
                                String str2 = "Dropping report due to queue being full: " + aVar2.f25097b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) dVar.f3058i.f17916c).getAndIncrement();
                                taskCompletionSource.trySetResult(aVar2);
                            }
                        } else {
                            dVar.b(aVar2, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new C1947c(this, 8)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
