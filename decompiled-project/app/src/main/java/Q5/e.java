package Q5;

import A9.AbstractC0113m2;
import A9.C0131r1;
import V0.m;
import a1.AbstractC0707h;
import a1.C0703d;
import a1.C0706g;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.Spanned;
import android.text.TextUtils;
import android.transition.TransitionValues;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import androidx.leanback.transition.FadeAndShortSlide;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.p002firebaseauthapi.zzahq;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.kt.apps.media.xemtv.beta.R;
import h3.C1242d;
import h3.o;
import ia.C1358d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.l;
import n5.AbstractC1705a;
import n7.q;
import n7.v;
import n7.y;
import o.F0;
import r3.C1921e;
import u.C2046I;
import u.C2047J;
import u.Q;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f8662a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f8663b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f8664c = -1;

    public static final int A(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(A3.c.f(i7, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int B(int i7) {
        if (i7 == 0) {
            return 1;
        }
        int i10 = 2;
        if (i7 != 1) {
            if (i7 == 2) {
                return 3;
            }
            i10 = 4;
            if (i7 != 3) {
                if (i7 == 4) {
                    return 5;
                }
                if (i7 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(A3.c.f(i7, "Could not convert ", " to State"));
            }
        }
        return i10;
    }

    public static boolean C(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final boolean L(C2046I c2046i, Object obj, Object obj2) {
        Object g = c2046i.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof C2047J)) {
            if (!g.equals(obj2)) {
                return false;
            }
            c2046i.j(obj);
            return true;
        }
        C2047J c2047j = (C2047J) g;
        boolean l10 = c2047j.l(obj2);
        if (l10 && c2047j.g()) {
            c2046i.j(obj);
        }
        return l10;
    }

    public static final void M(C2046I c2046i, Object obj) {
        boolean z8;
        long[] jArr = c2046i.f24603a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i7 << 3) + i11;
                        Object obj2 = c2046i.f24604b[i12];
                        Object obj3 = c2046i.f24605c[i12];
                        if (obj3 instanceof C2047J) {
                            l.c(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            C2047J c2047j = (C2047J) obj3;
                            c2047j.l(obj);
                            z8 = c2047j.g();
                        } else {
                            z8 = obj3 == obj;
                        }
                        if (z8) {
                            c2046i.k(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public static TypedValue N(Context context, int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean O(Context context, int i7, boolean z8) {
        TypedValue N10 = N(context, i7);
        return (N10 == null || N10.type != 18) ? z8 : N10.data != 0;
    }

    public static TypedValue P(int i7, Context context, String str) {
        TypedValue N10 = N(context, i7);
        if (N10 != null) {
            return N10;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }

    public static void Q(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i7 = 0; i7 < length; i7++) {
                            if (charSequence.charAt(i7) == text.charAt(i7)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static final int R(int i7) {
        o.t(i7, "state");
        int b2 = P.c.b(i7);
        if (b2 == 0) {
            return 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            return 2;
        }
        if (b2 == 3) {
            return 3;
        }
        if (b2 == 4) {
            return 4;
        }
        if (b2 == 5) {
            return 5;
        }
        throw new Db.d(1);
    }

    public static final C1921e S(byte[] bytes) {
        l.e(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new C1921e(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i7 = 0; i7 < readInt; i7++) {
                    iArr[i7] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i10 = 0; i10 < readInt2; i10++) {
                    iArr2[i10] = objectInputStream.readInt();
                }
                C1921e c10 = r3.f.c(iArr2, iArr);
                tc.b.o(objectInputStream, null);
                tc.b.o(byteArrayInputStream, null);
                return c10;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tc.b.o(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader T() {
        ClassLoader classLoader;
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        F3.a aVar;
        synchronized (e.class) {
            if (f8662a == null) {
                Thread thread2 = f8663b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i7 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i10];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i7 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i7];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i7++;
                                    }
                                    if (thread == null) {
                                        try {
                                            aVar = new F3.a(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e10) {
                                            e2 = e10;
                                        }
                                        try {
                                            aVar.setContextClassLoader(null);
                                            aVar.start();
                                            thread = aVar;
                                        } catch (SecurityException e11) {
                                            e2 = e11;
                                            thread = aVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e2.getMessage());
                                            thread2 = thread;
                                            f8663b = thread2;
                                        }
                                    }
                                } catch (SecurityException e12) {
                                    e2 = e12;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    f8663b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f8663b.getContextClassLoader();
                    } catch (SecurityException e13) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e13.getMessage());
                    }
                }
                f8662a = classLoader2;
            }
            classLoader = f8662a;
        }
        return classLoader;
    }

    public static ArrayList U(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q V7 = V((zzahq) it.next());
            if (V7 != null) {
                arrayList.add(V7);
            }
        }
        return arrayList;
    }

    public static q V(zzahq zzahqVar) {
        if (zzahqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahqVar.zze())) {
            String zzd = zzahqVar.zzd();
            String zzc = zzahqVar.zzc();
            long zza = zzahqVar.zza();
            String zze = zzahqVar.zze();
            G.d(zze);
            return new v(zza, zzd, zzc, zze);
        }
        if (zzahqVar.zzb() == null) {
            return null;
        }
        String zzd2 = zzahqVar.zzd();
        String zzc2 = zzahqVar.zzc();
        long zza2 = zzahqVar.zza();
        zzair zzb = zzahqVar.zzb();
        G.h(zzb, "totpInfo cannot be null.");
        return new y(zzd2, zzc2, zza2, zzb);
    }

    public static ec.d a(int i7, int i10, int i11) {
        ec.d oVar;
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if (i7 != -2) {
            if (i7 == -1) {
                if (i10 == 1) {
                    return new ec.o(1, 2);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i7 != 0) {
                return i7 != Integer.MAX_VALUE ? i10 == 1 ? new ec.d(i7) : new ec.o(i7, i10) : new ec.d(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            }
            oVar = i10 == 1 ? new ec.d(0) : new ec.o(1, i10);
        } else if (i10 == 1) {
            ec.h.f16890r.getClass();
            oVar = new ec.d(ec.g.f16889b);
        } else {
            oVar = new ec.o(1, i10);
        }
        return oVar;
    }

    public static final V0.e b(Context context) {
        float f4 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        W0.a a9 = W0.b.a(f4);
        if (a9 == null) {
            a9 = new m(f4);
        }
        return new V0.e(f10, f4, a9);
    }

    public static final void c(C2046I c2046i, Object obj, Object obj2) {
        int f4 = c2046i.f(obj);
        boolean z8 = f4 < 0;
        Object obj3 = z8 ? null : c2046i.f24605c[f4];
        if (obj3 != null) {
            if (obj3 instanceof C2047J) {
                ((C2047J) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C2047J c2047j = new C2047J();
                c2047j.a(obj3);
                c2047j.a(obj2);
                obj2 = c2047j;
            }
            obj2 = obj3;
        }
        if (!z8) {
            c2046i.f24605c[f4] = obj2;
            return;
        }
        int i7 = ~f4;
        c2046i.f24604b[i7] = obj;
        c2046i.f24605c[i7] = obj2;
    }

    public static String d(int i7, int i10, String str) {
        if (i7 < 0) {
            return Tb.a.w("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return Tb.a.w("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.l(i10, "negative size: "));
    }

    public static final LinkedHashSet e(byte[] bytes) {
        ObjectInputStream objectInputStream;
        l.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    tc.b.o(byteArrayInputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i7 = 0; i7 < readInt; i7++) {
                Uri uri = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                l.d(uri, "uri");
                linkedHashSet.add(new C1242d(readBoolean, uri));
            }
            tc.b.o(objectInputStream, null);
            tc.b.o(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                tc.b.o(objectInputStream, th3);
                throw th4;
            }
        }
    }

    public static final int i(float f4) {
        return Math.round((float) Math.ceil(f4));
    }

    public static void j(long j, String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(Tb.a.w(str, Long.valueOf(j)));
        }
    }

    public static void k(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(int i7, int i10) {
        String w10;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                w10 = Tb.a.w("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(o.l(i10, "negative size: "));
                }
                w10 = Tb.a.w("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(w10);
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(d(i7, i10, "index"));
        }
    }

    public static void o(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? d(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? d(i10, i11, "end index") : Tb.a.w("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static void p(String str, boolean z8) {
        if (!z8) {
            throw new IllegalStateException(str);
        }
    }

    public static C2046I q() {
        long[] jArr = Q.f24633a;
        return new C2046I();
    }

    public static ObjectAnimator s(View view, TransitionValues transitionValues, int i7, int i10, float f4, float f10, float f11, float f12, DecelerateInterpolator decelerateInterpolator, FadeAndShortSlide fadeAndShortSlide) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(R.id.transitionPosition)) != null) {
            f4 = (r2[0] - i7) + translationX;
            f10 = (r2[1] - i10) + translationY;
        }
        int round = Math.round(f4 - translationX) + i7;
        int round2 = Math.round(f10 - translationY) + i10;
        view.setTranslationX(f4);
        view.setTranslationY(f10);
        if (f4 == f11 && f10 == f12) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f4, f10);
        path.lineTo(f11, f12);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        androidx.leanback.transition.h hVar = new androidx.leanback.transition.h(view, transitionValues.view, round, round2, translationX, translationY);
        fadeAndShortSlide.addListener(hVar);
        ofFloat.addListener(hVar);
        ofFloat.addPauseListener(hVar);
        ofFloat.setInterpolator(decelerateInterpolator);
        return ofFloat;
    }

    public static final Object v(Context context, Class cls) {
        Application application;
        l.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context context2 = applicationContext;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    application = (Application) context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
        }
        application = (Application) applicationContext;
        return c2.i.p(cls, application);
    }

    public static Drawable x(Context context, int i7) {
        return F0.b().c(context, i7);
    }

    public static final int y(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(A3.c.f(i7, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int z(int i7) {
        if (i7 == 0) {
            return 1;
        }
        int i10 = 2;
        if (i7 != 1) {
            if (i7 == 2) {
                return 3;
            }
            i10 = 4;
            if (i7 != 3) {
                if (i7 == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i7 != 5) {
                    throw new IllegalArgumentException(A3.c.f(i7, "Could not convert ", " to NetworkType"));
                }
                return 6;
            }
        }
        return i10;
    }

    public void D(AbstractC0113m2 abstractC0113m2, int i7) {
    }

    public void E(C0131r1 c0131r1) {
    }

    public void F(C0131r1 c0131r1) {
    }

    public abstract void G(C0131r1 c0131r1);

    public void H(C0131r1 c0131r1) {
    }

    public void I(C0131r1 c0131r1) {
    }

    public abstract void J(C0706g c0706g, C0706g c0706g2);

    public abstract void K(C0706g c0706g, Thread thread);

    public abstract boolean f(AbstractC0707h abstractC0707h, C0703d c0703d, C0703d c0703d2);

    public abstract boolean g(AbstractC0707h abstractC0707h, Object obj, Object obj2);

    public abstract boolean h(AbstractC0707h abstractC0707h, C0706g c0706g, C0706g c0706g2);

    public abstract boolean r(C1358d c1358d);

    public F4.c t(F4.e eVar) {
        ByteBuffer byteBuffer = eVar.f23458d;
        byteBuffer.getClass();
        AbstractC1705a.h(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.i(Integer.MIN_VALUE)) {
            return null;
        }
        return u(eVar, byteBuffer);
    }

    public abstract F4.c u(F4.e eVar, ByteBuffer byteBuffer);

    public abstract Object w(C1358d c1358d);
}
