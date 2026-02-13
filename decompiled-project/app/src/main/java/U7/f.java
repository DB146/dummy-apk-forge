package U7;

import E5.k;
import J7.w;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public DataInputStream f9835a;

    /* renamed from: b, reason: collision with root package name */
    public d f9836b;

    /* renamed from: c, reason: collision with root package name */
    public q3.c f9837c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9838d;

    /* renamed from: e, reason: collision with root package name */
    public b f9839e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f9840f;

    public static long b(byte[] bArr) {
        return (bArr[2] << 56) + ((bArr[3] & 255) << 48) + ((bArr[4] & 255) << 40) + ((bArr[5] & 255) << 32) + ((bArr[6] & 255) << 24) + ((bArr[7] & 255) << 16) + ((bArr[8] & 255) << 8) + (bArr[9] & 255);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [U7.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [U7.a, java.lang.Object] */
    public final void a(boolean z8, byte b2, byte[] bArr) {
        b bVar;
        if (b2 == 9) {
            if (!z8) {
                throw new RuntimeException("PING must not fragment across frames");
            }
            if (bArr.length > 125) {
                throw new RuntimeException("PING frame too long");
            }
            d dVar = this.f9836b;
            synchronized (dVar) {
                dVar.e((byte) 10, bArr);
            }
            return;
        }
        b bVar2 = this.f9839e;
        if (bVar2 != null && b2 != 0) {
            throw new RuntimeException("Failed to continue outstanding frame");
        }
        if (bVar2 == null && b2 == 0) {
            throw new RuntimeException("Received continuing frame, but there's nothing to continue");
        }
        if (bVar2 == null) {
            if (b2 == 2) {
                ?? obj = new Object();
                obj.f9820b = 0;
                obj.f9819a = new ArrayList();
                bVar = obj;
            } else {
                ?? obj2 = new Object();
                obj2.f9822a = new StringBuilder();
                bVar = obj2;
            }
            this.f9839e = bVar;
        }
        if (!this.f9839e.a(bArr)) {
            throw new RuntimeException("Failed to decode frame");
        }
        if (z8) {
            D9.a b10 = this.f9839e.b();
            this.f9839e = null;
            q3.c cVar = this.f9837c;
            cVar.getClass();
            String str = b10.f3289a;
            w wVar = (w) cVar.f23372c;
            if (wVar.j.H()) {
                wVar.j.p(X.c.t("ws message: ", str), null, new Object[0]);
            }
            wVar.f5653i.execute(new k(4, cVar, str, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.RuntimeException, U7.e] */
    public final void c() {
        byte[] bArr;
        byte b2;
        boolean z8;
        long j;
        this.f9837c = this.f9836b.f9829c;
        while (!this.f9840f) {
            try {
                this.f9835a.readFully(this.f9838d, 0, 1);
                bArr = this.f9838d;
                b2 = bArr[0];
                z8 = (b2 & 128) != 0;
            } catch (e e2) {
                this.f9840f = true;
                d dVar = this.f9836b;
                dVar.f9829c.t(e2);
                if (dVar.f9827a == 3) {
                    dVar.a();
                }
                dVar.b();
            } catch (SocketTimeoutException unused) {
            } catch (IOException e10) {
                ?? runtimeException = new RuntimeException("IO Error", e10);
                this.f9840f = true;
                d dVar2 = this.f9836b;
                dVar2.f9829c.t(runtimeException);
                if (dVar2.f9827a == 3) {
                    dVar2.a();
                }
                dVar2.b();
            }
            if ((b2 & 112) != 0) {
                throw new RuntimeException("Invalid frame received");
            }
            byte b10 = (byte) (b2 & 15);
            this.f9835a.readFully(bArr, 1, 1);
            byte[] bArr2 = this.f9838d;
            byte b11 = bArr2[1];
            if (b11 < 126) {
                j = b11;
            } else if (b11 == 126) {
                this.f9835a.readFully(bArr2, 2, 2);
                byte[] bArr3 = this.f9838d;
                j = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else if (b11 == Byte.MAX_VALUE) {
                this.f9835a.readFully(bArr2, 2, 8);
                j = b(this.f9838d);
            } else {
                j = 0;
            }
            int i7 = (int) j;
            byte[] bArr4 = new byte[i7];
            this.f9835a.readFully(bArr4, 0, i7);
            if (b10 == 8) {
                this.f9836b.b();
            } else if (b10 != 10) {
                if (b10 != 1 && b10 != 2 && b10 != 9 && b10 != 0) {
                    throw new RuntimeException("Unsupported opcode: " + ((int) b10));
                }
                a(z8, b10, bArr4);
            }
        }
    }
}
