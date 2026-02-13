package q1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: q1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883i extends vc.i {
    public static Font J(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int L = L(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int L10 = L(fontStyle, font2.getStyle());
            if (L10 < L) {
                font = font2;
                L = L10;
            }
        }
        return font;
    }

    public static FontFamily K(v1.h[] hVarArr, ContentResolver contentResolver) {
        int i7;
        ParcelFileDescriptor openFileDescriptor;
        int length = hVarArr.length;
        FontFamily.Builder builder = null;
        while (i7 < length) {
            v1.h hVar = hVarArr[i7];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(hVar.f24953a, "r", null);
            } catch (IOException e2) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            }
            if (openFileDescriptor != null) {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(hVar.f24955c).setSlant(hVar.f24956d ? 1 : 0).setTtcIndex(hVar.f24954b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            } else {
                i7 = openFileDescriptor == null ? i7 + 1 : 0;
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int L(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // vc.i
    public final Typeface j(Context context, n1.e eVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (n1.f fVar : eVar.f21030a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f21036f).setWeight(fVar.f21032b).setSlant(fVar.f21033c ? 1 : 0).setTtcIndex(fVar.f21035e).setFontVariationSettings(fVar.f21034d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i7).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // vc.i
    public final Typeface k(Context context, v1.h[] hVarArr, int i7) {
        try {
            FontFamily K10 = K(hVarArr, context.getContentResolver());
            if (K10 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(K10).setStyle(J(K10, i7).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // vc.i
    public final Typeface l(Context context, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily K10 = K((v1.h[]) list.get(0), contentResolver);
            if (K10 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(K10);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily K11 = K((v1.h[]) list.get(i10), contentResolver);
                if (K11 != null) {
                    customFallbackBuilder.addCustomFallback(K11);
                }
            }
            return customFallbackBuilder.setStyle(J(K10, i7).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // vc.i
    public final Typeface m(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // vc.i
    public final Typeface n(Context context, Resources resources, int i7, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // vc.i
    public final v1.h p(v1.h[] hVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
