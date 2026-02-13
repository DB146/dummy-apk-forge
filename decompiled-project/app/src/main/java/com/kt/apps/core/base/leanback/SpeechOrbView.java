package com.kt.apps.core.base.leanback;

import A9.K2;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class SpeechOrbView extends SearchOrbView {

    /* renamed from: G, reason: collision with root package name */
    public final float f16095G;

    /* renamed from: H, reason: collision with root package name */
    public K2 f16096H;

    /* renamed from: I, reason: collision with root package name */
    public K2 f16097I;

    /* renamed from: J, reason: collision with root package name */
    public int f16098J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f16099K;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f16098J = 0;
        this.f16099K = false;
        Resources resources = context.getResources();
        this.f16095G = resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.f16097I = new K2(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        this.f16096H = new K2(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        c();
    }

    public final void c() {
        setOrbColors(this.f16097I);
        setOrbIcon(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        a(hasFocus());
        View view = this.f16045c;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.f16099K = false;
    }

    @Override // com.kt.apps.core.base.leanback.SearchOrbView
    public int getLayoutResourceId() {
        return R.layout.lb_speech_orb;
    }

    public void setListeningOrbColors(K2 k22) {
        this.f16096H = k22;
    }

    public void setNotListeningOrbColors(K2 k22) {
        this.f16097I = k22;
    }

    public void setSoundLevel(int i7) {
        if (this.f16099K) {
            int i10 = this.f16098J;
            if (i7 > i10) {
                this.f16098J = ((i7 - i10) / 2) + i10;
            } else {
                this.f16098J = (int) (i10 * 0.7f);
            }
            float focusedZoom = (((this.f16095G - getFocusedZoom()) * this.f16098J) / 100.0f) + 1.0f;
            View view = this.f16045c;
            view.setScaleX(focusedZoom);
            view.setScaleY(focusedZoom);
        }
    }
}
