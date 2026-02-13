package com.google.android.gms.common.api;

import Y5.J0;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.AbstractC0963d;
import com.google.android.gms.common.api.internal.AbstractC0971l;
import com.google.android.gms.common.api.internal.AbstractC0973n;
import com.google.android.gms.common.api.internal.AbstractC0977s;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.AbstractC0983y;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC0975p;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.C0960a;
import com.google.android.gms.common.api.internal.C0967h;
import com.google.android.gms.common.api.internal.C0974o;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.H;
import com.google.android.gms.common.api.internal.InterfaceC0972m;
import com.google.android.gms.common.api.internal.InterfaceC0979u;
import com.google.android.gms.common.api.internal.M;
import com.google.android.gms.common.api.internal.N;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.api.internal.U;
import com.google.android.gms.common.internal.AbstractC0990f;
import com.google.android.gms.common.internal.C0991g;
import com.google.android.gms.common.internal.C0992h;
import com.google.android.gms.common.internal.C0993i;
import com.google.android.gms.common.internal.C1002s;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import u.C2053f;

/* loaded from: classes.dex */
public abstract class l {
    protected final C0967h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final C0960a zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final InterfaceC0979u zaj;

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        G.h(context, "Null context is not permitted.");
        G.h(iVar, "Api must not be null.");
        G.h(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        G.h(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : getApiFallbackAttributionTag(context);
        this.zac = attributionTag;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f15011b;
        C0960a c0960a = new C0960a(iVar, eVar, attributionTag);
        this.zaf = c0960a;
        this.zai = new H(this);
        C0967h g = C0967h.g(applicationContext);
        this.zaa = g;
        this.zah = g.f14996v.getAndIncrement();
        this.zaj = kVar.f15010a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC0972m fragment = AbstractC0971l.getFragment(activity);
            B b2 = (B) fragment.r(B.class, "ConnectionlessLifecycleHelper");
            if (b2 == null) {
                Object obj = F5.e.f4097c;
                b2 = new B(fragment, g);
            }
            b2.f14911e.add(c0960a);
            g.b(b2);
        }
        zau zauVar = g.f14987B;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public final void a(int i7, AbstractC0963d abstractC0963d) {
        abstractC0963d.zak();
        C0967h c0967h = this.zaa;
        c0967h.getClass();
        M m10 = new M(new T(i7, abstractC0963d), c0967h.f14997w.get(), this);
        zau zauVar = c0967h.f14987B;
        zauVar.sendMessage(zauVar.obtainMessage(4, m10));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task b(int i7, AbstractC0982x abstractC0982x) {
        X4.i iVar;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        InterfaceC0979u interfaceC0979u = this.zaj;
        C0967h c0967h = this.zaa;
        c0967h.getClass();
        int zaa = abstractC0982x.zaa();
        zau zauVar = c0967h.f14987B;
        if (zaa != 0) {
            C0960a apiKey = getApiKey();
            if (c0967h.c()) {
                C1002s c1002s = (C1002s) com.google.android.gms.common.internal.r.b().f15106a;
                boolean z8 = true;
                if (c1002s != null) {
                    if (c1002s.f15108b) {
                        E e2 = (E) c0967h.f14998x.get(apiKey);
                        if (e2 != null) {
                            Object obj = e2.f14918b;
                            if (obj instanceof AbstractC0990f) {
                                AbstractC0990f abstractC0990f = (AbstractC0990f) obj;
                                if (abstractC0990f.hasConnectionInfo() && !abstractC0990f.isConnecting()) {
                                    C0993i e10 = X4.i.e(e2, abstractC0990f, zaa);
                                    if (e10 != null) {
                                        e2.f14926o++;
                                        z8 = e10.f15069c;
                                    }
                                }
                            }
                        }
                        z8 = c1002s.f15109c;
                    }
                }
                iVar = new X4.i(c0967h, zaa, apiKey, z8 ? System.currentTimeMillis() : 0L, z8 ? SystemClock.elapsedRealtime() : 0L);
                if (iVar != null) {
                    Task task = taskCompletionSource.getTask();
                    zauVar.getClass();
                    task.addOnCompleteListener(new J0(zauVar, 2), iVar);
                }
            }
            iVar = null;
            if (iVar != null) {
            }
        }
        zauVar.sendMessage(zauVar.obtainMessage(4, new M(new U(i7, abstractC0982x, taskCompletionSource, interfaceC0979u), c0967h.f14997w.get(), this)));
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.internal.g, java.lang.Object] */
    public C0991g createClientSettingsBuilder() {
        ?? obj = new Object();
        Set emptySet = Collections.emptySet();
        if (obj.f15058a == null) {
            obj.f15058a = new C2053f(0);
        }
        obj.f15058a.addAll(emptySet);
        obj.f15060c = this.zab.getClass().getName();
        obj.f15059b = this.zab.getPackageName();
        return obj;
    }

    public Task<Boolean> disconnectService() {
        C0967h c0967h = this.zaa;
        c0967h.getClass();
        C c10 = new C(getApiKey());
        zau zauVar = c0967h.f14987B;
        zauVar.sendMessage(zauVar.obtainMessage(14, c10));
        return c10.f14914b.getTask();
    }

    public <A extends b, T extends AbstractC0963d> T doBestEffortWrite(T t5) {
        a(2, t5);
        return t5;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doBestEffortWrite(AbstractC0982x abstractC0982x) {
        return b(2, abstractC0982x);
    }

    public <A extends b, T extends AbstractC0963d> T doRead(T t5) {
        a(0, t5);
        return t5;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doRead(AbstractC0982x abstractC0982x) {
        return b(0, abstractC0982x);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends b, T extends com.google.android.gms.common.api.internal.r, U extends AbstractC0983y> Task<Void> doRegisterEventListener(T t5, U u3) {
        G.g(t5);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public <A extends b> Task<Void> doRegisterEventListener(AbstractC0977s abstractC0977s) {
        G.g(abstractC0977s);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(AbstractC0973n abstractC0973n) {
        return doUnregisterEventListener(abstractC0973n, 0);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(AbstractC0973n abstractC0973n, int i7) {
        G.h(abstractC0973n, "Listener key cannot be null.");
        throw null;
    }

    public <A extends b, T extends AbstractC0963d> T doWrite(T t5) {
        a(1, t5);
        return t5;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doWrite(AbstractC0982x abstractC0982x) {
        return b(1, abstractC0982x);
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C0960a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.gms.common.api.internal.o] */
    public <L> C0974o registerListener(L l10, String str) {
        Looper looper = this.zag;
        G.h(l10, "Listener must not be null");
        G.h(looper, "Looper must not be null");
        G.h(str, "Listener type must not be null");
        ?? obj = new Object();
        new zzh(looper);
        obj.f15002a = l10;
        G.d(str);
        return obj;
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, E e2) {
        C0991g createClientSettingsBuilder = createClientSettingsBuilder();
        C0992h c0992h = new C0992h(createClientSettingsBuilder.f15058a, createClientSettingsBuilder.f15059b, createClientSettingsBuilder.f15060c);
        a aVar = this.zad.f14902a;
        G.g(aVar);
        g buildClient = aVar.buildClient(this.zab, looper, c0992h, (Object) this.zae, (m) e2, (n) e2);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC0990f)) {
            ((AbstractC0990f) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof AbstractServiceConnectionC0975p)) {
            return buildClient;
        }
        A3.c.p(buildClient);
        throw null;
    }

    public final N zac(Context context, Handler handler) {
        C0991g createClientSettingsBuilder = createClientSettingsBuilder();
        return new N(context, handler, new C0992h(createClientSettingsBuilder.f15058a, createClientSettingsBuilder.f15059b, createClientSettingsBuilder.f15060c));
    }
}
