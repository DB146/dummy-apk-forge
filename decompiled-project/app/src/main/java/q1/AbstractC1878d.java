package q1;

import A9.B2;
import Aa.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import ea.C1111f;
import i1.C1290a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u.C2066t;
import u.T;
import u1.ExecutorC2092b;

/* renamed from: q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1878d {

    /* renamed from: a, reason: collision with root package name */
    public static final vc.i f23347a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2066t f23348b;

    static {
        Trace.beginSection(vc.i.I("TypefaceCompat static init"));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f23347a = new vc.i();
        } else if (i7 >= 28) {
            f23347a = new C1881g();
        } else if (i7 >= 26) {
            f23347a = new C1881g();
        } else {
            Method method = C1880f.f23353h;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f23347a = new vc.i();
            } else {
                f23347a = new vc.i();
            }
        }
        f23348b = new C2066t(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r6.equals(r11) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, n1.d dVar, Resources resources, int i7, String str, int i10, int i11, n1.b bVar, boolean z8) {
        Typeface j;
        Typeface typeface;
        List unmodifiableList;
        int i12 = 22;
        int i13 = 15;
        int i14 = 1;
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i15 = -3;
        if (dVar instanceof n1.g) {
            n1.g gVar = (n1.g) dVar;
            String str2 = gVar.f21041e;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new j(i12, bVar, typeface));
                }
                return typeface;
            }
            Object[] objArr3 = !z8 ? bVar != null : gVar.f21040d != 0;
            int i16 = z8 ? gVar.f21039c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1290a c1290a = new C1290a(16);
            c1290a.f18187b = bVar;
            v1.c cVar = gVar.f21038b;
            if (cVar != null) {
                Object[] objArr4 = {gVar.f21037a, cVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i17 = 0; i17 < 2; i17++) {
                    Object obj = objArr4[i17];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr5 = {gVar.f21037a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr5[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            List list = unmodifiableList;
            ExecutorC2092b executorC2092b = new ExecutorC2092b(handler, 1);
            C1111f c1111f = new C1111f(i13, c1290a, executorC2092b);
            if (objArr3 != true) {
                String a9 = v1.g.a(i11, list);
                Typeface typeface2 = (Typeface) v1.g.f24949a.get(a9);
                if (typeface2 != null) {
                    executorC2092b.execute(new hc.i(i13, c1290a, typeface2, objArr2 == true ? 1 : 0));
                    j = typeface2;
                } else {
                    v1.e eVar = new v1.e(c1111f, objArr == true ? 1 : 0);
                    synchronized (v1.g.f24951c) {
                        try {
                            T t5 = v1.g.f24952d;
                            ArrayList arrayList3 = (ArrayList) t5.get(a9);
                            if (arrayList3 != null) {
                                arrayList3.add(eVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(eVar);
                                t5.put(a9, arrayList4);
                                v1.d dVar2 = new v1.d(a9, context, list, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = v1.g.f24950b;
                                v1.e eVar2 = new v1.e(a9, i14);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                C7.c cVar2 = new C7.c();
                                cVar2.f3048b = dVar2;
                                cVar2.f3049c = eVar2;
                                cVar2.f3050d = handler2;
                                threadPoolExecutor.execute(cVar2);
                            }
                        } finally {
                        }
                    }
                    j = null;
                }
            } else {
                if (list.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                v1.c cVar3 = (v1.c) list.get(0);
                C2066t c2066t = v1.g.f24949a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{cVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a10 = v1.g.a(i11, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) v1.g.f24949a.get(a10);
                if (typeface3 != null) {
                    executorC2092b.execute(new hc.i(i13, c1290a, typeface3, z10));
                    j = typeface3;
                } else if (i16 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = new Object[]{cVar3}[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    v1.f b2 = v1.g.b(a10, context, Collections.unmodifiableList(arrayList6), i11);
                    c1111f.v(b2);
                    j = b2.f24947a;
                } else {
                    try {
                        try {
                            try {
                                v1.f fVar = (v1.f) v1.g.f24950b.submit(new v1.d(a10, context, cVar3, i11, 0)).get(i16, TimeUnit.MILLISECONDS);
                                c1111f.v(fVar);
                                j = fVar.f24947a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((ExecutorC2092b) c1111f.f16838c).execute(new B2((C1290a) c1111f.f16837b, i15, 3));
                    }
                }
            }
        } else {
            j = f23347a.j(context, (n1.e) dVar, resources, i11);
            if (bVar != null) {
                if (j != null) {
                    new Handler(Looper.getMainLooper()).post(new j(i12, bVar, j));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (j != null) {
            f23348b.put(b(resources, i7, str, i10, i11), j);
        }
        return j;
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }
}
