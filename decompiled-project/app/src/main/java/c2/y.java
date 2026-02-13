package c2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public class y extends t {

    /* renamed from: M0, reason: collision with root package name */
    public SurfaceView f14260M0;

    @Override // c2.t, W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) super.T(layoutInflater, viewGroup, bundle);
        SurfaceView surfaceView = (SurfaceView) LayoutInflater.from(C()).inflate(R.layout.lb_video_surface, viewGroup2, false);
        this.f14260M0 = surfaceView;
        viewGroup2.addView(surfaceView, 0);
        this.f14260M0.getHolder().addCallback(new x(this, 0));
        if (2 != this.f14226t0) {
            this.f14226t0 = 2;
            s0();
        }
        return viewGroup2;
    }

    @Override // c2.t, W1.C
    public final void V() {
        this.f14260M0 = null;
        super.V();
    }
}
