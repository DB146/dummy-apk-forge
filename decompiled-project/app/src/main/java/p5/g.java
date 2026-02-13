package p5;

import android.opengl.GLES20;
import android.util.Log;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f23064i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f23065a;

    /* renamed from: b, reason: collision with root package name */
    public C6.l f23066b;

    /* renamed from: c, reason: collision with root package name */
    public B4.j f23067c;

    /* renamed from: d, reason: collision with root package name */
    public int f23068d;

    /* renamed from: e, reason: collision with root package name */
    public int f23069e;

    /* renamed from: f, reason: collision with root package name */
    public int f23070f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f23071h;

    public static boolean b(f fVar) {
        C6.l[] lVarArr = fVar.f23060a.f23059a;
        if (lVarArr.length != 1 || lVarArr[0].f2946a != 0) {
            return false;
        }
        C6.l[] lVarArr2 = fVar.f23061b.f23059a;
        return lVarArr2.length == 1 && lVarArr2[0].f2946a == 0;
    }

    public final void a() {
        try {
            B4.j jVar = new B4.j("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f23067c = jVar;
            this.f23068d = GLES20.glGetUniformLocation(jVar.f2089b, "uMvpMatrix");
            this.f23069e = GLES20.glGetUniformLocation(this.f23067c.f2089b, "uTexMatrix");
            this.f23070f = this.f23067c.k("aPosition");
            this.g = this.f23067c.k("aTexCoords");
            this.f23071h = GLES20.glGetUniformLocation(this.f23067c.f2089b, "uTexture");
        } catch (n5.g e2) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e2);
        }
    }
}
