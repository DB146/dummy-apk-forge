package F2;

import android.content.pm.PackageInfo;
import h3.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4043a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4044b = {112, 114, 109, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f4045c = {48, 49, 53, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f4046d = {48, 49, 48, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4047e = {48, 48, 57, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f4048f = {48, 48, 53, 0};
    public static final byte[] g = {48, 48, 49, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f4049h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f4050i = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(X4.e[] eVarArr, byte[] bArr) {
        int i7 = 0;
        int i10 = 0;
        for (X4.e eVar : eVarArr) {
            i10 += ((((eVar.f10959w * 2) + 7) & (-8)) / 8) + (eVar.f10956f * 2) + d(bArr, (String) eVar.f10952b, (String) eVar.f10953c).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f10958v;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f4047e)) {
            int length = eVarArr.length;
            while (i7 < length) {
                X4.e eVar2 = eVarArr[i7];
                q(byteArrayOutputStream, eVar2, d(bArr, (String) eVar2.f10952b, (String) eVar2.f10953c));
                p(byteArrayOutputStream, eVar2);
                i7++;
            }
        } else {
            for (X4.e eVar3 : eVarArr) {
                q(byteArrayOutputStream, eVar3, d(bArr, (String) eVar3.f10952b, (String) eVar3.f10953c));
            }
            int length2 = eVarArr.length;
            while (i7 < length2) {
                p(byteArrayOutputStream, eVarArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z8 = true;
        for (File file2 : listFiles) {
            z8 = c(file2) && z8;
        }
        return z8;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = g;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f4048f;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return o.p(X.c.m(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i7) {
        byte[] bArr = new byte[i7];
        int i10 = 0;
        while (i10 < i7) {
            int read = inputStream.read(bArr, i10, i7 - i10);
            if (read < 0) {
                throw new IllegalStateException(o.l(i7, "Not enough bytes to read: "));
            }
            i10 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i7, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int i12 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i7) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i12 += inflater.inflate(bArr, i12, i10 - i12);
                    i11 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    public static X4.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, X4.e[] eVarArr) {
        byte[] bArr3 = f4049h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f4050i)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m10 = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
            try {
                X4.e[] k = k(byteArrayInputStream, bArr2, m10, eVarArr);
                byteArrayInputStream.close();
                return k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f4045c, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m11 = (int) m(fileInputStream, 1);
        byte[] h11 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
        try {
            X4.e[] j = j(byteArrayInputStream2, m11, eVarArr);
            byteArrayInputStream2.close();
            return j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static X4.e[] j(ByteArrayInputStream byteArrayInputStream, int i7, X4.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new X4.e[0];
        }
        if (i7 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int m10 = (int) m(byteArrayInputStream, 2);
            iArr[i10] = (int) m(byteArrayInputStream, 2);
            strArr[i10] = new String(f(byteArrayInputStream, m10), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i7; i11++) {
            X4.e eVar = eVarArr[i11];
            if (!((String) eVar.f10953c).equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            eVar.f10956f = i12;
            eVar.f10954d = g(byteArrayInputStream, i12);
        }
        return eVarArr;
    }

    public static X4.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, X4.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new X4.e[0];
        }
        if (i7 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m10 = m(byteArrayInputStream, 4);
            int m11 = (int) m(byteArrayInputStream, 2);
            X4.e eVar = null;
            if (eVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= eVarArr.length) {
                        break;
                    }
                    if (((String) eVarArr[i11].f10953c).equals(substring)) {
                        eVar = eVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (eVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            eVar.f10960x = m10;
            int[] g2 = g(byteArrayInputStream, m11);
            if (Arrays.equals(bArr, g)) {
                eVar.f10956f = m11;
                eVar.f10954d = g2;
            }
        }
        return eVarArr;
    }

    public static X4.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f4046d)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m10 = (int) m(fileInputStream, 1);
        byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
        try {
            X4.e[] n6 = n(byteArrayInputStream, str, m10);
            byteArrayInputStream.close();
            return n6;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i7) {
        byte[] f4 = f(inputStream, i7);
        long j = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j += (f4[i10] & 255) << (i10 * 8);
        }
        return j;
    }

    public static X4.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new X4.e[0];
        }
        X4.e[] eVarArr = new X4.e[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int m10 = (int) m(byteArrayInputStream, 2);
            int m11 = (int) m(byteArrayInputStream, 2);
            eVarArr[i10] = new X4.e(str, new String(f(byteArrayInputStream, m10), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m11, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m11], new TreeMap());
        }
        for (int i11 = 0; i11 < i7; i11++) {
            X4.e eVar = eVarArr[i11];
            int available = byteArrayInputStream.available() - eVar.f10958v;
            int i12 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.f10955e;
                if (available2 <= available) {
                    break;
                }
                i12 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i12), 1);
                for (int m12 = (int) m(byteArrayInputStream, 2); m12 > 0; m12--) {
                    m(byteArrayInputStream, 2);
                    int m13 = (int) m(byteArrayInputStream, 1);
                    if (m13 != 6 && m13 != 7) {
                        while (m13 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m14 = (int) m(byteArrayInputStream, 1); m14 > 0; m14--) {
                                m(byteArrayInputStream, 2);
                            }
                            m13--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            eVar.f10954d = g(byteArrayInputStream, eVar.f10956f);
            int i13 = eVar.f10959w;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = valueOf.get(i14) ? 2 : 0;
                if (valueOf.get(i14 + i13)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, X4.e[] eVarArr) {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f4045c;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f4046d;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(eVarArr, bArr3);
                t(byteArrayOutputStream, eVarArr.length, 1);
                t(byteArrayOutputStream, b2.length, 4);
                byte[] a9 = a(b2);
                t(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr4 = f4048f;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, eVarArr.length, 1);
                for (X4.e eVar : eVarArr) {
                    int size = ((TreeMap) eVar.f10955e).size() * 4;
                    String d10 = d(bArr4, (String) eVar.f10952b, (String) eVar.f10953c);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d10.getBytes(charset).length);
                    u(byteArrayOutputStream, ((int[]) eVar.f10954d).length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, eVar.f10957u, 4);
                    byteArrayOutputStream.write(d10.getBytes(charset));
                    Iterator it = ((TreeMap) eVar.f10955e).keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i10 : (int[]) eVar.f10954d) {
                        u(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f4047e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b10 = b(eVarArr, bArr5);
                t(byteArrayOutputStream, eVarArr.length, 1);
                t(byteArrayOutputStream, b10.length, 4);
                byte[] a10 = a(b10);
                t(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr6 = g;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, eVarArr.length);
            for (X4.e eVar2 : eVarArr) {
                String d11 = d(bArr6, (String) eVar2.f10952b, (String) eVar2.f10953c);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d11.getBytes(charset2).length);
                TreeMap treeMap = (TreeMap) eVar2.f10955e;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, ((int[]) eVar2.f10954d).length);
                t(byteArrayOutputStream, eVar2.f10957u, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : (int[]) eVar2.f10954d) {
                    u(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, eVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (X4.e eVar3 : eVarArr) {
                t(byteArrayOutputStream2, eVar3.f10957u, 4);
                t(byteArrayOutputStream2, eVar3.f10960x, 4);
                t(byteArrayOutputStream2, eVar3.f10959w, 4);
                String d12 = d(bArr2, (String) eVar3.f10952b, (String) eVar3.f10953c);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d12.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(d12.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            g gVar = new g(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(gVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < eVarArr.length) {
                try {
                    X4.e eVar4 = eVarArr[i14];
                    u(byteArrayOutputStream3, i14);
                    u(byteArrayOutputStream3, eVar4.f10956f);
                    i15 = i15 + 4 + (eVar4.f10956f * 2);
                    int[] iArr = (int[]) eVar4.f10954d;
                    int length3 = iArr.length;
                    int i16 = i7;
                    while (i7 < length3) {
                        int i17 = iArr[i7];
                        u(byteArrayOutputStream3, i17 - i16);
                        i7++;
                        i16 = i17;
                    }
                    i14++;
                    i7 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            g gVar2 = new g(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(gVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < eVarArr.length) {
                try {
                    X4.e eVar5 = eVarArr[i18];
                    Iterator it3 = ((TreeMap) eVar5.f10955e).entrySet().iterator();
                    int i20 = 0;
                    while (it3.hasNext()) {
                        i20 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i20, eVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, eVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + i12 + byteArray4.length;
                            int i21 = i19 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i20);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i19 = i21 + length4;
                            i18++;
                            arrayList3 = arrayList4;
                            i12 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i19 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
            }
            g gVar3 = new g(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(gVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                g gVar4 = (g) arrayList2.get(i22);
                int i23 = gVar4.f4058a;
                if (i23 == 1) {
                    j = 0;
                } else if (i23 == 2) {
                    j = 1;
                } else if (i23 == 3) {
                    j = 2;
                } else if (i23 == 4) {
                    j = 3;
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                t(byteArrayOutputStream, j, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = gVar4.f4059b;
                if (gVar4.f4060c) {
                    long length5 = bArr7.length;
                    byte[] a11 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a11);
                    t(byteArrayOutputStream, a11.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a11.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, X4.e eVar) {
        s(byteArrayOutputStream, eVar);
        int[] iArr = (int[]) eVar.f10954d;
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int i11 = iArr[i7];
            u(byteArrayOutputStream, i11 - i10);
            i7++;
            i10 = i11;
        }
        int i12 = eVar.f10959w;
        byte[] bArr = new byte[(((i12 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f10955e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i13 = intValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i14 = intValue + i12;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, X4.e eVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, eVar.f10956f);
        t(byteArrayOutputStream, eVar.f10958v, 4);
        t(byteArrayOutputStream, eVar.f10957u, 4);
        t(byteArrayOutputStream, eVar.f10959w, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i7, X4.e eVar) {
        int bitCount = Integer.bitCount(i7 & (-2));
        int i10 = eVar.f10959w;
        byte[] bArr = new byte[(((bitCount * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f10955e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i7) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (i11 * i10) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, X4.e eVar) {
        int i7 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f10955e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i7);
                u(byteArrayOutputStream, 0);
                i7 = intValue;
            }
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j, int i7) {
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) ((j >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        t(byteArrayOutputStream, i7, 2);
    }
}
