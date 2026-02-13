package q9;

import android.hardware.Camera;

/* renamed from: q9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1907a implements Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1908b f23551a;

    public C1907a(C1908b c1908b) {
        this.f23551a = c1908b;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z8, Camera camera) {
        this.f23551a.f23556e.post(new k1.a(this, 7));
    }
}
