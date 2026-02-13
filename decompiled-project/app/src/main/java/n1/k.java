package n1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import q1.AbstractC1878d;
import u.C2066t;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f21047a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f21048b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21049c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00df A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i7, TypedValue typedValue, int i10, b bVar, boolean z8, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i7) + "\" (" + Integer.toHexString(i7) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i11 = typedValue.assetCookie;
            C2066t c2066t = AbstractC1878d.f23348b;
            Typeface typeface2 = (Typeface) c2066t.get(AbstractC1878d.b(resources, i7, charSequence2, i11, i10));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Aa.j(22, bVar, typeface2));
                }
            } else if (!z10) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        d k = b.k(resources.getXml(i7), resources);
                        if (k == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = AbstractC1878d.a(context, k, resources, i7, charSequence2, typedValue.assetCookie, i10, bVar, z8);
                        }
                    } else {
                        int i12 = typedValue.assetCookie;
                        typeface2 = AbstractC1878d.f23347a.n(context, resources, i7, charSequence2, i10);
                        if (typeface2 != null) {
                            c2066t.put(AbstractC1878d.b(resources, i7, charSequence2, i12, i10), typeface2);
                        }
                        if (bVar != null) {
                            if (typeface2 != null) {
                                new Handler(Looper.getMainLooper()).post(new Aa.j(22, bVar, typeface2));
                            } else {
                                bVar.a(-3);
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e10) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e10);
                    if (bVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
            typeface = typeface2;
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typeface == null || bVar != null || z10) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }
}
