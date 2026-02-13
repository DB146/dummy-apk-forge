package p5;

import I2.C0330t;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class k implements GLSurfaceView.Renderer, InterfaceC1852c {

    /* renamed from: a, reason: collision with root package name */
    public final i f23089a;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23092d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f23093e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f23094f;

    /* renamed from: u, reason: collision with root package name */
    public float f23095u;

    /* renamed from: v, reason: collision with root package name */
    public float f23096v;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f23099y;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23090b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f23091c = new float[16];

    /* renamed from: w, reason: collision with root package name */
    public final float[] f23097w = new float[16];

    /* renamed from: x, reason: collision with root package name */
    public final float[] f23098x = new float[16];

    public k(l lVar, i iVar) {
        this.f23099y = lVar;
        float[] fArr = new float[16];
        this.f23092d = fArr;
        float[] fArr2 = new float[16];
        this.f23093e = fArr2;
        float[] fArr3 = new float[16];
        this.f23094f = fArr3;
        this.f23089a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f23096v = 3.1415927f;
    }

    @Override // p5.InterfaceC1852c
    public final synchronized void a(float[] fArr, float f4) {
        float[] fArr2 = this.f23092d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f10 = -f4;
        this.f23096v = f10;
        Matrix.setRotateM(this.f23093e, 0, -this.f23095u, (float) Math.cos(f10), (float) Math.sin(this.f23096v), 0.0f);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, C6.l] */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object d10;
        Object d11;
        Object d12;
        float[] fArr;
        synchronized (this) {
            Matrix.multiplyMM(this.f23098x, 0, this.f23092d, 0, this.f23094f, 0);
            Matrix.multiplyMM(this.f23097w, 0, this.f23093e, 0, this.f23098x, 0);
        }
        Matrix.multiplyMM(this.f23091c, 0, this.f23090b, 0, this.f23097w, 0);
        i iVar = this.f23089a;
        float[] fArr2 = this.f23091c;
        GLES20.glClear(16384);
        try {
            AbstractC1705a.i();
        } catch (n5.g e2) {
            AbstractC1705a.u("SceneRenderer", "Failed to draw a frame", e2);
        }
        if (iVar.f23074a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.f23083x;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC1705a.i();
            } catch (n5.g e10) {
                AbstractC1705a.u("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (iVar.f23075b.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.f23080u, 0);
            }
            long timestamp = iVar.f23083x.getTimestamp();
            C6.l lVar = iVar.f23078e;
            synchronized (lVar) {
                d10 = lVar.d(timestamp, false);
            }
            Long l10 = (Long) d10;
            if (l10 != null) {
                C0330t c0330t = iVar.f23077d;
                float[] fArr3 = iVar.f23080u;
                long longValue = l10.longValue();
                C6.l lVar2 = (C6.l) c0330t.f5202d;
                synchronized (lVar2) {
                    d12 = lVar2.d(longValue, true);
                }
                float[] fArr4 = (float[]) d12;
                if (fArr4 != null) {
                    float f4 = fArr4[0];
                    float f10 = -fArr4[1];
                    float f11 = -fArr4[2];
                    float length = Matrix.length(f4, f10, f11);
                    float[] fArr5 = (float[]) c0330t.f5201c;
                    if (length != 0.0f) {
                        fArr = fArr3;
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f4 / length, f10 / length, f11 / length);
                    } else {
                        fArr = fArr3;
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!c0330t.f5199a) {
                        C0330t.h((float[]) c0330t.f5200b, (float[]) c0330t.f5201c);
                        c0330t.f5199a = true;
                    }
                    Matrix.multiplyMM(fArr, 0, (float[]) c0330t.f5200b, 0, (float[]) c0330t.f5201c, 0);
                }
            }
            C6.l lVar3 = iVar.f23079f;
            synchronized (lVar3) {
                d11 = lVar3.d(timestamp, true);
            }
            f fVar = (f) d11;
            if (fVar != null) {
                g gVar = iVar.f23076c;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f23065a = fVar.f23062c;
                    C6.l lVar4 = fVar.f23060a.f23059a[0];
                    ?? obj = new Object();
                    float[] fArr6 = (float[]) lVar4.f2948c;
                    obj.f2946a = fArr6.length / 3;
                    obj.f2948c = AbstractC1705a.r(fArr6);
                    obj.f2949d = AbstractC1705a.r((float[]) lVar4.f2949d);
                    int i7 = lVar4.f2947b;
                    if (i7 == 1) {
                        obj.f2947b = 5;
                    } else if (i7 != 2) {
                        obj.f2947b = 4;
                    } else {
                        obj.f2947b = 6;
                    }
                    gVar.f23066b = obj;
                    if (!fVar.f23063d) {
                        C6.l lVar5 = fVar.f23061b.f23059a[0];
                        float[] fArr7 = (float[]) lVar5.f2948c;
                        int length2 = fArr7.length;
                        AbstractC1705a.r(fArr7);
                        AbstractC1705a.r((float[]) lVar5.f2949d);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.f23081v, 0, fArr2, 0, iVar.f23080u, 0);
        g gVar2 = iVar.f23076c;
        int i10 = iVar.f23082w;
        float[] fArr8 = iVar.f23081v;
        C6.l lVar6 = gVar2.f23066b;
        if (lVar6 == null) {
            return;
        }
        int i11 = gVar2.f23065a;
        GLES20.glUniformMatrix3fv(gVar2.f23069e, 1, false, i11 == 1 ? g.j : i11 == 2 ? g.k : g.f23064i, 0);
        GLES20.glUniformMatrix4fv(gVar2.f23068d, 1, false, fArr8, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(gVar2.f23071h, 0);
        try {
            AbstractC1705a.i();
        } catch (n5.g e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(gVar2.f23070f, 3, 5126, false, 12, (Buffer) lVar6.f2948c);
        try {
            AbstractC1705a.i();
        } catch (n5.g e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(gVar2.g, 2, 5126, false, 8, (Buffer) lVar6.f2949d);
        try {
            AbstractC1705a.i();
        } catch (n5.g e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(lVar6.f2947b, 0, lVar6.f2946a);
        try {
            AbstractC1705a.i();
        } catch (n5.g e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        GLES20.glViewport(0, 0, i7, i10);
        float f4 = i7 / i10;
        Matrix.perspectiveM(this.f23090b, 0, f4 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f4)) * 2.0d) : 90.0f, f4, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        l lVar = this.f23099y;
        lVar.f23105e.post(new j(0, lVar, this.f23089a.c()));
    }
}
