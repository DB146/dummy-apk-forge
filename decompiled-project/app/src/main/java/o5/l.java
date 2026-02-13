package o5;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class l implements GLSurfaceView.Renderer {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f22010v = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: w, reason: collision with root package name */
    public static final FloatBuffer f22011w = AbstractC1705a.r(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: a, reason: collision with root package name */
    public final m f22012a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22013b = new int[3];

    /* renamed from: c, reason: collision with root package name */
    public final int[] f22014c = new int[3];

    /* renamed from: d, reason: collision with root package name */
    public final int[] f22015d = new int[3];

    /* renamed from: e, reason: collision with root package name */
    public final int[] f22016e = new int[3];

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f22017f = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public B4.j f22018u;

    public l(m mVar) {
        this.f22012a = mVar;
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = this.f22015d;
            this.f22016e[i7] = -1;
            iArr[i7] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f22013b;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i7 = 0; i7 < 3; i7++) {
                B4.j jVar = this.f22018u;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(jVar.f2089b, f22010v[i7]), i7);
                GLES20.glActiveTexture(33984 + i7);
                AbstractC1705a.d(3553, iArr[i7]);
            }
            AbstractC1705a.i();
        } catch (n5.g e2) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f22017f.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        GLES20.glViewport(0, 0, i7, i10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f22014c;
        try {
            B4.j jVar = new B4.j("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f22018u = jVar;
            GLES20.glVertexAttribPointer(jVar.k("in_pos"), 2, 5126, false, 0, (Buffer) f22011w);
            iArr[0] = this.f22018u.k("in_tc_y");
            iArr[1] = this.f22018u.k("in_tc_u");
            iArr[2] = this.f22018u.k("in_tc_v");
            GLES20.glGetUniformLocation(this.f22018u.f2089b, "mColorConversion");
            AbstractC1705a.i();
            a();
            AbstractC1705a.i();
        } catch (n5.g e2) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e2);
        }
    }
}
