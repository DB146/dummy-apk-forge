package com.journeyapps.barcodescanner;

import E5.o;
import P8.d;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1108c;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import n5.u;
import p9.C1861b;
import p9.e;
import p9.j;
import p9.k;
import p9.m;
import p9.q;
import q3.f;

/* loaded from: classes2.dex */
public class BarcodeView extends e {

    /* renamed from: O, reason: collision with root package name */
    public int f15886O;

    /* renamed from: P, reason: collision with root package name */
    public C1108c f15887P;

    /* renamed from: Q, reason: collision with root package name */
    public m f15888Q;

    /* renamed from: R, reason: collision with root package name */
    public k f15889R;

    /* renamed from: S, reason: collision with root package name */
    public final Handler f15890S;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15886O = 1;
        this.f15887P = null;
        C1861b c1861b = new C1861b(this, 0);
        this.f15889R = new u(3);
        this.f15890S = new Handler(c1861b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p9.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [P8.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [p9.j, p9.p] */
    public final j f() {
        j jVar;
        if (this.f15889R == null) {
            this.f15889R = new u(3);
        }
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put(d.f8204x, obj);
        u uVar = (u) this.f15889R;
        uVar.getClass();
        EnumMap enumMap = new EnumMap(d.class);
        enumMap.putAll(hashMap);
        EnumMap enumMap2 = (EnumMap) uVar.f21224d;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = (Set) uVar.f21223c;
        if (set != null) {
            enumMap.put((EnumMap) d.f8197c, (d) set);
        }
        String str = (String) uVar.f21225e;
        if (str != null) {
            enumMap.put((EnumMap) d.f8199e, (d) str);
        }
        ?? obj2 = new Object();
        obj2.c(enumMap);
        int i7 = uVar.f21222b;
        if (i7 == 0) {
            jVar = new j(obj2);
        } else if (i7 == 1) {
            jVar = new j(obj2);
        } else if (i7 != 2) {
            jVar = new j(obj2);
        } else {
            ?? jVar2 = new j(obj2);
            jVar2.f23212c = true;
            jVar = jVar2;
        }
        obj.f23203a = jVar;
        return jVar;
    }

    public final void g() {
        TextureView textureView;
        SurfaceView surfaceView;
        i();
        f.E();
        Log.d("e", "pause()");
        this.f23182w = -1;
        q9.f fVar = this.f23174a;
        if (fVar != null) {
            f.E();
            if (fVar.f23570f) {
                fVar.f23565a.d(fVar.f23573l);
            } else {
                fVar.g = true;
            }
            fVar.f23570f = false;
            this.f23174a = null;
            this.f23180u = false;
        } else {
            this.f23176c.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f23165D == null && (surfaceView = this.f23178e) != null) {
            surfaceView.getHolder().removeCallback(this.f23172K);
        }
        if (this.f23165D == null && (textureView = this.f23179f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f23162A = null;
        this.f23163B = null;
        this.f23167F = null;
        o oVar = this.f23181v;
        q qVar = (q) oVar.f3714c;
        if (qVar != null) {
            qVar.disable();
        }
        oVar.f3714c = null;
        oVar.f3713b = null;
        oVar.f3715d = null;
        this.f23173M.j();
    }

    public k getDecoderFactory() {
        return this.f15889R;
    }

    public final void h() {
        i();
        if (this.f15886O == 1 || !this.f23180u) {
            return;
        }
        m mVar = new m(getCameraInstance(), f(), this.f15890S);
        this.f15888Q = mVar;
        mVar.f23209f = getPreviewFramingRect();
        m mVar2 = this.f15888Q;
        mVar2.getClass();
        f.E();
        HandlerThread handlerThread = new HandlerThread("m");
        mVar2.f23205b = handlerThread;
        handlerThread.start();
        mVar2.f23206c = new Handler(mVar2.f23205b.getLooper(), mVar2.f23211i);
        mVar2.g = true;
        q9.f fVar = mVar2.f23204a;
        fVar.f23571h.post(new q9.d(fVar, mVar2.j, 0));
    }

    public final void i() {
        m mVar = this.f15888Q;
        if (mVar != null) {
            mVar.getClass();
            f.E();
            synchronized (mVar.f23210h) {
                mVar.g = false;
                mVar.f23206c.removeCallbacksAndMessages(null);
                mVar.f23205b.quit();
            }
            this.f15888Q = null;
        }
    }

    public void setDecoderFactory(k kVar) {
        f.E();
        this.f15889R = kVar;
        m mVar = this.f15888Q;
        if (mVar != null) {
            mVar.f23207d = f();
        }
    }
}
