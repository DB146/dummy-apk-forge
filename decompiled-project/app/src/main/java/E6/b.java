package E6;

import A0.G0;
import Db.q;
import J3.x;
import K0.E;
import W1.C;
import W1.h0;
import android.content.Context;
import android.hardware.Camera;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.work.WorkerParameters;
import c.AbstractActivityC0867k;
import cc.AbstractC0920a;
import cc.J;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import db.C1069b;
import gb.k;
import gb.l;
import h3.y;
import h3.z;
import hb.InterfaceC1269b;
import hc.AbstractC1273a;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import jb.InterfaceC1396g;
import l2.Y;
import l2.a0;
import m5.C1619p;
import n5.D;
import oa.C1827b;
import oa.C1830e;
import q6.C1896a;
import sb.RunnableC2004C;
import y1.AbstractC2352B;
import y1.K;
import y6.C2400f;
import y6.C2401g;
import y7.u0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static f f3719a;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f3720b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f3721c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f3722d;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f3723e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3724f;

    public static void A(View view, C2401g c2401g) {
        C1896a c1896a = c2401g.f27035a.f27012b;
        if (c1896a == null || !c1896a.f23509a) {
            return;
        }
        float f4 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = K.f26642a;
            f4 += AbstractC2352B.e((View) parent);
        }
        C2400f c2400f = c2401g.f27035a;
        if (c2400f.f27019l != f4) {
            c2400f.f27019l = f4;
            c2401g.n();
        }
    }

    public static void B(Rb.e eVar, AbstractC0920a abstractC0920a, AbstractC0920a abstractC0920a2) {
        try {
            AbstractC1273a.h(com.bumptech.glide.c.F(com.bumptech.glide.c.m(abstractC0920a, abstractC0920a2, eVar)), q.f3365a);
        } catch (Throwable th) {
            abstractC0920a2.resumeWith(com.bumptech.glide.c.n(th));
            throw th;
        }
    }

    public static G0 C(Object obj) {
        return new G0(obj.getClass().getSimpleName(), 24);
    }

    public static boolean D(k kVar, l lVar, InterfaceC1394e interfaceC1394e) {
        InterfaceC1269b interfaceC1269b = kb.c.f19072a;
        if (!(kVar instanceof InterfaceC1396g)) {
            return false;
        }
        try {
            Object obj = ((InterfaceC1396g) kVar).get();
            if (obj == null) {
                lVar.c(interfaceC1269b);
                lVar.a();
                return true;
            }
            try {
                Object apply = interfaceC1394e.apply(obj);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                k kVar2 = (k) apply;
                if (kVar2 instanceof InterfaceC1396g) {
                    try {
                        Object obj2 = ((InterfaceC1396g) kVar2).get();
                        if (obj2 == null) {
                            lVar.c(interfaceC1269b);
                            lVar.a();
                            return true;
                        }
                        RunnableC2004C runnableC2004C = new RunnableC2004C(lVar, obj2);
                        lVar.c(runnableC2004C);
                        runnableC2004C.run();
                    } catch (Throwable th) {
                        u0.L(th);
                        lVar.c(interfaceC1269b);
                        lVar.onError(th);
                        return true;
                    }
                } else {
                    kVar2.b(lVar);
                }
                return true;
            } catch (Throwable th2) {
                u0.L(th2);
                lVar.c(interfaceC1269b);
                lVar.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            u0.L(th3);
            lVar.c(interfaceC1269b);
            lVar.onError(th3);
            return true;
        }
    }

    public static final long a(int i7, int i10) {
        if (i7 < 0 || i10 < 0) {
            P0.a.a("start and end cannot be negative. [start: " + i7 + ", end: " + i10 + ']');
        }
        long j = (i10 & 4294967295L) | (i7 << 32);
        int i11 = E.f5852c;
        return j;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i10, 33);
    }

    public static void c(Object obj, O5.b bVar) {
        if (bVar == null) {
            return;
        }
        ((Transition) obj).addListener(new h0(bVar, 1));
    }

    public static a1.l d(J j) {
        return Tb.a.q(new A1.d(j, 6));
    }

    public static void e(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [y7.u0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [y7.u0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [y7.u0, java.lang.Object] */
    public static u0 f(int i7) {
        if (i7 != 0 && i7 == 1) {
            return new Object();
        }
        return new Object();
    }

    public static Scene g(ViewGroup viewGroup, Runnable runnable) {
        Scene scene = new Scene(viewGroup);
        scene.setEnterAction(runnable);
        return scene;
    }

    public static Y h(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.l.b(newInstance);
            return (Y) newInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    public static Object k(Object obj, Serializable serializable) {
        if (obj != null) {
            return obj;
        }
        if (serializable != null) {
            return serializable;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static Hb.g l(Hb.g gVar, Hb.h key) {
        kotlin.jvm.internal.l.e(key, "key");
        if (kotlin.jvm.internal.l.a(gVar.getKey(), key)) {
            return gVar;
        }
        return null;
    }

    public static Za.f m(AbstractActivityC0867k abstractActivityC0867k, a0 a0Var) {
        q3.e a9 = ((C1827b) ((Za.a) c2.i.p(Za.a.class, abstractActivityC0867k))).a();
        a0Var.getClass();
        return new Za.f((C1069b) a9.f23376b, a0Var, (ha.g) a9.f23377c);
    }

    public static int n(int i7) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("E6.b", "No cameras!");
            return -1;
        }
        boolean z8 = i7 >= 0;
        if (!z8) {
            i7 = 0;
            while (i7 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i7, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i7++;
            }
        }
        return i7 < numberOfCameras ? i7 : z8 ? -1 : 0;
    }

    public static void o(R6.a aVar) {
        if (!aVar.isDone()) {
            throw new IllegalStateException(Tb.a.w("Future was expected to be done: %s", aVar));
        }
        boolean z8 = false;
        while (true) {
            try {
                aVar.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public static Za.f p(C c10, a0 a0Var) {
        q3.e a9 = ((C1830e) ((Za.b) c2.i.p(Za.b.class, c10))).f22152b.a();
        a0Var.getClass();
        return new Za.f((C1069b) a9.f23376b, a0Var, (ha.g) a9.f23377c);
    }

    public static C1619p q(int i7) {
        int i10 = D.f21141a;
        Locale locale = Locale.US;
        return new C1619p(Uri.parse("rtp://0.0.0.0:" + i7), 1, null, Collections.emptyMap(), 0L, -1L, null, 0);
    }

    public static int r(ArrayList arrayList, InputStream inputStream, D3.f fVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                int c10 = ((A3.g) arrayList.get(i7)).c(inputStream, fVar);
                if (c10 != -1) {
                    return c10;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType s(ArrayList arrayList, InputStream inputStream, D3.f fVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ImageHeaderParser$ImageType d10 = ((A3.g) arrayList.get(i7)).d(inputStream);
                inputStream.reset();
                if (d10 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return d10;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType t(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ImageHeaderParser$ImageType a9 = ((A3.g) arrayList.get(i7)).a(byteBuffer);
                AtomicReference atomicReference = W3.b.f10596a;
                if (a9 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a9;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = W3.b.f10596a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static Transition u(Context context, int i7) {
        return TransitionInflater.from(context).inflateTransition(i7);
    }

    public static Hb.i v(Hb.g gVar, Hb.h key) {
        kotlin.jvm.internal.l.e(key, "key");
        return kotlin.jvm.internal.l.a(gVar.getKey(), key) ? Hb.j.f4919a : gVar;
    }

    public static Hb.i w(Hb.g gVar, Hb.i context) {
        kotlin.jvm.internal.l.e(context, "context");
        return context == Hb.j.f4919a ? gVar : (Hb.i) context.fold(gVar, new Hb.b(1));
    }

    public static final File x(Context context, String name) {
        kotlin.jvm.internal.l.e(name, "name");
        String fileName = name.concat(".preferences_pb");
        kotlin.jvm.internal.l.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }

    public static void y() {
        if (f3720b == null || f3721c == null || f3722d == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            f3720b = cls.getConstructor(null);
            f3721c = cls.getMethod("setRotationDegrees", Float.TYPE);
            f3722d = cls.getMethod("build", null);
        }
        if (f3723e == null || f3724f == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            f3723e = cls2.getConstructor(null);
            f3724f = cls2.getMethod("build", null);
        }
    }

    public static void z(Object obj, Object obj2) {
        TransitionManager.go((Scene) obj, (Transition) obj2);
    }

    public abstract y i(Context context, String str, WorkerParameters workerParameters);

    public y j(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        kotlin.jvm.internal.l.e(appContext, "appContext");
        kotlin.jvm.internal.l.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.l.e(workerParameters, "workerParameters");
        y i7 = i(appContext, workerClassName, workerParameters);
        if (i7 == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(workerClassName).asSubclass(y.class);
                kotlin.jvm.internal.l.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                    kotlin.jvm.internal.l.d(newInstance, "{\n                val co…Parameters)\n            }");
                    i7 = (y) newInstance;
                } catch (Throwable th) {
                    z.e().d(h3.K.f17667a, "Could not instantiate ".concat(workerClassName), th);
                    throw th;
                }
            } catch (Throwable th2) {
                z.e().d(h3.K.f17667a, "Invalid class: ".concat(workerClassName), th2);
                throw th2;
            }
        }
        if (!i7.f17721d) {
            return i7;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
