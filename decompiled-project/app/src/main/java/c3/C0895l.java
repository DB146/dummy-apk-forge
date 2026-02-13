package c3;

import A4.s;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import q1.C1877c;
import u.C2052e;
import u.T;

/* renamed from: c3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895l {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f14299p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f14300a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f14301b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f14302c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f14303d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f14304e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f14305f;
    public final C0892i g;

    /* renamed from: h, reason: collision with root package name */
    public float f14306h;

    /* renamed from: i, reason: collision with root package name */
    public float f14307i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public int f14308l;

    /* renamed from: m, reason: collision with root package name */
    public String f14309m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f14310n;

    /* renamed from: o, reason: collision with root package name */
    public final C2052e f14311o;

    /* JADX WARN: Type inference failed for: r0v4, types: [u.T, u.e] */
    public C0895l() {
        this.f14302c = new Matrix();
        this.f14306h = 0.0f;
        this.f14307i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f14308l = 255;
        this.f14309m = null;
        this.f14310n = null;
        this.f14311o = new T(0);
        this.g = new C0892i();
        this.f14300a = new Path();
        this.f14301b = new Path();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [u.T, u.e] */
    public C0895l(C0895l c0895l) {
        this.f14302c = new Matrix();
        this.f14306h = 0.0f;
        this.f14307i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f14308l = 255;
        this.f14309m = null;
        this.f14310n = null;
        ?? t5 = new T(0);
        this.f14311o = t5;
        this.g = new C0892i(c0895l.g, t5);
        this.f14300a = new Path(c0895l.f14300a);
        this.f14301b = new Path(c0895l.f14301b);
        this.f14306h = c0895l.f14306h;
        this.f14307i = c0895l.f14307i;
        this.j = c0895l.j;
        this.k = c0895l.k;
        this.f14308l = c0895l.f14308l;
        this.f14309m = c0895l.f14309m;
        String str = c0895l.f14309m;
        if (str != null) {
            t5.put(str, this);
        }
        this.f14310n = c0895l.f14310n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0892i c0892i, Matrix matrix, Canvas canvas, int i7, int i10) {
        Matrix matrix2;
        int i11;
        float f4;
        int i12 = 1;
        c0892i.f14288a.set(matrix);
        Matrix matrix3 = c0892i.j;
        Matrix matrix4 = c0892i.f14288a;
        matrix4.preConcat(matrix3);
        canvas.save();
        ?? r11 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = c0892i.f14289b;
            if (i13 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0893j abstractC0893j = (AbstractC0893j) arrayList.get(i13);
            if (abstractC0893j instanceof C0892i) {
                a((C0892i) abstractC0893j, matrix4, canvas, i7, i10);
                i11 = i12;
                matrix2 = matrix4;
            } else if (abstractC0893j instanceof AbstractC0894k) {
                AbstractC0894k abstractC0894k = (AbstractC0894k) abstractC0893j;
                float f10 = i7 / this.j;
                float f11 = i10 / this.k;
                float min = Math.min(f10, f11);
                Matrix matrix5 = this.f14302c;
                matrix5.set(matrix4);
                matrix5.postScale(f10, f11);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix4.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i12]);
                matrix2 = matrix4;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f12 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f12) / max : 0.0f;
                if (abs != 0.0f) {
                    abstractC0894k.getClass();
                    Path path = this.f14300a;
                    path.reset();
                    C1877c[] c1877cArr = abstractC0894k.f14296a;
                    if (c1877cArr != null) {
                        C1877c.b(c1877cArr, path);
                    }
                    Path path2 = this.f14301b;
                    path2.reset();
                    if (abstractC0894k instanceof C0890g) {
                        path2.setFillType(abstractC0894k.f14298c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix5);
                        canvas.clipPath(path2);
                    } else {
                        C0891h c0891h = (C0891h) abstractC0894k;
                        float f13 = c0891h.f14284i;
                        float f14 = f13 == 0.0f ? 1.0f : 1.0f;
                        float f15 = c0891h.k;
                        float f16 = (f13 + f15) % f14;
                        float f17 = (c0891h.j + f15) % f14;
                        if (this.f14305f == null) {
                            this.f14305f = new PathMeasure();
                        }
                        this.f14305f.setPath(path, r11);
                        float length = this.f14305f.getLength();
                        float f18 = f16 * length;
                        float f19 = f17 * length;
                        path.reset();
                        if (f18 > f19) {
                            this.f14305f.getSegment(f18, length, path, true);
                            f4 = 0.0f;
                            this.f14305f.getSegment(0.0f, f19, path, true);
                        } else {
                            f4 = 0.0f;
                            this.f14305f.getSegment(f18, f19, path, true);
                        }
                        path.rLineTo(f4, f4);
                        path2.addPath(path, matrix5);
                        s sVar = c0891h.f14282f;
                        if ((((Shader) sVar.f471b) == null && sVar.f470a == 0) ? r11 : true) {
                            if (this.f14304e == null) {
                                Paint paint = new Paint(1);
                                this.f14304e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f14304e;
                            Shader shader = (Shader) sVar.f471b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix5);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0891h.f14283h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i14 = sVar.f470a;
                                float f20 = c0891h.f14283h;
                                PorterDuff.Mode mode = C0898o.f14322x;
                                paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f20)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0891h.f14298c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        s sVar2 = c0891h.f14280d;
                        if (((Shader) sVar2.f471b) != null || sVar2.f470a != 0) {
                            if (this.f14303d == null) {
                                Paint paint3 = new Paint(1);
                                this.f14303d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f14303d;
                            Paint.Join join = c0891h.f14286m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0891h.f14285l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0891h.f14287n);
                            Shader shader2 = (Shader) sVar2.f471b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix5);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0891h.g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i15 = sVar2.f470a;
                                float f21 = c0891h.g;
                                PorterDuff.Mode mode2 = C0898o.f14322x;
                                paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0891h.f14281e * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i11 = 1;
            } else {
                matrix2 = matrix4;
                i11 = i12;
            }
            i13 += i11;
            i12 = i11;
            matrix4 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f14308l;
    }

    public void setAlpha(float f4) {
        setRootAlpha((int) (f4 * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.f14308l = i7;
    }
}
