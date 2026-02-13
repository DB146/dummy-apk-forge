package com.bumptech.glide;

import L7.C0381a;
import L7.C0385e;
import L7.z;
import P4.C0463k;
import T7.p;
import T7.s;
import T7.v;
import a5.C0775a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.widget.EdgeEffect;
import h3.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import y.AbstractC2315x;
import za.C2606e;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14606a = 0;

    public static final boolean A(int i7) {
        return i7 == 0;
    }

    public static HashMap B(O7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(aVar.c()));
        return hashMap;
    }

    public static Map C() {
        return (Map) C2606e.K1.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T6.a, java.lang.Object] */
    public static C0463k D(Context context) {
        C0463k x2;
        try {
            U6.e.a();
            ?? obj = new Object();
            obj.f9320a = null;
            obj.f9321b = null;
            obj.f9322c = null;
            obj.f9323d = null;
            obj.f9324e = null;
            obj.y(context);
            obj.f9324e = U6.c.n();
            obj.f9322c = "android-keystore://core-google-shortcuts.MASTER_KEY";
            C0463k k = obj.k();
            synchronized (k) {
                x2 = ((R7.a) k.f8074b).x();
            }
            return x2;
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("ShortcutUtils", "could not get or create keyset handle.", e2);
            return null;
        }
    }

    public static Hb.d F(Hb.d dVar) {
        Hb.d<Object> intercepted;
        kotlin.jvm.internal.l.e(dVar, "<this>");
        Jb.c cVar = dVar instanceof Jb.c ? (Jb.c) dVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }

    public static boolean G(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final boolean H(i0.d dVar) {
        long j = dVar.f18182e;
        return (j >>> 32) == (4294967295L & j) && j == dVar.f18183f && j == dVar.g && j == dVar.f18184h;
    }

    public static boolean I(s sVar) {
        return sVar.e().isEmpty() && (sVar.isEmpty() || (sVar instanceof T7.j) || (sVar instanceof v) || (sVar instanceof T7.i));
    }

    public static boolean J(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static s K(Object obj) {
        T7.k kVar = T7.k.f9348e;
        s a9 = android.support.v4.media.session.b.a(obj, kVar);
        if (a9 instanceof p) {
            a9 = new T7.j(Double.valueOf(((p) a9).f9356c), kVar);
        }
        if (I(a9)) {
            return a9;
        }
        throw new RuntimeException("Node contains invalid priority: Must be a string, double, ServerValue, or null");
    }

    public static boolean M(int i7, Parcel parcel) {
        f0(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean N(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        if (U8 == 0) {
            return null;
        }
        e0(parcel, U8, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double O(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        if (U8 == 0) {
            return null;
        }
        e0(parcel, U8, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static IBinder P(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + U8);
        return readStrongBinder;
    }

    public static int Q(int i7, Parcel parcel) {
        f0(parcel, i7, 4);
        return parcel.readInt();
    }

    public static Integer R(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        if (U8 == 0) {
            return null;
        }
        e0(parcel, U8, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long S(int i7, Parcel parcel) {
        f0(parcel, i7, 8);
        return parcel.readLong();
    }

    public static Long T(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        if (U8 == 0) {
            return null;
        }
        e0(parcel, U8, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int U(int i7, Parcel parcel) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static void W(C0775a c0775a) {
        c0775a.k = -3.4028235E38f;
        c0775a.j = Integer.MIN_VALUE;
        CharSequence charSequence = c0775a.f12694a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c0775a.f12694a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c0775a.f12694a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static Object X(Object obj, q3.e eVar, HashMap hashMap) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (!map.containsKey(".sv")) {
            return obj;
        }
        Object obj2 = map.get(".sv");
        Object obj3 = null;
        obj3 = null;
        obj3 = null;
        obj3 = null;
        obj3 = null;
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if ("timestamp".equals(str) && hashMap.containsKey(str)) {
                obj3 = hashMap.get(str);
            }
        } else if (obj2 instanceof Map) {
            Map map2 = (Map) obj2;
            if (map2.containsKey("increment")) {
                Object obj4 = map2.get("increment");
                if (obj4 instanceof Number) {
                    Number number = (Number) obj4;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    C0385e c0385e = (C0385e) eVar.f23377c;
                    z zVar = (z) eVar.f23376b;
                    O7.g gVar = zVar.f6411a;
                    C0385e c0385e2 = C0385e.f6337d;
                    s sVar = null;
                    C0385e c0385e3 = c0385e;
                    do {
                        T7.c C2 = c0385e3.C();
                        c0385e3 = c0385e3.F();
                        c0385e2 = c0385e2.o(C2);
                        C0385e E10 = C0385e.E(c0385e2, c0385e);
                        gVar = C2 != null ? gVar.t(C2) : O7.g.f7494d;
                        L7.n nVar = (L7.n) gVar.f7495a;
                        if (nVar != null) {
                            sVar = nVar.c(E10);
                        }
                        if (c0385e3.isEmpty()) {
                            break;
                        }
                    } while (sVar == null);
                    s a9 = zVar.f6412b.a(c0385e, sVar, arrayList, true);
                    obj3 = number;
                    if (a9.p()) {
                        obj3 = number;
                        if (a9.getValue() instanceof Number) {
                            Number number2 = (Number) a9.getValue();
                            if (!(number instanceof Double) && !(number instanceof Float) && !(number2 instanceof Double) && !(number2 instanceof Float)) {
                                long longValue = number.longValue();
                                long longValue2 = number2.longValue();
                                long j = longValue + longValue2;
                                if (((longValue ^ j) & (longValue2 ^ j)) >= 0) {
                                    obj3 = Long.valueOf(j);
                                }
                            }
                            obj3 = Double.valueOf(number2.doubleValue() + number.doubleValue());
                        }
                    }
                }
            }
        }
        return obj3 == null ? obj : obj3;
    }

    public static C0381a Y(C0381a c0381a, z zVar, C0385e c0385e, HashMap hashMap) {
        C0381a c0381a2 = C0381a.f6320b;
        Iterator it = c0381a.f6321a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0381a2 = c0381a2.b((C0385e) entry.getKey(), Z((s) entry.getValue(), new q3.e(14, zVar, c0385e.i((C0385e) entry.getKey())), hashMap));
        }
        return c0381a2;
    }

    public static s Z(s sVar, q3.e eVar, HashMap hashMap) {
        Object value = sVar.e().getValue();
        Object X10 = X(value, eVar.n(T7.c.b(".priority")), hashMap);
        boolean z8 = false;
        if (!sVar.p()) {
            if (sVar.isEmpty()) {
                return sVar;
            }
            T7.f fVar = (T7.f) sVar;
            D5.i iVar = new D5.i(23);
            iVar.f3256b = fVar;
            fVar.i(new L7.m(eVar, hashMap, iVar), false);
            return !((s) iVar.f3256b).e().equals(X10) ? ((s) iVar.f3256b).s(K(X10)) : (s) iVar.f3256b;
        }
        Object X11 = X(sVar.getValue(), eVar, hashMap);
        if (X11.equals(sVar.getValue())) {
            if (X10 == value) {
                z8 = true;
            } else if (X10 != null && value != null) {
                z8 = X10.equals(value);
            }
            if (z8) {
                return sVar;
            }
        }
        return android.support.v4.media.session.b.a(X11, K(X10));
    }

    public static final i0.d a(float f4, float f10, float f11, float f12, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new i0.d(f4, f10, f11, f12, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static float a0(float f4, int i7, int i10, int i11) {
        float f10;
        if (f4 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i7 == 0) {
            f10 = i11;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    return -3.4028235E38f;
                }
                return f4;
            }
            f10 = i10;
        }
        return f4 * f10;
    }

    public static final long b(float f4, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static void b0(int i7, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + U(i7, parcel));
    }

    public static float c(EdgeEffect edgeEffect, float f4, float f10, V0.c cVar) {
        float f11 = AbstractC2315x.f26534a;
        double k = cVar.k() * 386.0878f * 160.0f * 0.84f;
        double d10 = AbstractC2315x.f26534a * k;
        float exp = (float) (Math.exp((AbstractC2315x.f26535b / AbstractC2315x.f26536c) * Math.log((Math.abs(f4) * 0.35f) / d10)) * d10);
        int i7 = Build.VERSION.SDK_INT;
        if (exp > (i7 >= 31 ? l3.d.b(edgeEffect) : 0.0f) * f10) {
            return 0.0f;
        }
        int F10 = Tb.a.F(f4);
        if (i7 >= 31) {
            edgeEffect.onAbsorb(F10);
            return f4;
        }
        if (!edgeEffect.isFinished()) {
            return f4;
        }
        edgeEffect.onAbsorb(F10);
        return f4;
    }

    public static final void c0(Object obj) {
        if (obj instanceof Db.l) {
            throw ((Db.l) obj).f3356a;
        }
    }

    public static int d0(Parcel parcel) {
        int readInt = parcel.readInt();
        int U8 = U(readInt, parcel);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new G5.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i7 = U8 + dataPosition;
        if (i7 < dataPosition || i7 > parcel.dataSize()) {
            throw new G5.b(X.c.e(dataPosition, i7, "Size read is invalid start=", " end="), parcel);
        }
        return i7;
    }

    public static final Bundle e() {
        return new Bundle(0);
    }

    public static void e0(Parcel parcel, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        throw new G5.b(o.p(o.q(i10, i7, "Expected size ", " got ", " (0x"), Integer.toHexString(i7), ")"), parcel);
    }

    public static final Bundle f(Db.j... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (Db.j jVar : jVarArr) {
            String str = (String) jVar.f3354a;
            Object obj = jVar.f3355b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.l.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void f0(Parcel parcel, int i7, int i10) {
        int U8 = U(i7, parcel);
        if (U8 == i10) {
            return;
        }
        throw new G5.b(o.p(o.q(i10, U8, "Expected size ", " got ", " (0x"), Integer.toHexString(U8), ")"), parcel);
    }

    public static void g(int i7) {
        if (2 > i7 || i7 >= 37) {
            StringBuilder r10 = o.r(i7, "radix ", " was not in valid range ");
            r10.append(new Xb.e(2, 36, 1));
            throw new IllegalArgumentException(r10.toString());
        }
    }

    public static void h(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final boolean i(File file, String str) {
        String str2 = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            kotlin.jvm.internal.l.d(messageDigest, "getInstance(...)");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                } catch (IOException unused) {
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
            String replace = String.format("%32s", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest()).toString(16)}, 1)).replace(' ', '0');
            kotlin.jvm.internal.l.d(replace, "replace(...)");
            try {
                fileInputStream.close();
            } catch (IOException unused3) {
            }
            str2 = replace;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused4) {
        }
        if (str2 == null) {
            return false;
        }
        return ac.n.T(str2, str, false);
    }

    public static BigDecimal j(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + U8);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle k(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + U8);
        return readBundle;
    }

    public static byte[] l(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + U8);
        return createByteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Hb.d m(Hb.d dVar, Hb.d dVar2, Rb.e eVar) {
        kotlin.jvm.internal.l.e(eVar, "<this>");
        if (eVar instanceof Jb.a) {
            return ((Jb.a) eVar).create(dVar, dVar2);
        }
        Hb.i context = dVar2.getContext();
        return context == Hb.j.f4919a ? new Ib.b(dVar2, dVar, eVar) : new Ib.c(dVar2, context, eVar, dVar);
    }

    public static final Db.l n(Throwable exception) {
        kotlin.jvm.internal.l.e(exception, "exception");
        return new Db.l(exception);
    }

    public static int[] o(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + U8);
        return createIntArray;
    }

    public static Parcelable q(Parcel parcel, int i7, Parcelable.Creator creator) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + U8);
        return parcelable;
    }

    public static String r(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + U8);
        return readString;
    }

    public static String[] s(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + U8);
        return createStringArray;
    }

    public static ArrayList t(int i7, Parcel parcel) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + U8);
        return createStringArrayList;
    }

    public static Object[] u(Parcel parcel, int i7, Parcelable.Creator creator) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + U8);
        return createTypedArray;
    }

    public static ArrayList v(Parcel parcel, int i7, Parcelable.Creator creator) {
        int U8 = U(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (U8 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + U8);
        return createTypedArrayList;
    }

    public static byte[] w(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            int digit = Character.digit(str.charAt(i10), 16);
            int digit2 = Character.digit(str.charAt(i10 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i7] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static String x(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i7 = b2 & 255;
            sb2.append("0123456789abcdef".charAt(i7 / 16));
            sb2.append("0123456789abcdef".charAt(i7 % 16));
        }
        return sb2.toString();
    }

    public static void y(int i7, Parcel parcel) {
        if (parcel.dataPosition() != i7) {
            throw new G5.b(o.l(i7, "Overread allowed size end="), parcel);
        }
    }

    public static final boolean z(char c10, char c11, boolean z8) {
        if (c10 == c11) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public R7.a E(Context context, Object obj) {
        return null;
    }

    public abstract Object L(int i7, Intent intent);

    public void V(Context context, b bVar, i iVar) {
    }

    public void d(Context context, e eVar) {
    }

    public abstract Intent p(Context context, Object obj);
}
