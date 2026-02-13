package h3;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: h3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249k {

    /* renamed from: b, reason: collision with root package name */
    public static final C1249k f17698b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17699a;

    static {
        C1249k c1249k = new C1249k(new LinkedHashMap());
        c2.i.y(c1249k);
        f17698b = c1249k;
    }

    public C1249k(C1249k other) {
        kotlin.jvm.internal.l.e(other, "other");
        this.f17699a = new HashMap(other.f17699a);
    }

    public C1249k(LinkedHashMap values) {
        kotlin.jvm.internal.l.e(values, "values");
        this.f17699a = new HashMap(values);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: ClassNotFoundException -> 0x0061, IOException -> 0x0063, TRY_LEAVE, TryCatch #6 {IOException -> 0x0063, ClassNotFoundException -> 0x0061, blocks: (B:10:0x0018, B:12:0x002f, B:15:0x0036, B:17:0x003c, B:25:0x005c, B:33:0x0067, B:34:0x006a, B:35:0x006b, B:46:0x009e, B:56:0x00c4, B:57:0x00c7), top: B:9:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[Catch: ClassNotFoundException -> 0x0061, IOException -> 0x0063, TRY_LEAVE, TryCatch #6 {IOException -> 0x0063, ClassNotFoundException -> 0x0061, blocks: (B:10:0x0018, B:12:0x002f, B:15:0x0036, B:17:0x003c, B:25:0x005c, B:33:0x0067, B:34:0x006a, B:35:0x006b, B:46:0x009e, B:56:0x00c4, B:57:0x00c7), top: B:9:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1249k a(byte[] bytes) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr;
        byte b2;
        int i7;
        boolean z8;
        kotlin.jvm.internal.l.e(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return f17698b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            b2 = (byte) (-21267);
            i7 = 0;
        } catch (IOException e2) {
            z.e().d(l.f17700a, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e10) {
            z.e().d(l.f17700a, "Error in Data#fromByteArray: ", e10);
        }
        if (bArr[0] == ((byte) 16777132)) {
            z8 = true;
            if (bArr[1] == b2) {
                byteArrayInputStream.reset();
                if (z8) {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort != -21521) {
                            throw new IllegalStateException(o.l(readShort, "Magic number doesn't match: ").toString());
                        }
                        short readShort2 = dataInputStream.readShort();
                        if (readShort2 != 1) {
                            throw new IllegalStateException(o.l(readShort2, "Unsupported version number: ").toString());
                        }
                        int readInt = dataInputStream.readInt();
                        while (i7 < readInt) {
                            Serializable n6 = c2.i.n(dataInputStream.readByte(), dataInputStream);
                            String key = dataInputStream.readUTF();
                            kotlin.jvm.internal.l.d(key, "key");
                            linkedHashMap.put(key, n6);
                            i7++;
                        }
                        tc.b.o(dataInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            tc.b.o(dataInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt2 = objectInputStream.readInt();
                        while (i7 < readInt2) {
                            String readUTF = objectInputStream.readUTF();
                            kotlin.jvm.internal.l.d(readUTF, "readUTF()");
                            linkedHashMap.put(readUTF, objectInputStream.readObject());
                            i7++;
                        }
                        tc.b.o(objectInputStream, null);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            tc.b.o(objectInputStream, th3);
                            throw th4;
                        }
                    }
                }
                return new C1249k(linkedHashMap);
            }
        }
        z8 = false;
        byteArrayInputStream.reset();
        if (z8) {
        }
        return new C1249k(linkedHashMap);
    }

    public final String b(String str) {
        Object obj = this.f17699a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(String str) {
        Object obj = this.f17699a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1249k.class.equals(obj.getClass())) {
            return false;
        }
        HashMap hashMap = this.f17699a;
        Set<String> keySet = hashMap.keySet();
        HashMap hashMap2 = ((C1249k) obj).f17699a;
        if (!kotlin.jvm.internal.l.a(keySet, hashMap2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = hashMap2.get(str);
            if (obj2 == null || obj3 == null) {
                z8 = obj2 == obj3;
            } else {
                if (obj2 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj2;
                    if (obj3 instanceof Object[]) {
                        z8 = Eb.n.L(objArr, (Object[]) obj3);
                    }
                }
                z8 = obj2.equals(obj3);
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 0;
        for (Map.Entry entry : this.f17699a.entrySet()) {
            Object value = entry.getValue();
            i7 += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i7 * 31;
    }

    public final String toString() {
        String str = "Data {" + Eb.o.d0(this.f17699a.entrySet(), null, null, null, C1248j.f17697a, 31) + "}";
        kotlin.jvm.internal.l.d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
