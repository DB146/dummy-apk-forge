package J3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class k implements A3.j {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f5477a;

    public k() {
        this.f5477a = ByteBuffer.allocate(4);
    }

    public k(byte[] bArr, int i7) {
        this.f5477a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i7);
    }

    @Override // A3.j
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f5477a) {
            this.f5477a.position(0);
            messageDigest.update(this.f5477a.putInt(num.intValue()).array());
        }
    }

    public short b(int i7) {
        ByteBuffer byteBuffer = this.f5477a;
        if (byteBuffer.remaining() - i7 >= 2) {
            return byteBuffer.getShort(i7);
        }
        return (short) -1;
    }
}
