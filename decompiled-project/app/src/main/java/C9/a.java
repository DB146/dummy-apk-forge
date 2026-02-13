package C9;

import A9.T;
import A9.Z1;
import android.view.SurfaceHolder;
import com.kt.apps.media.xemtv.beta.R;
import m4.C1549C;
import m4.q0;
import m4.u0;
import m4.v0;
import m4.w0;
import o5.w;
import t8.C2034c;
import y9.s;

/* loaded from: classes2.dex */
public final class a implements v0, SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3059a;

    public a(b bVar) {
        this.f3059a = bVar;
    }

    @Override // m4.v0
    public final void J(w wVar) {
        int round = Math.round(wVar.f22048a * wVar.f22051d);
        c cVar = (c) ((C2034c) this.f3059a.f3094a).f24513b;
        cVar.f3078x = round;
        int i7 = wVar.f22049b;
        cVar.f3079y = i7;
        T t5 = cVar.f3077w;
        if (t5 != null) {
            ((s) t5.f964a).f27531b.u0(round, i7);
        }
    }

    @Override // m4.v0
    public final void b(int i7) {
        C2034c c2034c = (C2034c) this.f3059a.f3094a;
        c cVar = (c) c2034c.f24513b;
        Z1 z12 = cVar.f3073e;
        if (z12 != null) {
            b bVar = cVar.f3072d;
            long j = -1;
            if (bVar.L()) {
                long b02 = bVar.f3061c.b0();
                if (b02 != -9223372036854775807L) {
                    j = b02;
                }
            }
            z12.d(j);
        }
        ((c) c2034c.f24513b).a();
        c2034c.d();
    }

    @Override // m4.v0
    public final void h(C1549C c1549c, u0 u0Var) {
        if (u0Var.a(5, 4)) {
            this.f3059a.N();
        }
    }

    @Override // m4.v0
    public final void i(q0 q0Var) {
        b bVar = this.f3059a;
        C2034c c2034c = (C2034c) bVar.f3094a;
        int i7 = q0Var.f20477a;
        String string = bVar.f3060b.getString(R.string.lb_media_player_error, Integer.valueOf(i7), 0);
        c cVar = (c) c2034c.f24513b;
        cVar.f3080z = true;
        cVar.f3067A = i7;
        cVar.f3068B = string;
        T t5 = cVar.f3077w;
        if (t5 != null) {
            t5.l(i7, string);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f3059a.S(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f3059a.S(null);
    }

    @Override // m4.v0
    public final void y(int i7, w0 w0Var, w0 w0Var2) {
        C2034c c2034c = (C2034c) this.f3059a.f3094a;
        ((c) c2034c.f24513b).a();
        c2034c.d();
    }
}
