package J3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class j implements m, A3.j {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f5476a;

    public j() {
        this.f5476a = ByteBuffer.allocate(8);
    }

    public j(ByteBuffer byteBuffer) {
        this.f5476a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // A3.j
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l10 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f5476a) {
            this.f5476a.position(0);
            messageDigest.update(this.f5476a.putLong(l10.longValue()).array());
        }
    }

    @Override // J3.m
    public long e(long j) {
        ByteBuffer byteBuffer = this.f5476a;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // J3.m
    public short i() {
        ByteBuffer byteBuffer = this.f5476a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new l();
    }

    @Override // J3.m
    public int k() {
        return (i() << 8) | i();
    }

    @Override // J3.m
    public int n(int i7, byte[] bArr) {
        ByteBuffer byteBuffer = this.f5476a;
        int min = Math.min(i7, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }
}
