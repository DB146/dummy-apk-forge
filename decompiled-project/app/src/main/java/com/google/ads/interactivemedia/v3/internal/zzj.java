package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class zzj {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair zzf = zzf(randomAccessFile, 0);
        return zzf != null ? zzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j) {
        zzg(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(c.h("uint32 value of out range: ", j));
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    private static long zze(ByteBuffer byteBuffer, int i7) {
        return byteBuffer.getInt(i7) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i7) {
        int i10;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i7, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        zzg(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i11 = capacity2 - 22;
            int min = Math.min(i11, 65535);
            for (int i12 = 0; i12 < min; i12++) {
                i10 = i11 - i12;
                if (allocate.getInt(i10) == 101010256 && ((char) allocate.getShort(i10 + 20)) == i12) {
                    break;
                }
            }
        }
        i10 = -1;
        if (i10 == -1) {
            return null;
        }
        allocate.position(i10);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i10));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
