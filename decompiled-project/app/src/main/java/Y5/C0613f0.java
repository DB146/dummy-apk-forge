package Y5;

import I2.C0330t;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* renamed from: Y5.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613f0 extends AbstractC0659x0 {

    /* renamed from: N, reason: collision with root package name */
    public static final Pair f11728N = new Pair("", 0L);

    /* renamed from: A, reason: collision with root package name */
    public final C0330t f11729A;

    /* renamed from: B, reason: collision with root package name */
    public final r8.o f11730B;

    /* renamed from: C, reason: collision with root package name */
    public final C0607d0 f11731C;

    /* renamed from: D, reason: collision with root package name */
    public final C0610e0 f11732D;

    /* renamed from: E, reason: collision with root package name */
    public final C0610e0 f11733E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f11734F;

    /* renamed from: G, reason: collision with root package name */
    public final C0607d0 f11735G;

    /* renamed from: H, reason: collision with root package name */
    public final C0607d0 f11736H;

    /* renamed from: I, reason: collision with root package name */
    public final C0610e0 f11737I;

    /* renamed from: J, reason: collision with root package name */
    public final C0330t f11738J;

    /* renamed from: K, reason: collision with root package name */
    public final C0330t f11739K;
    public final C0610e0 L;

    /* renamed from: M, reason: collision with root package name */
    public final r8.o f11740M;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f11741c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f11742d;

    /* renamed from: e, reason: collision with root package name */
    public E3.d f11743e;

    /* renamed from: f, reason: collision with root package name */
    public final C0610e0 f11744f;

    /* renamed from: u, reason: collision with root package name */
    public final C0330t f11745u;

    /* renamed from: v, reason: collision with root package name */
    public String f11746v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11747w;

    /* renamed from: x, reason: collision with root package name */
    public long f11748x;

    /* renamed from: y, reason: collision with root package name */
    public final C0610e0 f11749y;

    /* renamed from: z, reason: collision with root package name */
    public final C0607d0 f11750z;

    public C0613f0(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11749y = new C0610e0(this, "session_timeout", 1800000L);
        this.f11750z = new C0607d0(this, "start_new_session", true);
        this.f11732D = new C0610e0(this, "last_pause_time", 0L);
        this.f11733E = new C0610e0(this, "session_id", 0L);
        this.f11729A = new C0330t(this, "non_personalized_ads");
        this.f11730B = new r8.o(this, "last_received_uri_timestamps_by_source");
        this.f11731C = new C0607d0(this, "allow_remote_dynamite", false);
        this.f11744f = new C0610e0(this, "first_open_time", 0L);
        com.google.android.gms.common.internal.G.d("app_install_time");
        this.f11745u = new C0330t(this, "app_instance_id");
        this.f11735G = new C0607d0(this, "app_backgrounded", false);
        this.f11736H = new C0607d0(this, "deep_link_retrieval_complete", false);
        this.f11737I = new C0610e0(this, "deep_link_retrieval_attempts", 0L);
        this.f11738J = new C0330t(this, "firebase_feature_rollouts");
        this.f11739K = new C0330t(this, "deferred_attribution_cache");
        this.L = new C0610e0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f11740M = new r8.o(this, "default_event_parameters");
    }

    @Override // Y5.AbstractC0659x0
    public final boolean K() {
        return true;
    }

    public final SharedPreferences N() {
        J();
        L();
        com.google.android.gms.common.internal.G.g(this.f11741c);
        return this.f11741c;
    }

    public final SharedPreferences O() {
        J();
        L();
        if (this.f11742d == null) {
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            String valueOf = String.valueOf(c0646q0.f11907a.getPackageName());
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            String concat = valueOf.concat("_preferences");
            w10.f11573B.b(concat, "Default prefs file");
            this.f11742d = c0646q0.f11907a.getSharedPreferences(concat, 0);
        }
        return this.f11742d;
    }

    public final SparseArray P() {
        Bundle n6 = this.f11730B.n();
        int[] intArray = n6.getIntArray("uriSources");
        long[] longArray = n6.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i7 = 0; i7 < intArray.length; i7++) {
            sparseArray.put(intArray[i7], Long.valueOf(longArray[i7]));
        }
        return sparseArray;
    }

    public final C0 Q() {
        J();
        return C0.c(N().getInt("consent_source", 100), N().getString("consent_settings", "G1"));
    }

    public final boolean R(u1 u1Var) {
        J();
        String string = N().getString("stored_tcf_param", "");
        String a9 = u1Var.a();
        if (a9.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = N().edit();
        edit.putString("stored_tcf_param", a9);
        edit.apply();
        return true;
    }

    public final void S(boolean z8) {
        J();
        W w10 = ((C0646q0) this.f3094a).f11912f;
        C0646q0.l(w10);
        w10.f11573B.b(Boolean.valueOf(z8), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = N().edit();
        edit.putBoolean("deferred_analytics_collection", z8);
        edit.apply();
    }

    public final boolean T(long j) {
        return j - this.f11749y.f() > this.f11732D.f();
    }
}
