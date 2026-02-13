package P3;

import A9.C0080e1;
import A9.C0088g1;
import A9.C0092h1;
import A9.P0;
import A9.V0;
import I2.C0330t;
import Y5.C0662z;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import cc.D0;
import cc.E;
import cc.F;
import ea.C1108c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import m4.RunnableC1557a;
import m4.SurfaceHolderCallbackC1596z;
import r.AbstractC1910a;
import u.r;
import u0.C2082l;
import u0.u;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static volatile p f7839e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7840a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7841b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7842c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7843d;

    public p(int i7) {
        this.f7840a = i7;
        switch (i7) {
            case 7:
                this.f7842c = new Intent("android.intent.action.VIEW");
                this.f7843d = new C0662z(16);
                this.f7841b = true;
                return;
            default:
                this.f7842c = Collections.newSetFromMap(new WeakHashMap());
                this.f7843d = new HashSet();
                return;
        }
    }

    public p(Context context) {
        this.f7840a = 0;
        this.f7843d = new HashSet();
        this.f7842c = new C0330t(new F5.i(new E6.e(context, 5)), new n(this));
    }

    public p(Context context, Handler handler, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z) {
        this.f7840a = 6;
        this.f7842c = context.getApplicationContext();
        this.f7843d = new RunnableC1557a(this, handler, surfaceHolderCallbackC1596z);
    }

    public p(E e2, boolean z8, Rb.e eVar, d.f fVar) {
        this.f7840a = 5;
        this.f7841b = z8;
        this.f7842c = Q5.e.a(-2, 1, 4);
        this.f7843d = F.B(e2, null, 0, new d.e(fVar, eVar, this, null), 3);
    }

    public p(String str, String str2, boolean z8) {
        this.f7840a = 2;
        this.f7842c = str;
        this.f7843d = str2;
        this.f7841b = z8;
    }

    public p(r rVar, C1108c c1108c) {
        this.f7840a = 8;
        this.f7842c = rVar;
        this.f7843d = c1108c;
    }

    public static p h(Context context) {
        if (f7839e == null) {
            synchronized (p.class) {
                try {
                    if (f7839e == null) {
                        f7839e = new p(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f7839e;
    }

    public static void k(C0080e1 c0080e1, TextView textView) {
        P0 p02 = c0080e1.f1118u;
        if (textView == c0080e1.f1121x) {
            if (p02.f930h != null) {
                p02.f930h = textView.getText();
                return;
            } else {
                p02.f1102d = textView.getText();
                return;
            }
        }
        if (textView == c0080e1.f1120w) {
            if (p02.g != null) {
                p02.g = textView.getText();
            } else {
                p02.f1101c = textView.getText();
            }
        }
    }

    public boolean a(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((C1108c) this.f7843d).f16831c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            if (u.d(((C2082l) obj).f24778a, j)) {
                break;
            }
            i7++;
        }
        C2082l c2082l = (C2082l) obj;
        if (c2082l != null) {
            return c2082l.f24784h;
        }
        return false;
    }

    public o7.o b() {
        Intent intent = (Intent) this.f7842c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f7841b);
        ((C0662z) this.f7843d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String a9 = AbstractC1910a.a();
        if (!TextUtils.isEmpty(a9)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a9);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        return new o7.o(intent, 3);
    }

    public void c() {
        ((ec.d) this.f7842c).k(true, new CancellationException("onBack cancelled"));
        ((D0) this.f7843d).cancel(null);
    }

    public boolean d(S3.c cVar) {
        boolean z8 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f7842c).remove(cVar);
        if (!((HashSet) this.f7843d).remove(cVar) && !remove) {
            z8 = false;
        }
        if (z8) {
            cVar.clear();
        }
        return z8;
    }

    public void e(View view) {
        if (this.f7841b) {
            this.f7841b = false;
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            C0092h1 c0092h1 = ((C0088g1) this.f7843d).f1201b;
            c0092h1.getClass();
            ArrayList arrayList = new ArrayList();
            c0092h1.f1210n0.getClass();
            c0092h1.f1211o0.getClass();
            c0092h1.f1212p0.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        }
    }

    public void f(V0 v02, TextView textView) {
        int indexOf;
        C0080e1 m10 = v02.m(textView);
        k(m10, textView);
        C0088g1 c0088g1 = v02.k;
        if (c0088g1 != null) {
            c0088g1.a(m10.f1118u);
        }
        ((C0088g1) this.f7843d).f1201b.getClass();
        v02.f982l.d(m10, false, true);
        P0 p02 = m10.f1118u;
        if (-2 != p02.f1099a && (indexOf = v02.j.indexOf(p02)) >= 0) {
            int i7 = indexOf + 1;
            while (true) {
                ArrayList arrayList = v02.j;
                int size = arrayList.size();
                while (i7 < size && (((P0) arrayList.get(i7)).f929f & 32) != 32) {
                    i7++;
                }
                if (i7 < size) {
                    C0080e1 c0080e1 = (C0080e1) v02.f982l.f1140b.I(i7, false);
                    if (c0080e1 != null) {
                        c0080e1.f1118u.getClass();
                        View view = c0080e1.f4707a;
                        e(view);
                        view.requestFocus();
                        return;
                    }
                } else {
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList2 = (ArrayList) this.f7842c;
                        if (i10 >= arrayList2.size()) {
                            v02 = null;
                            break;
                        }
                        Pair pair = (Pair) arrayList2.get(i10);
                        if (pair.first == v02) {
                            v02 = (V0) pair.second;
                            break;
                        }
                        i10++;
                    }
                    if (v02 == null) {
                        break;
                    } else {
                        i7 = 0;
                    }
                }
            }
        }
        e(textView);
        m10.f4707a.requestFocus();
    }

    public void g(V0 v02, TextView textView) {
        C0080e1 m10 = v02.m(textView);
        k(m10, textView);
        ((C0088g1) this.f7843d).f1201b.getClass();
        v02.f982l.d(m10, false, true);
        e(textView);
        m10.f4707a.requestFocus();
    }

    public void i() {
        if (this.f7841b || ((HashSet) this.f7843d).isEmpty()) {
            return;
        }
        C0330t c0330t = (C0330t) this.f7842c;
        F5.i iVar = (F5.i) c0330t.f5201c;
        boolean z8 = false;
        c0330t.f5199a = ((ConnectivityManager) iVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) iVar.get()).registerDefaultNetworkCallback((o) c0330t.f5202d);
            z8 = true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e2);
            }
        }
        this.f7841b = z8;
    }

    public void j(boolean z8) {
        RunnableC1557a runnableC1557a = (RunnableC1557a) this.f7843d;
        Context context = (Context) this.f7842c;
        if (z8 && !this.f7841b) {
            context.registerReceiver(runnableC1557a, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f7841b = true;
        } else {
            if (z8 || !this.f7841b) {
                return;
            }
            context.unregisterReceiver(runnableC1557a);
            this.f7841b = false;
        }
    }

    public String toString() {
        switch (this.f7840a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("http");
                sb2.append(this.f7841b ? "s" : "");
                sb2.append("://");
                sb2.append((String) this.f7842c);
                return sb2.toString();
            case 3:
                return super.toString() + "{numRequests=" + ((Set) this.f7842c).size() + ", isPaused=" + this.f7841b + "}";
            default:
                return super.toString();
        }
    }
}
