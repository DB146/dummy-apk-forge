package Y5;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f11449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11451f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f11452u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ S0 f11453v;

    public M0(S0 s02, String str, String str2, long j, Bundle bundle, boolean z8, boolean z10, boolean z11) {
        this.f11446a = str;
        this.f11447b = str2;
        this.f11448c = j;
        this.f11449d = bundle;
        this.f11450e = z8;
        this.f11451f = z10;
        this.f11452u = z11;
        Objects.requireNonNull(s02);
        this.f11453v = s02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11453v.S(this.f11446a, this.f11447b, this.f11448c, this.f11449d, this.f11450e, this.f11451f, this.f11452u);
    }
}
