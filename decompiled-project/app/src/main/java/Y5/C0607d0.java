package Y5;

import android.content.SharedPreferences;
import java.util.Objects;

/* renamed from: Y5.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11699a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11700b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11701c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0613f0 f11703e;

    public C0607d0(C0613f0 c0613f0, String str, boolean z8) {
        Objects.requireNonNull(c0613f0);
        this.f11703e = c0613f0;
        com.google.android.gms.common.internal.G.d(str);
        this.f11699a = str;
        this.f11700b = z8;
    }

    public final boolean a() {
        if (!this.f11701c) {
            this.f11701c = true;
            this.f11702d = this.f11703e.N().getBoolean(this.f11699a, this.f11700b);
        }
        return this.f11702d;
    }

    public final void b(boolean z8) {
        SharedPreferences.Editor edit = this.f11703e.N().edit();
        edit.putBoolean(this.f11699a, z8);
        edit.apply();
        this.f11702d = z8;
    }
}
