package k1;

import A9.O0;
import I2.C0330t;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.journeyapps.barcodescanner.BarcodeView;
import hb.InterfaceC1269b;
import i1.C1290a;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l1.AbstractC1449a;
import l5.B;
import l5.C1490d;
import m4.SurfaceHolderCallbackC1596z;
import q9.C1907a;
import q9.C1908b;
import r4.C1931c;
import r4.C1933e;
import r4.InterfaceC1938j;
import r8.z;
import y9.AbstractC2467j;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18759b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f18758a = i7;
        this.f18759b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Application application;
        Handler handler;
        d dVar;
        int i7 = 3;
        int i10 = 2;
        ?? r32 = 1;
        r32 = 1;
        Map map = null;
        boolean z8 = false;
        switch (this.f18758a) {
            case 0:
                Activity activity = (Activity) this.f18759b;
                if (activity.isFinishing()) {
                    return;
                }
                ?? r62 = Build.VERSION.SDK_INT;
                if (r62 >= 28) {
                    Class cls = e.f18766a;
                    activity.recreate();
                    return;
                }
                Class cls2 = e.f18766a;
                ?? r72 = 27;
                boolean z10 = r62 == 26 || r62 == 27;
                Method method = e.f18771f;
                if ((!z10 || method != null) && (e.f18770e != null || e.f18769d != null)) {
                    try {
                        Object obj2 = e.f18768c.get(activity);
                        if (obj2 != null && (obj = e.f18767b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            d dVar2 = new d(activity);
                            application2.registerActivityLifecycleCallbacks(dVar2);
                            Handler handler2 = e.g;
                            handler2.post(new hc.i(i10, dVar2, obj2, z8));
                            if (r62 != 26 && r62 != 27) {
                                r32 = 0;
                            }
                            try {
                                if (r32 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r62 = handler2;
                                        r32 = dVar2;
                                        r72 = application2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        handler = handler2;
                                        dVar = dVar2;
                                        application = application2;
                                        handler.post(new hc.i(i7, application, dVar, z8));
                                        throw th;
                                    }
                                } else {
                                    r62 = handler2;
                                    r32 = dVar2;
                                    r72 = application2;
                                    activity.recreate();
                                }
                                r62.post(new hc.i(i7, r72, r32, z8));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                dVar = r32;
                                handler = r62;
                                application = r72;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                ((CarouselLayoutManager) this.f18759b).F0();
                return;
            case 2:
                ((C1490d) this.f18759b).d(false);
                return;
            case 3:
                ((B) this.f18759b).o();
                return;
            case 4:
                n4.f fVar = (n4.f) this.f18759b;
                fVar.Q(fVar.d(), 1028, new n4.c(13));
                fVar.f21091f.d();
                return;
            case 5:
                p5.l lVar = (p5.l) this.f18759b;
                Surface surface = lVar.f23108v;
                if (surface != null) {
                    Iterator it = lVar.f23101a.iterator();
                    while (it.hasNext()) {
                        ((SurfaceHolderCallbackC1596z) it.next()).f20525a.v0(null);
                    }
                }
                SurfaceTexture surfaceTexture = lVar.f23107u;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                lVar.f23107u = null;
                lVar.f23108v = null;
                return;
            case 6:
                p9.e.a((BarcodeView) ((C1290a) this.f18759b).f18187b);
                return;
            case 7:
                C1908b c1908b = ((C1907a) this.f18759b).f23551a;
                c1908b.f23553b = false;
                c1908b.a();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C1933e c1933e = (C1933e) this.f18759b;
                if (c1933e.f23734c) {
                    return;
                }
                InterfaceC1938j interfaceC1938j = c1933e.f23733b;
                if (interfaceC1938j != null) {
                    interfaceC1938j.a(c1933e.f23732a);
                }
                c1933e.f23735d.f23745n.remove(c1933e);
                c1933e.f23734c = true;
                return;
            case 9:
                ((C1931c) this.f18759b).a(null);
                return;
            case 10:
                O0 o02 = (O0) this.f18759b;
                synchronized (((ArrayDeque) o02.f925d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) o02.f922a).edit();
                    String str = (String) o02.f923b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) o02.f925d).iterator();
                    while (it2.hasNext()) {
                        sb2.append((String) it2.next());
                        sb2.append((String) o02.f924c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                StringBuilder sb3 = new StringBuilder("Service took too long to process intent: ");
                z zVar = (z) this.f18759b;
                sb3.append(zVar.f23903a.getAction());
                sb3.append(" finishing.");
                Log.w("FirebaseMessaging", sb3.toString());
                zVar.f23904b.trySetResult(null);
                return;
            case 12:
                View view = (View) this.f18759b;
                ((InputMethodManager) AbstractC1449a.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 13:
                ((InterfaceC1269b) this.f18759b).b();
                return;
            case 14:
                C0330t c0330t = (C0330t) this.f18759b;
                ((AtomicReference) c0330t.f5201c).set(null);
                synchronized (c0330t) {
                    if (((AtomicMarkableReference) c0330t.f5200b).isMarked()) {
                        x7.e eVar = (x7.e) ((AtomicMarkableReference) c0330t.f5200b).getReference();
                        synchronized (eVar) {
                            map = Collections.unmodifiableMap(new HashMap(eVar.f26249a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c0330t.f5200b;
                        atomicMarkableReference.set((x7.e) atomicMarkableReference.getReference(), false);
                    }
                }
                if (map != null) {
                    B7.d dVar3 = (B7.d) c0330t.f5202d;
                    ((x7.h) dVar3.f2211b).h((String) dVar3.f2210a, map, c0330t.f5199a);
                    return;
                }
                return;
            case 15:
                AbstractC2467j abstractC2467j = (AbstractC2467j) this.f18759b;
                kotlin.jvm.internal.l.b(abstractC2467j.f27509p0);
                abstractC2467j.f27508o0.f1376c.setChildrenVisibility(0);
                return;
            default:
                R7.c cVar = (R7.c) this.f18759b;
                cVar.f8932c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) cVar.f8934e;
                I1.c cVar2 = sideSheetBehavior.f15425i;
                if (cVar2 != null && cVar2.f()) {
                    cVar.m(cVar.f8931b);
                    return;
                } else {
                    if (sideSheetBehavior.f15424h == 2) {
                        sideSheetBehavior.w(cVar.f8931b);
                        return;
                    }
                    return;
                }
        }
    }
}
