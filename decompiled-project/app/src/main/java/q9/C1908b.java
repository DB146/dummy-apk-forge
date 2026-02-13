package q9;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: q9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1908b {
    public static final ArrayList g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f23552a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23553b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23554c;

    /* renamed from: d, reason: collision with root package name */
    public final Camera f23555d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f23556e;

    /* renamed from: f, reason: collision with root package name */
    public final C1907a f23557f;

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C1908b(Camera camera, i iVar) {
        A6.e eVar = new A6.e(this, 4);
        this.f23557f = new C1907a(this);
        this.f23556e = new Handler(eVar);
        this.f23555d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        iVar.getClass();
        boolean contains = g.contains(focusMode);
        this.f23554c = contains;
        Log.i("b", "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        this.f23552a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f23552a && !this.f23556e.hasMessages(1)) {
            Handler handler = this.f23556e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (!this.f23554c || this.f23552a || this.f23553b) {
            return;
        }
        try {
            this.f23555d.autoFocus(this.f23557f);
            this.f23553b = true;
        } catch (RuntimeException e2) {
            Log.w("b", "Unexpected exception while focusing", e2);
            a();
        }
    }

    public final void c() {
        this.f23552a = true;
        this.f23553b = false;
        this.f23556e.removeMessages(1);
        if (this.f23554c) {
            try {
                this.f23555d.cancelAutoFocus();
            } catch (RuntimeException e2) {
                Log.w("b", "Unexpected exception while cancelling focusing", e2);
            }
        }
    }
}
