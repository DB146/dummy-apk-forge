package o4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f21764d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f21765e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public int f21766a;

    /* renamed from: b, reason: collision with root package name */
    public int f21767b;

    /* renamed from: c, reason: collision with root package name */
    public Comparable f21768c;

    public static void a(ByteBuffer byteBuffer, long j, int i7, int i10, boolean z8) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z8 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        long j10 = i10;
        Q5.e.j(j10, "out of range: %s", (j10 >> 8) == 0);
        byteBuffer.put((byte) j10);
    }
}
