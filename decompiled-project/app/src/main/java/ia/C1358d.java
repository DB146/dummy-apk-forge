package ia;

import B0.D;
import L7.i;
import P3.p;
import U9.e;
import U9.h;
import W1.L;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.kt.apps.core.workers.PreloadDataWorker;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1108c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CopyOnWriteArrayList;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import ma.C1653d;
import n.C1671e;
import n.C1680n;
import n.InterfaceC1676j;
import n.MenuC1678l;
import n.ViewOnKeyListenerC1672f;
import o.C1740j;
import o.InterfaceC1746m;
import o.InterfaceC1772z0;
import o5.q;
import ob.C1837e;
import org.json.JSONArray;
import org.json.JSONException;
import u.r;
import u0.C2080j;
import u0.C2081k;
import u0.C2082l;
import v7.j;
import x.C2251v;
import x.InterfaceC2244n;
import x.InterfaceC2250u;
import xc.x;
import zc.u;

/* renamed from: ia.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1358d implements InterfaceC1394e, InterfaceC1393d, InterfaceC1772z0, InterfaceC1676j, q, Continuation, SuccessContinuation, InterfaceC2244n, u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18486a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18487b;

    public C1358d() {
        this.f18486a = 18;
        this.f18487b = new r((Object) null);
    }

    public C1358d(float f4) {
        this.f18486a = 21;
        this.f18487b = new C2251v(f4, 0.01f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1358d(Rb.a aVar) {
        this.f18486a = 26;
        this.f18487b = (m) aVar;
    }

    public C1358d(Z.c cVar) {
        this.f18486a = 22;
        this.f18487b = new WeakReference(cVar);
    }

    public C1358d(Bundle bundle) {
        this.f18486a = 15;
        this.f18487b = new Bundle(bundle);
    }

    public C1358d(WorkDatabase workDatabase) {
        this.f18486a = 13;
        l.e(workDatabase, "workDatabase");
        this.f18487b = workDatabase;
    }

    public /* synthetic */ C1358d(Object obj, int i7) {
        this.f18486a = i7;
        this.f18487b = obj;
    }

    public C1358d(j jVar, String str) {
        this.f18486a = 19;
        this.f18487b = jVar;
    }

    public static boolean p(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String v(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // zc.u
    public void a(xc.q qVar, int i7) {
        boolean z8 = qVar instanceof x;
        StringBuilder sb2 = (StringBuilder) this.f18487b;
        if (z8) {
            xc.l.b0(sb2, (x) qVar);
            return;
        }
        if (qVar instanceof xc.l) {
            xc.l lVar = (xc.l) qVar;
            if (sb2.length() > 0) {
                if (((lVar.f26349d.f27659d & 4) == 0 && !lVar.K("br")) || x.c0(sb2)) {
                    return;
                }
                sb2.append(' ');
            }
        }
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f18486a) {
            case 1:
                C1653d it = (C1653d) obj;
                l.e(it, "it");
                ka.c cVar = (ka.c) this.f18487b;
                synchronized (cVar.f19067d) {
                    cVar.f19067d = it;
                }
                ka.c t5 = (ka.c) this.f18487b;
                String.valueOf(it);
                l.e(t5, "t");
                return;
            case 5:
                List it2 = (List) obj;
                l.e(it2, "it");
                ((na.b) this.f18487b).setCacheData(it2);
                return;
            default:
                Throwable error = (Throwable) obj;
                l.e(error, "error");
                va.u t10 = (va.u) this.f18487b;
                l.e(t10, "t");
                return;
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        M9.d it = (M9.d) obj;
        l.e(it, "it");
        h hVar = (h) ((PreloadDataWorker) this.f18487b).f16180h.getValue();
        hVar.getClass();
        return new C1837e(android.support.v4.media.session.b.g(hVar.f9862a, new e(hVar, it, 1)), 2);
    }

    @Override // o5.q
    public void b(Q9.a aVar) {
        aVar.f(((WindowManager) this.f18487b).getDefaultDisplay());
    }

    @Override // o5.q
    public void c() {
    }

    @Override // zc.u
    public void d(xc.q qVar, int i7) {
        if (qVar instanceof xc.l) {
            xc.l lVar = (xc.l) qVar;
            xc.q M3 = qVar.M();
            if ((lVar.f26349d.f27659d & 4) == 0) {
                return;
            }
            if ((M3 instanceof x) || ((M3 instanceof xc.l) && (((xc.l) M3).f26349d.f27659d & 4) == 0)) {
                StringBuilder sb2 = (StringBuilder) this.f18487b;
                if (x.c0(sb2)) {
                    return;
                }
                sb2.append(' ');
            }
        }
    }

    @Override // n.InterfaceC1676j
    public boolean e(MenuC1678l menuC1678l, MenuItem menuItem) {
        switch (this.f18486a) {
            case 6:
                InterfaceC1746m interfaceC1746m = ((ActionMenuView) this.f18487b).f12982N;
                if (interfaceC1746m != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((R7.b) interfaceC1746m).f8929b).f13076U.f19195c).iterator();
                    while (it.hasNext()) {
                        if (((L) it.next()).f10329a.p()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((Toolbar) this.f18487b).getClass();
                return false;
        }
    }

    @Override // o.InterfaceC1772z0
    public void f(MenuC1678l menuC1678l, C1680n c1680n) {
        ((ViewOnKeyListenerC1672f) this.f18487b).f20921f.removeCallbacksAndMessages(menuC1678l);
    }

    @Override // n.InterfaceC1676j
    public void g(MenuC1678l menuC1678l) {
        switch (this.f18486a) {
            case 6:
                C1358d c1358d = ((ActionMenuView) this.f18487b).f12978I;
                if (c1358d != null) {
                    c1358d.g(menuC1678l);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f18487b;
                C1740j c1740j = toolbar.f13079a.f12977H;
                if (c1740j == null || !c1740j.e()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f13076U.f19195c).iterator();
                    while (it.hasNext()) {
                        ((L) it.next()).f10329a.t();
                    }
                    return;
                }
                return;
        }
    }

    @Override // x.InterfaceC2244n
    public InterfaceC2250u get(int i7) {
        return (C2251v) this.f18487b;
    }

    public boolean i(String str) {
        String m10 = m(str);
        return "1".equals(m10) || Boolean.parseBoolean(m10);
    }

    public Integer j(String str) {
        String m10 = m(str);
        if (TextUtils.isEmpty(m10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m10));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + v(str) + "(" + m10 + ") into an int");
            return null;
        }
    }

    public JSONArray k(String str) {
        String m10 = m(str);
        if (TextUtils.isEmpty(m10)) {
            return null;
        }
        try {
            return new JSONArray(m10);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + v(str) + ": " + m10 + ", falling back to default");
            return null;
        }
    }

    public String l(Resources resources, String str, String str2) {
        String[] strArr;
        String m10 = m(str2);
        if (!TextUtils.isEmpty(m10)) {
            return m10;
        }
        String m11 = m(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(m11)) {
            return null;
        }
        int identifier = resources.getIdentifier(m11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", v(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray k = k(str2.concat("_loc_args"));
        if (k == null) {
            strArr = null;
        } else {
            int length = k.length();
            strArr = new String[length];
            for (int i7 = 0; i7 < length; i7++) {
                strArr[i7] = k.optString(i7);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + v(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e2);
            return null;
        }
    }

    public String m(String str) {
        Bundle bundle = (Bundle) this.f18487b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // o.InterfaceC1772z0
    public void n(MenuC1678l menuC1678l, C1680n c1680n) {
        ViewOnKeyListenerC1672f viewOnKeyListenerC1672f = (ViewOnKeyListenerC1672f) this.f18487b;
        viewOnKeyListenerC1672f.f20921f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1672f.f20923v;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (menuC1678l == ((C1671e) arrayList.get(i7)).f20902b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        viewOnKeyListenerC1672f.f20921f.postAtTime(new i(this, i10 < arrayList.size() ? (C1671e) arrayList.get(i10) : null, c1680n, menuC1678l, 10), menuC1678l, SystemClock.uptimeMillis() + 200);
    }

    public void o(float f4, float f10, float f11, float f12) {
        Q7.h hVar = (Q7.h) this.f18487b;
        j0.l x2 = hVar.x();
        float intBitsToFloat = Float.intBitsToFloat((int) (hVar.D() >> 32)) - (f11 + f4);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hVar.D() & 4294967295L)) - (f12 + f10)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f)) {
            j0.u.a("Width and height must be greater than or equal to zero");
        }
        hVar.U(floatToRawIntBits);
        x2.f(f4, f10);
    }

    public void q() {
        synchronized (((p9.m) this.f18487b).f23210h) {
            try {
                p9.m mVar = (p9.m) this.f18487b;
                if (mVar.g) {
                    mVar.f23206c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle r() {
        Bundle bundle = (Bundle) this.f18487b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public p s(C1108c c1108c, D d10) {
        boolean z8;
        long j;
        long j10;
        ArrayList arrayList;
        int i7;
        int i10;
        ArrayList arrayList2 = (ArrayList) c1108c.f16831c;
        r rVar = new r(arrayList2.size());
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            C2082l c2082l = (C2082l) arrayList2.get(i11);
            long j11 = c2082l.f24778a;
            r rVar2 = (r) this.f18487b;
            C2081k c2081k = (C2081k) rVar2.b(j11);
            if (c2081k == null) {
                j10 = c2082l.f24779b;
                j = c2082l.f24781d;
                z8 = false;
            } else {
                long G9 = d10.G(c2081k.f24776b);
                long j12 = c2081k.f24775a;
                z8 = c2081k.f24777c;
                j = G9;
                j10 = j12;
            }
            ArrayList arrayList3 = c2082l.f24785i;
            long j13 = c2082l.j;
            long j14 = c2082l.k;
            long j15 = c2082l.f24778a;
            rVar.e(new C2080j(j15, c2082l.f24779b, c2082l.f24781d, c2082l.f24782e, c2082l.f24783f, j10, j, z8, c2082l.g, arrayList3, j13, j14), j15);
            long j16 = c2082l.f24778a;
            boolean z10 = c2082l.f24782e;
            if (z10) {
                i10 = i11;
                arrayList = arrayList2;
                i7 = size;
                rVar2.e(new C2081k(c2082l.f24779b, c2082l.f24780c, z10), j16);
            } else {
                arrayList = arrayList2;
                i7 = size;
                i10 = i11;
                rVar2.f(j16);
            }
            i11 = i10 + 1;
            arrayList2 = arrayList;
            size = i7;
        }
        return new p(rVar, c1108c);
    }

    public void t(float f4, float f10, long j) {
        j0.l x2 = ((Q7.h) this.f18487b).x();
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        x2.f(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10));
        x2.b(f4, f10);
        x2.f(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i10));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((D7.b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        v7.l lVar = ((j) this.f18487b).f25123e;
        return Tasks.whenAll((Task<?>[]) new Task[]{v7.l.a(lVar), lVar.f25137m.g(lVar.f25132e.f25819a, null)});
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f18487b);
        }
        Exception exception = task.getException();
        G.g(exception);
        if (!(exception instanceof o7.p)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
        }
        return Tasks.forResult("");
    }

    public void u(float f4, float f10) {
        ((Q7.h) this.f18487b).x().f(f4, f10);
    }
}
