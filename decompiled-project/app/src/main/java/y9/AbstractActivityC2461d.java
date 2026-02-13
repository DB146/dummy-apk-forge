package y9;

import A9.C0076d1;
import W1.C0558a;
import W1.U;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.kt.apps.core.base.receiver.NetworkChangeReceiver;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.App;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import l1.AbstractC1449a;
import l2.InterfaceC1479x;
import m4.C1549C;
import r7.C1947c;

/* renamed from: y9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC2461d extends W1.G {

    /* renamed from: U, reason: collision with root package name */
    public static final Db.o f27489U = android.support.v4.media.session.b.z(new wa.f(10));

    /* renamed from: N, reason: collision with root package name */
    public J1.k f27490N;

    /* renamed from: O, reason: collision with root package name */
    public final Db.o f27491O;

    /* renamed from: P, reason: collision with root package name */
    public final Db.o f27492P;

    /* renamed from: Q, reason: collision with root package name */
    public final Db.o f27493Q = android.support.v4.media.session.b.z(new wa.f(9));

    /* renamed from: R, reason: collision with root package name */
    public NetworkChangeReceiver f27494R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f27495S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f27496T;

    public AbstractActivityC2461d() {
        NetworkChangeReceiver networkChangeReceiver;
        final int i7 = 0;
        this.f27491O = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: y9.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC2461d f27487b;

            {
                this.f27487b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                E6.f fVar;
                switch (i7) {
                    case 0:
                        Context context = this.f27487b;
                        synchronized (E6.b.class) {
                            try {
                                if (E6.b.f3719a == null) {
                                    Context applicationContext = context.getApplicationContext();
                                    if (applicationContext != null) {
                                        context = applicationContext;
                                    }
                                    E6.b.f3719a = new E6.f(new E6.e(context, 0));
                                }
                                fVar = E6.b.f3719a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return (E6.d) fVar.f3735a.zza();
                    default:
                        E6.d dVar = (E6.d) this.f27487b.f27491O.getValue();
                        String packageName = dVar.f3732c.getPackageName();
                        D9.a aVar = E6.i.f3744e;
                        E6.i iVar = dVar.f3730a;
                        F6.o oVar = iVar.f3746a;
                        if (oVar == null) {
                            Object[] objArr = {-9};
                            aVar.getClass();
                            if (Log.isLoggable("PlayCore", 6)) {
                                Log.e("PlayCore", D9.a.d(aVar.f3289a, "onError(%d)", objArr));
                            }
                            return Tasks.forException(new G6.a(-9));
                        }
                        aVar.c("requestUpdateInfo(%s)", packageName);
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        oVar.a().post(new E6.g(oVar, taskCompletionSource, taskCompletionSource, new E6.g(iVar, taskCompletionSource, packageName, taskCompletionSource)));
                        return taskCompletionSource.getTask();
                }
            }
        });
        final int i10 = 1;
        this.f27492P = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: y9.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC2461d f27487b;

            {
                this.f27487b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                E6.f fVar;
                switch (i10) {
                    case 0:
                        Context context = this.f27487b;
                        synchronized (E6.b.class) {
                            try {
                                if (E6.b.f3719a == null) {
                                    Context applicationContext = context.getApplicationContext();
                                    if (applicationContext != null) {
                                        context = applicationContext;
                                    }
                                    E6.b.f3719a = new E6.f(new E6.e(context, 0));
                                }
                                fVar = E6.b.f3719a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return (E6.d) fVar.f3735a.zza();
                    default:
                        E6.d dVar = (E6.d) this.f27487b.f27491O.getValue();
                        String packageName = dVar.f3732c.getPackageName();
                        D9.a aVar = E6.i.f3744e;
                        E6.i iVar = dVar.f3730a;
                        F6.o oVar = iVar.f3746a;
                        if (oVar == null) {
                            Object[] objArr = {-9};
                            aVar.getClass();
                            if (Log.isLoggable("PlayCore", 6)) {
                                Log.e("PlayCore", D9.a.d(aVar.f3289a, "onError(%d)", objArr));
                            }
                            return Tasks.forException(new G6.a(-9));
                        }
                        aVar.c("requestUpdateInfo(%s)", packageName);
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        oVar.a().post(new E6.g(oVar, taskCompletionSource, taskCompletionSource, new E6.g(iVar, taskCompletionSource, packageName, taskCompletionSource)));
                        return taskCompletionSource.getTask();
                }
            }
        });
        WeakReference weakReference = NetworkChangeReceiver.f16114b;
        if (weakReference == null || (networkChangeReceiver = (NetworkChangeReceiver) weakReference.get()) == null) {
            networkChangeReceiver = new NetworkChangeReceiver();
            NetworkChangeReceiver.f16114b = new WeakReference(networkChangeReceiver);
        }
        this.f27494R = networkChangeReceiver;
        this.f27496T = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        kotlin.jvm.internal.l.e(ev, "ev");
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (ev.getAction() == 1 || (ev.getAction() == 2 && (currentFocus instanceof EditText) && !ac.n.Y(currentFocus.getClass().getName(), "android.webkit.", false)))) {
            currentFocus.getLocationOnScreen(new int[2]);
            float rawX = (ev.getRawX() + currentFocus.getLeft()) - r1[0];
            float rawY = (ev.getRawY() + currentFocus.getTop()) - r1[1];
            if (rawX < currentFocus.getLeft() || rawX > currentFocus.getRight() || rawY < currentFocus.getTop() || rawY > currentFocus.getBottom()) {
                currentFocus.clearFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    public abstract int l();

    public boolean m() {
        return this.f27496T;
    }

    @Override // W1.G, c.AbstractActivityC0867k, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 102) {
            if (i10 != -1) {
                ActivityUtilsKt.showSuccessDialog$default((Activity) this, (Rb.a) new wa.f(11), "App update fail!", (Integer) null, false, 12, (Object) null);
                return;
            }
            E6.d dVar = (E6.d) this.f27491O.getValue();
            C2459b c2459b = (C2459b) this.f27493Q.getValue();
            synchronized (dVar) {
                E6.c cVar = dVar.f3731b;
                synchronized (cVar) {
                    cVar.f3725a.c("unregisterListener", new Object[0]);
                    if (c2459b == null) {
                        throw new NullPointerException("Unregistered Play Core listener should not be null.");
                    }
                    cVar.f3728d.remove(c2459b);
                    cVar.a();
                }
            }
            ActivityUtilsKt.showSuccessDialog$default((Activity) this, (Rb.a) new wa.f(11), "App update success", (Integer) null, false, 12, (Object) null);
        }
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public void onBackPressed() {
        View findViewById;
        ViewGroup viewGroup;
        W1.C D10;
        W1.C D11 = j().D(R.id.content);
        if (D11 != null) {
            if (!(D11 instanceof AbstractC2456A)) {
                D11 = null;
            }
            if (D11 != null) {
                AbstractC2456A abstractC2456A = (AbstractC2456A) D11;
                if (!abstractC2456A.K() || (abstractC2456A.f27459d2 == t.f27537d && (((viewGroup = abstractC2456A.f27436F1) == null || viewGroup.getVisibility() != 0) && ((D10 = abstractC2456A.B().D(com.kt.apps.media.xemtv.beta.R.id.container_program)) == null || !D10.N())))) {
                    String message = "{className: " + getComponentName().getClassName() + ", isTaskRoot: " + isTaskRoot() + ",activityCount: " + App.f16182x + "}";
                    kotlin.jvm.internal.l.e(message, "message");
                    String flattenToString = getComponentName().flattenToString();
                    kotlin.jvm.internal.l.d(flattenToString, "flattenToString(...)");
                    if (!ac.g.b0(flattenToString, "PlaybackActivity") || App.f16182x > 1) {
                        finish();
                        return;
                    }
                    String str = ActivityUtilsKt.isRindoTV(this) ? "rindo" : "xemtv";
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(str.concat("://tv/dashboard")));
                    intent.setFlags(32768);
                    startActivity(intent);
                    finish();
                    return;
                }
                if (abstractC2456A.K()) {
                    if (!abstractC2456A.R0()) {
                        ViewGroup viewGroup2 = abstractC2456A.f27436F1;
                        if (viewGroup2 == null || viewGroup2.getVisibility() != 0) {
                            ViewGroup viewGroup3 = abstractC2456A.f27436F1;
                            if (viewGroup3 != null) {
                                AnimationUtilsKt.gone(viewGroup3);
                            }
                            Message.obtain(abstractC2456A.K0(), 1003).sendToTarget();
                            return;
                        }
                        ViewGroup viewGroup4 = abstractC2456A.f27436F1;
                        if (viewGroup4 != null) {
                            AnimationUtilsKt.fadeOut$default(viewGroup4, false, new C2468k(abstractC2456A, 8), 1, null);
                        }
                        abstractC2456A.Z0();
                        return;
                    }
                    abstractC2456A.getClass();
                    abstractC2456A.N0(t.f27537d, true, null);
                    View view = abstractC2456A.f27473r1;
                    if (view != null) {
                        view.clearFocus();
                    }
                    ImageButton imageButton = abstractC2456A.f27472q1;
                    if (imageButton != null) {
                        imageButton.requestFocus();
                    }
                    if (abstractC2456A.K()) {
                        View view2 = abstractC2456A.f10277U;
                        if (view2 != null && (findViewById = view2.findViewById(com.kt.apps.media.xemtv.beta.R.id.container_program)) != null) {
                            AnimationUtilsKt.fadeOut$default(findViewById, false, null, 3, null);
                        }
                        W1.C D12 = abstractC2456A.B().D(com.kt.apps.media.xemtv.beta.R.id.container_program);
                        if (D12 == null || !D12.N()) {
                            return;
                        }
                        U B10 = abstractC2456A.B();
                        B10.getClass();
                        C0558a c0558a = new C0558a(B10);
                        c0558a.i(D12);
                        c0558a.f();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        J1.k c10;
        NetworkChangeReceiver networkChangeReceiver = this.f27494R;
        if (networkChangeReceiver != null) {
            WeakReference weakReference = NetworkChangeReceiver.f16114b;
            ((HashMap) networkChangeReceiver.f16115a.getValue()).put(getClass().getName(), new C2460c(this));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            AbstractC1449a.registerReceiver(this, networkChangeReceiver, intentFilter, 4);
        }
        getWindow().getDecorView().setBackgroundColor(-1);
        super.onCreate(bundle);
        ActivityUtilsKt.updateLocale$default(this, null, 1, null);
        this.f27495S = bundle != null ? bundle.getBoolean("IS_CHECK_UPDATE") : false;
        ((Task) this.f27492P.getValue()).addOnSuccessListener(new C1947c(new Ba.o(this, 26), 20));
        int l10 = l();
        DataBinderMapperImpl dataBinderMapperImpl = J1.e.f5416a;
        setContentView(l10);
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().findViewById(R.id.content);
        int childCount = viewGroup.getChildCount();
        int i7 = childCount + 0;
        DataBinderMapperImpl dataBinderMapperImpl2 = J1.e.f5416a;
        if (i7 == 1) {
            c10 = dataBinderMapperImpl2.b(viewGroup.getChildAt(childCount - 1), l10);
        } else {
            View[] viewArr = new View[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                viewArr[i10] = viewGroup.getChildAt(i10 + 0);
            }
            c10 = dataBinderMapperImpl2.c(viewArr, l10);
        }
        kotlin.jvm.internal.l.e(c10, "<set-?>");
        this.f27490N = c10;
        q();
        p(bundle);
    }

    @Override // W1.G, android.app.Activity
    public void onDestroy() {
        NetworkChangeReceiver networkChangeReceiver = this.f27494R;
        if (networkChangeReceiver != null) {
            WeakReference weakReference = NetworkChangeReceiver.f16114b;
            try {
                unregisterReceiver(networkChangeReceiver);
                ((HashMap) networkChangeReceiver.f16115a.getValue()).remove(getClass().getName());
            } catch (Exception unused) {
            }
            this.f27494R = null;
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        J j;
        J j10;
        String message = "onKeyDown: " + i7;
        kotlin.jvm.internal.l.e(message, "message");
        InterfaceC1479x D10 = j().D(R.id.content);
        if (D10 != null) {
            if (!(D10 instanceof J)) {
                D10 = null;
            }
            if (D10 != null) {
                j = (J) D10;
                if (i7 == 4) {
                    if (i7 != 66) {
                        if (i7 == 82) {
                            j.q();
                        } else if (i7 != 172) {
                            if (i7 != 269) {
                                if (i7 == 126) {
                                    j.k();
                                } else if (i7 == 127) {
                                    j.u();
                                } else {
                                    if (i7 == 166) {
                                        j.v();
                                        return true;
                                    }
                                    if (i7 == 167) {
                                        j.c();
                                        return true;
                                    }
                                    switch (i7) {
                                        case 7:
                                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                        case 9:
                                        case 10:
                                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                            Log.d("TuanDV", "onKeyDown: " + i7);
                                            Integer num = (Integer) ((Map) f27489U.getValue()).get(Integer.valueOf(i7));
                                            if (num != null) {
                                                j.m(num.intValue());
                                                break;
                                            }
                                            break;
                                        default:
                                            switch (i7) {
                                                case 19:
                                                    j.l();
                                                    break;
                                                case 20:
                                                    j.g();
                                                    break;
                                                case 21:
                                                    break;
                                                case 22:
                                                    j.f();
                                                    break;
                                                case 23:
                                                    break;
                                                case 24:
                                                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                                    break;
                                                default:
                                                    if (i7 == 89) {
                                                        j10 = j instanceof K ? j : null;
                                                        if (j10 != null) {
                                                            AbstractC2456A abstractC2456A = (AbstractC2456A) ((K) j10);
                                                            C1549C c1549c = abstractC2456A.H0().f3807c;
                                                            if (c1549c != null) {
                                                                c1549c.z(5, abstractC2456A.f27451W1 - 30000);
                                                                break;
                                                            }
                                                        }
                                                    } else if (i7 == 90) {
                                                        j10 = j instanceof K ? j : null;
                                                        if (j10 != null) {
                                                            AbstractC2456A abstractC2456A2 = (AbstractC2456A) ((K) j10);
                                                            C1549C c1549c2 = abstractC2456A2.H0().f3807c;
                                                            if (c1549c2 != null) {
                                                                c1549c2.z(5, abstractC2456A2.f27451W1 + 30000);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                    }
                                }
                            }
                            j.j();
                        } else if (j instanceof L) {
                            ((AbstractC2456A) ((L) j)).P0();
                            return true;
                        }
                    }
                    j.i();
                } else {
                    j.p();
                }
                return super.onKeyDown(i7, keyEvent);
            }
        }
        InterfaceC1479x D11 = j().D(com.kt.apps.media.xemtv.beta.R.id.main_browse_fragment);
        if (D11 != null) {
            if (!(D11 instanceof J)) {
                D11 = null;
            }
            if (D11 != null) {
                j = (J) D11;
                if (i7 == 4) {
                }
                return super.onKeyDown(i7, keyEvent);
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // W1.G, android.app.Activity
    public void onResume() {
        WeakReference weakReference = NetworkChangeReceiver.f16114b;
        u(c2.q.n(this));
        super.onResume();
    }

    @Override // c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.l.e(outState, "outState");
        outState.putBoolean("IS_CHECK_UPDATE", this.f27495S);
        super.onSaveInstanceState(outState);
    }

    public abstract void p(Bundle bundle);

    public abstract void q();

    public void r() {
    }

    public void t() {
    }

    public final void u(boolean z8) {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        if (!z8) {
            if (((LinearLayout) viewGroup.findViewById(com.kt.apps.media.xemtv.beta.R.id.no_network_view)) != null) {
                return;
            }
            viewGroup.addView(LayoutInflater.from(this).inflate(com.kt.apps.media.xemtv.beta.R.layout.base_no_network_view, (ViewGroup) null, false));
        } else {
            TextView textView = (TextView) viewGroup.findViewById(com.kt.apps.media.xemtv.beta.R.id.no_network_title_view);
            if (textView != null) {
                textView.setBackgroundColor(-16711936);
                textView.setText("Kết nối internet đã sẵn sàng");
                textView.animate().setStartDelay(300L).translationY(textView.getMeasuredHeight()).setListener(new C0076d1(viewGroup, 10));
            }
        }
    }
}
