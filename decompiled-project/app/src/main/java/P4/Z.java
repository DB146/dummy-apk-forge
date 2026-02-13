package P4;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import m4.C1586o0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public int f7975a;

    /* renamed from: b, reason: collision with root package name */
    public long f7976b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7977c;

    public Z(int i7, URL url, long j) {
        this.f7975a = i7;
        this.f7977c = url;
        this.f7976b = j;
    }

    public static byte[] b(byte b2, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b2, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public N6.H a(byte[] bArr) {
        long j;
        AbstractC1705a.h(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, W4.y.f10800u);
        ArrayList arrayList = (ArrayList) this.f7977c;
        arrayList.add(str);
        int i7 = this.f7975a;
        if (i7 == 1) {
            if (!W4.z.f10807a.matcher(str).matches() && !W4.z.f10808b.matcher(str).matches()) {
                return null;
            }
            this.f7975a = 2;
            return null;
        }
        if (i7 != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = W4.z.f10809c.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                j = Long.parseLong(group);
            } else {
                j = -1;
            }
            if (j != -1) {
                this.f7976b = j;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f7976b > 0) {
                this.f7975a = 3;
                return null;
            }
            N6.H F10 = N6.H.F(arrayList);
            arrayList.clear();
            this.f7975a = 1;
            this.f7976b = 0L;
            return F10;
        } catch (NumberFormatException e2) {
            throw C1586o0.b(str, e2);
        }
    }
}
