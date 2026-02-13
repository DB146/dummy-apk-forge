package o;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import h.AbstractC1213a;
import r1.AbstractC1915b;
import r1.InterfaceC1914a;

/* renamed from: o.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1767x {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21614d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21615a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f21616b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21617c;

    public /* synthetic */ C1767x() {
    }

    public C1767x(AbsSeekBar absSeekBar) {
        this.f21616b = absSeekBar;
    }

    public C1767x(EditText editText) {
        this.f21616b = editText;
        this.f21617c = new R7.b(editText);
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((q3.c) ((R7.b) this.f21617c).f8929b).getClass();
        if (keyListener instanceof T1.d) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new T1.d(keyListener);
    }

    public void b(AttributeSet attributeSet, int i7) {
        switch (this.f21615a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f21616b;
                l2.X u3 = l2.X.u(absSeekBar.getContext(), attributeSet, f21614d, i7);
                Drawable o10 = u3.o(0);
                if (o10 != null) {
                    if (o10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) o10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e2 = e(animationDrawable.getFrame(i10), true);
                            e2.setLevel(10000);
                            animationDrawable2.addFrame(e2, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        o10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(o10);
                }
                Drawable o11 = u3.o(1);
                if (o11 != null) {
                    absSeekBar.setProgressDrawable(e(o11, false));
                }
                u3.w();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f21616b).getContext().obtainStyledAttributes(attributeSet, AbstractC1213a.f17573i, i7, 0);
                try {
                    boolean z8 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z8);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public T1.b c(InputConnection inputConnection) {
        R7.b bVar = (R7.b) this.f21617c;
        if (inputConnection == null) {
            bVar.getClass();
            inputConnection = null;
        } else {
            q3.c cVar = (q3.c) bVar.f8929b;
            cVar.getClass();
            if (!(inputConnection instanceof T1.b)) {
                inputConnection = new T1.b((EditText) cVar.f23371b, inputConnection);
            }
        }
        return (T1.b) inputConnection;
    }

    public void d(boolean z8) {
        T1.g gVar = (T1.g) ((q3.c) ((R7.b) this.f21617c).f8929b).f23372c;
        if (gVar.f9213b != z8) {
            gVar.f9213b = z8;
            if (z8) {
                S1.a.b();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z8) {
        if (drawable instanceof InterfaceC1914a) {
            ((AbstractC1915b) ((InterfaceC1914a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id = layerDrawable.getId(i7);
                    drawableArr[i7] = e(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f21617c) == null) {
                    this.f21617c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z8 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
