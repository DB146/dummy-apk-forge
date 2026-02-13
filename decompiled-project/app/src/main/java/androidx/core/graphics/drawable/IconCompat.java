package androidx.core.graphics.drawable;

import C1.i;
import D0.d;
import D0.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f13275a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13276b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f13277c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f13278d;

    /* renamed from: e, reason: collision with root package name */
    public int f13279e;

    /* renamed from: f, reason: collision with root package name */
    public int f13280f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f13281h;

    /* renamed from: i, reason: collision with root package name */
    public String f13282i;
    public String j;

    public IconCompat() {
        this.f13275a = -1;
        this.f13277c = null;
        this.f13278d = null;
        this.f13279e = 0;
        this.f13280f = 0;
        this.g = null;
        this.f13281h = k;
        this.f13282i = null;
    }

    public IconCompat(int i7) {
        this.f13277c = null;
        this.f13278d = null;
        this.f13279e = 0;
        this.f13280f = 0;
        this.g = null;
        this.f13281h = k;
        this.f13282i = null;
        this.f13275a = i7;
    }

    public static Bitmap a(Bitmap bitmap, boolean z8) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f4 = min;
        float f10 = 0.5f * f4;
        float f11 = 0.9166667f * f10;
        if (z8) {
            float f12 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f13279e = i7;
        iconCompat.f13276b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    public final int c() {
        int i7 = this.f13275a;
        if (i7 != -1) {
            if (i7 == 2) {
                return this.f13279e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f13276b;
        if (i10 >= 28) {
            return i.g(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        }
    }

    public final int d() {
        int i7 = this.f13275a;
        if (i7 != -1) {
            return i7;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f13276b;
        if (i10 >= 28) {
            return i.o(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        }
    }

    public final Uri e() {
        int i7 = this.f13275a;
        if (i7 != -1) {
            if (i7 == 4 || i7 == 6) {
                return Uri.parse((String) this.f13276b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f13276b;
        if (i10 >= 28) {
            return i.p(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        }
    }

    public final InputStream f(Context context) {
        Uri e2 = e();
        String scheme = e2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(e2);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + e2, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f13276b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + e2, e11);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Icon g(Context context) {
        Icon createWithBitmap;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i7 = Build.VERSION.SDK_INT;
        int i10 = this.f13275a;
        switch (i10) {
            case -1:
                return (Icon) this.f13276b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f13276b);
                break;
            case 2:
                if (i10 == -1) {
                    Object obj = this.f13276b;
                    if (i7 >= 28) {
                        str = i.h(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                            str = null;
                            createWithBitmap = Icon.createWithResource(str, this.f13279e);
                            colorStateList = this.g;
                            if (colorStateList != null) {
                            }
                            mode = this.f13281h;
                            if (mode != k) {
                            }
                        } catch (NoSuchMethodException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                            str = null;
                            createWithBitmap = Icon.createWithResource(str, this.f13279e);
                            colorStateList = this.g;
                            if (colorStateList != null) {
                            }
                            mode = this.f13281h;
                            if (mode != k) {
                            }
                        } catch (InvocationTargetException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                            str = null;
                            createWithBitmap = Icon.createWithResource(str, this.f13279e);
                            colorStateList = this.g;
                            if (colorStateList != null) {
                            }
                            mode = this.f13281h;
                            if (mode != k) {
                            }
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f13276b).split(":", -1)[0] : this.j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f13279e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f13276b, this.f13279e, this.f13280f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f13276b);
                break;
            case 5:
                if (i7 < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f13276b, false));
                    break;
                } else {
                    createWithBitmap = d.a((Bitmap) this.f13276b);
                    break;
                }
            case 6:
                if (i7 >= 30) {
                    createWithBitmap = e.b(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    InputStream f4 = f(context);
                    if (f4 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (i7 < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(f4), false));
                        break;
                    } else {
                        createWithBitmap = d.a(BitmapFactory.decodeStream(f4));
                        break;
                    }
                }
        }
        colorStateList = this.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        mode = this.f13281h;
        if (mode != k) {
            return createWithBitmap;
        }
        createWithBitmap.setTintMode(mode);
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f13275a == -1) {
            return String.valueOf(this.f13276b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f13275a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f13275a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f13276b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f13276b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f13279e);
                if (this.f13280f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f13280f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f13276b);
                break;
        }
        if (this.g != null) {
            sb2.append(" tint=");
            sb2.append(this.g);
        }
        if (this.f13281h != k) {
            sb2.append(" mode=");
            sb2.append(this.f13281h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
