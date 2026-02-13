package com.google.android.recaptcha.internal;

import Eb.n;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import q3.f;
import tc.b;

/* loaded from: classes.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream, Ob.a, java.io.ByteArrayOutputStream] */
    public static final byte[] zza(File file) {
        l.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i7 = (int) length;
            byte[] bArr = new byte[i7];
            int i10 = i7;
            int i11 = 0;
            while (i10 > 0) {
                int read = fileInputStream.read(bArr, i11, i10);
                if (read < 0) {
                    break;
                }
                i10 -= read;
                i11 += read;
            }
            if (i10 > 0) {
                bArr = Arrays.copyOf(bArr, i11);
                l.d(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    ?? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                    byteArrayOutputStream.write(read2);
                    f.i(fileInputStream, byteArrayOutputStream);
                    int size = byteArrayOutputStream.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] l10 = byteArrayOutputStream.l();
                    bArr = Arrays.copyOf(bArr, size);
                    l.d(bArr, "copyOf(...)");
                    n.N(l10, i7, bArr, 0, byteArrayOutputStream.size());
                }
            }
            b.o(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.o(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] array) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        l.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            b.o(fileOutputStream, null);
        } finally {
        }
    }
}
