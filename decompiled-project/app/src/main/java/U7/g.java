package U7;

import B0.C;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f9841a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f9842b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9843c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9844d = false;

    /* renamed from: e, reason: collision with root package name */
    public final d f9845e;

    /* renamed from: f, reason: collision with root package name */
    public WritableByteChannel f9846f;
    public final Thread g;

    public g(d dVar, int i7) {
        Thread newThread = d.f9825n.newThread(new C(this, 12));
        this.g = newThread;
        d.f9826o.getClass();
        newThread.setName("TubeSockWriter-" + i7);
        this.f9845e = dVar;
        this.f9841a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b2, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + (length < 126 ? 6 : length <= 65535 ? 8 : 14));
        allocate.put((byte) (b2 | Byte.MIN_VALUE));
        if (length < 126) {
            allocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            allocate.put((byte) 254);
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) 255);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.f9842b.nextBytes(bArr2);
        allocate.put(bArr2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            allocate.put((byte) (bArr[i7] ^ bArr2[i7 % 4]));
        }
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r2.f9844d = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(byte b2, byte[] bArr) {
        try {
            ByteBuffer a9 = a(b2, bArr);
            if (this.f9843c && (this.f9844d || b2 != 8)) {
                throw new RuntimeException("Shouldn't be sending");
            }
            this.f9841a.add(a9);
        } catch (Throwable th) {
            throw th;
        }
    }
}
