package y7;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.InterfaceC0024m;
import B0.AbstractC0187l;
import G3.C0283e;
import K0.C0371a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import ia.C1358d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.C1586o0;
import n5.AbstractC1705a;
import o.V0;
import o.X0;
import w1.C2199c;

/* loaded from: classes.dex */
public abstract class u0 implements androidx.leanback.transition.f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27394a = 0;

    public static MappedByteBuffer A(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static ArrayList B(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new Eb.k(objArr, true));
    }

    public static final List C(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : x(list.get(0)) : Eb.v.f3891a;
    }

    public static F4.c D(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i10 = n5.D.f21141a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC1705a.S("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(I4.a.a(new n5.v(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    AbstractC1705a.R(e2, "VorbisUtil", "Failed to parse vorbis picture");
                }
            } else {
                arrayList.add(new I4.b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new F4.c(arrayList);
    }

    public static final String E(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.l.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static C1358d F(n5.v vVar, boolean z8, boolean z10) {
        if (z8) {
            Q(3, vVar, false);
        }
        vVar.t((int) vVar.m(), M6.e.f6799c);
        long m10 = vVar.m();
        String[] strArr = new String[(int) m10];
        for (int i7 = 0; i7 < m10; i7++) {
            strArr[i7] = vVar.t((int) vVar.m(), M6.e.f6799c);
        }
        if (z10 && (vVar.v() & 1) == 0) {
            throw C1586o0.a("framing bit expected to be set", null);
        }
        return new C1358d(strArr, 16);
    }

    public static final void G(TextPaint textPaint, float f4) {
        if (Float.isNaN(f4)) {
            return;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f4 * 255));
    }

    public static void H(TextView textView, int i7) {
        E6.b.e(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            C1.i.q(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void I(TextView textView, int i7) {
        E6.b.e(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i10);
        }
    }

    public static void J(TextView textView, int i7) {
        E6.b.e(i7);
        if (i7 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public static void K(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            V0.a(view, charSequence);
            return;
        }
        X0 x02 = X0.f21451y;
        if (x02 != null && x02.f21453a == view) {
            X0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new X0(view, charSequence);
            return;
        }
        X0 x03 = X0.f21452z;
        if (x03 != null && x03.f21453a == view) {
            x03.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void L(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void M() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static String N(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c10 = charArray[i7];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i7] = (char) (c10 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String O(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c10 = charArray[i7];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i7] = (char) (c10 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static ActionMode.Callback P(ActionMode.Callback callback) {
        return (!(callback instanceof C1.k) || Build.VERSION.SDK_INT < 26) ? callback : ((C1.k) callback).f2478a;
    }

    public static boolean Q(int i7, n5.v vVar, boolean z8) {
        if (vVar.a() < 7) {
            if (z8) {
                return false;
            }
            throw C1586o0.a("too short header: " + vVar.a(), null);
        }
        if (vVar.v() != i7) {
            if (z8) {
                return false;
            }
            throw C1586o0.a("expected header type " + Integer.toHexString(i7), null);
        }
        if (vVar.v() == 118 && vVar.v() == 111 && vVar.v() == 114 && vVar.v() == 98 && vVar.v() == 105 && vVar.v() == 115) {
            return true;
        }
        if (z8) {
            return false;
        }
        throw C1586o0.a("expected characters 'vorbis'", null);
    }

    public static ActionMode.Callback R(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof C1.k) || callback == null) ? callback : new C1.k(callback, textView);
    }

    public static C0371a d(String str, K0.F f4, long j, V0.d dVar, N0.d dVar2, int i7) {
        Eb.v vVar = Eb.v.f3891a;
        return new C0371a(new R0.c(str, f4, vVar, vVar, dVar2, dVar), i7, 1, j);
    }

    public static final H0.n e(A0.L l10, boolean z8) {
        c0.l lVar = (c0.l) l10.f60S.f229f;
        InterfaceC0024m interfaceC0024m = null;
        if ((lVar.f14116d & 8) != 0) {
            loop0: while (true) {
                if (lVar == null) {
                    break;
                }
                if ((lVar.f14115c & 8) != 0) {
                    c0.l lVar2 = lVar;
                    S.e eVar = null;
                    while (lVar2 != null) {
                        if (lVar2 instanceof A0.A0) {
                            interfaceC0024m = lVar2;
                            break loop0;
                        }
                        if ((lVar2.f14115c & 8) != 0 && (lVar2 instanceof AbstractC0025n)) {
                            int i7 = 0;
                            for (c0.l lVar3 = ((AbstractC0025n) lVar2).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                if ((lVar3.f14115c & 8) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        lVar2 = lVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new S.e(new c0.l[16]);
                                        }
                                        if (lVar2 != null) {
                                            eVar.b(lVar2);
                                            lVar2 = null;
                                        }
                                        eVar.b(lVar3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        lVar2 = AbstractC0017g.e(eVar);
                    }
                }
                if ((lVar.f14116d & 8) == 0) {
                    break;
                }
                lVar = lVar.f14118f;
            }
        }
        kotlin.jvm.internal.l.b(interfaceC0024m);
        c0.l lVar4 = ((c0.l) ((A0.A0) interfaceC0024m)).f14113a;
        H0.i v10 = l10.v();
        if (v10 == null) {
            v10 = new H0.i();
        }
        return new H0.n(lVar4, z8, l10, v10);
    }

    public static ArrayList f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new Eb.k(objArr, true));
    }

    public static int g(View view) {
        kotlin.jvm.internal.l.e(view, "<this>");
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(h3.o.l(visibility, "Unknown visibility "));
    }

    public static int h(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.l.e(arrayList, "<this>");
        int size2 = arrayList.size();
        int i7 = 0;
        if (size < 0) {
            throw new IllegalArgumentException(A3.c.e(0, size, "fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(A3.c.e(size, size2, "toIndex (", ") is greater than size (", ")."));
        }
        int i10 = size - 1;
        while (i7 <= i10) {
            int i11 = (i7 + i10) >>> 1;
            int h10 = q3.f.h((Comparable) arrayList.get(i11), comparable);
            if (h10 < 0) {
                i7 = i11 + 1;
            } else {
                if (h10 <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static Fb.b i(Fb.b bVar) {
        bVar.C();
        bVar.f4188c = true;
        return bVar.f4187b > 0 ? bVar : Fb.b.f4185d;
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean k(File file, Resources resources, int i7) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i7);
            try {
                boolean l10 = l(file, inputStream);
                j(inputStream);
                return l10;
            } catch (Throwable th) {
                th = th;
                j(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean l(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static Fb.b m() {
        return new Fb.b(10);
    }

    public static void n(e0.c cVar, LongSparseArray longSparseArray) {
        TranslationResponseValue k;
        CharSequence o10;
        B0.X0 x02;
        H0.n nVar;
        Rb.c cVar2;
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            long keyAt = longSparseArray.keyAt(i7);
            ViewTranslationResponse n6 = AbstractC0187l.n(longSparseArray.get(keyAt));
            if (n6 != null && (k = AbstractC0187l.k(n6)) != null && (o10 = AbstractC0187l.o(k)) != null && (x02 = (B0.X0) cVar.c().b((int) keyAt)) != null && (nVar = x02.f1809a) != null) {
                Object g = nVar.f4505d.f4494a.g(H0.h.k);
                if (g == null) {
                    g = null;
                }
                H0.a aVar = (H0.a) g;
                if (aVar != null && (cVar2 = (Rb.c) aVar.f4461b) != null) {
                }
            }
        }
    }

    public static boolean o(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (str.charAt(i7) != str2.charAt(i7) && ((c10 = (char) ((r4 | ' ') - 97)) >= 26 || c10 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String q(C0283e context, int i7) {
        kotlin.jvm.internal.l.e(context, "context");
        if (i7 <= 16777215) {
            return String.valueOf(i7);
        }
        try {
            Context context2 = context.f4301b;
            kotlin.jvm.internal.l.b(context2);
            String resourceName = context2.getResources().getResourceName(i7);
            kotlin.jvm.internal.l.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i7);
        }
    }

    public static Zb.g r(v2.q qVar) {
        kotlin.jvm.internal.l.e(qVar, "<this>");
        return Zb.i.N(qVar, new Ba.i(16));
    }

    public static int s(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        return list.size() - 1;
    }

    public static final A0.A0 t(A0.L l10) {
        c0.l lVar = (c0.l) l10.f60S.f229f;
        Object obj = null;
        if ((lVar.f14116d & 8) != 0) {
            loop0: while (true) {
                if (lVar == null) {
                    break;
                }
                if ((lVar.f14115c & 8) != 0) {
                    c0.l lVar2 = lVar;
                    S.e eVar = null;
                    while (lVar2 != null) {
                        if (lVar2 instanceof A0.A0) {
                            if (((A0.A0) lVar2).O()) {
                                obj = lVar2;
                                break loop0;
                            }
                        } else if ((lVar2.f14115c & 8) != 0 && (lVar2 instanceof AbstractC0025n)) {
                            int i7 = 0;
                            for (c0.l lVar3 = ((AbstractC0025n) lVar2).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                if ((lVar3.f14115c & 8) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        lVar2 = lVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new S.e(new c0.l[16]);
                                        }
                                        if (lVar2 != null) {
                                            eVar.b(lVar2);
                                            lVar2 = null;
                                        }
                                        eVar.b(lVar3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        lVar2 = AbstractC0017g.e(eVar);
                    }
                }
                if ((lVar.f14116d & 8) == 0) {
                    break;
                }
                lVar = lVar.f14118f;
            }
        }
        return (A0.A0) obj;
    }

    public static File u(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static C2199c v(AppCompatTextView appCompatTextView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new C2199c(C1.i.n(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i7 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
                boolean z8 = appCompatTextView.getLayoutDirection() == 1;
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z8) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(C1.i.c(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C2199c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int w(int i7) {
        int i10 = 0;
        while (i7 > 0) {
            i10++;
            i7 >>>= 1;
        }
        return i10;
    }

    public static List x(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.l.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List y(Object... objArr) {
        return objArr.length > 0 ? Eb.n.J(objArr) : Eb.v.f3891a;
    }

    public static String z(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb2.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb2.append(str2.charAt(i7));
            }
        }
        return sb2.toString();
    }

    @Override // androidx.leanback.transition.f
    public float b(View view) {
        return view.getTranslationY();
    }

    @Override // androidx.leanback.transition.f
    public Property c() {
        return View.TRANSLATION_Y;
    }

    public abstract void p(y6.s sVar, float f4, float f10);
}
