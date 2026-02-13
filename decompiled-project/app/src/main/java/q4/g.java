package q4;

import java.nio.ByteBuffer;
import m4.AbstractC1556J;

/* loaded from: classes.dex */
public class g extends A4.c {

    /* renamed from: c, reason: collision with root package name */
    public final C1889b f23457c = new C1889b();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f23458d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23459e;

    /* renamed from: f, reason: collision with root package name */
    public long f23460f;

    /* renamed from: u, reason: collision with root package name */
    public ByteBuffer f23461u;

    /* renamed from: v, reason: collision with root package name */
    public final int f23462v;

    static {
        AbstractC1556J.a("goog.exo.decoder");
    }

    public g(int i7) {
        this.f23462v = i7;
    }

    public void G() {
        this.f368b = 0;
        ByteBuffer byteBuffer = this.f23458d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f23461u;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f23459e = false;
    }

    public final ByteBuffer H(int i7) {
        int i10 = this.f23462v;
        if (i10 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f23458d;
        throw new IllegalStateException(A3.c.e(byteBuffer == null ? 0 : byteBuffer.capacity(), i7, "Buffer too small (", " < ", ")"));
    }

    public final void I(int i7) {
        ByteBuffer byteBuffer = this.f23458d;
        if (byteBuffer == null) {
            this.f23458d = H(i7);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i10 = i7 + position;
        if (capacity >= i10) {
            this.f23458d = byteBuffer;
            return;
        }
        ByteBuffer H10 = H(i10);
        H10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            H10.put(byteBuffer);
        }
        this.f23458d = H10;
    }

    public final void J() {
        ByteBuffer byteBuffer = this.f23458d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f23461u;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
